/**
 */
package calendar.impl;

import calendar.ActiveMeeting;
import calendar.Agenda;
import calendar.CalendarPackage;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.MeetingImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.impl.MeetingImpl#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link calendar.impl.MeetingImpl#getNonactivemeeting <em>Nonactivemeeting</em>}</li>
 *   <li>{@link calendar.impl.MeetingImpl#getActivemeeting <em>Activemeeting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeetingImpl extends MinimalEObjectImpl.Container implements Meeting {
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
	protected MeetingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.MEETING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentWithInverseEList<Participant>(Participant.class, this,
					CalendarPackage.MEETING__PARTICIPANT, CalendarPackage.PARTICIPANT__MEETING);
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
					CalendarPackage.MEETING__AGENDA, oldAgenda, newAgenda);
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
						EOPPOSITE_FEATURE_BASE - CalendarPackage.MEETING__AGENDA, null, msgs);
			if (newAgenda != null)
				msgs = ((InternalEObject) newAgenda).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CalendarPackage.MEETING__AGENDA, null, msgs);
			msgs = basicSetAgenda(newAgenda, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.MEETING__AGENDA, newAgenda,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalendarPackage.MEETING__NONACTIVEMEETING,
							oldNonactivemeeting, nonactivemeeting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.MEETING__NONACTIVEMEETING,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalendarPackage.MEETING__ACTIVEMEETING,
							oldActivemeeting, activemeeting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.MEETING__ACTIVEMEETING,
					oldActivemeeting, activemeeting));
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
		case CalendarPackage.MEETING__PARTICIPANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParticipant()).basicAdd(otherEnd, msgs);
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
		case CalendarPackage.MEETING__PARTICIPANT:
			return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
		case CalendarPackage.MEETING__AGENDA:
			return basicSetAgenda(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CalendarPackage.MEETING__PARTICIPANT:
			return getParticipant();
		case CalendarPackage.MEETING__AGENDA:
			return getAgenda();
		case CalendarPackage.MEETING__NONACTIVEMEETING:
			if (resolve)
				return getNonactivemeeting();
			return basicGetNonactivemeeting();
		case CalendarPackage.MEETING__ACTIVEMEETING:
			if (resolve)
				return getActivemeeting();
			return basicGetActivemeeting();
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
		case CalendarPackage.MEETING__PARTICIPANT:
			getParticipant().clear();
			getParticipant().addAll((Collection<? extends Participant>) newValue);
			return;
		case CalendarPackage.MEETING__AGENDA:
			setAgenda((Agenda) newValue);
			return;
		case CalendarPackage.MEETING__NONACTIVEMEETING:
			setNonactivemeeting((NonActiveMeeting) newValue);
			return;
		case CalendarPackage.MEETING__ACTIVEMEETING:
			setActivemeeting((ActiveMeeting) newValue);
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
		case CalendarPackage.MEETING__PARTICIPANT:
			getParticipant().clear();
			return;
		case CalendarPackage.MEETING__AGENDA:
			setAgenda((Agenda) null);
			return;
		case CalendarPackage.MEETING__NONACTIVEMEETING:
			setNonactivemeeting((NonActiveMeeting) null);
			return;
		case CalendarPackage.MEETING__ACTIVEMEETING:
			setActivemeeting((ActiveMeeting) null);
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
		case CalendarPackage.MEETING__PARTICIPANT:
			return participant != null && !participant.isEmpty();
		case CalendarPackage.MEETING__AGENDA:
			return agenda != null;
		case CalendarPackage.MEETING__NONACTIVEMEETING:
			return nonactivemeeting != null;
		case CalendarPackage.MEETING__ACTIVEMEETING:
			return activemeeting != null;
		}
		return super.eIsSet(featureID);
	}

} //MeetingImpl
