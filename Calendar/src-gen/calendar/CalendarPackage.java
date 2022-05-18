/**
 */
package calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see calendar.CalendarFactory
 * @model kind="package"
 * @generated
 */
public interface CalendarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calendar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/calendar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calendar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalendarPackage eINSTANCE = calendar.impl.CalendarPackageImpl.init();

	/**
	 * The meta object id for the '{@link calendar.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.PersonImpl
	 * @see calendar.impl.CalendarPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calendar.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.CalendarImpl
	 * @see calendar.impl.CalendarPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Division</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DIVISION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.DivisionImpl
	 * @see calendar.impl.CalendarPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__MEETING = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nonactivemeeting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NONACTIVEMEETING = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notaskpersonnel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NOTASKPERSONNEL = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.ActiveMeetingImpl <em>Active Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.ActiveMeetingImpl
	 * @see calendar.impl.CalendarPackageImpl#getActiveMeeting()
	 * @generated
	 */
	int ACTIVE_MEETING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__PARTICIPANT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__AGENDA = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nonactivemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__NONACTIVEMEETING = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__ACTIVEMEETING = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Division</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING__DIVISION = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Active Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Active Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_MEETING_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.InternalParticipantImpl <em>Internal Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.InternalParticipantImpl
	 * @see calendar.impl.CalendarPackageImpl#getInternalParticipant()
	 * @generated
	 */
	int INTERNAL_PARTICIPANT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT__SURNAME = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participants Division</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT__PARTICIPANT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT__ITEM = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Internal Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Internal Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_PARTICIPANT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.AgendaImpl <em>Agenda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.AgendaImpl
	 * @see calendar.impl.CalendarPackageImpl#getAgenda()
	 * @generated
	 */
	int AGENDA = 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calendar.impl.ExternalParticipantImpl <em>External Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.ExternalParticipantImpl
	 * @see calendar.impl.CalendarPackageImpl#getExternalParticipant()
	 * @generated
	 */
	int EXTERNAL_PARTICIPANT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTICIPANT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTICIPANT__PARTICIPANT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTICIPANT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PARTICIPANT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.ParticipantImpl
	 * @see calendar.impl.CalendarPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 7;

	/**
	 * The feature id for the '<em><b>Externalparticipant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXTERNALPARTICIPANT = 0;

	/**
	 * The feature id for the '<em><b>Internalparticipant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INTERNALPARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Notavailable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NOTAVAILABLE = 2;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MEETING = 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calendar.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.ItemImpl
	 * @see calendar.impl.CalendarPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Externalparticipant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EXTERNALPARTICIPANT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notavailable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NOTAVAILABLE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internalparticipant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INTERNALPARTICIPANT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.NotAvailableImpl <em>Not Available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.NotAvailableImpl
	 * @see calendar.impl.CalendarPackageImpl#getNotAvailable()
	 * @generated
	 */
	int NOT_AVAILABLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE__PARTICIPANT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE__ITEM = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE__SURNAME = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Division</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE__DIVISION = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Not Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Not Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AVAILABLE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.NonActiveMeetingImpl <em>Non Active Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.NonActiveMeetingImpl
	 * @see calendar.impl.CalendarPackageImpl#getNonActiveMeeting()
	 * @generated
	 */
	int NON_ACTIVE_MEETING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__PARTICIPANT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__AGENDA = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nonactivemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__NONACTIVEMEETING = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__ACTIVEMEETING = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Division</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING__DIVISION = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Non Active Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Non Active Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ACTIVE_MEETING_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calendar.impl.MeetingImpl <em>Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.MeetingImpl
	 * @see calendar.impl.CalendarPackageImpl#getMeeting()
	 * @generated
	 */
	int MEETING = 11;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__PARTICIPANT = 0;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__AGENDA = 1;

	/**
	 * The feature id for the '<em><b>Nonactivemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__NONACTIVEMEETING = 2;

	/**
	 * The feature id for the '<em><b>Activemeeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ACTIVEMEETING = 3;

	/**
	 * The number of structural features of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calendar.impl.NoTaskPersonnelImpl <em>No Task Personnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calendar.impl.NoTaskPersonnelImpl
	 * @see calendar.impl.CalendarPackageImpl#getNoTaskPersonnel()
	 * @generated
	 */
	int NO_TASK_PERSONNEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TASK_PERSONNEL__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Division</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TASK_PERSONNEL__DIVISION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TASK_PERSONNEL__SURNAME = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>No Task Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TASK_PERSONNEL_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>No Task Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TASK_PERSONNEL_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link calendar.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see calendar.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Calendar#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Division</em>'.
	 * @see calendar.Calendar#getDivision()
	 * @see #getCalendar()
	 * @generated
	 */
	EReference getCalendar_Division();

	/**
	 * Returns the meta object for class '{@link calendar.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see calendar.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Division#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meeting</em>'.
	 * @see calendar.Division#getMeeting()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Meeting();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Division#getNonactivemeeting <em>Nonactivemeeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nonactivemeeting</em>'.
	 * @see calendar.Division#getNonactivemeeting()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Nonactivemeeting();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Division#getNotaskpersonnel <em>Notaskpersonnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notaskpersonnel</em>'.
	 * @see calendar.Division#getNotaskpersonnel()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Notaskpersonnel();

	/**
	 * Returns the meta object for class '{@link calendar.ActiveMeeting <em>Active Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Meeting</em>'.
	 * @see calendar.ActiveMeeting
	 * @generated
	 */
	EClass getActiveMeeting();

	/**
	 * Returns the meta object for the container reference '{@link calendar.ActiveMeeting#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Division</em>'.
	 * @see calendar.ActiveMeeting#getDivision()
	 * @see #getActiveMeeting()
	 * @generated
	 */
	EReference getActiveMeeting_Division();

	/**
	 * Returns the meta object for class '{@link calendar.InternalParticipant <em>Internal Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Participant</em>'.
	 * @see calendar.InternalParticipant
	 * @generated
	 */
	EClass getInternalParticipant();

	/**
	 * Returns the meta object for the attribute '{@link calendar.InternalParticipant#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see calendar.InternalParticipant#getSurname()
	 * @see #getInternalParticipant()
	 * @generated
	 */
	EAttribute getInternalParticipant_Surname();

	/**
	 * Returns the meta object for the reference '{@link calendar.InternalParticipant#getParticipantsDivision <em>Participants Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participants Division</em>'.
	 * @see calendar.InternalParticipant#getParticipantsDivision()
	 * @see #getInternalParticipant()
	 * @generated
	 */
	EReference getInternalParticipant_ParticipantsDivision();

	/**
	 * Returns the meta object for the container reference '{@link calendar.InternalParticipant#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Participant</em>'.
	 * @see calendar.InternalParticipant#getParticipant()
	 * @see #getInternalParticipant()
	 * @generated
	 */
	EReference getInternalParticipant_Participant();

	/**
	 * Returns the meta object for the reference list '{@link calendar.InternalParticipant#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see calendar.InternalParticipant#getItem()
	 * @see #getInternalParticipant()
	 * @generated
	 */
	EReference getInternalParticipant_Item();

	/**
	 * Returns the meta object for class '{@link calendar.Agenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda</em>'.
	 * @see calendar.Agenda
	 * @generated
	 */
	EClass getAgenda();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Agenda#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see calendar.Agenda#getItem()
	 * @see #getAgenda()
	 * @generated
	 */
	EReference getAgenda_Item();

	/**
	 * Returns the meta object for class '{@link calendar.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see calendar.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link calendar.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see calendar.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link calendar.ExternalParticipant <em>External Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Participant</em>'.
	 * @see calendar.ExternalParticipant
	 * @generated
	 */
	EClass getExternalParticipant();

	/**
	 * Returns the meta object for the container reference '{@link calendar.ExternalParticipant#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Participant</em>'.
	 * @see calendar.ExternalParticipant#getParticipant()
	 * @see #getExternalParticipant()
	 * @generated
	 */
	EReference getExternalParticipant_Participant();

	/**
	 * Returns the meta object for class '{@link calendar.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see calendar.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Participant#getExternalparticipant <em>Externalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externalparticipant</em>'.
	 * @see calendar.Participant#getExternalparticipant()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Externalparticipant();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Participant#getInternalparticipant <em>Internalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internalparticipant</em>'.
	 * @see calendar.Participant#getInternalparticipant()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Internalparticipant();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Participant#getNotavailable <em>Notavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notavailable</em>'.
	 * @see calendar.Participant#getNotavailable()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Notavailable();

	/**
	 * Returns the meta object for the container reference '{@link calendar.Participant#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see calendar.Participant#getMeeting()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Meeting();

	/**
	 * Returns the meta object for class '{@link calendar.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see calendar.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference list '{@link calendar.Item#getExternalparticipant <em>Externalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Externalparticipant</em>'.
	 * @see calendar.Item#getExternalparticipant()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Externalparticipant();

	/**
	 * Returns the meta object for the reference list '{@link calendar.Item#getNotavailable <em>Notavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notavailable</em>'.
	 * @see calendar.Item#getNotavailable()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Notavailable();

	/**
	 * Returns the meta object for the reference list '{@link calendar.Item#getInternalparticipant <em>Internalparticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internalparticipant</em>'.
	 * @see calendar.Item#getInternalparticipant()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Internalparticipant();

	/**
	 * Returns the meta object for class '{@link calendar.NotAvailable <em>Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Available</em>'.
	 * @see calendar.NotAvailable
	 * @generated
	 */
	EClass getNotAvailable();

	/**
	 * Returns the meta object for the container reference '{@link calendar.NotAvailable#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Participant</em>'.
	 * @see calendar.NotAvailable#getParticipant()
	 * @see #getNotAvailable()
	 * @generated
	 */
	EReference getNotAvailable_Participant();

	/**
	 * Returns the meta object for the reference list '{@link calendar.NotAvailable#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see calendar.NotAvailable#getItem()
	 * @see #getNotAvailable()
	 * @generated
	 */
	EReference getNotAvailable_Item();

	/**
	 * Returns the meta object for the attribute '{@link calendar.NotAvailable#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see calendar.NotAvailable#getSurname()
	 * @see #getNotAvailable()
	 * @generated
	 */
	EAttribute getNotAvailable_Surname();

	/**
	 * Returns the meta object for the reference '{@link calendar.NotAvailable#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Division</em>'.
	 * @see calendar.NotAvailable#getDivision()
	 * @see #getNotAvailable()
	 * @generated
	 */
	EReference getNotAvailable_Division();

	/**
	 * Returns the meta object for class '{@link calendar.NonActiveMeeting <em>Non Active Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Active Meeting</em>'.
	 * @see calendar.NonActiveMeeting
	 * @generated
	 */
	EClass getNonActiveMeeting();

	/**
	 * Returns the meta object for the container reference '{@link calendar.NonActiveMeeting#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Division</em>'.
	 * @see calendar.NonActiveMeeting#getDivision()
	 * @see #getNonActiveMeeting()
	 * @generated
	 */
	EReference getNonActiveMeeting_Division();

	/**
	 * Returns the meta object for class '{@link calendar.Meeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting</em>'.
	 * @see calendar.Meeting
	 * @generated
	 */
	EClass getMeeting();

	/**
	 * Returns the meta object for the containment reference list '{@link calendar.Meeting#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see calendar.Meeting#getParticipant()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Participant();

	/**
	 * Returns the meta object for the containment reference '{@link calendar.Meeting#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agenda</em>'.
	 * @see calendar.Meeting#getAgenda()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Agenda();

	/**
	 * Returns the meta object for the reference '{@link calendar.Meeting#getNonactivemeeting <em>Nonactivemeeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nonactivemeeting</em>'.
	 * @see calendar.Meeting#getNonactivemeeting()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Nonactivemeeting();

	/**
	 * Returns the meta object for the reference '{@link calendar.Meeting#getActivemeeting <em>Activemeeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activemeeting</em>'.
	 * @see calendar.Meeting#getActivemeeting()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Activemeeting();

	/**
	 * Returns the meta object for class '{@link calendar.NoTaskPersonnel <em>No Task Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Task Personnel</em>'.
	 * @see calendar.NoTaskPersonnel
	 * @generated
	 */
	EClass getNoTaskPersonnel();

	/**
	 * Returns the meta object for the container reference '{@link calendar.NoTaskPersonnel#getDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Division</em>'.
	 * @see calendar.NoTaskPersonnel#getDivision()
	 * @see #getNoTaskPersonnel()
	 * @generated
	 */
	EReference getNoTaskPersonnel_Division();

	/**
	 * Returns the meta object for the attribute '{@link calendar.NoTaskPersonnel#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see calendar.NoTaskPersonnel#getSurname()
	 * @see #getNoTaskPersonnel()
	 * @generated
	 */
	EAttribute getNoTaskPersonnel_Surname();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalendarFactory getCalendarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link calendar.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.CalendarImpl
		 * @see calendar.impl.CalendarPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR__DIVISION = eINSTANCE.getCalendar_Division();

		/**
		 * The meta object literal for the '{@link calendar.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.DivisionImpl
		 * @see calendar.impl.CalendarPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__MEETING = eINSTANCE.getDivision_Meeting();

		/**
		 * The meta object literal for the '<em><b>Nonactivemeeting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__NONACTIVEMEETING = eINSTANCE.getDivision_Nonactivemeeting();

		/**
		 * The meta object literal for the '<em><b>Notaskpersonnel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__NOTASKPERSONNEL = eINSTANCE.getDivision_Notaskpersonnel();

		/**
		 * The meta object literal for the '{@link calendar.impl.ActiveMeetingImpl <em>Active Meeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.ActiveMeetingImpl
		 * @see calendar.impl.CalendarPackageImpl#getActiveMeeting()
		 * @generated
		 */
		EClass ACTIVE_MEETING = eINSTANCE.getActiveMeeting();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_MEETING__DIVISION = eINSTANCE.getActiveMeeting_Division();

		/**
		 * The meta object literal for the '{@link calendar.impl.InternalParticipantImpl <em>Internal Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.InternalParticipantImpl
		 * @see calendar.impl.CalendarPackageImpl#getInternalParticipant()
		 * @generated
		 */
		EClass INTERNAL_PARTICIPANT = eINSTANCE.getInternalParticipant();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_PARTICIPANT__SURNAME = eINSTANCE.getInternalParticipant_Surname();

		/**
		 * The meta object literal for the '<em><b>Participants Division</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION = eINSTANCE
				.getInternalParticipant_ParticipantsDivision();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_PARTICIPANT__PARTICIPANT = eINSTANCE.getInternalParticipant_Participant();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_PARTICIPANT__ITEM = eINSTANCE.getInternalParticipant_Item();

		/**
		 * The meta object literal for the '{@link calendar.impl.AgendaImpl <em>Agenda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.AgendaImpl
		 * @see calendar.impl.CalendarPackageImpl#getAgenda()
		 * @generated
		 */
		EClass AGENDA = eINSTANCE.getAgenda();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA__ITEM = eINSTANCE.getAgenda_Item();

		/**
		 * The meta object literal for the '{@link calendar.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.PersonImpl
		 * @see calendar.impl.CalendarPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link calendar.impl.ExternalParticipantImpl <em>External Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.ExternalParticipantImpl
		 * @see calendar.impl.CalendarPackageImpl#getExternalParticipant()
		 * @generated
		 */
		EClass EXTERNAL_PARTICIPANT = eINSTANCE.getExternalParticipant();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_PARTICIPANT__PARTICIPANT = eINSTANCE.getExternalParticipant_Participant();

		/**
		 * The meta object literal for the '{@link calendar.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.ParticipantImpl
		 * @see calendar.impl.CalendarPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Externalparticipant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__EXTERNALPARTICIPANT = eINSTANCE.getParticipant_Externalparticipant();

		/**
		 * The meta object literal for the '<em><b>Internalparticipant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__INTERNALPARTICIPANT = eINSTANCE.getParticipant_Internalparticipant();

		/**
		 * The meta object literal for the '<em><b>Notavailable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__NOTAVAILABLE = eINSTANCE.getParticipant_Notavailable();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__MEETING = eINSTANCE.getParticipant_Meeting();

		/**
		 * The meta object literal for the '{@link calendar.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.ItemImpl
		 * @see calendar.impl.CalendarPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Externalparticipant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__EXTERNALPARTICIPANT = eINSTANCE.getItem_Externalparticipant();

		/**
		 * The meta object literal for the '<em><b>Notavailable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__NOTAVAILABLE = eINSTANCE.getItem_Notavailable();

		/**
		 * The meta object literal for the '<em><b>Internalparticipant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__INTERNALPARTICIPANT = eINSTANCE.getItem_Internalparticipant();

		/**
		 * The meta object literal for the '{@link calendar.impl.NotAvailableImpl <em>Not Available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.NotAvailableImpl
		 * @see calendar.impl.CalendarPackageImpl#getNotAvailable()
		 * @generated
		 */
		EClass NOT_AVAILABLE = eINSTANCE.getNotAvailable();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_AVAILABLE__PARTICIPANT = eINSTANCE.getNotAvailable_Participant();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_AVAILABLE__ITEM = eINSTANCE.getNotAvailable_Item();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_AVAILABLE__SURNAME = eINSTANCE.getNotAvailable_Surname();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_AVAILABLE__DIVISION = eINSTANCE.getNotAvailable_Division();

		/**
		 * The meta object literal for the '{@link calendar.impl.NonActiveMeetingImpl <em>Non Active Meeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.NonActiveMeetingImpl
		 * @see calendar.impl.CalendarPackageImpl#getNonActiveMeeting()
		 * @generated
		 */
		EClass NON_ACTIVE_MEETING = eINSTANCE.getNonActiveMeeting();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_ACTIVE_MEETING__DIVISION = eINSTANCE.getNonActiveMeeting_Division();

		/**
		 * The meta object literal for the '{@link calendar.impl.MeetingImpl <em>Meeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.MeetingImpl
		 * @see calendar.impl.CalendarPackageImpl#getMeeting()
		 * @generated
		 */
		EClass MEETING = eINSTANCE.getMeeting();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__PARTICIPANT = eINSTANCE.getMeeting_Participant();

		/**
		 * The meta object literal for the '<em><b>Agenda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__AGENDA = eINSTANCE.getMeeting_Agenda();

		/**
		 * The meta object literal for the '<em><b>Nonactivemeeting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__NONACTIVEMEETING = eINSTANCE.getMeeting_Nonactivemeeting();

		/**
		 * The meta object literal for the '<em><b>Activemeeting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__ACTIVEMEETING = eINSTANCE.getMeeting_Activemeeting();

		/**
		 * The meta object literal for the '{@link calendar.impl.NoTaskPersonnelImpl <em>No Task Personnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calendar.impl.NoTaskPersonnelImpl
		 * @see calendar.impl.CalendarPackageImpl#getNoTaskPersonnel()
		 * @generated
		 */
		EClass NO_TASK_PERSONNEL = eINSTANCE.getNoTaskPersonnel();

		/**
		 * The meta object literal for the '<em><b>Division</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_TASK_PERSONNEL__DIVISION = eINSTANCE.getNoTaskPersonnel_Division();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_TASK_PERSONNEL__SURNAME = eINSTANCE.getNoTaskPersonnel_Surname();

	}

} //CalendarPackage
