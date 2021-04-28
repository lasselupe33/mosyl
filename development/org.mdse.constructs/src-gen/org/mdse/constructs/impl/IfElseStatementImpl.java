/**
 */
package org.mdse.constructs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mdse.constructs.ConstructsPackage;
import org.mdse.constructs.Expression;
import org.mdse.constructs.IfElseStatement;
import org.mdse.constructs.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.impl.IfElseStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mdse.constructs.impl.IfElseStatementImpl#getElseStatement <em>Else Statement</em>}</li>
 *   <li>{@link org.mdse.constructs.impl.IfElseStatementImpl#getIfStatement <em>If Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfElseStatementImpl extends StatementImpl implements IfElseStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement elseStatement;

	/**
	 * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement ifStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstructsPackage.Literals.IF_ELSE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.IF_ELSE_STATEMENT__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.IF_ELSE_STATEMENT__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs) {
		Statement oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT, oldElseStatement, newElseStatement);
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
	public void setElseStatement(Statement newElseStatement) {
		if (newElseStatement != elseStatement) {
			NotificationChain msgs = null;
			if (elseStatement != null)
				msgs = ((InternalEObject) elseStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT, null, msgs);
			if (newElseStatement != null)
				msgs = ((InternalEObject) newElseStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT, null, msgs);
			msgs = basicSetElseStatement(newElseStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT,
					newElseStatement, newElseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getIfStatement() {
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfStatement(Statement newIfStatement, NotificationChain msgs) {
		Statement oldIfStatement = ifStatement;
		ifStatement = newIfStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT, oldIfStatement, newIfStatement);
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
	public void setIfStatement(Statement newIfStatement) {
		if (newIfStatement != ifStatement) {
			NotificationChain msgs = null;
			if (ifStatement != null)
				msgs = ((InternalEObject) ifStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT, null, msgs);
			if (newIfStatement != null)
				msgs = ((InternalEObject) newIfStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT, null, msgs);
			msgs = basicSetIfStatement(newIfStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT,
					newIfStatement, newIfStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
			return basicSetCondition(null, msgs);
		case ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT:
			return basicSetElseStatement(null, msgs);
		case ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT:
			return basicSetIfStatement(null, msgs);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
			return getCondition();
		case ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT:
			return getElseStatement();
		case ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT:
			return getIfStatement();
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
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
			setCondition((Expression) newValue);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT:
			setElseStatement((Statement) newValue);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT:
			setIfStatement((Statement) newValue);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
			setCondition((Expression) null);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT:
			setElseStatement((Statement) null);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT:
			setIfStatement((Statement) null);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__CONDITION:
			return condition != null;
		case ConstructsPackage.IF_ELSE_STATEMENT__ELSE_STATEMENT:
			return elseStatement != null;
		case ConstructsPackage.IF_ELSE_STATEMENT__IF_STATEMENT:
			return ifStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfElseStatementImpl
