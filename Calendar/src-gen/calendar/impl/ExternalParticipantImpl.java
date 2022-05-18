/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.ExternalParticipant;
import calendar.Participant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.ExternalParticipantImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalParticipantImpl extends PersonImpl implements ExternalParticipant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.EXTERNAL_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getParticipant() {
		if (eContainerFeatureID() != CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT)
			return null;
		return (Participant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParticipant, CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(Participant newParticipant) {
		if (newParticipant != eInternalContainer()
				|| (eContainerFeatureID() != CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT
						&& newParticipant != null)) {
			if (EcoreUtil.isAncestor(this, newParticipant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject) newParticipant).eInverseAdd(this,
						CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT, Participant.class, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT,
					newParticipant, newParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParticipant((Participant) otherEnd, msgs);
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
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			return basicSetParticipant(null, msgs);
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
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.PARTICIPANT__EXTERNALPARTICIPANT,
					Participant.class, msgs);
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
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			return getParticipant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			setParticipant((Participant) newValue);
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
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			setParticipant((Participant) null);
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
		case CalendarPackage.EXTERNAL_PARTICIPANT__PARTICIPANT:
			return getParticipant() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalParticipantImpl
