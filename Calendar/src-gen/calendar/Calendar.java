/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Calendar#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getCalendar()
 * @model
 * @generated
 */
public interface Calendar extends Person {
	/**
	 * Returns the value of the '<em><b>Division</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' containment reference list.
	 * @see calendar.CalendarPackage#getCalendar_Division()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Division> getDivision();

} // Calendar
