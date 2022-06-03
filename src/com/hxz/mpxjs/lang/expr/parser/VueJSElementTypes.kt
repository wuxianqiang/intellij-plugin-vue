// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.lang.expr.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.javascript.types.JSExpressionElementType
import com.intellij.psi.tree.ICompositeElementType
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import com.hxz.mpxjs.lang.expr.VueJSLanguage
import com.hxz.mpxjs.lang.expr.psi.impl.*

object VueJSElementTypes {

  val FILTER_ARGUMENTS_LIST: IElementType = VueJSExpressionElementType(
    "FILTER_ARGUMENTS_LIST", ::VueJSFilterArgumentsListImpl)

  val FILTER_REFERENCE_EXPRESSION: IElementType = VueJSExpressionElementType(
    "FILTER_REFERENCE_EXPRESSION", ::VueJSFilterReferenceExpressionImpl)

  val FILTER_LEFT_SIDE_ARGUMENT: IElementType = VueJSExpressionElementType(
    "FILTER_LEFT_SIDE_ARGUMENT", ::VueJSFilterLeftSideArgumentImpl)

  val FILTER_EXPRESSION: IElementType = VueJSExpressionElementType(
    "FILTER_EXPRESSION", ::VueJSFilterExpressionImpl)

  val V_FOR_EXPRESSION: IElementType = VueJSExpressionElementType(
    "V_FOR_EXPRESSION", ::VueJSVForExpressionImpl)

  val SLOT_PROPS_EXPRESSION: IElementType = VueJSExpressionElementType(
    "SLOT_PROPS_EXPRESSION", ::VueJSSlotPropsExpressionImpl)

  val EMBEDDED_EXPR_STATEMENT: IElementType = VueJSElementType(
    "VUE:EMBEDDED_EXPR_STATEMENT", ::VueJSEmbeddedExpressionImpl)


  private open class VueJSElementType(@NonNls debugName: String, private val myClassConstructor: (VueJSElementType) -> ASTNode)
    : IElementType(debugName, VueJSLanguage.INSTANCE), ICompositeElementType {
    final override fun createCompositeNode(): ASTNode = myClassConstructor(this)
  }

  private class VueJSExpressionElementType(@NonNls debugName: String,
                                           classConstructor: (VueJSElementType) -> ASTNode)
    : VueJSElementType(debugName, classConstructor), JSExpressionElementType


}

