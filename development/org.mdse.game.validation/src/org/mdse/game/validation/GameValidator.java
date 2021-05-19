package org.mdse.game.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.constructs.ArithmeticExpression;
import org.mdse.constructs.ArithmeticOperator;
import org.mdse.constructs.ComparativeExpression;
import org.mdse.constructs.ComparativeOperator;
import org.mdse.constructs.Expression;
import org.mdse.constructs.IfElseStatement;
import org.mdse.constructs.ReturnStatement;
import org.mdse.constructs.SetStatement;
import org.mdse.constructs.Statement;
import org.mdse.constructs.Type;
import org.mdse.game.Entrypoint;
import org.mdse.game.GameInputs;
import org.mdse.game.GamePackage;
import org.mdse.game.GameStatement;

public class GameValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(GamePackage.eINSTANCE, new GameValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);

		this.diagnostics = diagnostics;
		
		
		if (GamePackage.eINSTANCE.getEntrypoint().equals(eClass)) {
			Entrypoint entrypoint = (Entrypoint) eObject;
			modelIsValid &= validateWellformedEntrypoint(entrypoint);
			modelIsValid &= validateExactlyOneReturnStatement(entrypoint);
		}
		
		if (GamePackage.eINSTANCE.getGameStatement().equals(eClass)) {
			GameStatement gstmt = (GameStatement) eObject;
			Statement stmt = gstmt.getStatement();
			
			if (stmt instanceof IfElseStatement) {
				modelIsValid &= validateIfElseStatementOperatorIsBool((IfElseStatement)stmt);
				modelIsValid &= validateIfElseStatementHasNoReturnStatements((IfElseStatement)stmt);
				modelIsValid &= validateExpression(((IfElseStatement) stmt).getCondition());
			}
			
			if (stmt instanceof SetStatement) {
				modelIsValid &= validateSetStatementValueMatchesVariable((SetStatement)stmt);
			}
			
			if (stmt instanceof ReturnStatement) {
				modelIsValid &= validateReturnStatementHasNoNextStatement(gstmt);
				modelIsValid &= validateExpression(((ReturnStatement) stmt).getExpression());
			}
		}
		
		return modelIsValid;
	}
	
	protected boolean validateWellformedEntrypoint(Entrypoint entrypoint) {
		boolean modelIsValid = true;
		
		if (entrypoint.getStatement() == null && entrypoint.getInputs() == null) {
			modelIsValid &= constraintViolated(entrypoint, "Entrypoint must specify either a statement or inputs");
		}
		
		return modelIsValid;
	}
	
	protected boolean validateExactlyOneReturnStatement(Entrypoint entrypoint) {
		boolean modelIsValid = true;
		int count = 0;
		GameStatement statement = entrypoint.getStatement();
		
		if (statement == null) {
			GameInputs inputs = entrypoint.getInputs();
			
			// This error will be handled by another validation function
			if (inputs == null) {
				return true;
			}
			
			statement = inputs.getNextStatement();
			
			// This error will be handled by another validation function
			if (statement == null) {
				return true;
			}
		}
		
		while (statement != null) {
			if (statement.getStatement() instanceof ReturnStatement) {
				count++;
			}
			
			statement = statement.getNextStatement();
		}
		
		if (count != 1) {
			modelIsValid &= constraintViolated(entrypoint, "There must be exactly one return statement. Found " + count);
		}
		
		return modelIsValid;
	}
		
	protected boolean validateIfElseStatementOperatorIsBool(IfElseStatement stmt) {
		boolean modelIsValid = true;

		Expression expr = stmt.getCondition();
		Type type = expr.getType();
		
		if (type.getValue() != Type.BOOLEAN_VALUE) {
			modelIsValid &= constraintViolated(stmt, "The condition of an IfElse Statement must be of type boolean, received " + type.getName());
		}
		
		return modelIsValid;
	}
	
	protected boolean validateIfElseStatementHasNoReturnStatements(IfElseStatement stmt) {
		boolean modelIsValid = true;
		
		Statement ifStmt = stmt.getIfStatement();
		Statement elseStmt = stmt.getElseStatement();
		
		if (ifStmt instanceof ReturnStatement) {
			modelIsValid &= constraintViolated(stmt, "The if branch must not be a return statement.");
		}
		
		if (elseStmt instanceof ReturnStatement) {
			modelIsValid &= constraintViolated(stmt, "The else branch must not be a return statement.");
		}

		return modelIsValid;
	}
	
	protected boolean validateSetStatementValueMatchesVariable(SetStatement stmt) {
		boolean modelIsValid = true;

		if (stmt.getVariable().getType().getValue() != stmt.getNewValue().getType().getValue()) {
			modelIsValid &= constraintViolated(
					stmt, 
					"The new value of the variable must match the type of the old value. Expected " +
					stmt.getVariable().getType().getName() +
					", Got: " +
					stmt.getNewValue().getType().getName()
			);
					
		}
		
		return modelIsValid;
	}
	
	protected boolean validateReturnStatementHasNoNextStatement(GameStatement stmt) {
		boolean modelIsValid = true;

		if (stmt.getNextStatement() != null) {
			modelIsValid &= constraintViolated(stmt, "The return statement must be the final statement in the program");
		}
		
		return modelIsValid;
	}
	
	protected boolean validateExpression(Expression expr) {
		boolean modelIsValid = true;

		if (expr instanceof ComparativeExpression) {
			modelIsValid &= validateComparativeExpression((ComparativeExpression) expr);
		}
		
		if (expr instanceof ArithmeticExpression) {
			modelIsValid &= validateArithmeticExpression((ArithmeticExpression) expr);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateComparativeExpression(ComparativeExpression expr) {
		boolean modelIsValid = true;

		ComparativeOperator operator = expr.getOperator();
		Expression expr1 = expr.getExpression1();
		Expression expr2 = expr.getExpression2();
		Type type1 = expr1.getType();
		Type type2 = expr2.getType();
		
		if (type1.getValue() != type2.getValue()) {
			modelIsValid &= constraintViolated(expr, "Both operands of a comparison must be of the same type. Got " + type1.getName() + " and " + type2.getName());
		}
		
		
		switch (type1.getValue()) {
			case Type.BOOLEAN_VALUE:
				if (operator.getValue() != ComparativeOperator.EQUAL_VALUE && operator.getValue() != ComparativeOperator.NOT_EQUAL_VALUE) {
					modelIsValid &= constraintViolated(expr, "Bool operands may only be compared for equality (=) or inequality (!=).");
				}
				break;
				
			case Type.STRING_VALUE:
				if (operator.getValue() != ComparativeOperator.EQUAL_VALUE && operator.getValue() != ComparativeOperator.NOT_EQUAL_VALUE) {
					modelIsValid &= constraintViolated(expr, "String operands may only be compared for equality (=) or inequality (!=).");
				}
				break;
		}
		
		
		
		return modelIsValid;
	}
	
	protected boolean validateArithmeticExpression(ArithmeticExpression expr) {
		boolean modelIsValid = true;
		
		ArithmeticOperator operator = expr.getOperator();
		Expression expr1 = expr.getExpression1();
		Expression expr2 = expr.getExpression2();
		Type type1 = expr1.getType();
		Type type2 = expr2.getType();
		
		if (type1.getValue() != Type.INTEGER_VALUE || type2.getValue() != Type.INTEGER_VALUE) {
			modelIsValid &= constraintViolated(expr, "Both operands of a comparison must be of the type Integer. Got " + type1.getName() + " and " + type2.getName());
		}

		return modelIsValid;
	}
		
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
