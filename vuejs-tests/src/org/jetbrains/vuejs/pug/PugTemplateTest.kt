// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.pug

import com.intellij.lang.javascript.inspections.JSIncompatibleTypesComparisonInspection
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.hxz.mpxjs.lang.createPackageJsonWithVueDependency
import com.hxz.mpxjs.lang.getVueTestDataPath

class PugTemplateTest : BasePlatformTestCase() {

  override fun getTestDataPath(): String = getVueTestDataPath() + "/pug/"

  fun testJadeExtendsResolve() {
    createPackageJsonWithVueDependency(myFixture)
    myFixture.copyDirectoryToProject("jadeExtends", ".")
    myFixture.configureFromTempProjectFile("test.vue")
    myFixture.checkHighlighting()
  }

  fun testPugExtendsResolve() {
    createPackageJsonWithVueDependency(myFixture)
    myFixture.copyDirectoryToProject("pugExtends", ".")
    myFixture.configureFromTempProjectFile("test.vue")
    myFixture.checkHighlighting()
  }

  fun testInjectedExpressions() {
    myFixture.enableInspections(JSIncompatibleTypesComparisonInspection())
    myFixture.configureByFile("injectedExpressions.vue")
    myFixture.checkHighlighting()
  }

  fun testLineCommenterWithinTemplate() {
    doCommenterTest(true)
  }

  fun testLineCommenterCaret() {
    doCommenterTest(true)
  }

  fun testLineCommenterAcrossTemplate() {
    doCommenterTest(true)
  }

  fun testLineCommenterBinding() {
    doCommenterTest(true)
  }

  fun testBlockCommenterBinding() {
    doCommenterTest(false)
  }

  private fun doCommenterTest(lineCommenter: Boolean) {
    val name = getTestName(true)
    myFixture.configureByFile("$name.vue")
    myFixture.performEditorAction(if (lineCommenter) "CommentByLineComment" else "CommentByBlockComment")
    myFixture.checkResultByFile("${name}_after.vue")
  }

}
