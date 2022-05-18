/**
 */
package calendar.impl;

import calendar.ActiveMeeting;
import calendar.CalendarPackage;
import calendar.Division;
import calendar.NoTaskPersonnel;
import calendar.NonActiveMeeting;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.DivisionImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link calendar.impl.DivisionImpl#getNonactivemeeting <em>Nonactivemeeting</em>}</li>
 *   <li>{@link calendar.impl.DivisionImpl#getNotaskpersonnel <em>Notaskpersonnel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivisionImpl extends PersonImpl implements Division {
	/**
	 * The cached value of the '{@link #getMeeting() <em>Meeting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeeting()
	 * @generated
	 * @ordered
	 */
	protected EList<ActiveMeeting> meeting;

	/**
	 * The cached value of the '{@link #getNonactivemeeting() <em>Nonactivemeeting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonactivemeeting()
	 * @generated
	 * @ordered
	 */
	protected EList<NonActiveMeeting> nonactivemeeting;

	/**
	 * The cached value of the '{@link #getNotaskpersonnel() <em>Notaskpersonnel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotaskpersonnel()
	 * @generated
	 * @ordered
	 */
	protected EList<NoTaskPersonnel> notaskpersonnel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.DIVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActiveMeeting> getMeeting() {
		if (meeting == null) {
			meeting = new EObjectContainmentWithInverseEList<ActiveMeeting>(ActiveMeeting.class, this,
					CalendarPackage.DIVISION__MEETING, CalendarPackage.ACTIVE_MEETING__DIVISION);
		}
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonActiveMeeting> getNonactivemeeting() {
		if (nonactivemeeting == null) {
			nonactivemeeting = new EObjectContainmentWithInverseEList<NonActiveMeeting>(NonActiveMeeting.class, this,
					CalendarPackage.DIVISION__NONACTIVEMEETING, CalendarPackage.NON_ACTIVE_MEETING__DIVISION);
		}
		return nonactivemeeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoTaskPersonnel> getNotaskpersonnel() {
		if (notaskpersonnel == null) {
			notaskpersonnel = new EObjectContainmentWithInverseEList<NoTaskPersonnel>(NoTaskPersonnel.class, this,
					CalendarPackage.DIVISION__NOTASKPERSONNEL, CalendarPackage.NO_TASK_PERSONNEL__DIVISION);
		}
		return notaskpersonnel;
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
		case CalendarPackage.DIVISION__MEETING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMeeting()).basicAdd(otherEnd, msgs);
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNonactivemeeting()).basicAdd(otherEnd, msgs);
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotaskpersonnel()).basicAdd(otherEnd, msgs);
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
		case CalendarPackage.DIVISION__MEETING:
			return ((InternalEList<?>) getMeeting()).basicRemove(otherEnd, msgs);
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			return ((InternalEList<?>) getNonactivemeeting()).basicRemove(otherEnd, msgs);
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			return ((InternalEList<?>) getNotaskpersonnel()).basicRemove(otherEnd, msgs);
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
		case CalendarPackage.DIVISION__MEETING:
			return getMeeting();
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			return getNonactivemeeting();
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			return getNotaskpersonnel();
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
		case CalendarPackage.DIVISION__MEETING:
			getMeeting().clear();
			getMeeting().addAll((Collection<? extends ActiveMeeting>) newValue);
			return;
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			getNonactivemeeting().clear();
			getNonactivemeeting().addAll((Collection<? extends NonActiveMeeting>) newValue);
			return;
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			getNotaskpersonnel().clear();
			getNotaskpersonnel().addAll((Collection<? extends NoTaskPersonnel>) newValue);
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
		case CalendarPackage.DIVISION__MEETING:
			getMeeting().clear();
			return;
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			getNonactivemeeting().clear();
			return;
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			getNotaskpersonnel().clear();
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
		case CalendarPackage.DIVISION__MEETING:
			return meeting != null && !meeting.isEmpty();
		case CalendarPackage.DIVISION__NONACTIVEMEETING:
			return nonactivemeeting != null && !nonactivemeeting.isEmpty();
		case CalendarPackage.DIVISION__NOTASKPERSONNEL:
			return notaskpersonnel != null && !notaskpersonnel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DivisionImpl
