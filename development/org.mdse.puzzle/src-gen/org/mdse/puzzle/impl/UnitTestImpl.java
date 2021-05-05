/**
 */
package org.mdse.puzzle.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.mdse.constructs.Literal;

import org.mdse.constructs.Variable;
import org.mdse.puzzle.PuzzlePackage;
import org.mdse.puzzle.UnitTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.impl.UnitTestImpl#getExpected <em>Expected</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.UnitTestImpl#getFailedMessage <em>Failed Message</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.UnitTestImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitTestImpl extends MinimalEObjectImpl.Container implements UnitTest {
	/**
	 * The cached value of the '{@link #getExpected() <em>Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected()
	 * @generated
	 * @ordered
	 */
	protected Literal expected;

	/**
	 * The default value of the '{@link #getFailedMessage() <em>Failed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILED_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailedMessage() <em>Failed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedMessage()
	 * @generated
	 * @ordered
	 */
	protected String failedMessage = FAILED_MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.UNIT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getExpected() {
		return expected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpected(Literal newExpected, NotificationChain msgs) {
		Literal oldExpected = expected;
		expected = newExpected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PuzzlePackage.UNIT_TEST__EXPECTED, oldExpected, newExpected);
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
	public void setExpected(Literal newExpected) {
		if (newExpected != expected) {
			NotificationChain msgs = null;
			if (expected != null)
				msgs = ((InternalEObject) expected).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.UNIT_TEST__EXPECTED, null, msgs);
			if (newExpected != null)
				msgs = ((InternalEObject) newExpected).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.UNIT_TEST__EXPECTED, null, msgs);
			msgs = basicSetExpected(newExpected, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.UNIT_TEST__EXPECTED, newExpected,
					newExpected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailedMessage() {
		return failedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedMessage(String newFailedMessage) {
		String oldFailedMessage = failedMessage;
		failedMessage = newFailedMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.UNIT_TEST__FAILED_MESSAGE,
					oldFailedMessage, failedMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Variable>(Variable.class, this, PuzzlePackage.UNIT_TEST__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PuzzlePackage.UNIT_TEST__EXPECTED:
			return basicSetExpected(null, msgs);
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
		case PuzzlePackage.UNIT_TEST__EXPECTED:
			return getExpected();
		case PuzzlePackage.UNIT_TEST__FAILED_MESSAGE:
			return getFailedMessage();
		case PuzzlePackage.UNIT_TEST__INPUTS:
			return getInputs();
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
		case PuzzlePackage.UNIT_TEST__EXPECTED:
			setExpected((Literal) newValue);
			return;
		case PuzzlePackage.UNIT_TEST__FAILED_MESSAGE:
			setFailedMessage((String) newValue);
			return;
		case PuzzlePackage.UNIT_TEST__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Variable>) newValue);
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
		case PuzzlePackage.UNIT_TEST__EXPECTED:
			setExpected((Literal) null);
			return;
		case PuzzlePackage.UNIT_TEST__FAILED_MESSAGE:
			setFailedMessage(FAILED_MESSAGE_EDEFAULT);
			return;
		case PuzzlePackage.UNIT_TEST__INPUTS:
			getInputs().clear();
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
		case PuzzlePackage.UNIT_TEST__EXPECTED:
			return expected != null;
		case PuzzlePackage.UNIT_TEST__FAILED_MESSAGE:
			return FAILED_MESSAGE_EDEFAULT == null ? failedMessage != null
					: !FAILED_MESSAGE_EDEFAULT.equals(failedMessage);
		case PuzzlePackage.UNIT_TEST__INPUTS:
			return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (failedMessage: ");
		result.append(failedMessage);
		result.append(')');
		return result.toString();
	}

} //UnitTestImpl
