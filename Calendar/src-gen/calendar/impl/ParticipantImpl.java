/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.ExternalParticipant;
import calendar.InternalParticipant;
import calendar.Meeting;
import calendar.NotAvailable;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.ParticipantImpl#getExternalparticipant <em>Externalparticipant</em>}</li>
 *   <li>{@link calendar.impl.ParticipantImpl#getInternalparticipant <em>Internalparticipant</em>}</li>
 *   <li>{@link calendar.impl.ParticipantImpl#getNotavailable <em>Notavailable</em>}</li>
 *   <li>{@link calendar.impl.ParticipantImpl#getMeeting <em>Meeting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The cached value of the '{@link #getExternalparticipant() <em>Externalparticipant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalparticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalParticipant> externalparticipant;

	/**
	 * The cached value of the '{@link #getInternalparticipant() <em>Internalparticipant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalparticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalParticipant> internalparticipant;

	/**
	 * The cached value of the '{@link #getNotavailable() <em>Notavailable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotavailable()
	 * @generated
	 * @ordered
	 */
	protected EList<NotAvailable> notavailable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalParticipant> getExternalparticipant() {
		if (externalparticipant == null) {
			externalparticipant = new EObjectContainmentWithInverseEList<ExternalParticipant>(ExternalParticipant.class,
					this, CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT,
					CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT);
		}
		return externalparticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalParticipant> getInternalparticipant() {
		if (internalparticipant == null) {
			internalparticipant = new EObjectContainmentWithInverseEList<InternalParticipant>(InternalParticipant.class,
					this, CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT,
					CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT);
		}
		return internalparticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotAvailable> getNotavailable() {
		if (notavailable == null) {
			notavailable = new EObjectContainmentWithInverseEList<NotAvailable>(NotAvailable.class, this,
					CalendarPackage.PARTICIPANT__NOTAVAILABLE, CalendarPackage.NOT_AVAILABLE__PARTICIPANT);
		}
		return notavailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting getMeeting() {
		if (eContainerFeatureID() != CalendarPackage.PARTICIPANT__MEETING)
			return null;
		return (Meeting) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeeting(Meeting newMeeting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMeeting, CalendarPackage.PARTICIPANT__MEETING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeeting(Meeting newMeeting) {
		if (newMeeting != eInternalContainer()
				|| (eContainerFeatureID() != CalendarPackage.PARTICIPANT__MEETING && newMeeting != null)) {
			if (EcoreUtil.isAncestor(this, newMeeting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeeting != null)
				msgs = ((InternalEObject) newMeeting).eInverseAdd(this, CalendarPackage.MEETING__PARTICIPANT,
						Meeting.class, msgs);
			msgs = basicSetMeeting(newMeeting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.PARTICIPANT__MEETING, newMeeting,
					newMeeting));
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExternalparticipant()).basicAdd(otherEnd,
					msgs);
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInternalparticipant()).basicAdd(otherEnd,
					msgs);
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotavailable()).basicAdd(otherEnd, msgs);
		case CalendarPackage.PARTICIPANT__MEETING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMeeting((Meeting) otherEnd, msgs);
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			return ((InternalEList<?>) getExternalparticipant()).basicRemove(otherEnd, msgs);
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			return ((InternalEList<?>) getInternalparticipant()).basicRemove(otherEnd, msgs);
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			return ((InternalEList<?>) getNotavailable()).basicRemove(otherEnd, msgs);
		case CalendarPackage.PARTICIPANT__MEETING:
			return basicSetMeeting(null, msgs);
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
		case CalendarPackage.PARTICIPANT__MEETING:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.MEETING__PARTICIPANT, Meeting.class, msgs);
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			return getExternalparticipant();
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			return getInternalparticipant();
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			return getNotavailable();
		case CalendarPackage.PARTICIPANT__MEETING:
			return getMeeting();
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			getExternalparticipant().clear();
			getExternalparticipant().addAll((Collection<? extends ExternalParticipant>) newValue);
			return;
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			getInternalparticipant().clear();
			getInternalparticipant().addAll((Collection<? extends InternalParticipant>) newValue);
			return;
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			getNotavailable().clear();
			getNotavailable().addAll((Collection<? extends NotAvailable>) newValue);
			return;
		case CalendarPackage.PARTICIPANT__MEETING:
			setMeeting((Meeting) newValue);
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			getExternalparticipant().clear();
			return;
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			getInternalparticipant().clear();
			return;
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			getNotavailable().clear();
			return;
		case CalendarPackage.PARTICIPANT__MEETING:
			setMeeting((Meeting) null);
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
		case CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT:
			return externalparticipant != null && !externalparticipant.isEmpty();
		case CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT:
			return internalparticipant != null && !internalparticipant.isEmpty();
		case CalendarPackage.PARTICIPANT__NOTAVAILABLE:
			return notavailable != null && !notavailable.isEmpty();
		case CalendarPackage.PARTICIPANT__MEETING:
			return getMeeting() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantImpl
