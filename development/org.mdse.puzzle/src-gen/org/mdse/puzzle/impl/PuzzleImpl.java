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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.Puzzle;
import org.mdse.puzzle.PuzzlePackage;
import org.mdse.puzzle.UnitTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.impl.PuzzleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.PuzzleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.PuzzleImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.mdse.puzzle.impl.PuzzleImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleImpl extends MinimalEObjectImpl.Container implements Puzzle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitTest> tests;

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
	protected PuzzleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.PUZZLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.PUZZLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.PUZZLE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitTest> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<UnitTest>(UnitTest.class, this, PuzzlePackage.PUZZLE__TESTS);
		}
		return tests;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PuzzlePackage.PUZZLE__INPUTS,
					oldInputs, newInputs);
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
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.PUZZLE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject) newInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.PUZZLE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.PUZZLE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PuzzlePackage.PUZZLE__TESTS:
			return ((InternalEList<?>) getTests()).basicRemove(otherEnd, msgs);
		case PuzzlePackage.PUZZLE__INPUTS:
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
		case PuzzlePackage.PUZZLE__NAME:
			return getName();
		case PuzzlePackage.PUZZLE__DESCRIPTION:
			return getDescription();
		case PuzzlePackage.PUZZLE__TESTS:
			return getTests();
		case PuzzlePackage.PUZZLE__INPUTS:
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
		case PuzzlePackage.PUZZLE__NAME:
			setName((String) newValue);
			return;
		case PuzzlePackage.PUZZLE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case PuzzlePackage.PUZZLE__TESTS:
			getTests().clear();
			getTests().addAll((Collection<? extends UnitTest>) newValue);
			return;
		case PuzzlePackage.PUZZLE__INPUTS:
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
		case PuzzlePackage.PUZZLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PuzzlePackage.PUZZLE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case PuzzlePackage.PUZZLE__TESTS:
			getTests().clear();
			return;
		case PuzzlePackage.PUZZLE__INPUTS:
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
		case PuzzlePackage.PUZZLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PuzzlePackage.PUZZLE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case PuzzlePackage.PUZZLE__TESTS:
			return tests != null && !tests.isEmpty();
		case PuzzlePackage.PUZZLE__INPUTS:
			return inputs != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PuzzleImpl
