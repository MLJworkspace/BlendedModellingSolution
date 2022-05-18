/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.NotAvailable#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.NotAvailable#getItem <em>Item</em>}</li>
 *   <li>{@link calendar.NotAvailable#getSurname <em>Surname</em>}</li>
 *   <li>{@link calendar.NotAvailable#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getNotAvailable()
 * @model
 * @generated
 */
public interface NotAvailable extends Person {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link calendar.Participant#getNotavailable <em>Notavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' container reference.
	 * @see #setParticipant(Participant)
	 * @see calendar.CalendarPackage#getNotAvailable_Participant()
	 * @see calendar.Participant#getNotavailable
	 * @model opposite="notavailable" required="true" transient="false"
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link calendar.NotAvailable#getParticipant <em>Participant</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link calendar.Item#getNotavailable <em>Notavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see calendar.CalendarPackage#getNotAvailable_Item()
	 * @see calendar.Item#getNotavailable
	 * @model opposite="notavailable" required="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see calendar.CalendarPackage#getNotAvailable_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link calendar.NotAvailable#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Division</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' reference.
	 * @see #setDivision(Division)
	 * @see calendar.CalendarPackage#getNotAvailable_Division()
	 * @model required="true"
	 * @generated
	 */
	Division getDivision();

	/**
	 * Sets the value of the '{@link calendar.NotAvailable#getDivision <em>Division</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' reference.
	 * @see #getDivision()
	 * @generated
	 */
	void setDivision(Division value);

} // NotAvailable
