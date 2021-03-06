/**
 * generated by Xtext 2.21.0
 */
package org.xtext.selfie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selfie.Valuable#getLeftValue <em>Left Value</em>}</li>
 *   <li>{@link org.xtext.selfie.Valuable#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.selfie.Valuable#getRightValue <em>Right Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.selfie.SelfiePackage#getValuable()
 * @model
 * @generated
 */
public interface Valuable extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Value</em>' containment reference.
   * @see #setLeftValue(Valuable)
   * @see org.xtext.selfie.SelfiePackage#getValuable_LeftValue()
   * @model containment="true"
   * @generated
   */
  Valuable getLeftValue();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Valuable#getLeftValue <em>Left Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Value</em>' containment reference.
   * @see #getLeftValue()
   * @generated
   */
  void setLeftValue(Valuable value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.selfie.Operator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.xtext.selfie.Operator
   * @see #setOperator(Operator)
   * @see org.xtext.selfie.SelfiePackage#getValuable_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Valuable#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.xtext.selfie.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Right Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Value</em>' containment reference.
   * @see #setRightValue(Valuable)
   * @see org.xtext.selfie.SelfiePackage#getValuable_RightValue()
   * @model containment="true"
   * @generated
   */
  Valuable getRightValue();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Valuable#getRightValue <em>Right Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Value</em>' containment reference.
   * @see #getRightValue()
   * @generated
   */
  void setRightValue(Valuable value);

} // Valuable
