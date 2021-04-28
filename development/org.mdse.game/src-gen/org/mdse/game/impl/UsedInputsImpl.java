/**
 */
package org.mdse.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.game.GamePackage;
import org.mdse.game.UsedInputs;
import org.mdse.game.UsedStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.UsedInputsImpl#getNextStatement <em>Next Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsedInputsImpl extends MinimalEObjectImpl.Container implements UsedInputs {
	/**
	 * The cached value of the '{@link #getNextStatement() <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStatement()
	 * @generated
	 * @ordered
	 */
	protected UsedStatement nextStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedInputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.USED_INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedStatement getNextStatement() {
		return nextStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStatement(UsedStatement newNextStatement, NotificationChain msgs) {
		UsedStatement oldNextStatement = nextStatement;
		nextStatement = newNextStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.USED_INPUTS__NEXT_STATEMENT, oldNextStatement, newNextStatement);
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
	public void setNextStatement(UsedStatement newNextStatement) {
		if (newNextStatement != nextStatement) {
			NotificationChain msgs = null;
			if (nextStatement != null)
				msgs = ((InternalEObject) nextStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUTS__NEXT_STATEMENT, null, msgs);
			if (newNextStatement != null)
				msgs = ((InternalEObject) newNextStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUTS__NEXT_STATEMENT, null, msgs);
			msgs = basicSetNextStatement(newNextStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.USED_INPUTS__NEXT_STATEMENT,
					newNextStatement, newNextStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.USED_INPUTS__NEXT_STATEMENT:
			return basicSetNextStatement(null, msgs);
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
		case GamePackage.USED_INPUTS__NEXT_STATEMENT:
			return getNextStatement();
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
		case GamePackage.USED_INPUTS__NEXT_STATEMENT:
			setNextStatement((UsedStatement) newValue);
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
		case GamePackage.USED_INPUTS__NEXT_STATEMENT:
			setNextStatement((UsedStatement) null);
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
		case GamePackage.USED_INPUTS__NEXT_STATEMENT:
			return nextStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //UsedInputsImpl
