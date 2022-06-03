// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.libraries.nuxt.codeInsight


import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiFileSystemItem
import com.intellij.psi.impl.source.html.HtmlLikeFile
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceHelper
import com.hxz.mpxjs.context.isVueContext
import com.hxz.mpxjs.libraries.nuxt.model.NuxtModelManager

class NuxtFileReferenceHelper : FileReferenceHelper() {

  override fun isMine(project: Project, file: VirtualFile): Boolean {
    return getPsiFileSystemItem(project, file)?.let {
      it is HtmlLikeFile
      && isVueContext(it)
      && NuxtModelManager.getApplication(it) != null
    } == true
  }

  override fun getContexts(project: Project, file: VirtualFile): Collection<PsiFileSystemItem> = emptyList()

  override fun getRoots(module: Module, file: VirtualFile): Collection<PsiFileSystemItem> =
    getPsiFileSystemItem(module.project, file)
      ?.let { NuxtModelManager.getApplication(it) }
      ?.staticResourcesDir
      ?.let { listOf(it) }
    ?: emptyList()
}
