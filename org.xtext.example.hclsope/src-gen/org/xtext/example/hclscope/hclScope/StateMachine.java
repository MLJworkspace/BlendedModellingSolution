/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.hclScope;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getInitialtransition <em>Initialtransition</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getJunction <em>Junction</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.StateMachine#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.hclscope.hclScope.StateMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.hclscope.hclScope.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Initialtransition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialtransition</em>' containment reference.
   * @see #setInitialtransition(InitialTransition)
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_Initialtransition()
   * @model containment="true"
   * @generated
   */
  InitialTransition getInitialtransition();

  /**
   * Sets the value of the '{@link org.xtext.example.hclscope.hclScope.StateMachine#getInitialtransition <em>Initialtransition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialtransition</em>' containment reference.
   * @see #getInitialtransition()
   * @generated
   */
  void setInitialtransition(InitialTransition value);

  /**
   * Returns the value of the '<em><b>Junction</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.hclscope.hclScope.Junction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junction</em>' containment reference list.
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_Junction()
   * @model containment="true"
   * @generated
   */
  EList<Junction> getJunction();

  /**
   * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.hclscope.hclScope.Choice}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' containment reference list.
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_Choice()
   * @model containment="true"
   * @generated
   */
  EList<Choice> getChoice();

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.hclscope.hclScope.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getStateMachine_Transition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransition();

} // StateMachine