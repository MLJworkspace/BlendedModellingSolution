/**
 */
package calendar.impl;

import calendar.ActiveMeeting;
import calendar.Agenda;
import calendar.Calendar;
import calendar.CalendarFactory;
import calendar.CalendarPackage;
import calendar.Division;
import calendar.ExternalParticipant;
import calendar.InternalParticipant;
import calendar.Item;
import calendar.Meeting;
import calendar.NoTaskPersonnel;
import calendar.NonActiveMeeting;
import calendar.NotAvailable;
import calendar.Participant;
import calendar.Person;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalendarPackageImpl extends EPackageImpl implements CalendarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeMeetingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonActiveMeetingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noTaskPersonnelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see calendar.CalendarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalendarPackageImpl() {
		super(eNS_URI, CalendarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CalendarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalendarPackage init() {
		if (isInited)
			return (CalendarPackage) EPackage.Registry.INSTANCE.getEPackage(CalendarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCalendarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CalendarPackageImpl theCalendarPackage = registeredCalendarPackage instanceof CalendarPackageImpl
				? (CalendarPackageImpl) registeredCalendarPackage
				: new CalendarPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCalendarPackage.createPackageContents();

		// Initialize created meta-data
		theCalendarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalendarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalendarPackage.eNS_URI, theCalendarPackage);
		return theCalendarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendar() {
		return calendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendar_Division() {
		return (EReference) calendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Meeting() {
		return (EReference) divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Nonactivemeeting() {
		return (EReference) divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Notaskpersonnel() {
		return (EReference) divisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveMeeting() {
		return activeMeetingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActiveMeeting_Division() {
		return (EReference) activeMeetingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalParticipant() {
		return internalParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalParticipant_Surname() {
		return (EAttribute) internalParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalParticipant_ParticipantsDivision() {
		return (EReference) internalParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalParticipant_Participant() {
		return (EReference) internalParticipantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalParticipant_Item() {
		return (EReference) internalParticipantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgenda() {
		return agendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgenda_Item() {
		return (EReference) agendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalParticipant() {
		return externalParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalParticipant_Participant() {
		return (EReference) externalParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Externalparticipant() {
		return (EReference) participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Internalparticipant() {
		return (EReference) participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Notavailable() {
		return (EReference) participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Meeting() {
		return (EReference) participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Externalparticipant() {
		return (EReference) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Notavailable() {
		return (EReference) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Internalparticipant() {
		return (EReference) itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotAvailable() {
		return notAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotAvailable_Participant() {
		return (EReference) notAvailableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotAvailable_Item() {
		return (EReference) notAvailableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotAvailable_Surname() {
		return (EAttribute) notAvailableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotAvailable_Division() {
		return (EReference) notAvailableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonActiveMeeting() {
		return nonActiveMeetingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonActiveMeeting_Division() {
		return (EReference) nonActiveMeetingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeeting() {
		return meetingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Participant() {
		return (EReference) meetingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Agenda() {
		return (EReference) meetingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Nonactivemeeting() {
		return (EReference) meetingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Activemeeting() {
		return (EReference) meetingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoTaskPersonnel() {
		return noTaskPersonnelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoTaskPersonnel_Division() {
		return (EReference) noTaskPersonnelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoTaskPersonnel_Surname() {
		return (EAttribute) noTaskPersonnelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarFactory getCalendarFactory() {
		return (CalendarFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		calendarEClass = createEClass(CALENDAR);
		createEReference(calendarEClass, CALENDAR__DIVISION);

		divisionEClass = createEClass(DIVISION);
		createEReference(divisionEClass, DIVISION__MEETING);
		createEReference(divisionEClass, DIVISION__NONACTIVEMEETING);
		createEReference(divisionEClass, DIVISION__NOTASKPERSONNEL);

		activeMeetingEClass = createEClass(ACTIVE_MEETING);
		createEReference(activeMeetingEClass, ACTIVE_MEETING__DIVISION);

		internalParticipantEClass = createEClass(INTERNAL_PARTICIPANT);
		createEAttribute(internalParticipantEClass, INTERNAL_PARTICIPANT__SURNAME);
		createEReference(internalParticipantEClass, INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION);
		createEReference(internalParticipantEClass, INTERNAL_PARTICIPANT__PARTICIPANT);
		createEReference(internalParticipantEClass, INTERNAL_PARTICIPANT__ITEM);

		agendaEClass = createEClass(AGENDA);
		createEReference(agendaEClass, AGENDA__ITEM);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);

		externalParticipantEClass = createEClass(EXTERNAL_PARTICIPANT);
		createEReference(externalParticipantEClass, EXTERNAL_PARTICIPANT__PARTICIPANT);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__EXTERNALPARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__INTERNALPARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__NOTAVAILABLE);
		createEReference(participantEClass, PARTICIPANT__MEETING);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__EXTERNALPARTICIPANT);
		createEReference(itemEClass, ITEM__NOTAVAILABLE);
		createEReference(itemEClass, ITEM__INTERNALPARTICIPANT);

		notAvailableEClass = createEClass(NOT_AVAILABLE);
		createEReference(notAvailableEClass, NOT_AVAILABLE__PARTICIPANT);
		createEReference(notAvailableEClass, NOT_AVAILABLE__ITEM);
		createEAttribute(notAvailableEClass, NOT_AVAILABLE__SURNAME);
		createEReference(notAvailableEClass, NOT_AVAILABLE__DIVISION);

		nonActiveMeetingEClass = createEClass(NON_ACTIVE_MEETING);
		createEReference(nonActiveMeetingEClass, NON_ACTIVE_MEETING__DIVISION);

		meetingEClass = createEClass(MEETING);
		createEReference(meetingEClass, MEETING__PARTICIPANT);
		createEReference(meetingEClass, MEETING__AGENDA);
		createEReference(meetingEClass, MEETING__NONACTIVEMEETING);
		createEReference(meetingEClass, MEETING__ACTIVEMEETING);

		noTaskPersonnelEClass = createEClass(NO_TASK_PERSONNEL);
		createEReference(noTaskPersonnelEClass, NO_TASK_PERSONNEL__DIVISION);
		createEAttribute(noTaskPersonnelEClass, NO_TASK_PERSONNEL__SURNAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		calendarEClass.getESuperTypes().add(this.getPerson());
		divisionEClass.getESuperTypes().add(this.getPerson());
		activeMeetingEClass.getESuperTypes().add(this.getPerson());
		activeMeetingEClass.getESuperTypes().add(this.getMeeting());
		internalParticipantEClass.getESuperTypes().add(this.getPerson());
		externalParticipantEClass.getESuperTypes().add(this.getPerson());
		itemEClass.getESuperTypes().add(this.getPerson());
		notAvailableEClass.getESuperTypes().add(this.getPerson());
		nonActiveMeetingEClass.getESuperTypes().add(this.getPerson());
		nonActiveMeetingEClass.getESuperTypes().add(this.getMeeting());
		noTaskPersonnelEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(calendarEClass, Calendar.class, "Calendar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalendar_Division(), this.getDivision(), null, "division", null, 1, -1, Calendar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivision_Meeting(), this.getActiveMeeting(), this.getActiveMeeting_Division(), "meeting",
				null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Nonactivemeeting(), this.getNonActiveMeeting(), this.getNonActiveMeeting_Division(),
				"nonactivemeeting", null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Notaskpersonnel(), this.getNoTaskPersonnel(), this.getNoTaskPersonnel_Division(),
				"notaskpersonnel", null, 0, -1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeMeetingEClass, ActiveMeeting.class, "ActiveMeeting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActiveMeeting_Division(), this.getDivision(), this.getDivision_Meeting(), "division", null, 1,
				1, ActiveMeeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalParticipantEClass, InternalParticipant.class, "InternalParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalParticipant_Surname(), ecorePackage.getEString(), "surname", null, 0, 1,
				InternalParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalParticipant_ParticipantsDivision(), this.getDivision(), null, "participantsDivision",
				null, 0, 1, InternalParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalParticipant_Participant(), this.getParticipant(),
				this.getParticipant_Internalparticipant(), "participant", null, 1, 1, InternalParticipant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalParticipant_Item(), this.getItem(), this.getItem_Internalparticipant(), "item", null,
				0, -1, InternalParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agendaEClass, Agenda.class, "Agenda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgenda_Item(), this.getItem(), null, "item", null, 0, -1, Agenda.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalParticipantEClass, ExternalParticipant.class, "ExternalParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalParticipant_Participant(), this.getParticipant(),
				this.getParticipant_Externalparticipant(), "participant", null, 1, 1, ExternalParticipant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Externalparticipant(), this.getExternalParticipant(),
				this.getExternalParticipant_Participant(), "externalparticipant", null, 0, -1, Participant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Internalparticipant(), this.getInternalParticipant(),
				this.getInternalParticipant_Participant(), "internalparticipant", null, 0, -1, Participant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Notavailable(), this.getNotAvailable(), this.getNotAvailable_Participant(),
				"notavailable", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Meeting(), this.getMeeting(), this.getMeeting_Participant(), "meeting", null, 1,
				1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Externalparticipant(), this.getExternalParticipant(), null, "externalparticipant", null,
				0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Notavailable(), this.getNotAvailable(), this.getNotAvailable_Item(), "notavailable",
				null, 1, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Internalparticipant(), this.getInternalParticipant(), this.getInternalParticipant_Item(),
				"internalparticipant", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notAvailableEClass, NotAvailable.class, "NotAvailable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotAvailable_Participant(), this.getParticipant(), this.getParticipant_Notavailable(),
				"participant", null, 1, 1, NotAvailable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotAvailable_Item(), this.getItem(), this.getItem_Notavailable(), "item", null, 1, -1,
				NotAvailable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotAvailable_Surname(), ecorePackage.getEString(), "surname", null, 0, 1, NotAvailable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotAvailable_Division(), this.getDivision(), null, "division", null, 1, 1, NotAvailable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonActiveMeetingEClass, NonActiveMeeting.class, "NonActiveMeeting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonActiveMeeting_Division(), this.getDivision(), this.getDivision_Nonactivemeeting(),
				"division", null, 1, 1, NonActiveMeeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meetingEClass, Meeting.class, "Meeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeeting_Participant(), this.getParticipant(), this.getParticipant_Meeting(), "participant",
				null, 0, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Agenda(), this.getAgenda(), null, "agenda", null, 1, 1, Meeting.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMeeting_Nonactivemeeting(), this.getNonActiveMeeting(), null, "nonactivemeeting", null, 0, 1,
				Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Activemeeting(), this.getActiveMeeting(), null, "activemeeting", null, 0, 1,
				Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noTaskPersonnelEClass, NoTaskPersonnel.class, "NoTaskPersonnel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoTaskPersonnel_Division(), this.getDivision(), this.getDivision_Notaskpersonnel(),
				"division", null, 1, 1, NoTaskPersonnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoTaskPersonnel_Surname(), ecorePackage.getEString(), "surname", null, 0, 1,
				NoTaskPersonnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CalendarPackageImpl
