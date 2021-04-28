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
import org.mdse.game.UsedInput;
import org.mdse.game.UsedStatement;

import org.mdse.puzzle.Input;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.UsedInputImpl#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.impl.UsedInputImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.mdse.game.impl.UsedInputImpl#getNextInput <em>Next Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsedInputImpl extends MinimalEObjectImpl.Container implements UsedInput {
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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Input input;

	/**
	 * The cached value of the '{@link #getNextInput() <em>Next Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInput()
	 * @generated
	 * @ordered
	 */
	protected UsedInput nextInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.USED_INPUT;
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
					GamePackage.USED_INPUT__NEXT_STATEMENT, oldNextStatement, newNextStatement);
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
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__NEXT_STATEMENT, null, msgs);
			if (newNextStatement != null)
				msgs = ((InternalEObject) newNextStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__NEXT_STATEMENT, null, msgs);
			msgs = basicSetNextStatement(newNextStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.USED_INPUT__NEXT_STATEMENT,
					newNextStatement, newNextStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Input newInput, NotificationChain msgs) {
		Input oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.USED_INPUT__INPUT, oldInput, newInput);
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
	public void setInput(Input newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.USED_INPUT__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedInput getNextInput() {
		return nextInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextInput(UsedInput newNextInput, NotificationChain msgs) {
		UsedInput oldNextInput = nextInput;
		nextInput = newNextInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.USED_INPUT__NEXT_INPUT, oldNextInput, newNextInput);
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
	public void setNextInput(UsedInput newNextInput) {
		if (newNextInput != nextInput) {
			NotificationChain msgs = null;
			if (nextInput != null)
				msgs = ((InternalEObject) nextInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__NEXT_INPUT, null, msgs);
			if (newNextInput != null)
				msgs = ((InternalEObject) newNextInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.USED_INPUT__NEXT_INPUT, null, msgs);
			msgs = basicSetNextInput(newNextInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.USED_INPUT__NEXT_INPUT, newNextInput,
					newNextInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.USED_INPUT__NEXT_STATEMENT:
			return basicSetNextStatement(null, msgs);
		case GamePackage.USED_INPUT__INPUT:
			return basicSetInput(null, msgs);
		case GamePackage.USED_INPUT__NEXT_INPUT:
			return basicSetNextInput(null, msgs);
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
		case GamePackage.USED_INPUT__NEXT_STATEMENT:
			return getNextStatement();
		case GamePackage.USED_INPUT__INPUT:
			return getInput();
		case GamePackage.USED_INPUT__NEXT_INPUT:
			return getNextInput();
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
		case GamePackage.USED_INPUT__NEXT_STATEMENT:
			setNextStatement((UsedStatement) newValue);
			return;
		case GamePackage.USED_INPUT__INPUT:
			setInput((Input) newValue);
			return;
		case GamePackage.USED_INPUT__NEXT_INPUT:
			setNextInput((UsedInput) newValue);
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
		case GamePackage.USED_INPUT__NEXT_STATEMENT:
			setNextStatement((UsedStatement) null);
			return;
		case GamePackage.USED_INPUT__INPUT:
			setInput((Input) null);
			return;
		case GamePackage.USED_INPUT__NEXT_INPUT:
			setNextInput((UsedInput) null);
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
		case GamePackage.USED_INPUT__NEXT_STATEMENT:
			return nextStatement != null;
		case GamePackage.USED_INPUT__INPUT:
			return input != null;
		case GamePackage.USED_INPUT__NEXT_INPUT:
			return nextInput != null;
		}
		return super.eIsSet(featureID);
	}

} //UsedInputImpl
