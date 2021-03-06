/**
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.ts.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TStructural Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.n4js.ts.types.TypesPackage#getTStructuralType()
 * @model
 * @generated
 */
public interface TStructuralType extends ContainerType<TStructMember>, SyntaxRelatedTElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Structural types can be sub-typed, since only the structure is used for typing.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;'"
	 * @generated
	 */
	boolean isFinal();

} // TStructuralType
