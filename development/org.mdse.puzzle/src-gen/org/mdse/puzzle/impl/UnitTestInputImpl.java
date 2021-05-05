/**
 */
package org.mdse.puzzle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.constructs.Literal;
import org.mdse.constructs.Variable;

import org.mdse.puzzle.PuzzlePackage;
import org.mdse.puzzle.UnitTestInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Test Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.impl.UnitTestInputImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.UnitTestInputImpl#getOverwritingValue <em>Overwriting Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitTestInputImpl extends MinimalEObjectImpl.Container implements UnitTestInput {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getOverwritingValue() <em>Overwriting Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverwritingValue()
	 * @generated
	 * @ordered
	 */
	protected Literal overwritingValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitTestInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.UNIT_TEST_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PuzzlePackage.UNIT_TEST_INPUT__VARIABLE,
							oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.UNIT_TEST_INPUT__VARIABLE, oldVariable,
					variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getOverwritingValue() {
		return overwritingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverwritingValue(Literal newOverwritingValue, NotificationChain msgs) {
		Literal oldOverwritingValue = overwritingValue;
		overwritingValue = newOverwritingValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE, oldOverwritingValue, newOverwritingValue);
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
	public void setOverwritingValue(Literal newOverwritingValue) {
		if (newOverwritingValue != overwritingValue) {
			NotificationChain msgs = null;
			if (overwritingValue != null)
				msgs = ((InternalEObject) overwritingValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE, null, msgs);
			if (newOverwritingValue != null)
				msgs = ((InternalEObject) newOverwritingValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE, null, msgs);
			msgs = basicSetOverwritingValue(newOverwritingValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE,
					newOverwritingValue, newOverwritingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE:
			return basicSetOverwritingValue(null, msgs);
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
		case PuzzlePackage.UNIT_TEST_INPUT__VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
		case PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE:
			return getOverwritingValue();
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
		case PuzzlePackage.UNIT_TEST_INPUT__VARIABLE:
			setVariable((Variable) newValue);
			return;
		case PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE:
			setOverwritingValue((Literal) newValue);
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
		case PuzzlePackage.UNIT_TEST_INPUT__VARIABLE:
			setVariable((Variable) null);
			return;
		case PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE:
			setOverwritingValue((Literal) null);
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
		case PuzzlePackage.UNIT_TEST_INPUT__VARIABLE:
			return variable != null;
		case PuzzlePackage.UNIT_TEST_INPUT__OVERWRITING_VALUE:
			return overwritingValue != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitTestInputImpl
