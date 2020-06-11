/**
 * generated by Xtext 2.21.0
 */
package org.xtext.selfie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selfie.Assignment#getValuable <em>Valuable</em>}</li>
 * </ul>
 *
 * @see org.xtext.selfie.SelfiePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression
{
  /**
   * Returns the value of the '<em><b>Valuable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuable</em>' containment reference.
   * @see #setValuable(Valuable)
   * @see org.xtext.selfie.SelfiePackage#getAssignment_Valuable()
   * @model containment="true"
   * @generated
   */
  Valuable getValuable();

  /**
   * Sets the value of the '{@link org.xtext.selfie.Assignment#getValuable <em>Valuable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuable</em>' containment reference.
   * @see #getValuable()
   * @generated
   */
  void setValuable(Valuable value);

} // Assignment
