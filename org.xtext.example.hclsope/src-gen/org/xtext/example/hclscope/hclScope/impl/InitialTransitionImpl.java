/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.hclScope.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.hclscope.hclScope.HclScopePackage;
import org.xtext.example.hclscope.hclScope.InitialState;
import org.xtext.example.hclscope.hclScope.InitialTransition;
import org.xtext.example.hclscope.hclScope.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hclscope.hclScope.impl.InitialTransitionImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.impl.InitialTransitionImpl#getInitialto <em>Initialto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialTransitionImpl extends TransitionsImpl implements InitialTransition
{
  /**
   * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialstate()
   * @generated
   * @ordered
   */
  protected InitialState initialstate;

  /**
   * The cached value of the '{@link #getInitialto() <em>Initialto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialto()
   * @generated
   * @ordered
   */
  protected Vertex initialto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialTransitionImpl()
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
    return HclScopePackage.Literals.INITIAL_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitialState getInitialstate()
  {
    return initialstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialstate(InitialState newInitialstate, NotificationChain msgs)
  {
    InitialState oldInitialstate = initialstate;
    initialstate = newInitialstate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HclScopePackage.INITIAL_TRANSITION__INITIALSTATE, oldInitialstate, newInitialstate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitialstate(InitialState newInitialstate)
  {
    if (newInitialstate != initialstate)
    {
      NotificationChain msgs = null;
      if (initialstate != null)
        msgs = ((InternalEObject)initialstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HclScopePackage.INITIAL_TRANSITION__INITIALSTATE, null, msgs);
      if (newInitialstate != null)
        msgs = ((InternalEObject)newInitialstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HclScopePackage.INITIAL_TRANSITION__INITIALSTATE, null, msgs);
      msgs = basicSetInitialstate(newInitialstate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HclScopePackage.INITIAL_TRANSITION__INITIALSTATE, newInitialstate, newInitialstate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Vertex getInitialto()
  {
    if (initialto != null && initialto.eIsProxy())
    {
      InternalEObject oldInitialto = (InternalEObject)initialto;
      initialto = (Vertex)eResolveProxy(oldInitialto);
      if (initialto != oldInitialto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HclScopePackage.INITIAL_TRANSITION__INITIALTO, oldInitialto, initialto));
      }
    }
    return initialto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex basicGetInitialto()
  {
    return initialto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitialto(Vertex newInitialto)
  {
    Vertex oldInitialto = initialto;
    initialto = newInitialto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HclScopePackage.INITIAL_TRANSITION__INITIALTO, oldInitialto, initialto));
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
      case HclScopePackage.INITIAL_TRANSITION__INITIALSTATE:
        return basicSetInitialstate(null, msgs);
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
      case HclScopePackage.INITIAL_TRANSITION__INITIALSTATE:
        return getInitialstate();
      case HclScopePackage.INITIAL_TRANSITION__INITIALTO:
        if (resolve) return getInitialto();
        return basicGetInitialto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HclScopePackage.INITIAL_TRANSITION__INITIALSTATE:
        setInitialstate((InitialState)newValue);
        return;
      case HclScopePackage.INITIAL_TRANSITION__INITIALTO:
        setInitialto((Vertex)newValue);
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
      case HclScopePackage.INITIAL_TRANSITION__INITIALSTATE:
        setInitialstate((InitialState)null);
        return;
      case HclScopePackage.INITIAL_TRANSITION__INITIALTO:
        setInitialto((Vertex)null);
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
      case HclScopePackage.INITIAL_TRANSITION__INITIALSTATE:
        return initialstate != null;
      case HclScopePackage.INITIAL_TRANSITION__INITIALTO:
        return initialto != null;
    }
    return super.eIsSet(featureID);
  }

} //InitialTransitionImpl
