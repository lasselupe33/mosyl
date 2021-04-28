/**
 */
package puzzle.impl;

import constructs.ConstructsPackage;

import constructs.impl.ConstructsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.game.GamePackage;

import org.mdse.game.impl.GamePackageImpl;

import puzzle.Input;
import puzzle.Puzzle;
import puzzle.PuzzleFactory;
import puzzle.PuzzlePackage;
import puzzle.UnitTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzlePackageImpl extends EPackageImpl implements PuzzlePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see puzzle.PuzzlePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PuzzlePackageImpl() {
		super(eNS_URI, PuzzleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PuzzlePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PuzzlePackage init() {
		if (isInited)
			return (PuzzlePackage) EPackage.Registry.INSTANCE.getEPackage(PuzzlePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPuzzlePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PuzzlePackageImpl thePuzzlePackage = registeredPuzzlePackage instanceof PuzzlePackageImpl
				? (PuzzlePackageImpl) registeredPuzzlePackage
				: new PuzzlePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);
		GamePackageImpl theGamePackage = (GamePackageImpl) (registeredPackage instanceof GamePackageImpl
				? registeredPackage
				: GamePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstructsPackage.eNS_URI);
		ConstructsPackageImpl theConstructsPackage = (ConstructsPackageImpl) (registeredPackage instanceof ConstructsPackageImpl
				? registeredPackage
				: ConstructsPackage.eINSTANCE);

		// Create package meta-data objects
		thePuzzlePackage.createPackageContents();
		theGamePackage.createPackageContents();
		theConstructsPackage.createPackageContents();

		// Initialize created meta-data
		thePuzzlePackage.initializePackageContents();
		theGamePackage.initializePackageContents();
		theConstructsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePuzzlePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PuzzlePackage.eNS_URI, thePuzzlePackage);
		return thePuzzlePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuzzle() {
		return puzzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzle_Name() {
		return (EAttribute) puzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzle_Description() {
		return (EAttribute) puzzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzle_Tests() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzle_Inputs() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzle_AllowedStatements() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTest() {
		return unitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTest_Expected() {
		return (EReference) unitTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitTest_FailedMessage() {
		return (EAttribute) unitTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTest_Inputs() {
		return (EReference) unitTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_NextStatement() {
		return (EReference) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_DeclareStatement() {
		return (EReference) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleFactory getPuzzleFactory() {
		return (PuzzleFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		puzzleEClass = createEClass(PUZZLE);
		createEAttribute(puzzleEClass, PUZZLE__NAME);
		createEAttribute(puzzleEClass, PUZZLE__DESCRIPTION);
		createEReference(puzzleEClass, PUZZLE__TESTS);
		createEReference(puzzleEClass, PUZZLE__INPUTS);
		createEReference(puzzleEClass, PUZZLE__ALLOWED_STATEMENTS);

		unitTestEClass = createEClass(UNIT_TEST);
		createEReference(unitTestEClass, UNIT_TEST__EXPECTED);
		createEAttribute(unitTestEClass, UNIT_TEST__FAILED_MESSAGE);
		createEReference(unitTestEClass, UNIT_TEST__INPUTS);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__NEXT_STATEMENT);
		createEReference(inputEClass, INPUT__DECLARE_STATEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConstructsPackage theConstructsPackage = (ConstructsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConstructsPackage.eNS_URI);
		GamePackage theGamePackage = (GamePackage) EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleEClass, Puzzle.class, "Puzzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzle_Description(), ecorePackage.getEString(), "description", null, 0, 1, Puzzle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_Tests(), this.getUnitTest(), null, "tests", null, 1, -1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPuzzle_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPuzzle_AllowedStatements(), theConstructsPackage.getStatement(), null, "allowedStatements",
				null, 1, -1, Puzzle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTestEClass, UnitTest.class, "UnitTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTest_Expected(), theConstructsPackage.getExpression(), null, "expected", null, 1, 1,
				UnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitTest_FailedMessage(), ecorePackage.getEString(), "failedMessage", null, 0, 1,
				UnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUnitTest_Inputs(), this.getInput(), null, "inputs", null, 0, -1, UnitTest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_NextStatement(), theGamePackage.getUsedStatement(), null, "nextStatement", null, 1, 1,
				Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_DeclareStatement(), theConstructsPackage.getDeclareStatement(), null,
				"declareStatement", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PuzzlePackageImpl
