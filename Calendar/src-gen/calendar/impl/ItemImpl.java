/**
 */
package calendar.impl;

import calendar.CalendarPackage;
import calendar.ExternalParticipant;
import calendar.InternalParticipant;
import calendar.Item;
import calendar.NotAvailable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calendar.impl.ItemImpl#getExternalparticipant <em>Externalparticipant</em>}</li>
 *   <li>{@link calendar.impl.ItemImpl#getNotavailable <em>Notavailable</em>}</li>
 *   <li>{@link calendar.impl.ItemImpl#getInternalparticipant <em>Internalparticipant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends PersonImpl implements Item {
	/**
	 * The cached value of the '{@link #getExternalparticipant() <em>Externalparticipant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalparticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalParticipant> externalparticipant;

	/**
	 * The cached value of the '{@link #getNotavailable() <em>Notavailable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotavailable()
	 * @generated
	 * @ordered
	 */
	protected EList<NotAvailable> notavailable;

	/**
	 * The cached value of the '{@link #getInternalparticipant() <em>Internalparticipant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalparticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalParticipant> internalparticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalendarPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalParticipant> getExternalparticipant() {
		if (externalparticipant == null) {
			externalparticipant = new EObjectResolvingEList<ExternalParticipant>(ExternalParticipant.class, this,
					CalendarPackage.ITEM__EXTERNALPARTICIPANT);
		}
		return externalparticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotAvailable> getNotavailable() {
		if (notavailable == null) {
			notavailable = new EObjectWithInverseResolvingEList.ManyInverse<NotAvailable>(NotAvailable.class, this,
					CalendarPackage.ITEM__NOTAVAILABLE, CalendarPackage.NOT_AVAILABLE__ITEM);
		}
		return notavailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalParticipant> getInternalparticipant() {
		if (internalparticipant == null) {
			internalparticipant = new EObjectWithInverseResolvingEList.ManyInverse<InternalParticipant>(
					InternalParticipant.class, this, CalendarPackage.ITEM__INTERNALPARTICIPANT,
					CalendarPackage.INTERNAL_PARTICIPANT__ITEM);
		}
		return internalparticipant;
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
		case CalendarPackage.ITEM__NOTAVAILABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotavailable()).basicAdd(otherEnd, msgs);
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInternalparticipant()).basicAdd(otherEnd,
					msgs);
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
		case CalendarPackage.ITEM__NOTAVAILABLE:
			return ((InternalEList<?>) getNotavailable()).basicRemove(otherEnd, msgs);
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			return ((InternalEList<?>) getInternalparticipant()).basicRemove(otherEnd, msgs);
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
		case CalendarPackage.ITEM__EXTERNALPARTICIPANT:
			return getExternalparticipant();
		case CalendarPackage.ITEM__NOTAVAILABLE:
			return getNotavailable();
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			return getInternalparticipant();
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
		case CalendarPackage.ITEM__EXTERNALPARTICIPANT:
			getExternalparticipant().clear();
			getExternalparticipant().addAll((Collection<? extends ExternalParticipant>) newValue);
			return;
		case CalendarPackage.ITEM__NOTAVAILABLE:
			getNotavailable().clear();
			getNotavailable().addAll((Collection<? extends NotAvailable>) newValue);
			return;
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			getInternalparticipant().clear();
			getInternalparticipant().addAll((Collection<? extends InternalParticipant>) newValue);
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
		case CalendarPackage.ITEM__EXTERNALPARTICIPANT:
			getExternalparticipant().clear();
			return;
		case CalendarPackage.ITEM__NOTAVAILABLE:
			getNotavailable().clear();
			return;
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			getInternalparticipant().clear();
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
		case CalendarPackage.ITEM__EXTERNALPARTICIPANT:
			return externalparticipant != null && !externalparticipant.isEmpty();
		case CalendarPackage.ITEM__NOTAVAILABLE:
			return notavailable != null && !notavailable.isEmpty();
		case CalendarPackage.ITEM__INTERNALPARTICIPANT:
			return internalparticipant != null && !internalparticipant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
