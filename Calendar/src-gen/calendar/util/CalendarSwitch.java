/**
 */
package calendar.util;

import calendar.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see calendar.CalendarPackage
 * @generated
 */
public class CalendarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CalendarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarSwitch() {
		if (modelPackage == null) {
			modelPackage = CalendarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CalendarPackage.CALENDAR: {
			Calendar calendar = (Calendar) theEObject;
			T result = caseCalendar(calendar);
			if (result == null)
				result = casePerson(calendar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = casePerson(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.ACTIVE_MEETING: {
			ActiveMeeting activeMeeting = (ActiveMeeting) theEObject;
			T result = caseActiveMeeting(activeMeeting);
			if (result == null)
				result = casePerson(activeMeeting);
			if (result == null)
				result = caseMeeting(activeMeeting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.INTERNAL_PARTICIPANT: {
			InternalParticipant internalParticipant = (InternalParticipant) theEObject;
			T result = caseInternalParticipant(internalParticipant);
			if (result == null)
				result = casePerson(internalParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.AGENDA: {
			Agenda agenda = (Agenda) theEObject;
			T result = caseAgenda(agenda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.EXTERNAL_PARTICIPANT: {
			ExternalParticipant externalParticipant = (ExternalParticipant) theEObject;
			T result = caseExternalParticipant(externalParticipant);
			if (result == null)
				result = casePerson(externalParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.PARTICIPANT: {
			Participant participant = (Participant) theEObject;
			T result = caseParticipant(participant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = casePerson(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.NOT_AVAILABLE: {
			NotAvailable notAvailable = (NotAvailable) theEObject;
			T result = caseNotAvailable(notAvailable);
			if (result == null)
				result = casePerson(notAvailable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.NON_ACTIVE_MEETING: {
			NonActiveMeeting nonActiveMeeting = (NonActiveMeeting) theEObject;
			T result = caseNonActiveMeeting(nonActiveMeeting);
			if (result == null)
				result = casePerson(nonActiveMeeting);
			if (result == null)
				result = caseMeeting(nonActiveMeeting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.MEETING: {
			Meeting meeting = (Meeting) theEObject;
			T result = caseMeeting(meeting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CalendarPackage.NO_TASK_PERSONNEL: {
			NoTaskPersonnel noTaskPersonnel = (NoTaskPersonnel) theEObject;
			T result = caseNoTaskPersonnel(noTaskPersonnel);
			if (result == null)
				result = casePerson(noTaskPersonnel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Meeting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveMeeting(ActiveMeeting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalParticipant(InternalParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agenda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agenda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgenda(Agenda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalParticipant(ExternalParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotAvailable(NotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Active Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Active Meeting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonActiveMeeting(NonActiveMeeting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meeting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meeting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeeting(Meeting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Task Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Task Personnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoTaskPersonnel(NoTaskPersonnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CalendarSwitch
