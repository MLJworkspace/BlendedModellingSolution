/**
 * Copyright (c) 2016 EclipseSource Services GmbH
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Philip Langer (EclipseSource) - Initial API and implementation
 */
package org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.compare.diagram.internal.extensions.provider.ExtensionsEditPlugin;
import org.eclipse.emf.compare.provider.EMFCompareEditPlugin;
import org.eclipse.emf.compare.uml2.internal.provider.UMLCompareEditPlugin;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the central singleton for the Umlrt edit plugin.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public final class UMLRTEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final UMLRTEditPlugin INSTANCE = new UMLRTEditPlugin();

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRTEditPlugin() {
		super(new ResourceLocator[] {
				EMFCompareEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				ExtensionsEditPlugin.INSTANCE,
				UMLEditPlugin.INSTANCE,
				UMLCompareEditPlugin.INSTANCE,
		});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
