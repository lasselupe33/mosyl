/**
 */
package constructs.impl;

import constructs.ArithmeticExpression;
import constructs.ArithmeticOperator;
import constructs.BinaryExpression;
import constructs.BooleanVariable;
import constructs.ComparativeExpression;
import constructs.ComparativeOperator;
import constructs.ConstructsFactory;
import constructs.ConstructsPackage;
import constructs.DeclareStatement;
import constructs.Expression;
import constructs.IfElseStatement;
import constructs.IntegerVariable;
import constructs.ReturnStatement;
import constructs.Statement;
import constructs.StringVariable;
import constructs.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.game.GamePackage;

import org.mdse.game.impl.GamePackageImpl;

import puzzle.PuzzlePackage;

import puzzle.impl.PuzzlePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructsPackageImpl extends EPackageImpl implements ConstructsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifElseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparativeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

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
	 * @see constructs.ConstructsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstructsPackageImpl() {
		super(eNS_URI, ConstructsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstructsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstructsPackage init() {
		if (isInited)
			return (ConstructsPackage) EPackage.Registry.INSTANCE.getEPackage(ConstructsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConstructsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConstructsPackageImpl theConstructsPackage = registeredConstructsPackage instanceof ConstructsPackageImpl
				? (ConstructsPackageImpl) registeredConstructsPackage
				: new ConstructsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);
		GamePackageImpl theGamePackage = (GamePackageImpl) (registeredPackage instanceof GamePackageImpl
				? registeredPackage
				: GamePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PuzzlePackage.eNS_URI);
		PuzzlePackageImpl thePuzzlePackage = (PuzzlePackageImpl) (registeredPackage instanceof PuzzlePackageImpl
				? registeredPackage
				: PuzzlePackage.eINSTANCE);

		// Create package meta-data objects
		theConstructsPackage.createPackageContents();
		theGamePackage.createPackageContents();
		thePuzzlePackage.createPackageContents();

		// Initialize created meta-data
		theConstructsPackage.initializePackageContents();
		theGamePackage.initializePackageContents();
		thePuzzlePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstructsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstructsPackage.eNS_URI, theConstructsPackage);
		return theConstructsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__GetValue() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparativeExpression() {
		return comparativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeExpression_Operator() {
		return (EAttribute) comparativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticExpression_Operator() {
		return (EAttribute) arithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfElseStatement() {
		return ifElseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfElseStatement_Condition() {
		return (EReference) ifElseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfElseStatement_ElseStatement() {
		return (EReference) ifElseStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfElseStatement_IfStatement() {
		return (EReference) ifElseStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareStatement() {
		return declareStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclareStatement_Variable() {
		return (EReference) declareStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_Expression() {
		return (EReference) returnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Expression1() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Expression2() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparativeOperator() {
		return comparativeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructsFactory getConstructsFactory() {
		return (ConstructsFactory) getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEOperation(variableEClass, VARIABLE___GET_VALUE);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);

		stringVariableEClass = createEClass(STRING_VARIABLE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);

		comparativeExpressionEClass = createEClass(COMPARATIVE_EXPRESSION);
		createEAttribute(comparativeExpressionEClass, COMPARATIVE_EXPRESSION__OPERATOR);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEAttribute(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__OPERATOR);

		statementEClass = createEClass(STATEMENT);

		ifElseStatementEClass = createEClass(IF_ELSE_STATEMENT);
		createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__CONDITION);
		createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__ELSE_STATEMENT);
		createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__IF_STATEMENT);

		declareStatementEClass = createEClass(DECLARE_STATEMENT);
		createEReference(declareStatementEClass, DECLARE_STATEMENT__VARIABLE);

		returnStatementEClass = createEClass(RETURN_STATEMENT);
		createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__EXPRESSION1);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__EXPRESSION2);

		// Create enums
		comparativeOperatorEEnum = createEEnum(COMPARATIVE_OPERATOR);
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getExpression());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		stringVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		comparativeExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		arithmeticExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		ifElseStatementEClass.getESuperTypes().add(this.getStatement());
		declareStatementEClass.getESuperTypes().add(this.getStatement());
		returnStatementEClass.getESuperTypes().add(this.getStatement());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVariable__GetValue(), ecorePackage.getEObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringVariableEClass, StringVariable.class, "StringVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparativeExpressionEClass, ComparativeExpression.class, "ComparativeExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparativeExpression_Operator(), this.getComparativeOperator(), "operator", null, 0, 1,
				ComparativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticExpression_Operator(), this.getArithmeticOperator(), "operator", null, 0, 1,
				ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifElseStatementEClass, IfElseStatement.class, "IfElseStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfElseStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1,
				IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfElseStatement_ElseStatement(), this.getStatement(), null, "elseStatement", null, 1, 1,
				IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfElseStatement_IfStatement(), this.getStatement(), null, "ifStatement", null, 1, 1,
				IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declareStatementEClass, DeclareStatement.class, "DeclareStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclareStatement_Variable(), this.getVariable(), null, "variable", null, 1, 1,
				DeclareStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Expression1(), this.getExpression(), null, "expression1", null, 1, -1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Expression2(), this.getExpression(), null, "expression2", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparativeOperatorEEnum, ComparativeOperator.class, "ComparativeOperator");
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.EQUAL);
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.NOT_EQUAL);
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.LESS_THAN);
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.LESS_THAN_EQ);
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.GREATER_THAN);
		addEEnumLiteral(comparativeOperatorEEnum, ComparativeOperator.GREATER_THAN_EQ);

		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.PLUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MINUS);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULTIPLY);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVIDE);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstructsPackageImpl
