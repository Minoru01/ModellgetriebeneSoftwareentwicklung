/**
 * generated by Xtext 2.21.0
 */
package org.xtext.selfie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selfie.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.selfie.SelfiePackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Valuable
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.selfie.SelfiePackage#getVariableRef_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.selfie.VariableRef#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // VariableRef
