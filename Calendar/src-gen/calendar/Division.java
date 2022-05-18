/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Division#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link calendar.Division#getNonactivemeeting <em>Nonactivemeeting</em>}</li>
 *   <li>{@link calendar.Division#getNotaskpersonnel <em>Notaskpersonnel</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getDivision()
 * @model
 * @generated
 */
public interface Division extends Person {
	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.ActiveMeeting}.
	 * It is bidirectional and its opposite is '{@link calendar.ActiveMeeting#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting</em>' containment reference list.
	 * @see calendar.CalendarPackage#getDivision_Meeting()
	 * @see calendar.ActiveMeeting#getDivision
	 * @model opposite="division" containment="true"
	 * @generated
	 */
	EList<ActiveMeeting> getMeeting();

	/**
	 * Returns the value of the '<em><b>Nonactivemeeting</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.NonActiveMeeting}.
	 * It is bidirectional and its opposite is '{@link calendar.NonActiveMeeting#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonactivemeeting</em>' containment reference list.
	 * @see calendar.CalendarPackage#getDivision_Nonactivemeeting()
	 * @see calendar.NonActiveMeeting#getDivision
	 * @model opposite="division" containment="true"
	 * @generated
	 */
	EList<NonActiveMeeting> getNonactivemeeting();

	/**
	 * Returns the value of the '<em><b>Notaskpersonnel</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.NoTaskPersonnel}.
	 * It is bidirectional and its opposite is '{@link calendar.NoTaskPersonnel#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notaskpersonnel</em>' containment reference list.
	 * @see calendar.CalendarPackage#getDivision_Notaskpersonnel()
	 * @see calendar.NoTaskPersonnel#getDivision
	 * @model opposite="division" containment="true"
	 * @generated
	 */
	EList<NoTaskPersonnel> getNotaskpersonnel();

} // Division
