// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.libraries.nuxt.model

import com.intellij.lang.javascript.buildTools.webpack.WebPackConfigManager
import com.intellij.lang.javascript.buildTools.webpack.WebPackReferenceContributor
import com.intellij.lang.javascript.library.JSLibraryUtil
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.castSafelyTo
import com.hxz.mpxjs.codeInsight.fromAsset
import com.hxz.mpxjs.model.source.VueContainerInfoProvider

class NuxtComponentProvider : VueContainerInfoProvider {

  override fun getAdditionalComponents(scope: GlobalSearchScope,
                                       sourceComponents: VueContainerInfoProvider.ComponentsInfo): VueContainerInfoProvider.ComponentsInfo? =
    NuxtModelManager.getApplication(scope)
      ?.config?.takeIf { it.file != null }
      ?.let { config ->
        val resolvedDirs = config.components.asSequence()
          .mapNotNull { componentDir -> resolvePath(config.file!!, componentDir)?.let { Pair(it, componentDir) } }
          .sortedBy { dir -> -dir.first.path.count { it == '\\' || it == '/' } }
          .toList()

        sourceComponents.local.flatMap { (_, component) ->
          val componentFile = component.source?.containingFile?.virtualFile
                              ?: return@flatMap emptySequence()
          val componentDirConfig = resolvedDirs.find { VfsUtil.isAncestor(it.first, componentFile, true) }?.second
          if (componentDirConfig != null
              && componentFile.extension.let { componentDirConfig.extensions.contains(it) }) {
            val prefix = componentDirConfig.prefix
            val name = fromAsset(componentFile.nameWithoutExtension).let {
              when {
                prefix.isEmpty() -> it
                it.startsWith(prefix) -> it
                else -> "$prefix-$it"
              }
            }
            sequenceOf(Pair(name, component), Pair("lazy-$name", component))
          }
          else emptySequence()
        }
          .distinctBy { it.first }
          .toMap()
          .let { VueContainerInfoProvider.ComponentsInfo(emptyMap(), it) }
      }

  private fun resolvePath(configFile: PsiFile, componentDir: NuxtConfig.ComponentsDirectoryConfig): VirtualFile? =
    if (componentDir.path.startsWith("~") || componentDir.path.startsWith("@")) {
      WebPackConfigManager.getInstance(configFile.project)
        .resolveConfig(configFile)
        .takeIf { !it.isEmpty() }
        ?.let { webpackReferenceProvider.getAliasedReferences(componentDir.path.trimEnd('/'), configFile, 0, null, it, true) }
        ?.lastOrNull()
        ?.resolve()
        ?.castSafelyTo<PsiDirectory>()
        ?.virtualFile
    }
    else {
      configFile.virtualFile.parent?.findFileByRelativePath(componentDir.path)
    }
      ?.takeIf { it.isDirectory && it.name != JSLibraryUtil.NODE_MODULES }

  companion object {
    val webpackReferenceProvider = WebPackReferenceContributor()
  }

}