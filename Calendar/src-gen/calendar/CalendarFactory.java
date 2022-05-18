/**
 */
package calendar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see calendar.CalendarPackage
 * @generated
 */
public interface CalendarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalendarFactory eINSTANCE = calendar.impl.CalendarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	Calendar createCalendar();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Active Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Meeting</em>'.
	 * @generated
	 */
	ActiveMeeting createActiveMeeting();

	/**
	 * Returns a new object of class '<em>Internal Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Participant</em>'.
	 * @generated
	 */
	InternalParticipant createInternalParticipant();

	/**
	 * Returns a new object of class '<em>Agenda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agenda</em>'.
	 * @generated
	 */
	Agenda createAgenda();

	/**
	 * Returns a new object of class '<em>External Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Participant</em>'.
	 * @generated
	 */
	ExternalParticipant createExternalParticipant();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Available</em>'.
	 * @generated
	 */
	NotAvailable createNotAvailable();

	/**
	 * Returns a new object of class '<em>Non Active Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Active Meeting</em>'.
	 * @generated
	 */
	NonActiveMeeting createNonActiveMeeting();

	/**
	 * Returns a new object of class '<em>Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meeting</em>'.
	 * @generated
	 */
	Meeting createMeeting();

	/**
	 * Returns a new object of class '<em>No Task Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Task Personnel</em>'.
	 * @generated
	 */
	NoTaskPersonnel createNoTaskPersonnel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalendarPackage getCalendarPackage();

} //CalendarFactory
