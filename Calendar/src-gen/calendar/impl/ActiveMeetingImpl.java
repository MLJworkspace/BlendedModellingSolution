/**
 */
package calendar.impl;

import calendar.ActiveMeeting;
import calendar.Agenda;
import calendar.CalendarPackage;
import calendar.Division;
import calendar.Meeting;
import calendar.NonActiveMeeting;
import calendar.Participant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Meeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.ActiveMeetingImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.impl.ActiveMeetingImpl#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link calendar.impl.ActiveMeetingImpl#getNonactivemeeting <em>Nonactivemeeting</em>}</li>
 *   <li>{@link calendar.impl.ActiveMeetingImpl#getActivemeeting <em>Activemeeting</em>}</li>
 *   <li>{@link calendar.impl.ActiveMeetingImpl#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveMeetingImpl extends PersonImpl implements ActiveMeeting {
	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getAgenda() <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenda()
	 * @generated
	 * @ordered
	 */
	protected Agenda agenda;

	/**
	 * The cached value of the '{@link #getNonactivemeeting() <em>Nonactivemeeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonactivemeeting()
	 * @generated
	 * @ordered
	 */
	protected NonActiveMeeting nonactivemeeting;

	/**
	 * The cached value of the '{@link #getActivemeeting() <em>Activemeeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivemeeting()
	 * @generated
	 * @ordered
	 */
	protected ActiveMeeting activemeeting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveMeetingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.ACTIVE_MEETING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentWithInverseEList<Participant>(Participant.class, this,
					CalendarPackage.ACTIVE_MEETING__PARTICIPANT, CalendarPackage.PARTICIPANT__MEETING);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda getAgenda() {
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgenda(Agenda newAgenda, NotificationChain msgs) {
		Agenda oldAgenda = agenda;
		agenda = newAgenda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CalendarPackage.ACTIVE_MEETING__AGENDA, oldAgenda, newAgenda);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenda(Agenda newAgenda) {
		if (newAgenda != agenda) {
			NotificationChain msgs = null;
			if (agenda != null)
				msgs = ((InternalEObject) agenda).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CalendarPackage.ACTIVE_MEETING__AGENDA, null, msgs);
			if (newAgenda != null)
				msgs = ((InternalEObject) newAgenda).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CalendarPackage.ACTIVE_MEETING__AGENDA, null, msgs);
			msgs = basicSetAgenda(newAgenda, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.ACTIVE_MEETING__AGENDA, newAgenda,
					newAgenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonActiveMeeting getNonactivemeeting() {
		if (nonactivemeeting != null && nonactivemeeting.eIsProxy()) {
			InternalEObject oldNonactivemeeting = (InternalEObject) nonactivemeeting;
			nonactivemeeting = (NonActiveMeeting) eResolveProxy(oldNonactivemeeting);
			if (nonactivemeeting != oldNonactivemeeting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING, oldNonactivemeeting, nonactivemeeting));
			}
		}
		return nonactivemeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonActiveMeeting basicGetNonactivemeeting() {
		return nonactivemeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonactivemeeting(NonActiveMeeting newNonactivemeeting) {
		NonActiveMeeting oldNonactivemeeting = nonactivemeeting;
		nonactivemeeting = newNonactivemeeting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING,
					oldNonactivemeeting, nonactivemeeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMeeting getActivemeeting() {
		if (activemeeting != null && activemeeting.eIsProxy()) {
			InternalEObject oldActivemeeting = (InternalEObject) activemeeting;
			activemeeting = (ActiveMeeting) eResolveProxy(oldActivemeeting);
			if (activemeeting != oldActivemeeting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING, oldActivemeeting, activemeeting));
			}
		}
		return activemeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMeeting basicGetActivemeeting() {
		return activemeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivemeeting(ActiveMeeting newActivemeeting) {
		ActiveMeeting oldActivemeeting = activemeeting;
		activemeeting = newActivemeeting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING,
					oldActivemeeting, activemeeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division getDivision() {
		if (eContainerFeatureID() != CalendarPackage.ACTIVE_MEETING__DIVISION)
			return null;
		return (Division) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivision(Division newDivision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDivision, CalendarPackage.ACTIVE_MEETING__DIVISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivision(Division newDivision) {
		if (newDivision != eInternalContainer()
				|| (eContainerFeatureID() != CalendarPackage.ACTIVE_MEETING__DIVISION && newDivision != null)) {
			if (EcoreUtil.isAncestor(this, newDivision))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDivision != null)
				msgs = ((InternalEObject) newDivision).eInverseAdd(this, CalendarPackage.DIVISION__MEETING,
						Division.class, msgs);
			msgs = basicSetDivision(newDivision, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.ACTIVE_MEETING__DIVISION, newDivision,
					newDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipant()).basicAdd(otherEnd, msgs);
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDivision((Division) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
		case CalendarPackage.ACTIVE_MEETING__AGENDA:
			return basicSetAgenda(null, msgs);
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			return basicSetDivision(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.DIVISION__MEETING, Division.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			return getParticipant();
		case CalendarPackage.ACTIVE_MEETING__AGENDA:
			return getAgenda();
		case CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING:
			if (resolve)
				return getNonactivemeeting();
			return basicGetNonactivemeeting();
		case CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING:
			if (resolve)
				return getActivemeeting();
			return basicGetActivemeeting();
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			return getDivision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			getParticipant().clear();
			getParticipant().addAll((Collection<? extends Participant>) newValue);
			return;
		case CalendarPackage.ACTIVE_MEETING__AGENDA:
			setAgenda((Agenda) newValue);
			return;
		case CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING:
			setNonactivemeeting((NonActiveMeeting) newValue);
			return;
		case CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING:
			setActivemeeting((ActiveMeeting) newValue);
			return;
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			setDivision((Division) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			getParticipant().clear();
			return;
		case CalendarPackage.ACTIVE_MEETING__AGENDA:
			setAgenda((Agenda) null);
			return;
		case CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING:
			setNonactivemeeting((NonActiveMeeting) null);
			return;
		case CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING:
			setActivemeeting((ActiveMeeting) null);
			return;
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			setDivision((Division) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
			return participant != null && !participant.isEmpty();
		case CalendarPackage.ACTIVE_MEETING__AGENDA:
			return agenda != null;
		case CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING:
			return nonactivemeeting != null;
		case CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING:
			return activemeeting != null;
		case CalendarPackage.ACTIVE_MEETING__DIVISION:
			return getDivision() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Meeting.class) {
			switch (derivedFeatureID) {
			case CalendarPackage.ACTIVE_MEETING__PARTICIPANT:
				return CalendarPackage.MEETING__PARTICIPANT;
			case CalendarPackage.ACTIVE_MEETING__AGENDA:
				return CalendarPackage.MEETING__AGENDA;
			case CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING:
				return CalendarPackage.MEETING__NONACTIVEMEETING;
			case CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING:
				return CalendarPackage.MEETING__ACTIVEMEETING;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Meeting.class) {
			switch (baseFeatureID) {
			case CalendarPackage.MEETING__PARTICIPANT:
				return CalendarPackage.ACTIVE_MEETING__PARTICIPANT;
			case CalendarPackage.MEETING__AGENDA:
				return CalendarPackage.ACTIVE_MEETING__AGENDA;
			case CalendarPackage.MEETING__NONACTIVEMEETING:
				return CalendarPackage.ACTIVE_MEETING__NONACTIVEMEETING;
			case CalendarPackage.MEETING__ACTIVEMEETING:
				return CalendarPackage.ACTIVE_MEETING__ACTIVEMEETING;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActiveMeetingImpl
