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
import org.mdse.game.Game;
import org.mdse.game.GamePackage;

import org.mdse.puzzle.Puzzle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.impl.GameImpl#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link org.mdse.game.impl.GameImpl#getEntrypoint <em>Entrypoint</em>}</li>
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
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected Entrypoint entrypoint;

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
	public Entrypoint getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntrypoint(Entrypoint newEntrypoint, NotificationChain msgs) {
		Entrypoint oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME__ENTRYPOINT,
					oldEntrypoint, newEntrypoint);
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
	public void setEntrypoint(Entrypoint newEntrypoint) {
		if (newEntrypoint != entrypoint) {
			NotificationChain msgs = null;
			if (entrypoint != null)
				msgs = ((InternalEObject) entrypoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__ENTRYPOINT, null, msgs);
			if (newEntrypoint != null)
				msgs = ((InternalEObject) newEntrypoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME__ENTRYPOINT, null, msgs);
			msgs = basicSetEntrypoint(newEntrypoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__ENTRYPOINT, newEntrypoint,
					newEntrypoint));
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
		case GamePackage.GAME__ENTRYPOINT:
			return basicSetEntrypoint(null, msgs);
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
		case GamePackage.GAME__ENTRYPOINT:
			return getEntrypoint();
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
		case GamePackage.GAME__PUZZLE:
			setPuzzle((Puzzle) newValue);
			return;
		case GamePackage.GAME__ENTRYPOINT:
			setEntrypoint((Entrypoint) newValue);
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
		case GamePackage.GAME__ENTRYPOINT:
			setEntrypoint((Entrypoint) null);
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
		case GamePackage.GAME__ENTRYPOINT:
			return entrypoint != null;
		}
		return super.eIsSet(featureID);
	}

} //GameImpl
