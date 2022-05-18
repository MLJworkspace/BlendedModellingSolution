/**
 */
package calendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.ActiveMeeting#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getActiveMeeting()
 * @model
 * @generated
 */
public interface ActiveMeeting extends Person, Meeting {
	/**
	 * Returns the value of the '<em><b>Division</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Division#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' container reference.
	 * @see #setDivision(Division)
	 * @see calendar.CalendarPackage#getActiveMeeting_Division()
	 * @see calendar.Division#getMeeting
	 * @model opposite="meeting" required="true" transient="false"
	 * @generated
	 */
	Division getDivision();

	/**
	 * Sets the value of the '{@link calendar.ActiveMeeting#getDivision <em>Division</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' container reference.
	 * @see #getDivision()
	 * @generated
	 */
	void setDivision(Division value);

} // ActiveMeeting
