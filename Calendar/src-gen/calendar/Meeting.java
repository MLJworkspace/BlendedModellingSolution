/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Meeting#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.Meeting#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link calendar.Meeting#getNonactivemeeting <em>Nonactivemeeting</em>}</li>
 *   <li>{@link calendar.Meeting#getActivemeeting <em>Activemeeting</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends EObject {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.Participant}.
	 * It is bidirectional and its opposite is '{@link calendar.Participant#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see calendar.CalendarPackage#getMeeting_Participant()
	 * @see calendar.Participant#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda</em>' containment reference.
	 * @see #setAgenda(Agenda)
	 * @see calendar.CalendarPackage#getMeeting_Agenda()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Agenda getAgenda();

	/**
	 * Sets the value of the '{@link calendar.Meeting#getAgenda <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda</em>' containment reference.
	 * @see #getAgenda()
	 * @generated
	 */
	void setAgenda(Agenda value);

	/**
	 * Returns the value of the '<em><b>Nonactivemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonactivemeeting</em>' reference.
	 * @see #setNonactivemeeting(NonActiveMeeting)
	 * @see calendar.CalendarPackage#getMeeting_Nonactivemeeting()
	 * @model
	 * @generated
	 */
	NonActiveMeeting getNonactivemeeting();

	/**
	 * Sets the value of the '{@link calendar.Meeting#getNonactivemeeting <em>Nonactivemeeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonactivemeeting</em>' reference.
	 * @see #getNonactivemeeting()
	 * @generated
	 */
	void setNonactivemeeting(NonActiveMeeting value);

	/**
	 * Returns the value of the '<em><b>Activemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activemeeting</em>' reference.
	 * @see #setActivemeeting(ActiveMeeting)
	 * @see calendar.CalendarPackage#getMeeting_Activemeeting()
	 * @model
	 * @generated
	 */
	ActiveMeeting getActivemeeting();

	/**
	 * Sets the value of the '{@link calendar.Meeting#getActivemeeting <em>Activemeeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activemeeting</em>' reference.
	 * @see #getActivemeeting()
	 * @generated
	 */
	void setActivemeeting(ActiveMeeting value);

} // Meeting
