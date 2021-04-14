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
 *   <li>{@link org.mdse.constructs.impl.IfElseStatementImpl#getStatement2 <em>Statement2</em>}</li>
 *   <li>{@link org.mdse.constructs.impl.IfElseStatementImpl#getStatement1 <em>Statement1</em>}</li>
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
	 * The cached value of the '{@link #getStatement2() <em>Statement2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement2()
	 * @generated
	 * @ordered
	 */
	protected Statement statement2;

	/**
	 * The cached value of the '{@link #getStatement1() <em>Statement1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement1()
	 * @generated
	 * @ordered
	 */
	protected Statement statement1;

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
	public Statement getStatement2() {
		return statement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement2(Statement newStatement2, NotificationChain msgs) {
		Statement oldStatement2 = statement2;
		statement2 = newStatement2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2, oldStatement2, newStatement2);
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
	public void setStatement2(Statement newStatement2) {
		if (newStatement2 != statement2) {
			NotificationChain msgs = null;
			if (statement2 != null)
				msgs = ((InternalEObject) statement2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2, null, msgs);
			if (newStatement2 != null)
				msgs = ((InternalEObject) newStatement2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2, null, msgs);
			msgs = basicSetStatement2(newStatement2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2,
					newStatement2, newStatement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement1() {
		return statement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement1(Statement newStatement1, NotificationChain msgs) {
		Statement oldStatement1 = statement1;
		statement1 = newStatement1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1, oldStatement1, newStatement1);
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
	public void setStatement1(Statement newStatement1) {
		if (newStatement1 != statement1) {
			NotificationChain msgs = null;
			if (statement1 != null)
				msgs = ((InternalEObject) statement1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1, null, msgs);
			if (newStatement1 != null)
				msgs = ((InternalEObject) newStatement1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1, null, msgs);
			msgs = basicSetStatement1(newStatement1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1,
					newStatement1, newStatement1));
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
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
			return basicSetStatement2(null, msgs);
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
			return basicSetStatement1(null, msgs);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
			return getStatement2();
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
			return getStatement1();
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
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
			setStatement2((Statement) newValue);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
			setStatement1((Statement) newValue);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
			setStatement2((Statement) null);
			return;
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
			setStatement1((Statement) null);
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
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT2:
			return statement2 != null;
		case ConstructsPackage.IF_ELSE_STATEMENT__STATEMENT1:
			return statement1 != null;
		}
		return super.eIsSet(featureID);
	}

} //IfElseStatementImpl
