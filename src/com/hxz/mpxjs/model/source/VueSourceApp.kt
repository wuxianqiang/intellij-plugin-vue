// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.hxz.mpxjs.model.source

import com.intellij.lang.javascript.psi.JSObjectLiteralExpression
import com.intellij.lang.javascript.psi.stubs.JSImplicitElement
import com.hxz.mpxjs.model.VueApp

class VueSourceApp(source: JSImplicitElement, declaration: JSObjectLiteralExpression)
  : VueSourceContainer(source, VueSourceEntityDescriptor(declaration)), VueApp
