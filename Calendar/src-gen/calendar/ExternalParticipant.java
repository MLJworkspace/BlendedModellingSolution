/**
 */
package calendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.ExternalParticipant#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getExternalParticipant()
 * @model
 * @generated
 */
public interface ExternalParticipant extends Person {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Participant#getExternalparticipant <em>Externalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' container reference.
	 * @see #setParticipant(Participant)
	 * @see calendar.CalendarPackage#getExternalParticipant_Participant()
	 * @see calendar.Participant#getExternalparticipant
	 * @model opposite="externalparticipant" required="true" transient="false"
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link calendar.ExternalParticipant#getParticipant <em>Participant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' container reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

} // ExternalParticipant
