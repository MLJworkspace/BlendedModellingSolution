/**
 */
package calendar.util;

import calendar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see calendar.CalendarPackage
 * @generated
 */
public class CalendarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CalendarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CalendarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarSwitch<Adapter> modelSwitch = new CalendarSwitch<Adapter>() {
		@Override
		public Adapter caseCalendar(Calendar object) {
			return createCalendarAdapter();
		}

		@Override
		public Adapter caseDivision(Division object) {
			return createDivisionAdapter();
		}

		@Override
		public Adapter caseActiveMeeting(ActiveMeeting object) {
			return createActiveMeetingAdapter();
		}

		@Override
		public Adapter caseInternalParticipant(InternalParticipant object) {
			return createInternalParticipantAdapter();
		}

		@Override
		public Adapter caseAgenda(Agenda object) {
			return createAgendaAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseExternalParticipant(ExternalParticipant object) {
			return createExternalParticipantAdapter();
		}

		@Override
		public Adapter caseParticipant(Participant object) {
			return createParticipantAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseNotAvailable(NotAvailable object) {
			return createNotAvailableAdapter();
		}

		@Override
		public Adapter caseNonActiveMeeting(NonActiveMeeting object) {
			return createNonActiveMeetingAdapter();
		}

		@Override
		public Adapter caseMeeting(Meeting object) {
			return createMeetingAdapter();
		}

		@Override
		public Adapter caseNoTaskPersonnel(NoTaskPersonnel object) {
			return createNoTaskPersonnelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.ActiveMeeting <em>Active Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.ActiveMeeting
	 * @generated
	 */
	public Adapter createActiveMeetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.InternalParticipant <em>Internal Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.InternalParticipant
	 * @generated
	 */
	public Adapter createInternalParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Agenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Agenda
	 * @generated
	 */
	public Adapter createAgendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.ExternalParticipant <em>External Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.ExternalParticipant
	 * @generated
	 */
	public Adapter createExternalParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.NotAvailable <em>Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.NotAvailable
	 * @generated
	 */
	public Adapter createNotAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.NonActiveMeeting <em>Non Active Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.NonActiveMeeting
	 * @generated
	 */
	public Adapter createNonActiveMeetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.Meeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.Meeting
	 * @generated
	 */
	public Adapter createMeetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calendar.NoTaskPersonnel <em>No Task Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calendar.NoTaskPersonnel
	 * @generated
	 */
	public Adapter createNoTaskPersonnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CalendarAdapterFactory
