/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.Division;
import calendar.InternalParticipant;
import calendar.Item;
import calendar.Participant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.InternalParticipantImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link calendar.impl.InternalParticipantImpl#getParticipantsDivision <em>Participants Division</em>}</li>
 *   <li>{@link calendar.impl.InternalParticipantImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.impl.InternalParticipantImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalParticipantImpl extends PersonImpl implements InternalParticipant {
	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipantsDivision() <em>Participants Division</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantsDivision()
	 * @generated
	 * @ordered
	 */
	protected Division participantsDivision;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.INTERNAL_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.INTERNAL_PARTICIPANT__SURNAME,
					oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division getParticipantsDivision() {
		if (participantsDivision != null && participantsDivision.eIsProxy()) {
			InternalEObject oldParticipantsDivision = (InternalEObject) participantsDivision;
			participantsDivision = (Division) eResolveProxy(oldParticipantsDivision);
			if (participantsDivision != oldParticipantsDivision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION, oldParticipantsDivision,
							participantsDivision));
			}
		}
		return participantsDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division basicGetParticipantsDivision() {
		return participantsDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantsDivision(Division newParticipantsDivision) {
		Division oldParticipantsDivision = participantsDivision;
		participantsDivision = newParticipantsDivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION, oldParticipantsDivision,
					participantsDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getParticipant() {
		if (eContainerFeatureID() != CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT)
			return null;
		return (Participant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParticipant, CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT,
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
				|| (eContainerFeatureID() != CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT
						&& newParticipant != null)) {
			if (EcoreUtil.isAncestor(this, newParticipant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject) newParticipant).eInverseAdd(this,
						CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT, Participant.class, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT,
					newParticipant, newParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectWithInverseResolvingEList.ManyInverse<Item>(Item.class, this,
					CalendarPackage.INTERNAL_PARTICIPANT__ITEM, CalendarPackage.ITEM__INTERNALPARTICIPANT);
		}
		return item;
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
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParticipant((Participant) otherEnd, msgs);
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getItem()).basicAdd(otherEnd, msgs);
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
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			return basicSetParticipant(null, msgs);
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			return ((InternalEList<?>) getItem()).basicRemove(otherEnd, msgs);
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
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.PARTICIPANT__INTERNALPARTICIPANT,
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
		case CalendarPackage.INTERNAL_PARTICIPANT__SURNAME:
			return getSurname();
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION:
			if (resolve)
				return getParticipantsDivision();
			return basicGetParticipantsDivision();
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			return getParticipant();
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			return getItem();
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
		case CalendarPackage.INTERNAL_PARTICIPANT__SURNAME:
			setSurname((String) newValue);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION:
			setParticipantsDivision((Division) newValue);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			setParticipant((Participant) newValue);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			getItem().clear();
			getItem().addAll((Collection<? extends Item>) newValue);
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
		case CalendarPackage.INTERNAL_PARTICIPANT__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION:
			setParticipantsDivision((Division) null);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			setParticipant((Participant) null);
			return;
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			getItem().clear();
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
		case CalendarPackage.INTERNAL_PARTICIPANT__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANTS_DIVISION:
			return participantsDivision != null;
		case CalendarPackage.INTERNAL_PARTICIPANT__PARTICIPANT:
			return getParticipant() != null;
		case CalendarPackage.INTERNAL_PARTICIPANT__ITEM:
			return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (surname: ");
		result.append(surname);
		result.append(')');
		return result.toString();
	}

} //InternalParticipantImpl
