package org.mdse.minisql.query.validation;

import org.mdse.minisql.query.ArithmeticExpression;
import org.mdse.minisql.query.BinaryLogicalExpression;
import org.mdse.minisql.query.ComparativeExpression;
import org.mdse.minisql.query.ComparativeOperator;
import org.mdse.minisql.query.Expression;
import org.mdse.minisql.query.UnaryLogicalExpression;
import org.mdse.minisql.query.WhereClause;
import org.mdse.minisql.types.BooleanType;
import org.mdse.minisql.types.IntegerType;
import org.mdse.minisql.types.StringType;
import org.mdse.minisql.types.Type;

public class MiniSQLQueryValidator extends AbstractMiniSQLQueryValidator {
	
	@Override
	protected boolean validateWhereClauseTypeCompatibility(WhereClause whereClause) {
		Expression expression = whereClause.getExpression();
		
		if (expression == null) {
			return true;
		}
		
		Type type = expression.getType();
				
		if (!(type instanceof BooleanType)) {
			return constraintViolated(expression, "Operand of WHERE clause must be of type Bool.");
		}
				
		return true;
	}
	
	@Override
	protected boolean validateArithmeticExpressionTypeCompatibility(ArithmeticExpression arithmeticExpression) {
		Expression expression1 = arithmeticExpression.getExpression1();
		Expression expression2 = arithmeticExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		Boolean ex1IsInt = type1 instanceof IntegerType;
		Boolean ex2IsInt = type2 instanceof IntegerType;
				
		if (!ex1IsInt || !ex2IsInt) {
			return constraintViolated(arithmeticExpression, "Both operands of a calculation must be of type Int.");			
		}
		
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionTypeCompatibility(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		Boolean areSameType = type1.getClass().equals(type2.getClass());
		
		if (!areSameType) {
			return constraintViolated(comparativeExpression, "Both operands of a comparison must be of the same type.");
		}
		
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionBooleanOperators(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();
		ComparativeOperator operator = comparativeExpression.getOperator();

		if (expression1 == null || expression2 == null || operator == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		Boolean ex1IsBool = type1 instanceof BooleanType;
		Boolean ex2IsBool = type2 instanceof BooleanType;
		
		Boolean isEquality = operator.getLiteral().equals("EQUAL");
		Boolean isInequality = operator.getLiteral().equals("NOT_EQUAL");
		
		if (ex1IsBool && ex2IsBool && !isEquality && !isInequality) {
			return constraintViolated(comparativeExpression, "Bool operands may only be compared for equality (=) or inequality (!=).");			
		}
		
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionStringOperators(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();
		ComparativeOperator operator = comparativeExpression.getOperator();

		if (expression1 == null || expression2 == null || operator == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		Boolean ex1IsString = type1 instanceof StringType;
		Boolean ex2IsString = type2 instanceof StringType;
		
		Boolean isEquality = operator.getLiteral().equals("EQUAL");
		Boolean isInequality = operator.getLiteral().equals("NOT_EQUAL");
		
		if (ex1IsString && ex2IsString && !isEquality && !isInequality) {
			return constraintViolated(comparativeExpression, "String operands may only be compared for equality (=) or inequality (!=).");
		}
		
		return true;
	}
	

	@Override
	protected boolean validateUnaryLogicalExpressionTypeCompatibility(UnaryLogicalExpression unaryLogicalExpression) {
		Expression expression = unaryLogicalExpression.getExpression();

		if (expression == null) {
			return true;
		}
		
		Type type = expression.getType();
		
		Boolean exIsBool = type instanceof BooleanType;
		
		if (!exIsBool) {
			return constraintViolated(unaryLogicalExpression, "Operand of a logical expression must be of type Bool.");
		}
		
		return true;
	}
	
	@Override
	protected boolean validateBinaryLogicalExpressionTypeCompatibility(BinaryLogicalExpression binaryLogicalExpression) {
		Expression expression1 = binaryLogicalExpression.getExpression1();
		Expression expression2 = binaryLogicalExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		Boolean ex1IsBool = type1 instanceof BooleanType;
		Boolean ex2IsBool = type2 instanceof BooleanType;
		
		if (!ex1IsBool || !ex2IsBool) {
			return constraintViolated(binaryLogicalExpression, "Both operands of a logical expression must be of type Bool.");
		}
		
		return true;
	}
}
