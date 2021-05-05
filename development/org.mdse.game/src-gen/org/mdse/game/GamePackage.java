/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.mdse/game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = org.mdse.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.GameImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ENTRYPOINT = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TESTS = 3;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.GameStatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.GameStatementImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getGameStatement()
	 * @generated
	 */
	int GAME_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATEMENT__NEXT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATEMENT__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.GameInputsImpl <em>Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.GameInputsImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getGameInputs()
	 * @generated
	 */
	int GAME_INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUTS__NEXT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUTS__INPUTS = 1;

	/**
	 * The number of structural features of the '<em>Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.EntrypointImpl <em>Entrypoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.EntrypointImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getEntrypoint()
	 * @generated
	 */
	int ENTRYPOINT = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Entrypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entrypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.mdse.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see org.mdse.game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.game.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.game.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.game.Game#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mdse.game.Game#getDescription()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Game#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entrypoint</em>'.
	 * @see org.mdse.game.Game#getEntrypoint()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entrypoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.game.Game#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.mdse.game.Game#getTests()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Tests();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.GameStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.mdse.game.GameStatement
	 * @generated
	 */
	EClass getGameStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.GameStatement#getNextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Statement</em>'.
	 * @see org.mdse.game.GameStatement#getNextStatement()
	 * @see #getGameStatement()
	 * @generated
	 */
	EReference getGameStatement_NextStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.GameStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.mdse.game.GameStatement#getStatement()
	 * @see #getGameStatement()
	 * @generated
	 */
	EReference getGameStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.GameInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs</em>'.
	 * @see org.mdse.game.GameInputs
	 * @generated
	 */
	EClass getGameInputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.GameInputs#getNextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Statement</em>'.
	 * @see org.mdse.game.GameInputs#getNextStatement()
	 * @see #getGameInputs()
	 * @generated
	 */
	EReference getGameInputs_NextStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.GameInputs#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.mdse.game.GameInputs#getInputs()
	 * @see #getGameInputs()
	 * @generated
	 */
	EReference getGameInputs_Inputs();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.Entrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrypoint</em>'.
	 * @see org.mdse.game.Entrypoint
	 * @generated
	 */
	EClass getEntrypoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Entrypoint#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.mdse.game.Entrypoint#getInputs()
	 * @see #getEntrypoint()
	 * @generated
	 */
	EReference getEntrypoint_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.mdse.game.Entrypoint#getStatement()
	 * @see #getEntrypoint()
	 * @generated
	 */
	EReference getEntrypoint_Statement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.GameImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__DESCRIPTION = eINSTANCE.getGame_Description();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ENTRYPOINT = eINSTANCE.getGame_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TESTS = eINSTANCE.getGame_Tests();

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.GameStatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.GameStatementImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getGameStatement()
		 * @generated
		 */
		EClass GAME_STATEMENT = eINSTANCE.getGameStatement();

		/**
		 * The meta object literal for the '<em><b>Next Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_STATEMENT__NEXT_STATEMENT = eINSTANCE.getGameStatement_NextStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_STATEMENT__STATEMENT = eINSTANCE.getGameStatement_Statement();

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.GameInputsImpl <em>Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.GameInputsImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getGameInputs()
		 * @generated
		 */
		EClass GAME_INPUTS = eINSTANCE.getGameInputs();

		/**
		 * The meta object literal for the '<em><b>Next Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_INPUTS__NEXT_STATEMENT = eINSTANCE.getGameInputs_NextStatement();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_INPUTS__INPUTS = eINSTANCE.getGameInputs_Inputs();

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.EntrypointImpl <em>Entrypoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.EntrypointImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getEntrypoint()
		 * @generated
		 */
		EClass ENTRYPOINT = eINSTANCE.getEntrypoint();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPOINT__INPUTS = eINSTANCE.getEntrypoint_Inputs();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPOINT__STATEMENT = eINSTANCE.getEntrypoint_Statement();

	}

} //GamePackage
