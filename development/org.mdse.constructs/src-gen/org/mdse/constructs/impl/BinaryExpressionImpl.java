/**
 */
package org.mdse.constructs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mdse.constructs.BinaryExpression;
import org.mdse.constructs.ConstructsPackage;
import org.mdse.constructs.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.impl.BinaryExpressionImpl#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.mdse.constructs.impl.BinaryExpressionImpl#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getExpression1() <em>Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression1()
	 * @generated
	 * @ordered
	 */
	protected Expression expression1;

	/**
	 * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression2()
	 * @generated
	 * @ordered
	 */
	protected Expression expression2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstructsPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression1() {
		return expression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression1(Expression newExpression1, NotificationChain msgs) {
		Expression oldExpression1 = expression1;
		expression1 = newExpression1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1, oldExpression1, newExpression1);
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
	public void setExpression1(Expression newExpression1) {
		if (newExpression1 != expression1) {
			NotificationChain msgs = null;
			if (expression1 != null)
				msgs = ((InternalEObject) expression1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1, null, msgs);
			if (newExpression1 != null)
				msgs = ((InternalEObject) newExpression1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1, null, msgs);
			msgs = basicSetExpression1(newExpression1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1,
					newExpression1, newExpression1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression2() {
		return expression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression2(Expression newExpression2, NotificationChain msgs) {
		Expression oldExpression2 = expression2;
		expression2 = newExpression2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2, oldExpression2, newExpression2);
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
	public void setExpression2(Expression newExpression2) {
		if (newExpression2 != expression2) {
			NotificationChain msgs = null;
			if (expression2 != null)
				msgs = ((InternalEObject) expression2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2, null, msgs);
			if (newExpression2 != null)
				msgs = ((InternalEObject) newExpression2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2, null, msgs);
			msgs = basicSetExpression2(newExpression2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2,
					newExpression2, newExpression2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
			return basicSetExpression1(null, msgs);
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			return basicSetExpression2(null, msgs);
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
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
			return getExpression1();
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			return getExpression2();
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
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
			setExpression1((Expression) newValue);
			return;
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			setExpression2((Expression) newValue);
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
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
			setExpression1((Expression) null);
			return;
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			setExpression2((Expression) null);
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
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION1:
			return expression1 != null;
		case ConstructsPackage.BINARY_EXPRESSION__EXPRESSION2:
			return expression2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
