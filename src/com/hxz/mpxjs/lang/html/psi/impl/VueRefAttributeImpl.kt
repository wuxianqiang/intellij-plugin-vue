// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.lang.html.psi.impl

import com.intellij.javascript.web.types.WebJSTypesUtil
import com.intellij.lang.ASTNode
import com.intellij.lang.javascript.psi.JSType
import com.intellij.lang.javascript.psi.ecma6.impl.JSLocalImplicitElementImpl
import com.intellij.lang.javascript.psi.stubs.JSImplicitElement
import com.intellij.lang.javascript.psi.stubs.TypeScriptMergedTypeImplicitElement
import com.intellij.lang.javascript.psi.types.JSArrayTypeImpl
import com.intellij.lang.javascript.psi.types.JSCompositeTypeFactory
import com.intellij.lang.javascript.psi.types.JSTypeSourceFactory
import com.intellij.openapi.util.TextRange
import com.intellij.pom.PomRenameableTarget
import com.intellij.pom.PomTarget
import com.intellij.pom.PomTargetPsiElement
import com.intellij.pom.PsiDeclaredTarget
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.xml.XmlStubBasedAttributeBase
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiModificationTracker
import com.intellij.refactoring.suggested.startOffset
import com.hxz.mpxjs.codeInsight.ATTR_DIRECTIVE_PREFIX
import com.hxz.mpxjs.codeInsight.attributes.VueAttributeNameParser.VueDirectiveKind
import com.hxz.mpxjs.codeInsight.resolveLocalComponent
import com.hxz.mpxjs.lang.html.psi.VueRefAttribute
import com.hxz.mpxjs.model.VueModelManager
import com.hxz.mpxjs.model.VueRegularComponent

class VueRefAttributeImpl : XmlStubBasedAttributeBase<VueRefAttributeStubImpl>, VueRefAttribute {

  constructor(stub: VueRefAttributeStubImpl,
              nodeType: IStubElementType<out VueRefAttributeStubImpl, out VueRefAttributeImpl>) : super(stub, nodeType)

  constructor(node: ASTNode) : super(node)

  override fun getValue(): String? =
    stub?.value ?: super.getValue()

  override val isList: Boolean
    get() = stub?.isList ?: (parent.getAttribute(V_FOR_NAME) != null)

  override val containingTagName: String
    get() = stub?.containingTagName ?: parent.name

  override val implicitElement: VueRefAttribute.VueRefDeclaration?
    get() = CachedValuesManager.getCachedValue(this) {
      CachedValueProvider.Result(
        value?.trim()
          ?.takeIf { it.isNotEmpty() }
          ?.let { VueRefDeclarationImpl(it, resolveTagType(), this, JSImplicitElement.Type.Property) },
        PsiModificationTracker.MODIFICATION_COUNT)
    }

  private fun resolveTagType(): JSType? {
    val component = VueModelManager.findEnclosingContainer(this) as? VueRegularComponent ?: return null
    val source = JSTypeSourceFactory.createTypeSource(this, true)
    return (resolveLocalComponent(component, containingTagName, containingFile.originalFile)
              .takeIf { it.isNotEmpty() }
              ?.map { it.thisType }
              ?.let { JSCompositeTypeFactory.createUnionType(source, it) }
            ?: WebJSTypesUtil.getHtmlElementClassType(source, containingTagName))
      ?.let { if (isList) JSArrayTypeImpl(it, it.source) else it }
  }

  private class VueRefDeclarationImpl(name: String, jsType: JSType?, provider: PsiElement, kind: JSImplicitElement.Type)
    : JSLocalImplicitElementImpl(name, jsType, provider, kind), VueRefAttribute.VueRefDeclaration,
      PomRenameableTarget<PsiElement>, PomTargetPsiElement, PsiDeclaredTarget {

    override fun setName(name: String): PsiElement {
      (myProvider as VueRefAttribute).setValue(name)
      return myProvider.implicitElement!!
    }

    override fun getNavigationElement(): PsiElement {
      return (myProvider as VueRefAttribute).valueElement ?: super.getNavigationElement()
    }

    override fun getNameIdentifierRange(): TextRange? =
      (myProvider as VueRefAttribute).valueElement?.let { it.valueTextRange?.shiftLeft(it.startOffset) }

    override fun getTextRange(): TextRange =
      (myProvider as VueRefAttribute).valueElement?.valueTextRange ?: TextRange.EMPTY_RANGE

    override fun isEquivalentTo(another: PsiElement?): Boolean =
      when (another) {
        is VueRefDeclarationImpl -> equals(another)
        is TypeScriptMergedTypeImplicitElement -> equals(another.explicitElement)
        else -> false
      }

    override fun getTarget(): PomTarget = this
  }

  companion object {
    private val V_FOR_NAME = ATTR_DIRECTIVE_PREFIX + VueDirectiveKind.FOR.directiveName
  }

}