package org.mdse.game.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.common.util.EList;
import org.mdse.constructs.ArithmeticExpression;
import org.mdse.constructs.ArithmeticOperator;
import org.mdse.constructs.BinaryExpression;
import org.mdse.constructs.BooleanLiteral;
import org.mdse.constructs.BooleanVariable;
import org.mdse.constructs.ComparativeExpression;
import org.mdse.constructs.ComparativeOperator;
import org.mdse.constructs.DeclareStatement;
import org.mdse.constructs.Expression;
import org.mdse.constructs.IfElseStatement;
import org.mdse.constructs.IntegerLiteral;
import org.mdse.constructs.IntegerVariable;
import org.mdse.constructs.Literal;
import org.mdse.constructs.ReturnStatement;
import org.mdse.constructs.SetStatement;
import org.mdse.constructs.Statement;
import org.mdse.constructs.StringLiteral;
import org.mdse.constructs.StringVariable;
import org.mdse.constructs.Variable;
import org.mdse.constructs.VariableReference;
import org.mdse.game.Entrypoint;
import org.mdse.game.Game;
import org.mdse.game.GameInputs;
import org.mdse.game.GameStatement;
import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.UnitTest;
import org.mdse.puzzle.UnitTestInput;

public class GameInterpreter {
	private Map<String, Variable> variables;
	private UnitTest currentTest;
	private OutputStream outputStream;
	private String output = "";
	
	public String interpret(Game game, OutputStream interpreterOutputStream) throws GameInterpreterException {
		this.outputStream = interpreterOutputStream;

		// Start by extracting inputs for the current unit test
		List<UnitTest> tests = game.getTests();
		Entrypoint entrypoint = game.getEntrypoint();
		GameInputs gameInputs = entrypoint.getInputs();
		Inputs baseInputs = null;
		
		if (gameInputs != null) {
			baseInputs = gameInputs.getInputs();
		}
		
		// Execute all unit tests to determine if game has been successfully implemented
		output += "Tests:\n";
		
		for (UnitTest test : tests) {
			variables = extractInputsForUnitTest(baseInputs, test.getInputs());
			currentTest = test;
			evaluateEntrypoint(entrypoint);
		}
		
		println(output, interpreterOutputStream);
		
		return output;
	}
	
	private Map<String, Variable> extractInputsForUnitTest(Inputs baseInputs, List<UnitTestInput> unitTestInputs) throws GameInterpreterException {
		Map<String, Variable> variables = new HashMap<>();
		Copier copier = new Copier();
		
		// Add all base variables to variable set
		if (baseInputs != null) {
			List<Variable> inputVariables = baseInputs.getVariables();
			
			for (Variable variable : inputVariables) {
				// Ensure we create new instances of the base variables, since overwriting uncloned variables will have side
				// effects between unit tests
				Variable copiedVar = (Variable) copier.copy(variable);
				
				variables.put(variable.getName(), copiedVar);
			}
		}
		
		for (UnitTestInput input : unitTestInputs) {			
			Variable var = variables.get(input.getVariable().getName());
			Literal overwritingLiteral = input.getOverwritingValue();
			
			if (!var.getValue().getClass().equals(overwritingLiteral.getValue().getClass())) {
				throw new GameInterpreterException("UnitTestInput value does not match variable value. Original val = " + var.getValue() + " - overwriting value = " + overwritingLiteral.getValue());
			}
						
			if (var instanceof BooleanVariable) {
				((BooleanVariable) var).setValue(((BooleanLiteral)overwritingLiteral).getValue());
			} else if (var instanceof IntegerVariable) {
				((IntegerVariable) var).setValue(((IntegerLiteral)overwritingLiteral).getValue());
			} else if (var instanceof StringVariable) {
				((StringVariable) var).setValue(((StringLiteral)overwritingLiteral).getValue());
			}
		}
		
		return variables;
	}
	
	private void evaluateEntrypoint(Entrypoint entrypoint) throws GameInterpreterException {
		GameStatement currentStatement = null;
		
		if (entrypoint.getInputs() != null) {
			currentStatement = entrypoint.getInputs().getNextStatement();
		} else if (entrypoint.getStatement() != null) {
			currentStatement = entrypoint.getStatement();
		} else {
			throw new GameInterpreterException("Failed to determine entrypoint, neither a first statement or inputs were available");
		}
		
		while (currentStatement != null) {
			evaluateStatement(currentStatement.getStatement());
			currentStatement = currentStatement.getNextStatement();
		}
	}
	
	private void evaluateStatement(Statement statement) throws GameInterpreterException {
		if (statement instanceof DeclareStatement) {
			evaluateDeclareStatement((DeclareStatement) statement);
		} else if (statement instanceof SetStatement) {
			evaluateSetStatement((SetStatement) statement);
		} else if (statement instanceof IfElseStatement) {
			evaluateIfElseStatement((IfElseStatement) statement);
		} else if (statement instanceof ReturnStatement) {
			evaluateReturnStatement((ReturnStatement) statement);
		}
	}
	
	private void evaluateDeclareStatement(DeclareStatement stmt) {
		variables.put(stmt.getVariable().getName(), stmt.getVariable());
	}
	
	private void evaluateSetStatement(SetStatement stmt) {
		Variable var = variables.get(stmt.getVariable().getName());
		Literal newValue = stmt.getNewValue();
		
		if (var instanceof BooleanVariable) {
			((BooleanVariable) var).setValue(((BooleanLiteral)newValue).getValue());
		} else if (var instanceof IntegerVariable) {
			((IntegerVariable) var).setValue(((IntegerLiteral)newValue).getValue());
		} else if (var instanceof StringVariable) {
			((StringVariable) var).setValue(((StringLiteral)newValue).getValue());
		}
	}
	
	private void evaluateIfElseStatement(IfElseStatement stmt) throws GameInterpreterException {
		Object cond = evaluateExpression(stmt.getCondition());
		
		if (!(cond instanceof Boolean)) {
			throw new GameInterpreterException("Condition is not a boolean, contact devs.");
		}
		
		if ((Boolean) cond) {
			evaluateStatement(stmt.getIfStatement());
		} else {
			evaluateStatement(stmt.getElseStatement());
		}
	}
	
	private void evaluateReturnStatement(ReturnStatement stmt) throws GameInterpreterException {
		Object output = evaluateExpression(stmt.getExpression());
		Object expected = currentTest.getExpected().getValue();
		
		if (!output.equals(expected)) {
			this.output += "    Failed:\n";
			this.output += "        Got: " + output + ", expected: " + expected + "\n";
			this.output += "        Hint: " + currentTest.getFailedMessage() + "\n\n";
		} else {
			this.output += "    Success!\n\n";
		}
	}
	
	private Object evaluateExpression(Expression expression) throws GameInterpreterException {
		if (expression instanceof Literal) {
			return ((Literal) expression).getValue();
		}
		
		if (expression instanceof Variable) {
			return variables.get(((Variable) expression).getName()).getValue();
		}
		
		if (expression instanceof VariableReference) {
			Variable var = ((VariableReference) expression).getVariable();
			
			return variables.get(var.getName()).getValue();
		}
		
		if (expression instanceof ComparativeExpression) {
			return evaluateComparativeExpression((ComparativeExpression)expression);
		}
		
		if (expression instanceof ArithmeticExpression) {
			return evaluateArithmeticExpression((ArithmeticExpression)expression);
		}
		
		throw new GameInterpreterException("Attempting to interpret invalid expression, " + expression);
	}
	
	private Boolean evaluateComparativeExpression(ComparativeExpression expr) throws GameInterpreterException {
		ComparativeOperator opr = expr.getOperator();
		Expression expr1 = expr.getExpression1();
		Expression expr2 = expr.getExpression2();
		
		Object value1 = evaluateExpression(expr1);
		Object value2 = evaluateExpression(expr2);
		
		if (value1 instanceof Integer && value2 instanceof Integer) {
			Integer typedValue1 = (Integer) value1;
			Integer typedValue2 = (Integer) value2;
			
			switch (opr.getLiteral()) {
				case "LessThan":
					return typedValue1 < typedValue2;
					
				case "LessThanEq":
					return typedValue1 <= typedValue2;
					
				case "Equal":
					return typedValue1 == typedValue2;
				
				case "NotEqual":
					return typedValue1 != typedValue2;
					
				case "GreaterThan":
					return typedValue1 > typedValue2;
					
				case "GreaterThanEq":
					return typedValue1 >= typedValue2;
			}
		}
		
		if (value1 instanceof Boolean && value2 instanceof Boolean) {
			Boolean typedValue1 = (Boolean) value1;
			Boolean typedValue2 = (Boolean) value2;
			
			switch (opr.getLiteral()) {
				case "Equal":
					return typedValue1 == typedValue2;
				
				case "NotEqual":
					return typedValue1 != typedValue2;
			}
		}
		
		if (value1 instanceof String && value2 instanceof String) {
			String typedValue1 = (String) value1;
			String typedValue2 = (String) value2;
			
			switch (opr.getLiteral()) {
				case "EQUAL":
					return typedValue1.equals(typedValue2);
				
				case "NOT_EQUAL":
					return !typedValue1.equals(typedValue2);
			}
		}
		
		throw new GameInterpreterException("Failed to interpret comparative expression with opr = " + opr.getName() + ", expr1 = " + value1 + " expr2 = " + value2);
	}
	
	private Integer evaluateArithmeticExpression(ArithmeticExpression expr) throws GameInterpreterException {
		ArithmeticOperator opr = expr.getOperator();
		Expression expr1 = expr.getExpression1();
		Expression expr2 = expr.getExpression2();
		
		Object value1 = evaluateExpression(expr1);
		Object value2 = evaluateExpression(expr2);
		
		if (value1 instanceof Integer && value2 instanceof Integer) {
			Integer typedValue1 = (Integer) value1;
			Integer typedValue2 = (Integer) value2;

			switch (opr.getLiteral()) {
				case "Add":
					return typedValue1 + typedValue2;
					
				case "Subtract":
					return typedValue1 - typedValue2;
					
				case "Multiply":
					return typedValue1 * typedValue2;
					
				case "Divide":
					return typedValue1 / typedValue2;
			}
		}
		
		throw new GameInterpreterException("Failed to interpret arithmetic expression with opr = " + opr.getName() + ", expr1 = " + value1 + " expr2 = " + value2);
	}
	
	protected static void println(OutputStream out) {
		println("", out);
	}
	
	protected static void println(String message, OutputStream out) {
		message += System.lineSeparator();

		print(message, out);
	}
	
	protected static void print(String message, OutputStream out) {
		if (message == null || out == null) {
			return;
		}
		
		try {
			out.write(message.getBytes());
		} catch(IOException e) {
			System.err.println("Problem writing to output stream.");
			e.printStackTrace();
		}
	}
}
