package org.mdse.game.interpreter.eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class GameEclipseUtil {
	public static EObject loadModel(IFile gameFile) {
		IPath fullPath = gameFile.getFullPath();
		String absolutePathString = fullPath.toOSString();
				
		URI uri = URI.createPlatformResourceURI(absolutePathString, true);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource resource = resourceSet.getResource(uri, true);
		
		try {
	    	resource.load(Collections.EMPTY_MAP);
	    	
	    	List<EObject> contents = resource.getContents();
	    	
	    	if (contents == null || contents.isEmpty()) {
	    		//Throw just to be caught again immediately and keep on going with the next model.
	    		throw new UnsupportedOperationException();
	    	}
	    	
    		return contents.get(0);
	    } catch(Exception e) {
	    	e.printStackTrace();
	    	System.err.println("Failed to load model from \"" + resource.getURI() + "\".");
	    }
		
		return null;
	}
	
	public static IFile getFirstIFileFromSelectionWithExtension(String requestedFileExtension, ISelection selection) {
		List<IResource> resources = extractResourcesFromSelection(selection);
		
		for (IResource resource : resources) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				
				String fileExtension = file.getFileExtension();
				if (fileExtension.equalsIgnoreCase(requestedFileExtension)) {
					return file;
				}
			}
		}
		
		return null;
	}
	
	private static List<IResource> extractResourcesFromSelection(ISelection selection) {
		List<IResource> selectedResources = new ArrayList<IResource>();
		
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;

			List<?> selectedObjects = structuredSelection.toList();

			for (Object selectedObject : selectedObjects) {
				if (selectedObject instanceof IResource) {
					IResource resource = (IResource) selectedObject;
					selectedResources.add(resource);
				} else if (selectedObject instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) selectedObject;
					Object adapter = adaptable.getAdapter(IResource.class);

					if (adapter != null) {
						IResource resource = (IResource) adapter;
						selectedResources.add(resource);
					}
				}
			}
		}
		
		return selectedResources;
	}
	
	public static MessageConsole findOrCreateConsole(String name) {
		MessageConsole console = findConsole(name);
		
		if (console != null) {
			return console;
		}
		
		return createConsole(name);
	}
	
	public static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		IConsole[] existingConsoles = consoleManager.getConsoles();
		
		for (int i = 0; i < existingConsoles.length; i++) {
			if (name.equals(existingConsoles[i].getName())) {
				return (MessageConsole) existingConsoles[i];
			}
		}
		
		return null;
	}
	
	public static MessageConsole createConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		MessageConsole newConsole = new MessageConsole(name, null);
		consoleManager.addConsoles(new IConsole[] { newConsole });
		return newConsole;
	}
}
