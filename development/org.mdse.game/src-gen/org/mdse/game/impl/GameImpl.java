/**
 */
package org.mdse.game.impl;

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

import org.mdse.constructs.ReturnStatement;
import org.mdse.constructs.Statement;

import org.mdse.game.Game;
import org.mdse.game.GamePackage;

import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.UnitTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.GameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatement()
	 * @generated
	 * @ordered
	 */
	protected ReturnStatement returnStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitTest> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<UnitTest>(UnitTest.class, this, GamePackage.GAME__TESTS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME__INPUTS,
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
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject) newInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, GamePackage.GAME__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement getReturnStatement() {
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnStatement(ReturnStatement newReturnStatement, NotificationChain msgs) {
		ReturnStatement oldReturnStatement = returnStatement;
		returnStatement = newReturnStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.GAME__RETURN_STATEMENT, oldReturnStatement, newReturnStatement);
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
	public void setReturnStatement(ReturnStatement newReturnStatement) {
		if (newReturnStatement != returnStatement) {
			NotificationChain msgs = null;
			if (returnStatement != null)
				msgs = ((InternalEObject) returnStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__RETURN_STATEMENT, null, msgs);
			if (newReturnStatement != null)
				msgs = ((InternalEObject) newReturnStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__RETURN_STATEMENT, null, msgs);
			msgs = basicSetReturnStatement(newReturnStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__RETURN_STATEMENT,
					newReturnStatement, newReturnStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.GAME__TESTS:
			return ((InternalEList<?>) getTests()).basicRemove(otherEnd, msgs);
		case GamePackage.GAME__INPUTS:
			return basicSetInputs(null, msgs);
		case GamePackage.GAME__STATEMENTS:
			return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
		case GamePackage.GAME__RETURN_STATEMENT:
			return basicSetReturnStatement(null, msgs);
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
		case GamePackage.GAME__NAME:
			return getName();
		case GamePackage.GAME__DESCRIPTION:
			return getDescription();
		case GamePackage.GAME__TESTS:
			return getTests();
		case GamePackage.GAME__INPUTS:
			return getInputs();
		case GamePackage.GAME__STATEMENTS:
			return getStatements();
		case GamePackage.GAME__RETURN_STATEMENT:
			return getReturnStatement();
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
		case GamePackage.GAME__NAME:
			setName((String) newValue);
			return;
		case GamePackage.GAME__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GamePackage.GAME__TESTS:
			getTests().clear();
			getTests().addAll((Collection<? extends UnitTest>) newValue);
			return;
		case GamePackage.GAME__INPUTS:
			setInputs((Inputs) newValue);
			return;
		case GamePackage.GAME__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection<? extends Statement>) newValue);
			return;
		case GamePackage.GAME__RETURN_STATEMENT:
			setReturnStatement((ReturnStatement) newValue);
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
		case GamePackage.GAME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GamePackage.GAME__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GamePackage.GAME__TESTS:
			getTests().clear();
			return;
		case GamePackage.GAME__INPUTS:
			setInputs((Inputs) null);
			return;
		case GamePackage.GAME__STATEMENTS:
			getStatements().clear();
			return;
		case GamePackage.GAME__RETURN_STATEMENT:
			setReturnStatement((ReturnStatement) null);
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
		case GamePackage.GAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GamePackage.GAME__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GamePackage.GAME__TESTS:
			return tests != null && !tests.isEmpty();
		case GamePackage.GAME__INPUTS:
			return inputs != null;
		case GamePackage.GAME__STATEMENTS:
			return statements != null && !statements.isEmpty();
		case GamePackage.GAME__RETURN_STATEMENT:
			return returnStatement != null;
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

} //GameImpl
