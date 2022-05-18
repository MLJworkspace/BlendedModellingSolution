/**
 */
package calendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Task Personnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.NoTaskPersonnel#getDivision <em>Division</em>}</li>
 *   <li>{@link calendar.NoTaskPersonnel#getSurname <em>Surname</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getNoTaskPersonnel()
 * @model
 * @generated
 */
public interface NoTaskPersonnel extends Person {
	/**
	 * Returns the value of the '<em><b>Division</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Division#getNotaskpersonnel <em>Notaskpersonnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' container reference.
	 * @see #setDivision(Division)
	 * @see calendar.CalendarPackage#getNoTaskPersonnel_Division()
	 * @see calendar.Division#getNotaskpersonnel
	 * @model opposite="notaskpersonnel" required="true" transient="false"
	 * @generated
	 */
	Division getDivision();

	/**
	 * Sets the value of the '{@link calendar.NoTaskPersonnel#getDivision <em>Division</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' container reference.
	 * @see #getDivision()
	 * @generated
	 */
	void setDivision(Division value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see calendar.CalendarPackage#getNoTaskPersonnel_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link calendar.NoTaskPersonnel#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

} // NoTaskPersonnel
