// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.service

import com.intellij.codeInsight.completion.CompletionType
import com.intellij.lang.javascript.service.JSLanguageService
import com.intellij.lang.javascript.service.JSLanguageServiceBase
import com.intellij.lang.javascript.service.JSLanguageServiceProvider
import com.intellij.lang.javascript.typescript.service.TypeScriptServiceTestBase
import com.intellij.lang.typescript.compiler.TypeScriptCompilerSettings
import com.intellij.openapi.application.WriteAction
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.testFramework.JUnit38AssumeSupportRunner
import com.intellij.util.containers.ContainerUtil
import com.intellij.util.ui.UIUtil
import junit.framework.TestCase
import com.hxz.mpxjs.lang.VueTestModule
import com.hxz.mpxjs.lang.configureVueDependencies
import com.hxz.mpxjs.lang.typescript.service.VueTypeScriptService
import com.hxz.mpxjs.lang.vueRelativeTestDataPath
import org.junit.runner.RunWith

@RunWith(JUnit38AssumeSupportRunner::class)
class VueTypeScriptServiceTest : TypeScriptServiceTestBase() {
  override fun getService(): JSLanguageServiceBase {
    val services = JSLanguageServiceProvider.getLanguageServices(project)
    return ContainerUtil.find(services) { el: JSLanguageService? -> el is VueTypeScriptService } as JSLanguageServiceBase
  }

  override fun getExtension(): String {
    return "vue"
  }

  private fun completeTsLangAndAssert() {
    doTestWithCopyDirectory()
    myFixture.type(" lang=\"\bts\"")
    FileDocumentManager.getInstance().saveDocument(myFixture.getDocument(myFixture.file))
    UIUtil.dispatchAllInvocationEvents()
    checkAfterFile("vue")
  }

  override fun getBasePath(): String {
    return vueRelativeTestDataPath() + BASE_PATH
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVue() {
    doTestWithCopyDirectory()
    myFixture.configureByFile("SimpleVueNoTs.vue")
    checkHighlightingByOptions(false)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testGotoDeclaration() {
    myFixture.configureVueDependencies(VueTestModule.VUE_2_6_10)
    myFixture.configureByFile("GotoDeclaration.vue")
    myFixture.performEditorAction("GotoDeclaration")
    TestCase.assertEquals(2399, myFixture.editor.caretModel.currentCaret.offset)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  @Throws(Exception::class)
  fun testSimpleCompletion() {
    checkBaseStringQualifiedCompletionWithTemplates(
      {
        doTestWithCopyDirectory()
        myFixture.complete(
          CompletionType.BASIC)
      }, true)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueNoTs() {
    doTestWithCopyDirectory()
    myFixture.configureByFile("SimpleVue.vue")
    checkHighlightingByOptions(false)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueEditing() {
    doTestWithCopyDirectory()
    myFixture.type('\b')
    checkAfterFile("vue")
    myFixture.type('s')
    checkAfterFile("2.vue")
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueEditingNoTs() {
    completeTsLangAndAssert()
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueEditingNoTsNoRefs() {
    completeTsLangAndAssert()
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueEditingCloseTag() {
    doTestWithCopyDirectory()
    myFixture.type('\b')
    checkAfterFile("vue")
    myFixture.type('/')
    checkAfterFile("2.vue")
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueTsx() {
    doTestWithCopyDirectory()
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testNoScriptSection() {
    myFixture.configureVueDependencies(VueTestModule.VUE_2_5_3)
    doTestWithCopyDirectory()
    myFixture.configureByFile("NoScriptSectionImport.vue")
    checkHighlightingByOptions(false)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testScriptSetup() {
    myFixture.configureVueDependencies(VueTestModule.VUE_3_0_0)
    doTestWithCopyDirectory()
    myFixture.configureFromTempProjectFile("ScriptSetup2.vue")
    myFixture.checkHighlighting()
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testNoScriptSectionVue3() {
    myFixture.configureVueDependencies(VueTestModule.VUE_3_0_0)
    doTestWithCopyDirectory()
    myFixture.configureByFile("main.ts")
    checkHighlightingByOptions(false)
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testConfigScope() {
    doTestWithCopyDirectory()
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueTsToTsx() {
    doTestWithCopyDirectory()
    myFixture.type('x')
    checkAfterFile("vue")
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testSimpleVueTsxToTs() {
    doTestWithCopyDirectory()
    myFixture.type('\b')
    checkAfterFile("vue")
  }

  @TypeScriptVersion(TypeScriptVersions.TS26)
  fun testNoVueCompileOnSave() {
    val settings = TypeScriptCompilerSettings.getSettings(project)
    settings.isRecompileOnChanges = true
    settings.setUseServiceForProjectsWithoutConfig(true)
    settings.setUseService(true)
    myFixture.copyDirectoryToProject(getTestName(false), "")
    myFixture.configureFromTempProjectFile(getTestName(false) + "." + extension)
    myFixture.checkHighlighting()
    myFixture.configureFromTempProjectFile(getTestName(false) + "Clear." + extension)
    myFixture.type("1")
    myFixture.configureFromTempProjectFile("test.ts")
    myFixture.type("1")
    WriteAction.runAndWait<Exception> {
      FileDocumentManager.getInstance().saveAllDocuments()
    }
    myFixture.checkHighlighting()
    waitEmptyServiceQueue()
    WriteAction.runAndWait<Exception> {
      myFixture.tempDirFixture.findOrCreateDir(".").refresh(false, true)
    }
    TestCase.assertEquals(listOf("NoVueCompileOnSave.vue", "NoVueCompileOnSaveClear.vue",
                                 "shims-vue.d.ts", "test.d.ts", "test.js", "test.js.map", "test.ts", "tsconfig.json"),
                          myFixture.tempDirFixture.findOrCreateDir(".")
                            .children.asSequence().map { it.name }.sorted().toList())
  }

  companion object {
    private const val BASE_PATH = "/ts_ls_highlighting"
  }
}
