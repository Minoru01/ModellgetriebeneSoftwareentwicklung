/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.zustandsdiagramm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.zustandsdiagramm.FinalState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.zustandsdiagramm.ZustandsdiagrammPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(TargetableState)
   * @see org.xtext.example.mydsl.zustandsdiagramm.ZustandsdiagrammPackage#getFinalState_Name()
   * @model containment="true"
   * @generated
   */
  TargetableState getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.zustandsdiagramm.FinalState#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(TargetableState value);

} // FinalState
