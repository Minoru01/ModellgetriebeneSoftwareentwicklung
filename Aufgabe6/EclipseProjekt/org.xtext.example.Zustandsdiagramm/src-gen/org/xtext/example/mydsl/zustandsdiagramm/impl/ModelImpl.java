/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.zustandsdiagramm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.zustandsdiagramm.FinalState;
import org.xtext.example.mydsl.zustandsdiagramm.GenericState;
import org.xtext.example.mydsl.zustandsdiagramm.InitialState;
import org.xtext.example.mydsl.zustandsdiagramm.Model;
import org.xtext.example.mydsl.zustandsdiagramm.ZustandsdiagrammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.zustandsdiagramm.impl.ModelImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.zustandsdiagramm.impl.ModelImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.zustandsdiagramm.impl.ModelImpl#getGenericState <em>Generic State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected EList<InitialState> initialState;

  /**
   * The cached value of the '{@link #getFinalState() <em>Final State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalState()
   * @generated
   * @ordered
   */
  protected EList<FinalState> finalState;

  /**
   * The cached value of the '{@link #getGenericState() <em>Generic State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericState()
   * @generated
   * @ordered
   */
  protected EList<GenericState> genericState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ZustandsdiagrammPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InitialState> getInitialState()
  {
    if (initialState == null)
    {
      initialState = new EObjectContainmentEList<InitialState>(InitialState.class, this, ZustandsdiagrammPackage.MODEL__INITIAL_STATE);
    }
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FinalState> getFinalState()
  {
    if (finalState == null)
    {
      finalState = new EObjectContainmentEList<FinalState>(FinalState.class, this, ZustandsdiagrammPackage.MODEL__FINAL_STATE);
    }
    return finalState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GenericState> getGenericState()
  {
    if (genericState == null)
    {
      genericState = new EObjectContainmentEList<GenericState>(GenericState.class, this, ZustandsdiagrammPackage.MODEL__GENERIC_STATE);
    }
    return genericState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ZustandsdiagrammPackage.MODEL__INITIAL_STATE:
        return ((InternalEList<?>)getInitialState()).basicRemove(otherEnd, msgs);
      case ZustandsdiagrammPackage.MODEL__FINAL_STATE:
        return ((InternalEList<?>)getFinalState()).basicRemove(otherEnd, msgs);
      case ZustandsdiagrammPackage.MODEL__GENERIC_STATE:
        return ((InternalEList<?>)getGenericState()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ZustandsdiagrammPackage.MODEL__INITIAL_STATE:
        return getInitialState();
      case ZustandsdiagrammPackage.MODEL__FINAL_STATE:
        return getFinalState();
      case ZustandsdiagrammPackage.MODEL__GENERIC_STATE:
        return getGenericState();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ZustandsdiagrammPackage.MODEL__INITIAL_STATE:
        getInitialState().clear();
        getInitialState().addAll((Collection<? extends InitialState>)newValue);
        return;
      case ZustandsdiagrammPackage.MODEL__FINAL_STATE:
        getFinalState().clear();
        getFinalState().addAll((Collection<? extends FinalState>)newValue);
        return;
      case ZustandsdiagrammPackage.MODEL__GENERIC_STATE:
        getGenericState().clear();
        getGenericState().addAll((Collection<? extends GenericState>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ZustandsdiagrammPackage.MODEL__INITIAL_STATE:
        getInitialState().clear();
        return;
      case ZustandsdiagrammPackage.MODEL__FINAL_STATE:
        getFinalState().clear();
        return;
      case ZustandsdiagrammPackage.MODEL__GENERIC_STATE:
        getGenericState().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ZustandsdiagrammPackage.MODEL__INITIAL_STATE:
        return initialState != null && !initialState.isEmpty();
      case ZustandsdiagrammPackage.MODEL__FINAL_STATE:
        return finalState != null && !finalState.isEmpty();
      case ZustandsdiagrammPackage.MODEL__GENERIC_STATE:
        return genericState != null && !genericState.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
