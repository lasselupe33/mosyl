package org.mdse.game.interpreter.eclipse.launch;

import java.io.OutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.mdse.game.Game;
import org.mdse.game.interpreter.GameInterpreter;
import org.mdse.game.interpreter.GameInterpreterException;
import org.mdse.game.interpreter.eclipse.GameEclipseUtil;

public class GameLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		//Load model
		IFile gameFile = GameEclipseUtil.getFirstIFileFromSelectionWithExtension("game", selection);
		Game gameModel = (Game) GameEclipseUtil.loadModel(gameFile);

		interpretGameModel(gameModel);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject model = getModelFromEditor(editor);
		
		if (model instanceof Game) {
			Game gameModel = (Game) model;
			interpretGameModel(gameModel);
			return;
		}
		
		String title = "Error";
		String message = "The file cannot be interpreted as an Game model.";
		MessageDialog.openError(null, title, message);
	}
	
	protected EObject getModelFromEditor(IEditorPart editor) {
		//The generated Ecore editor implements this interface.
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			
			//This is how the generated Ecore editor accesses the resource internally.
			//Still seems brittle esp. when there is another model in the editing domain.
			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			EObject model = resource.getContents().get(0);
			
			return model;
		}
		
		//TODO: Sirius Editor
		
		return null;
	}
	
	protected String askForInterpreterInput() {
		InputDialog inputDialog = new InputDialog(null, "Game Interpreter Input", "Please provide input for the Game interpreter", null, null);
		
		int returnCode = inputDialog.open();
		
		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}
		
		return null;
	}

	protected void interpretGameModel(Game model) {
		GameInterpreter interpreter = new GameInterpreter();
		
		try {
			//Reroute output to console of runtime instance
			MessageConsole console = GameEclipseUtil.findOrCreateConsole("Game Interpreter");
			console.clearConsole();
			console.activate();
			OutputStream consoleOutputStream = console.newOutputStream();
			
			interpreter.interpret(model, consoleOutputStream);
		} catch(GameInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
}
