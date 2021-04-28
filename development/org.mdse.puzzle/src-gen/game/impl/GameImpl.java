/**
 */
package game.impl;

import game.Game;
import game.GamePackage;
import game.UsedStatement;

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

import org.mdse.puzzle.Puzzle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.impl.GameImpl#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link game.impl.GameImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPuzzle() <em>Puzzle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuzzle()
	 * @generated
	 * @ordered
	 */
	protected Puzzle puzzle;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<UsedStatement> statements;

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
	public Puzzle getPuzzle() {
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPuzzle(Puzzle newPuzzle, NotificationChain msgs) {
		Puzzle oldPuzzle = puzzle;
		puzzle = newPuzzle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME__PUZZLE,
					oldPuzzle, newPuzzle);
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
	public void setPuzzle(Puzzle newPuzzle) {
		if (newPuzzle != puzzle) {
			NotificationChain msgs = null;
			if (puzzle != null)
				msgs = ((InternalEObject) puzzle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__PUZZLE, null, msgs);
			if (newPuzzle != null)
				msgs = ((InternalEObject) newPuzzle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__PUZZLE, null, msgs);
			msgs = basicSetPuzzle(newPuzzle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__PUZZLE, newPuzzle, newPuzzle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsedStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<UsedStatement>(UsedStatement.class, this,
					GamePackage.GAME__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.GAME__PUZZLE:
			return basicSetPuzzle(null, msgs);
		case GamePackage.GAME__STATEMENTS:
			return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
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
		case GamePackage.GAME__PUZZLE:
			return getPuzzle();
		case GamePackage.GAME__STATEMENTS:
			return getStatements();
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
		case GamePackage.GAME__PUZZLE:
			setPuzzle((Puzzle) newValue);
			return;
		case GamePackage.GAME__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection<? extends UsedStatement>) newValue);
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
		case GamePackage.GAME__PUZZLE:
			setPuzzle((Puzzle) null);
			return;
		case GamePackage.GAME__STATEMENTS:
			getStatements().clear();
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
		case GamePackage.GAME__PUZZLE:
			return puzzle != null;
		case GamePackage.GAME__STATEMENTS:
			return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
