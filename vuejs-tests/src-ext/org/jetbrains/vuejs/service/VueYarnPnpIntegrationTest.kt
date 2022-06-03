// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.service

import com.intellij.javascript.nodejs.library.yarn.YarnPnpManager
import com.intellij.lang.javascript.buildTools.npm.PackageJsonUtil
import com.intellij.lang.javascript.nodejs.library.yarn.AbstractYarnPnpIntegrationTest
import com.hxz.mpxjs.lang.VueInspectionsProvider
import com.hxz.mpxjs.lang.VueTestModule
import com.hxz.mpxjs.lang.configureVueDependencies
import com.hxz.mpxjs.lang.vueRelativeTestDataPath
import org.junit.Assert

class VueYarnPnpIntegrationTest: AbstractYarnPnpIntegrationTest() {

  override fun getBasePath(): String {
    return vueRelativeTestDataPath() + "/yarnPnp"
  }

  @Throws(Exception::class)
  fun testVue2() {
    val root = myFixture.copyDirectoryToProject("vue2", ".")
    configureYarnBerryAndRunYarnInstall(root)
    val yarnPnpManager = YarnPnpManager.getInstance(project)
    Assert.assertNotNull(yarnPnpManager.findInstalledPackageDir(PackageJsonUtil.findChildPackageJsonFile(root)!!, "vue"))
    myFixture.configureFromTempProjectFile("test.vue")
    myFixture.enableInspections(VueInspectionsProvider())
    myFixture.checkHighlighting()
  }

}