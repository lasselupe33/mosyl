/**
 */
package org.mdse.game.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.game.Entrypoint;
import org.mdse.game.GameInputs;
import org.mdse.game.GamePackage;
import org.mdse.game.GameStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entrypoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.EntrypointImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.mdse.game.impl.EntrypointImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntrypointImpl extends MinimalEObjectImpl.Container implements Entrypoint {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected GameInputs inputs;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected GameStatement statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntrypointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.ENTRYPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameInputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(GameInputs newInputs, NotificationChain msgs) {
		GameInputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.ENTRYPOINT__INPUTS, oldInputs, newInputs);
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
	public void setInputs(GameInputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject) inputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.ENTRYPOINT__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject) newInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.ENTRYPOINT__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ENTRYPOINT__INPUTS, newInputs,
					newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStatement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(GameStatement newStatement, NotificationChain msgs) {
		GameStatement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.ENTRYPOINT__STATEMENT, oldStatement, newStatement);
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
	public void setStatement(GameStatement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject) statement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.ENTRYPOINT__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject) newStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.ENTRYPOINT__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ENTRYPOINT__STATEMENT, newStatement,
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
		case GamePackage.ENTRYPOINT__INPUTS:
			return basicSetInputs(null, msgs);
		case GamePackage.ENTRYPOINT__STATEMENT:
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
		case GamePackage.ENTRYPOINT__INPUTS:
			return getInputs();
		case GamePackage.ENTRYPOINT__STATEMENT:
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
		case GamePackage.ENTRYPOINT__INPUTS:
			setInputs((GameInputs) newValue);
			return;
		case GamePackage.ENTRYPOINT__STATEMENT:
			setStatement((GameStatement) newValue);
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
		case GamePackage.ENTRYPOINT__INPUTS:
			setInputs((GameInputs) null);
			return;
		case GamePackage.ENTRYPOINT__STATEMENT:
			setStatement((GameStatement) null);
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
		case GamePackage.ENTRYPOINT__INPUTS:
			return inputs != null;
		case GamePackage.ENTRYPOINT__STATEMENT:
			return statement != null;
		}
		return super.eIsSet(featureID);
	}

} //EntrypointImpl
