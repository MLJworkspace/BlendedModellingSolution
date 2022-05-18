/**
 */
package calendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Active Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.NonActiveMeeting#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getNonActiveMeeting()
 * @model
 * @generated
 */
public interface NonActiveMeeting extends Person, Meeting {
	/**
	 * Returns the value of the '<em><b>Division</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Division#getNonactivemeeting <em>Nonactivemeeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' container reference.
	 * @see #setDivision(Division)
	 * @see calendar.CalendarPackage#getNonActiveMeeting_Division()
	 * @see calendar.Division#getNonactivemeeting
	 * @model opposite="nonactivemeeting" required="true" transient="false"
	 * @generated
	 */
	Division getDivision();

	/**
	 * Sets the value of the '{@link calendar.NonActiveMeeting#getDivision <em>Division</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' container reference.
	 * @see #getDivision()
	 * @generated
	 */
	void setDivision(Division value);

} // NonActiveMeeting
