/**
 */
package calendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calendar.Item#getExternalparticipant <em>Externalparticipant</em>}</li>
 *   <li>{@link calendar.Item#getNotavailable <em>Notavailable</em>}</li>
 *   <li>{@link calendar.Item#getInternalparticipant <em>Internalparticipant</em>}</li>
 * </ul>
 *
 * @see calendar.CalendarPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Person {
	/**
	 * Returns the value of the '<em><b>Externalparticipant</b></em>' reference list.
	 * The list contents are of type {@link calendar.ExternalParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalparticipant</em>' reference list.
	 * @see calendar.CalendarPackage#getItem_Externalparticipant()
	 * @model
	 * @generated
	 */
	EList<ExternalParticipant> getExternalparticipant();

	/**
	 * Returns the value of the '<em><b>Notavailable</b></em>' reference list.
	 * The list contents are of type {@link calendar.NotAvailable}.
	 * It is bidirectional and its opposite is '{@link calendar.NotAvailable#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notavailable</em>' reference list.
	 * @see calendar.CalendarPackage#getItem_Notavailable()
	 * @see calendar.NotAvailable#getItem
	 * @model opposite="item" required="true"
	 * @generated
	 */
	EList<NotAvailable> getNotavailable();

	/**
	 * Returns the value of the '<em><b>Internalparticipant</b></em>' reference list.
	 * The list contents are of type {@link calendar.InternalParticipant}.
	 * It is bidirectional and its opposite is '{@link calendar.InternalParticipant#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internalparticipant</em>' reference list.
	 * @see calendar.CalendarPackage#getItem_Internalparticipant()
	 * @see calendar.InternalParticipant#getItem
	 * @model opposite="item"
	 * @generated
	 */
	EList<InternalParticipant> getInternalparticipant();

} // Item
