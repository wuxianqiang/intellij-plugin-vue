// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.libraries.nuxt

import com.intellij.lang.javascript.buildTools.webpack.WebPackConfig
import com.intellij.lang.javascript.buildTools.webpack.WebPackConfigManager
import com.intellij.lang.javascript.buildTools.webpack.WebPackConfigPath
import com.intellij.lang.javascript.buildTools.webpack.WebPackResolve
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.hxz.mpxjs.lang.VueTestModule
import com.hxz.mpxjs.lang.configureVueDependencies
import com.hxz.mpxjs.lang.getVueTestDataPath

class NuxtCompletionTest : BasePlatformTestCase() {

  override fun getTestDataPath(): String = getVueTestDataPath() + "/libraries/nuxt/completion"

  fun testNuxtExtensionsBasic() {
    myFixture.configureVueDependencies(VueTestModule.NUXT_2_8_1, VueTestModule.VUE_2_6_10)
    myFixture.configureByText("test.vue", "<script>export default {<caret>}</script>")
    myFixture.completeBasic()
    assertContainsElements(
      myFixture.lookupElementStrings!!,
      "asyncData", "fetch", "head", "key", "layout", "loading", "middleware", "scrollToTop", "transition", "validate",
      "watchQuery"
    )
  }

  fun testNuxtApp() {
    myFixture.configureVueDependencies(VueTestModule.NUXT_2_8_1, VueTestModule.VUE_2_6_10)
    myFixture.configureByText("test.vue", "<template>{{\$nuxt.<caret>}}</template>")
    myFixture.completeBasic()
    assertContainsElements(
      myFixture.lookupElementStrings!!,
      "\$options", "\$loading", "isOffline", "isOnline", "\$nuxt"
    )
  }

  fun testNuxtExtensionsBasic2_13() {
    myFixture.configureVueDependencies(VueTestModule.NUXT_2_13_2, VueTestModule.VUE_2_6_10)
    myFixture.configureByText("test.vue", "<script>export default {<caret>}</script>")
    myFixture.completeBasic()
    assertContainsElements(
      myFixture.lookupElementStrings!!,
      "asyncData", "fetch", "head", "key", "layout", "loading", "middleware", "scrollToTop", "transition", "validate",
      "watchQuery"
    )
  }

  fun testNuxtApp2_13() {
    myFixture.configureVueDependencies(VueTestModule.NUXT_2_13_2, VueTestModule.VUE_2_6_10)
    myFixture.configureByText("test.vue", "<template>{{\$nuxt.<caret>}}</template>")
    myFixture.completeBasic()
    assertContainsElements(
      myFixture.lookupElementStrings!!,
      "\$options", "\$loading", "isOffline", "isOnline", "\$nuxt", "\$fetch"
    )
  }

  fun testNuxtComponents() {
    myFixture.configureVueDependencies(VueTestModule.NUXT_2_13_2, VueTestModule.VUE_2_6_10)
    WebPackConfigManager.getInstance(project).setConfig(WebPackConfig(WebPackResolve(mapOf("@" to WebPackConfigPath("/src"), "~" to WebPackConfigPath("/src")))))
    myFixture.copyDirectoryToProject("components", ".")
    myFixture.configureFromTempProjectFile("index.vue")
    myFixture.completeBasic()

    assertContainsElements(
      myFixture.lookupElementStrings!!,
      "Special", "LazySpecial", "Javascript", "LazyJavascript", "Regular", "LazyRegular",
      "Prefixed", "LazyPrefixed", "PrefixedAnother", "LazyPrefixedAnother",
      "special", "lazy-special", "javascript", "lazy-javascript", "regular", "lazy-regular",
      "prefixed", "lazy-prefixed", "prefixed-another", "lazy-prefixed-another"
    )
    assertDoesntContain(
      myFixture.lookupElementStrings!!,
      "LazyPrefixedPrefixed", "lazy-prefixed-prefixed", "LazyAnother", "lazy-another", "LazyBad", "lazy-bad"
    )
  }

}