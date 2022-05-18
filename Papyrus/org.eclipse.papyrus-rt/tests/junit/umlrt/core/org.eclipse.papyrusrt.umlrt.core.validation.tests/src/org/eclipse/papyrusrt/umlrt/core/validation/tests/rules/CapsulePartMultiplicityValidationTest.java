/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrusrt.umlrt.core.validation.tests.rules;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.uml.service.validation.internal.UMLDiagnostician;
import org.eclipse.papyrusrt.umlrt.core.validation.tests.Activator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Sample test for validation Rule: <i>Fixed capsule parts cannot have variable multiplicity</i>.
 */
public class CapsulePartMultiplicityValidationTest extends AbstractValidationEditorTest {

	public static final String CONSTRAINT_PLUGIN = "org.eclipse.papyrusrt.umlrt.core.validation"; //$NON-NLS-1$

	public static final String CONSTRAINT_ID = "UMLRealTime.CapsulePart.Fixed capsule parts cannot have variable multiplicity"; //$NON-NLS-1$

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "CapsulePartMultiplicityRule"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "CapsulePartMultiplicityRuleValidationTest"; //$NON-NLS-1$

	public static final String CAPSULE = "Capsule";

	public final static String CAPSULE_PART_UPPER_EQUALS_LOWER = "CapsulePartUpperEqualsLower"; //$NON-NLS-1$

	public final static String CAPSULE_PART_UPPER_NOT_EQUALS_LOWER = "CapsulePartUpperNotEqualsLower"; //$NON-NLS-1$

	public final static String CAPSULE_PART_UPPER_NOT_EQUALS_LOWER_NOT_INTEGERS = "CapsulePartUpperNotEqualsLowerNotIntegers"; //$NON-NLS-1$

	public final static String CAPSULE_PART_UPPER_EQUALS_LOWER_NOT_INTEGERS = "CapsulePartUpperEqualsLowerNotIntegers"; //$NON-NLS-1$

	/** validation diagnostic */
	protected Diagnostic globalDiagnostic;

	/** root model */
	public Model model;

	/** capsule part valid */
	public Property capsulePartUpperEqualsLower;

	/** capsule part not valid */
	public Property capsulePartUpperNotEqualsLower;

	/** capsule part valid */
	public Property capsulePartUpperEqualsLowerNotIntegers;

	/** capsule part not valid */
	public Property capsulePartUpperNotEqualsLowerNotIntegers;

	public List<Diagnostic> CapsulePartMultiplicityDiagnostics;

	public Class capsule;

	@Before
	public void initModelForValidationTest() throws Exception {
		initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle());

		// validate the new model

		Assert.assertNotNull("RootModel is null", getRootUMLModel()); //$NON-NLS-1$
		model = (Model) getRootUMLModel();
		capsule = (Class) model.getPackagedElement(CAPSULE);

		capsulePartUpperEqualsLower = (Property) capsule.getOwnedMember(CAPSULE_PART_UPPER_EQUALS_LOWER);
		Assert.assertNotNull("Impossible to find capsule part " + CAPSULE_PART_UPPER_EQUALS_LOWER, capsulePartUpperEqualsLower);

		capsulePartUpperNotEqualsLower = (Property) capsule.getOwnedMember(CAPSULE_PART_UPPER_NOT_EQUALS_LOWER);
		Assert.assertNotNull("Impossible to find capsule part " + CAPSULE_PART_UPPER_NOT_EQUALS_LOWER, capsulePartUpperNotEqualsLower);

		capsulePartUpperEqualsLowerNotIntegers = (Property) capsule.getOwnedMember(CAPSULE_PART_UPPER_EQUALS_LOWER_NOT_INTEGERS);
		Assert.assertNotNull("Impossible to find capsule part " + CAPSULE_PART_UPPER_EQUALS_LOWER_NOT_INTEGERS, capsulePartUpperEqualsLowerNotIntegers);

		capsulePartUpperNotEqualsLowerNotIntegers = (Property) capsule.getOwnedMember(CAPSULE_PART_UPPER_NOT_EQUALS_LOWER_NOT_INTEGERS);
		Assert.assertNotNull("Impossible to find capsule part " + CAPSULE_PART_UPPER_NOT_EQUALS_LOWER_NOT_INTEGERS, capsulePartUpperNotEqualsLowerNotIntegers);

		final EditingDomain domain = TransactionUtil.getEditingDomain(model);
		final ValidateModelCommand validateModelCommand = new ValidateModelCommand(model, new UMLDiagnostician());
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				domain.getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(validateModelCommand));
			}
		});

		// check that the constraint exist
		ConstraintRegistry instance = ConstraintRegistry.getInstance();
		IConstraintDescriptor descriptor = instance.getDescriptor(CONSTRAINT_PLUGIN, CONSTRAINT_ID);
		Assert.assertNotNull("Constraint is missing", descriptor);

		globalDiagnostic = validateModelCommand.getDiagnostic();
		CapsulePartMultiplicityDiagnostics = findDiagnosticBySource(globalDiagnostic, CONSTRAINT_PLUGIN + "." + CONSTRAINT_ID);
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}

	/**
	 * Simple failing validation for CapsulePart Multiplicity
	 */
	@Test
	public void validateCapsulePartUpperNotEqualsLower() throws Exception {
		// get the diagnostic and check for the given capsule
		List<Diagnostic> diagnostics = filterDiagnosticsByElement(CapsulePartMultiplicityDiagnostics, capsulePartUpperNotEqualsLower);
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this element", 1, diagnostics.size());
	}

	/**
	 * Simple valid validation for IsActiveEntityRule
	 */
	@Test
	public void validateCapsulePartUpperEqualsLower() throws Exception {
		// get the diagnostic and check for the given capsule
		List<Diagnostic> diagnostics = filterDiagnosticsByElement(CapsulePartMultiplicityDiagnostics, capsulePartUpperEqualsLower);
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger issue for this element", 0, diagnostics.size());
	}

	/**
	 * Simple failing validation for CapsulePart Multiplicity
	 */
	@Test
	public void validateCapsulePartUpperNotEqualsLowerNotIntegers() throws Exception {
		// get the diagnostic and check for the given capsule
		List<Diagnostic> diagnostics = filterDiagnosticsByElement(CapsulePartMultiplicityDiagnostics, capsulePartUpperNotEqualsLowerNotIntegers);
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should trigger an issue for this element", 1, diagnostics.size());
	}

	/**
	 * Simple valid validation for IsActiveEntityRule
	 */
	@Test
	public void validateCapsulePartUpperEqualsLowerNotIntegers() throws Exception {
		// get the diagnostic and check for the given capsule
		List<Diagnostic> diagnostics = filterDiagnosticsByElement(CapsulePartMultiplicityDiagnostics, capsulePartUpperEqualsLowerNotIntegers);
		Assert.assertEquals("The rule " + CONSTRAINT_ID + " should not trigger issue for this element", 0, diagnostics.size());
	}


}
