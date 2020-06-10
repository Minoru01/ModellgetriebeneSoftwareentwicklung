/**
 * generated by Xtext 2.21.0
 */
package org.xtext.selfie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selfie.Model#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.selfie.SelfiePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.selfie.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.selfie.SelfiePackage#getModel_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Model
