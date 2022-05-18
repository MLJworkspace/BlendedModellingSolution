/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.Division;
import calendar.NoTaskPersonnel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Task Personnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.NoTaskPersonnelImpl#getDivision <em>Division</em>}</li>
 *   <li>{@link calendar.impl.NoTaskPersonnelImpl#getSurname <em>Surname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoTaskPersonnelImpl extends PersonImpl implements NoTaskPersonnel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoTaskPersonnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.NO_TASK_PERSONNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division getDivision() {
		if (eContainerFeatureID() != CalendarPackage.NO_TASK_PERSONNEL__DIVISION)
			return null;
		return (Division) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivision(Division newDivision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDivision, CalendarPackage.NO_TASK_PERSONNEL__DIVISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivision(Division newDivision) {
		if (newDivision != eInternalContainer()
				|| (eContainerFeatureID() != CalendarPackage.NO_TASK_PERSONNEL__DIVISION && newDivision != null)) {
			if (EcoreUtil.isAncestor(this, newDivision))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDivision != null)
				msgs = ((InternalEObject) newDivision).eInverseAdd(this, CalendarPackage.DIVISION__NOTASKPERSONNEL,
						Division.class, msgs);
			msgs = basicSetDivision(newDivision, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.NO_TASK_PERSONNEL__DIVISION,
					newDivision, newDivision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CalendarPackage.NO_TASK_PERSONNEL__SURNAME,
					oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
			return eInternalContainer().eInverseRemove(this, CalendarPackage.DIVISION__NOTASKPERSONNEL, Division.class,
					msgs);
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
			return getDivision();
		case CalendarPackage.NO_TASK_PERSONNEL__SURNAME:
			return getSurname();
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
			setDivision((Division) newValue);
			return;
		case CalendarPackage.NO_TASK_PERSONNEL__SURNAME:
			setSurname((String) newValue);
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
			setDivision((Division) null);
			return;
		case CalendarPackage.NO_TASK_PERSONNEL__SURNAME:
			setSurname(SURNAME_EDEFAULT);
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
		case CalendarPackage.NO_TASK_PERSONNEL__DIVISION:
			return getDivision() != null;
		case CalendarPackage.NO_TASK_PERSONNEL__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
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

} //NoTaskPersonnelImpl
