/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.Division;
import calendar.Item;
import calendar.NotAvailable;
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
 * An implementation of the model object '<em><b>Not Available</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.NotAvailableImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link calendar.impl.NotAvailableImpl#getItem <em>Item</em>}</li>
 *   <li>{@link calendar.impl.NotAvailableImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link calendar.impl.NotAvailableImpl#getDivision <em>Division</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotAvailableImpl extends PersonImpl implements NotAvailable {
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
	 * The cached value of the '{@link #getDivision() <em>Division</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivision()
	 * @generated
	 * @ordered
	 */
	protected Division division;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotAvailableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.NOT_AVAILABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getParticipant() {
		if (eContainerFeatureID() != CalendarPackage.NOT_AVAILABLE__PARTICIPANT)
			return null;
		return (Participant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParticipant, CalendarPackage.NOT_AVAILABLE__PARTICIPANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipant(Participant newParticipant) {
		if (newParticipant != eInternalContainer()
				|| (eContainerFeatureID() != CalendarPackage.NOT_AVAILABLE__PARTICIPANT && newParticipant != null)) {
			if (EcoreUtil.isAncestor(this, newParticipant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParticipant != null)
				msgs = ((InternalEObject) newParticipant).eInverseAdd(this, CalendarPackage.PARTICIPANT__NOTAVAILABLE,
						Participant.class, msgs);
			msgs = basicSetParticipant(newParticipant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.NOT_AVAILABLE__PARTICIPANT,
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
					CalendarPackage.NOT_AVAILABLE__ITEM, CalendarPackage.ITEM__NOTAVAILABLE);
		}
		return item;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.NOT_AVAILABLE__SURNAME, oldSurname,
					surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division getDivision() {
		if (division != null && division.eIsProxy()) {
			InternalEObject oldDivision = (InternalEObject) division;
			division = (Division) eResolveProxy(oldDivision);
			if (division != oldDivision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalendarPackage.NOT_AVAILABLE__DIVISION,
							oldDivision, division));
			}
		}
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division basicGetDivision() {
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivision(Division newDivision) {
		Division oldDivision = division;
		division = newDivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.NOT_AVAILABLE__DIVISION, oldDivision,
					division));
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParticipant((Participant) otherEnd, msgs);
		case CalendarPackage.NOT_AVAILABLE__ITEM:
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			return basicSetParticipant(null, msgs);
		case CalendarPackage.NOT_AVAILABLE__ITEM:
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.PARTICIPANT__NOTAVAILABLE,
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			return getParticipant();
		case CalendarPackage.NOT_AVAILABLE__ITEM:
			return getItem();
		case CalendarPackage.NOT_AVAILABLE__SURNAME:
			return getSurname();
		case CalendarPackage.NOT_AVAILABLE__DIVISION:
			if (resolve)
				return getDivision();
			return basicGetDivision();
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			setParticipant((Participant) newValue);
			return;
		case CalendarPackage.NOT_AVAILABLE__ITEM:
			getItem().clear();
			getItem().addAll((Collection<? extends Item>) newValue);
			return;
		case CalendarPackage.NOT_AVAILABLE__SURNAME:
			setSurname((String) newValue);
			return;
		case CalendarPackage.NOT_AVAILABLE__DIVISION:
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			setParticipant((Participant) null);
			return;
		case CalendarPackage.NOT_AVAILABLE__ITEM:
			getItem().clear();
			return;
		case CalendarPackage.NOT_AVAILABLE__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case CalendarPackage.NOT_AVAILABLE__DIVISION:
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
		case CalendarPackage.NOT_AVAILABLE__PARTICIPANT:
			return getParticipant() != null;
		case CalendarPackage.NOT_AVAILABLE__ITEM:
			return item != null && !item.isEmpty();
		case CalendarPackage.NOT_AVAILABLE__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case CalendarPackage.NOT_AVAILABLE__DIVISION:
			return division != null;
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

} //NotAvailableImpl
