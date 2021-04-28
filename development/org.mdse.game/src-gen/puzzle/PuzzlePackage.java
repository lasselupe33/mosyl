/**
 */
package puzzle;

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
 * @see puzzle.PuzzleFactory
 * @model kind="package"
 * @generated
 */
public interface PuzzlePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "puzzle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.mdse/puzzle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "puzzle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzlePackage eINSTANCE = puzzle.impl.PuzzlePackageImpl.init();

	/**
	 * The meta object id for the '{@link puzzle.impl.PuzzleImpl <em>Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see puzzle.impl.PuzzleImpl
	 * @see puzzle.impl.PuzzlePackageImpl#getPuzzle()
	 * @generated
	 */
	int PUZZLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__TESTS = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Allowed Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__ALLOWED_STATEMENTS = 4;

	/**
	 * The number of structural features of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link puzzle.impl.UnitTestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see puzzle.impl.UnitTestImpl
	 * @see puzzle.impl.PuzzlePackageImpl#getUnitTest()
	 * @generated
	 */
	int UNIT_TEST = 1;

	/**
	 * The feature id for the '<em><b>Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__EXPECTED = 0;

	/**
	 * The feature id for the '<em><b>Failed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__FAILED_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__INPUTS = 2;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link puzzle.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see puzzle.impl.InputImpl
	 * @see puzzle.impl.PuzzlePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Next Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NEXT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Declare Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DECLARE_STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link puzzle.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle</em>'.
	 * @see puzzle.Puzzle
	 * @generated
	 */
	EClass getPuzzle();

	/**
	 * Returns the meta object for the attribute '{@link puzzle.Puzzle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see puzzle.Puzzle#getName()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Name();

	/**
	 * Returns the meta object for the attribute '{@link puzzle.Puzzle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see puzzle.Puzzle#getDescription()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link puzzle.Puzzle#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see puzzle.Puzzle#getTests()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Tests();

	/**
	 * Returns the meta object for the containment reference list '{@link puzzle.Puzzle#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see puzzle.Puzzle#getInputs()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link puzzle.Puzzle#getAllowedStatements <em>Allowed Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Statements</em>'.
	 * @see puzzle.Puzzle#getAllowedStatements()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_AllowedStatements();

	/**
	 * Returns the meta object for class '{@link puzzle.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see puzzle.UnitTest
	 * @generated
	 */
	EClass getUnitTest();

	/**
	 * Returns the meta object for the containment reference '{@link puzzle.UnitTest#getExpected <em>Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected</em>'.
	 * @see puzzle.UnitTest#getExpected()
	 * @see #getUnitTest()
	 * @generated
	 */
	EReference getUnitTest_Expected();

	/**
	 * Returns the meta object for the attribute '{@link puzzle.UnitTest#getFailedMessage <em>Failed Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failed Message</em>'.
	 * @see puzzle.UnitTest#getFailedMessage()
	 * @see #getUnitTest()
	 * @generated
	 */
	EAttribute getUnitTest_FailedMessage();

	/**
	 * Returns the meta object for the reference list '{@link puzzle.UnitTest#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see puzzle.UnitTest#getInputs()
	 * @see #getUnitTest()
	 * @generated
	 */
	EReference getUnitTest_Inputs();

	/**
	 * Returns the meta object for class '{@link puzzle.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see puzzle.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link puzzle.Input#getNextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Statement</em>'.
	 * @see puzzle.Input#getNextStatement()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_NextStatement();

	/**
	 * Returns the meta object for the containment reference '{@link puzzle.Input#getDeclareStatement <em>Declare Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declare Statement</em>'.
	 * @see puzzle.Input#getDeclareStatement()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_DeclareStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PuzzleFactory getPuzzleFactory();

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
		 * The meta object literal for the '{@link puzzle.impl.PuzzleImpl <em>Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see puzzle.impl.PuzzleImpl
		 * @see puzzle.impl.PuzzlePackageImpl#getPuzzle()
		 * @generated
		 */
		EClass PUZZLE = eINSTANCE.getPuzzle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__NAME = eINSTANCE.getPuzzle_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__DESCRIPTION = eINSTANCE.getPuzzle_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__TESTS = eINSTANCE.getPuzzle_Tests();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__INPUTS = eINSTANCE.getPuzzle_Inputs();

		/**
		 * The meta object literal for the '<em><b>Allowed Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__ALLOWED_STATEMENTS = eINSTANCE.getPuzzle_AllowedStatements();

		/**
		 * The meta object literal for the '{@link puzzle.impl.UnitTestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see puzzle.impl.UnitTestImpl
		 * @see puzzle.impl.PuzzlePackageImpl#getUnitTest()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnitTest();

		/**
		 * The meta object literal for the '<em><b>Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST__EXPECTED = eINSTANCE.getUnitTest_Expected();

		/**
		 * The meta object literal for the '<em><b>Failed Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__FAILED_MESSAGE = eINSTANCE.getUnitTest_FailedMessage();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST__INPUTS = eINSTANCE.getUnitTest_Inputs();

		/**
		 * The meta object literal for the '{@link puzzle.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see puzzle.impl.InputImpl
		 * @see puzzle.impl.PuzzlePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Next Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__NEXT_STATEMENT = eINSTANCE.getInput_NextStatement();

		/**
		 * The meta object literal for the '<em><b>Declare Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__DECLARE_STATEMENT = eINSTANCE.getInput_DeclareStatement();

	}

} //PuzzlePackage
