// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.libraries.nuxt.model.impl

import com.intellij.ide.util.PropertiesComponent
import com.intellij.javascript.nodejs.NodeModuleDirectorySearchProcessor
import com.intellij.javascript.nodejs.NodeModuleSearchUtil
import com.intellij.javascript.nodejs.PackageJsonData
import com.intellij.lang.ecmascript6.psi.ES6ExportDefaultAssignment
import com.intellij.lang.javascript.buildTools.npm.PackageJsonUtil
import com.intellij.lang.javascript.psi.JSType
import com.intellij.lang.javascript.psi.ecma6.TypeScriptInterface
import com.intellij.lang.javascript.psi.ecma6.TypeScriptTypeAlias
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.util.AlarmFactory
import com.intellij.util.castSafelyTo
import com.intellij.util.text.SemVer
import com.hxz.mpxjs.VueBundle
import com.hxz.mpxjs.codeInsight.VUE_NOTIFICATIONS
import com.hxz.mpxjs.codeInsight.resolveSymbolFromNodeModule
import com.hxz.mpxjs.libraries.nuxt.NUXT_2_9_0
import com.hxz.mpxjs.libraries.nuxt.NUXT_CONFIG_PKG
import com.hxz.mpxjs.libraries.nuxt.NUXT_PKG
import com.hxz.mpxjs.libraries.nuxt.NUXT_TYPES_PKG
import com.hxz.mpxjs.libraries.nuxt.actions.InstallNuxtTypesAction
import com.hxz.mpxjs.libraries.nuxt.model.NuxtApplication
import com.hxz.mpxjs.libraries.nuxt.model.NuxtConfig
import com.hxz.mpxjs.libraries.vuex.model.store.VuexStore
import java.util.concurrent.TimeUnit

class NuxtApplicationImpl(override val configFile: VirtualFile, override val project: Project) : NuxtApplication {

  override val nuxtVersion: SemVer? by lazy(LazyThreadSafetyMode.NONE) {
    PsiManager.getInstance(project).findFile(configFile)?.let { file ->
      CachedValuesManager.getCachedValue(file) {
        CachedValueProvider.Result.create(NodeModuleSearchUtil.resolveModule(
          NUXT_PKG, file.virtualFile, emptyList(), false, file.project)
                                            ?.let { PackageJsonUtil.findChildPackageJsonFile(it.moduleSourceRoot) }
                                            ?.let { PackageJsonData.getOrCreate(it) }
                                            ?.version, VirtualFileManager.VFS_STRUCTURE_MODIFICATIONS)
      }
    }
  }

  init {
    if (!hasBeenNotifiedAboutTypes()
        && nuxtVersion?.isGreaterOrEqualThan(NUXT_2_9_0) == true
        && NodeModuleSearchUtil.resolveModule(
        NUXT_TYPES_PKG, configFile.parent, emptyList(), false, project) == null) {
      notifyNuxtTypesNotInstalled()
    }
  }

  private fun hasBeenNotifiedAboutTypes(): Boolean {
    return PropertiesComponent.getInstance(project).isTrueValue(NUXT_TYPES_NOTIFICATION_SHOWN)
  }

  override val packageJson: VirtualFile?
    get() = PackageJsonUtil.findChildPackageJsonFile(configFile.parent)

  override val sourceDir: VirtualFile?
    get() = config.sourceDir ?: configFile.parent

  override val vuexStore: VuexStore?
    get() = sourceDir?.findChild("store")?.let {
      PsiManager.getInstance(project).findDirectory(it)
    }?.let { NuxtVuexStore(it) }

  override val staticResourcesDir: PsiDirectory?
    get() = sourceDir?.findChild("static")?.let {
      PsiManager.getInstance(project).findDirectory(it)
    }

  override fun getNuxtConfigType(context: PsiElement): JSType? =
    resolveSymbolFromNodeModule(context, NUXT_TYPES_PKG, "NuxtConfig", TypeScriptTypeAlias::class.java)
      ?.parsedTypeDeclaration
    ?: resolveSymbolFromNodeModule(context, NUXT_TYPES_PKG, "Configuration", TypeScriptInterface::class.java)
      ?.jsType
    ?: resolveSymbolFromNodeModule(context, NUXT_CONFIG_PKG, "default", ES6ExportDefaultAssignment::class.java)
      ?.stubSafeElement?.castSafelyTo<TypeScriptInterface>()?.jsType

  override val config: NuxtConfig
    get() = PsiManager.getInstance(project).findFile(configFile)?.let { file ->
      CachedValuesManager.getCachedValue(file) {
        CachedValueProvider.Result.create(NuxtConfigImpl(file), file, VirtualFileManager.VFS_STRUCTURE_MODIFICATIONS)
      }
    } ?: EmptyNuxtConfig

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    return other is NuxtApplicationImpl
           && configFile == other.configFile
           && project == other.project
  }

  override fun hashCode(): Int {
    var result = configFile.hashCode()
    result = 31 * result + project.hashCode()
    return result
  }

  private fun notifyNuxtTypesNotInstalled() {
    val notification = VUE_NOTIFICATIONS.createNotification(
      VueBundle.message("nuxt.support.notification.title"),
      VueBundle.message("nuxt.support.notification.contents"),
      NotificationType.INFORMATION)
    packageJson?.let {
      notification.addAction(InstallNuxtTypesAction(project, it, notification))
    }
    if (hasBeenNotifiedAboutTypes()) {
      return
    }
    PropertiesComponent.getInstance(project).setValue(NUXT_TYPES_NOTIFICATION_SHOWN, true)
    notification.notify(project)

    AlarmFactory.getInstance().create().addRequest(
      Runnable { notification.hideBalloon() },
      TimeUnit.SECONDS.toMillis(30)
    )
  }

  companion object {
    private const val NUXT_TYPES_NOTIFICATION_SHOWN = "vuejs.nuxt.types-notification-shown"
  }

  private object EmptyNuxtConfig : NuxtConfig

}