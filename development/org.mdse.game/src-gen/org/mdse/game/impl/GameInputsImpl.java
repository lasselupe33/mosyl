/**
 */
package org.mdse.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.game.GameInputs;
import org.mdse.game.GamePackage;
import org.mdse.game.GameStatement;

import org.mdse.puzzle.Inputs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.GameInputsImpl#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameInputsImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameInputsImpl extends MinimalEObjectImpl.Container implements GameInputs {
	/**
	 * The cached value of the '{@link #getNextStatement() <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStatement()
	 * @generated
	 * @ordered
	 */
	protected GameStatement nextStatement;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected Inputs inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameInputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.GAME_INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStatement getNextStatement() {
		return nextStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStatement(GameStatement newNextStatement, NotificationChain msgs) {
		GameStatement oldNextStatement = nextStatement;
		nextStatement = newNextStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.GAME_INPUTS__NEXT_STATEMENT, oldNextStatement, newNextStatement);
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
	public void setNextStatement(GameStatement newNextStatement) {
		if (newNextStatement != nextStatement) {
			NotificationChain msgs = null;
			if (nextStatement != null)
				msgs = ((InternalEObject) nextStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_INPUTS__NEXT_STATEMENT, null, msgs);
			if (newNextStatement != null)
				msgs = ((InternalEObject) newNextStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_INPUTS__NEXT_STATEMENT, null, msgs);
			msgs = basicSetNextStatement(newNextStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_INPUTS__NEXT_STATEMENT,
					newNextStatement, newNextStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(Inputs newInputs, NotificationChain msgs) {
		Inputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.GAME_INPUTS__INPUTS, oldInputs, newInputs);
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
	public void setInputs(Inputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject) inputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_INPUTS__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject) newInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_INPUTS__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_INPUTS__INPUTS, newInputs,
					newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.GAME_INPUTS__NEXT_STATEMENT:
			return basicSetNextStatement(null, msgs);
		case GamePackage.GAME_INPUTS__INPUTS:
			return basicSetInputs(null, msgs);
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
		case GamePackage.GAME_INPUTS__NEXT_STATEMENT:
			return getNextStatement();
		case GamePackage.GAME_INPUTS__INPUTS:
			return getInputs();
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
		case GamePackage.GAME_INPUTS__NEXT_STATEMENT:
			setNextStatement((GameStatement) newValue);
			return;
		case GamePackage.GAME_INPUTS__INPUTS:
			setInputs((Inputs) newValue);
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
		case GamePackage.GAME_INPUTS__NEXT_STATEMENT:
			setNextStatement((GameStatement) null);
			return;
		case GamePackage.GAME_INPUTS__INPUTS:
			setInputs((Inputs) null);
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
		case GamePackage.GAME_INPUTS__NEXT_STATEMENT:
			return nextStatement != null;
		case GamePackage.GAME_INPUTS__INPUTS:
			return inputs != null;
		}
		return super.eIsSet(featureID);
	}

} //GameInputsImpl
