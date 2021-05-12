package org.mdse.game.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.mdse.game.Game;

public class GameInterpreter {	
	public String interpret(Game game, OutputStream interpreterOutputStream) throws GameInterpreterException {
		String interpreterOutput = "Success :)";
		
		println(interpreterOutput, interpreterOutputStream);
		
		return interpreterOutput;
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
