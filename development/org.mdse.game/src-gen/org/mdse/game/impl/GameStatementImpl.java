/**
 */
package org.mdse.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.constructs.Statement;

import org.mdse.game.GamePackage;
import org.mdse.game.GameStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.GameStatementImpl#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameStatementImpl extends MinimalEObjectImpl.Container implements GameStatement {
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
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.GAME_STATEMENT;
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
					GamePackage.GAME_STATEMENT__NEXT_STATEMENT, oldNextStatement, newNextStatement);
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
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_STATEMENT__NEXT_STATEMENT, null, msgs);
			if (newNextStatement != null)
				msgs = ((InternalEObject) newNextStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_STATEMENT__NEXT_STATEMENT, null, msgs);
			msgs = basicSetNextStatement(newNextStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_STATEMENT__NEXT_STATEMENT,
					newNextStatement, newNextStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.GAME_STATEMENT__STATEMENT, oldStatement, newStatement);
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
	public void setStatement(Statement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject) statement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_STATEMENT__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject) newStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_STATEMENT__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_STATEMENT__STATEMENT, newStatement,
					newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.GAME_STATEMENT__NEXT_STATEMENT:
			return basicSetNextStatement(null, msgs);
		case GamePackage.GAME_STATEMENT__STATEMENT:
			return basicSetStatement(null, msgs);
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
		case GamePackage.GAME_STATEMENT__NEXT_STATEMENT:
			return getNextStatement();
		case GamePackage.GAME_STATEMENT__STATEMENT:
			return getStatement();
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
		case GamePackage.GAME_STATEMENT__NEXT_STATEMENT:
			setNextStatement((GameStatement) newValue);
			return;
		case GamePackage.GAME_STATEMENT__STATEMENT:
			setStatement((Statement) newValue);
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
		case GamePackage.GAME_STATEMENT__NEXT_STATEMENT:
			setNextStatement((GameStatement) null);
			return;
		case GamePackage.GAME_STATEMENT__STATEMENT:
			setStatement((Statement) null);
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
		case GamePackage.GAME_STATEMENT__NEXT_STATEMENT:
			return nextStatement != null;
		case GamePackage.GAME_STATEMENT__STATEMENT:
			return statement != null;
		}
		return super.eIsSet(featureID);
	}

} //GameStatementImpl
