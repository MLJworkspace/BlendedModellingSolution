/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Participant#getExternalparticipant <em>Externalparticipant</em>}</li>
 *   <li>{@link calendar.Participant#getInternalparticipant <em>Internalparticipant</em>}</li>
 *   <li>{@link calendar.Participant#getNotavailable <em>Notavailable</em>}</li>
 *   <li>{@link calendar.Participant#getMeeting <em>Meeting</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Externalparticipant</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.ExternalParticipant}.
	 * It is bidirectional and its opposite is '{@link calendar.ExternalParticipant#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalparticipant</em>' containment reference list.
	 * @see calendar.CalendarPackage#getParticipant_Externalparticipant()
	 * @see calendar.ExternalParticipant#getParticipant
	 * @model opposite="participant" containment="true"
	 * @generated
	 */
	EList<ExternalParticipant> getExternalparticipant();

	/**
	 * Returns the value of the '<em><b>Internalparticipant</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.InternalParticipant}.
	 * It is bidirectional and its opposite is '{@link calendar.InternalParticipant#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internalparticipant</em>' containment reference list.
	 * @see calendar.CalendarPackage#getParticipant_Internalparticipant()
	 * @see calendar.InternalParticipant#getParticipant
	 * @model opposite="participant" containment="true"
	 * @generated
	 */
	EList<InternalParticipant> getInternalparticipant();

	/**
	 * Returns the value of the '<em><b>Notavailable</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.NotAvailable}.
	 * It is bidirectional and its opposite is '{@link calendar.NotAvailable#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notavailable</em>' containment reference list.
	 * @see calendar.CalendarPackage#getParticipant_Notavailable()
	 * @see calendar.NotAvailable#getParticipant
	 * @model opposite="participant" containment="true"
	 * @generated
	 */
	EList<NotAvailable> getNotavailable();

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Meeting#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting</em>' container reference.
	 * @see #setMeeting(Meeting)
	 * @see calendar.CalendarPackage#getParticipant_Meeting()
	 * @see calendar.Meeting#getParticipant
	 * @model opposite="participant" required="true" transient="false"
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link calendar.Participant#getMeeting <em>Meeting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' container reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

} // Participant
