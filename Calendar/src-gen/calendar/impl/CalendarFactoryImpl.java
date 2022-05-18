/**
 */
package calendar.impl;

import calendar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalendarFactoryImpl extends EFactoryImpl implements CalendarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalendarFactory init() {
		try {
			CalendarFactory theCalendarFactory = (CalendarFactory) EPackage.Registry.INSTANCE
					.getEFactory(CalendarPackage.eNS_URI);
			if (theCalendarFactory != null) {
				return theCalendarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CalendarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CalendarPackage.CALENDAR:
			return createCalendar();
		case CalendarPackage.DIVISION:
			return createDivision();
		case CalendarPackage.ACTIVE_MEETING:
			return createActiveMeeting();
		case CalendarPackage.INTERNAL_PARTICIPANT:
			return createInternalParticipant();
		case CalendarPackage.AGENDA:
			return createAgenda();
		case CalendarPackage.EXTERNAL_PARTICIPANT:
			return createExternalParticipant();
		case CalendarPackage.PARTICIPANT:
			return createParticipant();
		case CalendarPackage.ITEM:
			return createItem();
		case CalendarPackage.NOT_AVAILABLE:
			return createNotAvailable();
		case CalendarPackage.NON_ACTIVE_MEETING:
			return createNonActiveMeeting();
		case CalendarPackage.MEETING:
			return createMeeting();
		case CalendarPackage.NO_TASK_PERSONNEL:
			return createNoTaskPersonnel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendar() {
		CalendarImpl calendar = new CalendarImpl();
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMeeting createActiveMeeting() {
		ActiveMeetingImpl activeMeeting = new ActiveMeetingImpl();
		return activeMeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalParticipant createInternalParticipant() {
		InternalParticipantImpl internalParticipant = new InternalParticipantImpl();
		return internalParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda createAgenda() {
		AgendaImpl agenda = new AgendaImpl();
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalParticipant createExternalParticipant() {
		ExternalParticipantImpl externalParticipant = new ExternalParticipantImpl();
		return externalParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotAvailable createNotAvailable() {
		NotAvailableImpl notAvailable = new NotAvailableImpl();
		return notAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonActiveMeeting createNonActiveMeeting() {
		NonActiveMeetingImpl nonActiveMeeting = new NonActiveMeetingImpl();
		return nonActiveMeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting createMeeting() {
		MeetingImpl meeting = new MeetingImpl();
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoTaskPersonnel createNoTaskPersonnel() {
		NoTaskPersonnelImpl noTaskPersonnel = new NoTaskPersonnelImpl();
		return noTaskPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarPackage getCalendarPackage() {
		return (CalendarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CalendarPackage getPackage() {
		return CalendarPackage.eINSTANCE;
	}

} //CalendarFactoryImpl
