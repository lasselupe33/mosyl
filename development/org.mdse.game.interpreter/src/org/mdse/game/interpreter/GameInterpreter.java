package org.mdse.game.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.mdse.constructs.BooleanLiteral;
import org.mdse.constructs.BooleanVariable;
import org.mdse.constructs.Expression;
import org.mdse.constructs.IntegerLiteral;
import org.mdse.constructs.IntegerVariable;
import org.mdse.constructs.Literal;
import org.mdse.constructs.Statement;
import org.mdse.constructs.StringLiteral;
import org.mdse.constructs.StringVariable;
import org.mdse.constructs.Variable;
import org.mdse.game.Entrypoint;
import org.mdse.game.Game;
import org.mdse.game.GameInputs;
import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.UnitTest;
import org.mdse.puzzle.UnitTestInput;

public class GameInterpreter {
	private Map<String, Variable> variables;
	
	public String interpret(Game game, OutputStream interpreterOutputStream) throws GameInterpreterException {
		String interpreterOutput = "Success :)";

		// Start by extracting inputs for the current unit test
		List<UnitTest> tests = game.getTests();
		Entrypoint entrypoint = game.getEntrypoint();
		GameInputs gameInputs = entrypoint.getInputs();
		Inputs baseInputs = null;
		
		if (gameInputs != null) {
			baseInputs = gameInputs.getInputs();
		}
		
		// Execute all unit tests to determine if game has been successfully implemented
		for (UnitTest test : tests) {
			variables = extractInputsForUnitTest(baseInputs, test.getInputs());
			
			for (Entry<String, Variable> entry : variables.entrySet()) {
//				println(entry.getValue().getName() + " - " + entry.getValue().get, interpreterOutputStream);
			}
		}
		
		println(interpreterOutput, interpreterOutputStream);
		
		return interpreterOutput;
	}
	
	private Map<String, Variable> extractInputsForUnitTest(Inputs baseInputs, List<UnitTestInput> unitTestInputs) throws GameInterpreterException {
		Map<String, Variable> variables = new HashMap<>();
		
		// Add all base variables to variable set
		if (baseInputs != null) {
			List<Variable> inputVariables = baseInputs.getVariables();
			
			for (Variable variable : inputVariables) {
				variables.put(variable.getName(), variable);
			}
		}
		
		for (UnitTestInput input : unitTestInputs) {			
			Variable var = variables.get(input.getVariable().getName());
			Literal overwritingLiteral = input.getOverwritingValue();
			
			if (var instanceof BooleanVariable) {
				if (!(overwritingLiteral instanceof BooleanLiteral)) {
					throw new GameInterpreterException("UnitTestInput value does not match variable value. Expected Boolean, recieved " + overwritingLiteral);
				}
				
				BooleanLiteral typedLiteral = (BooleanLiteral) overwritingLiteral;
				
				((BooleanVariable) var).setValue(typedLiteral.getValue());
			} else if (var instanceof StringVariable) {
				if (!(overwritingLiteral instanceof StringLiteral)) {
					throw new GameInterpreterException("UnitTestInput value does not match variable value. Expected String, recieved " + overwritingLiteral);
				}
				
				StringLiteral typedLiteral = (StringLiteral) overwritingLiteral;
				
				((StringVariable) var).setValue(typedLiteral.getValue());				
			} else if (var instanceof IntegerVariable) {
				if (!(overwritingLiteral instanceof IntegerLiteral)) {
					throw new GameInterpreterException("UnitTestInput value does not match variable value. Expected Integer, recieved " + overwritingLiteral);
				}
				
				IntegerLiteral typedLiteral = (IntegerLiteral) overwritingLiteral;
				
				((IntegerVariable) var).setValue(typedLiteral.getValue());				
			}
		}
		
		return variables;
	}
	
	private void evaluateEntrypoint(Entrypoint entrypoint) {
		
	}
	
	private void evaluateStatement(Statement statement) {
		
	}
	
	private Object evaluateExpression(Expression expression) {
		return 0;
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
