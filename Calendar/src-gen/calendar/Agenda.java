/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Agenda#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getAgenda()
 * @model
 * @generated
 */
public interface Agenda extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link calendar.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see calendar.CalendarPackage#getAgenda_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

} // Agenda
