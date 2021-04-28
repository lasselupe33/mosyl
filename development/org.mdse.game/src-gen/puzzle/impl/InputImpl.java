/**
 */
package puzzle.impl;

import constructs.DeclareStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.game.UsedStatement;

import puzzle.Input;
import puzzle.PuzzlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link puzzle.impl.InputImpl#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link puzzle.impl.InputImpl#getDeclareStatement <em>Declare Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getNextStatement() <em>Next Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStatement()
	 * @generated
	 * @ordered
	 */
	protected UsedStatement nextStatement;

	/**
	 * The cached value of the '{@link #getDeclareStatement() <em>Declare Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclareStatement()
	 * @generated
	 * @ordered
	 */
	protected DeclareStatement declareStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PuzzlePackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedStatement getNextStatement() {
		if (nextStatement != null && nextStatement.eIsProxy()) {
			InternalEObject oldNextStatement = (InternalEObject) nextStatement;
			nextStatement = (UsedStatement) eResolveProxy(oldNextStatement);
			if (nextStatement != oldNextStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PuzzlePackage.INPUT__NEXT_STATEMENT,
							oldNextStatement, nextStatement));
			}
		}
		return nextStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedStatement basicGetNextStatement() {
		return nextStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStatement(UsedStatement newNextStatement) {
		UsedStatement oldNextStatement = nextStatement;
		nextStatement = newNextStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.INPUT__NEXT_STATEMENT, oldNextStatement,
					nextStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareStatement getDeclareStatement() {
		return declareStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclareStatement(DeclareStatement newDeclareStatement, NotificationChain msgs) {
		DeclareStatement oldDeclareStatement = declareStatement;
		declareStatement = newDeclareStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PuzzlePackage.INPUT__DECLARE_STATEMENT, oldDeclareStatement, newDeclareStatement);
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
	public void setDeclareStatement(DeclareStatement newDeclareStatement) {
		if (newDeclareStatement != declareStatement) {
			NotificationChain msgs = null;
			if (declareStatement != null)
				msgs = ((InternalEObject) declareStatement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.INPUT__DECLARE_STATEMENT, null, msgs);
			if (newDeclareStatement != null)
				msgs = ((InternalEObject) newDeclareStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PuzzlePackage.INPUT__DECLARE_STATEMENT, null, msgs);
			msgs = basicSetDeclareStatement(newDeclareStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PuzzlePackage.INPUT__DECLARE_STATEMENT,
					newDeclareStatement, newDeclareStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PuzzlePackage.INPUT__DECLARE_STATEMENT:
			return basicSetDeclareStatement(null, msgs);
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
		case PuzzlePackage.INPUT__NEXT_STATEMENT:
			if (resolve)
				return getNextStatement();
			return basicGetNextStatement();
		case PuzzlePackage.INPUT__DECLARE_STATEMENT:
			return getDeclareStatement();
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
		case PuzzlePackage.INPUT__NEXT_STATEMENT:
			setNextStatement((UsedStatement) newValue);
			return;
		case PuzzlePackage.INPUT__DECLARE_STATEMENT:
			setDeclareStatement((DeclareStatement) newValue);
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
		case PuzzlePackage.INPUT__NEXT_STATEMENT:
			setNextStatement((UsedStatement) null);
			return;
		case PuzzlePackage.INPUT__DECLARE_STATEMENT:
			setDeclareStatement((DeclareStatement) null);
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
		case PuzzlePackage.INPUT__NEXT_STATEMENT:
			return nextStatement != null;
		case PuzzlePackage.INPUT__DECLARE_STATEMENT:
			return declareStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
