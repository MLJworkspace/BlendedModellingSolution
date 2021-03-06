/*****************************************************************************
 * Copyright (c) 2017 EclipseSource France SAS.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		Remi Schnekenburger - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrusrt.umlrt.core.internal.commands;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.papyrusrt.umlrt.core.Activator;
import org.eclipse.papyrusrt.umlrt.profile.util.UMLRTResource;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * The Class CreateSysMLModelCommand.
 */
public class CreateUMLRTModelCommand implements IModelCreationCommand {

	@Override
	public void createModel(final ModelSet modelSet) {
		runAsTransaction(modelSet);
	}

	protected void runAsTransaction(final ModelSet modelSet) {
		// Get the uml element to which the newly created diagram will be
		// attached.
		// Create the diagram
		final Resource modelResource = UmlUtils.getUmlResource(modelSet);
		TransactionalEditingDomain editingDomain = modelSet.getTransactionalEditingDomain();

		AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, "Initialize model", Collections.EMPTY_LIST) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				EObject model = getRootElement(modelResource);
				attachModelToResource(model, modelResource);

				initializeModel(model);
				return CommandResult.newOKCommandResult();

			}
		};
		editingDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
	}

	protected EObject getRootElement(Resource modelResource) {
		EObject rootElement = null;
		if (modelResource != null && modelResource.getContents() != null && modelResource.getContents().size() > 0) {
			Object root = modelResource.getContents().get(0);
			if (root instanceof EObject) {
				rootElement = (EObject) root;
			}
		} else {
			rootElement = createRootElement();
		}
		return rootElement;
	}

	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	protected void attachModelToResource(EObject root, Resource resource) {
		resource.getContents().add(root);
	}

	protected void initializeModel(EObject owner) {
		((org.eclipse.uml2.uml.Package) owner).setName(getModelName());

		// Retrieve UMLRT profile and apply with Sub-profile
		Profile profile = (Profile) PackageUtil.loadPackage(URI.createURI(UMLRTResource.PROFILE_PATH), owner.eResource().getResourceSet());
		if (profile != null) {
			PackageUtil.applyProfile(((org.eclipse.uml2.uml.Package) owner), profile, true);
		} else {
			Activator.log.error("Impossible to find UML-RT profile", null);
		}
	}

	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return "UMLRTModel";
	}
}
