// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.libraries.vuex.types

import com.intellij.lang.javascript.psi.JSRecordType
import com.intellij.lang.javascript.psi.JSType
import com.intellij.lang.javascript.psi.JSTypeTextBuilder
import com.intellij.lang.javascript.psi.JSTypeWithIncompleteSubstitution
import com.intellij.lang.javascript.psi.ecma6.TypeScriptInterface
import com.intellij.lang.javascript.psi.stubs.JSImplicitElement
import com.intellij.lang.javascript.psi.types.*
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import com.hxz.mpxjs.codeInsight.resolveSymbolFromNodeModule
import com.hxz.mpxjs.libraries.vuex.VuexUtils.COMMIT
import com.hxz.mpxjs.libraries.vuex.VuexUtils.DISPATCH
import com.hxz.mpxjs.libraries.vuex.VuexUtils.GETTERS
import com.hxz.mpxjs.libraries.vuex.VuexUtils.ROOT_GETTERS
import com.hxz.mpxjs.libraries.vuex.VuexUtils.ROOT_STATE
import com.hxz.mpxjs.libraries.vuex.VuexUtils.STATE
import com.hxz.mpxjs.libraries.vuex.model.store.VuexStaticNamespace
import com.hxz.mpxjs.libraries.vuex.model.store.VuexStoreActionContextNamespace
import com.hxz.mpxjs.model.VueImplicitElement
import java.util.*

class VuexActionContextType private constructor(source: JSTypeSource,
                                                private val element: PsiElement)
  : JSSimpleTypeBaseImpl(source), JSCodeBasedType, JSTypeWithIncompleteSubstitution {

  constructor(element: PsiElement)
    : this(JSTypeSource(element, JSTypeSource.SourceLanguage.TS, true), element)

  override fun copyWithNewSource(source: JSTypeSource): JSType = VuexActionContextType(source, element)

  override fun hashCodeImpl(): Int {
    return Objects.hash(element)
  }

  override fun isEquivalentToWithSameClass(type: JSType, context: ProcessingContext?, allowResolve: Boolean): Boolean {
    return (type.javaClass == this.javaClass)
           && (type as VuexActionContextType).element == element
  }

  override fun buildTypeTextImpl(format: JSType.TypeTextFormat, builder: JSTypeTextBuilder) {
    if (format == JSType.TypeTextFormat.SIMPLE) {
      builder.append("#$javaClass")
      return
    }
    substitute().buildTypeText(format, builder)
  }


  override fun substituteCompletely(): JSType {
    val result = mutableListOf<JSRecordType.TypeMember>()

    fun addProperty(name: String, type: JSType?) {
      result.add(JSRecordTypeImpl.PropertySignatureImpl(
        name, type, false, true,
        VueImplicitElement(name, type, element, JSImplicitElement.Type.Property)))
    }

    addProperty(STATE, VuexContainerStateType(element, VuexStoreActionContextNamespace()))
    addProperty(ROOT_STATE, VuexContainerStateType(element, VuexStaticNamespace.EMPTY))
    addProperty(GETTERS, VuexContainerGettersType(element, VuexStoreActionContextNamespace()))
    addProperty(ROOT_GETTERS, VuexContainerGettersType(element, VuexStaticNamespace.EMPTY))
    addProperty(DISPATCH, resolveSymbolFromNodeModule(
      element, "vuex", "Dispatch", TypeScriptInterface::class.java)?.jsType)
    addProperty(COMMIT, resolveSymbolFromNodeModule(
      element, "vuex", "Commit", TypeScriptInterface::class.java)?.jsType)
    return JSSimpleRecordTypeImpl(source, result)
  }
}

