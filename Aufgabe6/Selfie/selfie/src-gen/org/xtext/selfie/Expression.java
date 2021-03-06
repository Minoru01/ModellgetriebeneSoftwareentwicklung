/**
 * generated by Xtext 2.21.0
 */
package org.xtext.selfie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selfie.Expression#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.selfie.Expression#getValuable <em>Valuable</em>}</li>
 * </ul>
 *
 * @see org.xtext.selfie.SelfiePackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.selfie.SelfiePackage#getExpression_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Expression#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Valuable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuable</em>' containment reference.
   * @see #setValuable(Valuable)
   * @see org.xtext.selfie.SelfiePackage#getExpression_Valuable()
   * @model containment="true"
   * @generated
   */
  Valuable getValuable();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Expression#getValuable <em>Valuable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuable</em>' containment reference.
   * @see #getValuable()
   * @generated
   */
  void setValuable(Valuable value);

} // Expression
