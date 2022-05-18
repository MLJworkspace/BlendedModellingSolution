/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.InternalParticipant#getSurname <em>Surname</em>}</li>
 *   <li>{@link calendar.InternalParticipant#getParticipantsDivision <em>Participants Division</em>}</li>
 *   <li>{@link calendar.InternalParticipant#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.InternalParticipant#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getInternalParticipant()
 * @model
 * @generated
 */
public interface InternalParticipant extends Person {
	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see calendar.CalendarPackage#getInternalParticipant_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link calendar.InternalParticipant#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Participants Division</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants Division</em>' reference.
	 * @see #setParticipantsDivision(Division)
	 * @see calendar.CalendarPackage#getInternalParticipant_ParticipantsDivision()
	 * @model
	 * @generated
	 */
	Division getParticipantsDivision();

	/**
	 * Sets the value of the '{@link calendar.InternalParticipant#getParticipantsDivision <em>Participants Division</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participants Division</em>' reference.
	 * @see #getParticipantsDivision()
	 * @generated
	 */
	void setParticipantsDivision(Division value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Participant#getInternalparticipant <em>Internalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' container reference.
	 * @see #setParticipant(Participant)
	 * @see calendar.CalendarPackage#getInternalParticipant_Participant()
	 * @see calendar.Participant#getInternalparticipant
	 * @model opposite="internalparticipant" required="true" transient="false"
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link calendar.InternalParticipant#getParticipant <em>Participant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' container reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link calendar.Item}.
	 * It is bidirectional and its opposite is '{@link calendar.Item#getInternalparticipant <em>Internalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see calendar.CalendarPackage#getInternalParticipant_Item()
	 * @see calendar.Item#getInternalparticipant
	 * @model opposite="internalparticipant"
	 * @generated
	 */
	EList<Item> getItem();

} // InternalParticipant
