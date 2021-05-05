/**
 */
package org.mdse.puzzle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.constructs.DeclareStatement;

import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.PuzzlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.impl.InputsImpl#getDeclareStatement <em>Declare Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputsImpl extends MinimalEObjectImpl.Container implements Inputs {
	/**
	 * The cached value of the '{@link #getDeclareStatement() <em>Declare Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclareStatement> declareStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclareStatement> getDeclareStatement() {
		if (declareStatement == null) {
			declareStatement = new EObjectContainmentEList<DeclareStatement>(DeclareStatement.class, this,
					PuzzlePackage.INPUTS__DECLARE_STATEMENT);
		}
		return declareStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PuzzlePackage.INPUTS__DECLARE_STATEMENT:
			return ((InternalEList<?>) getDeclareStatement()).basicRemove(otherEnd, msgs);
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
		case PuzzlePackage.INPUTS__DECLARE_STATEMENT:
			return getDeclareStatement();
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
		case PuzzlePackage.INPUTS__DECLARE_STATEMENT:
			getDeclareStatement().clear();
			getDeclareStatement().addAll((Collection<? extends DeclareStatement>) newValue);
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
		case PuzzlePackage.INPUTS__DECLARE_STATEMENT:
			getDeclareStatement().clear();
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
		case PuzzlePackage.INPUTS__DECLARE_STATEMENT:
			return declareStatement != null && !declareStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputsImpl
