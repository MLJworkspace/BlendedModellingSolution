/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mapping.mapping.provider;


import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.example.mapping.mapping.MappingFactory;
import org.xtext.example.mapping.mapping.MappingPackage;
import org.xtext.example.mapping.mapping.MappingRule;





/**
 * This is the item provider adapter for a {@link org.xtext.example.mapping.mapping.MappingRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingRuleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addEEnumLiteralPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_name_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MappingRule_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_source_feature",
								"_UI_MappingRule_type"),
						MappingPackage.Literals.MAPPING_RULE__SOURCE, true, false, true, null, null, null)
						{
						@Override
//						public Collection<?> getChoiceOfValues(Object object) {
//							List<EObject> choiceOfValues = new ArrayList<EObject>();
//							if (object instanceof MappingRule) {
//								EObject parentrule = ((MappingRule) object).getParentRule();
//								if (parentrule instanceof MappingRule) {
//									EObject inputproperty = ((MappingRule) parentrule).getInput();
//									
//										choiceOfValues = inputproperty.eContents();
//									
//								} else if (parentrule == null) {
//									MappingModel objectContainer = (MappingModel) ((MappingRule) object).eContainer();
//									EList<Model> models = objectContainer.getLeftModels();
//								    for (int i=0; i < models.size() ; i++) {
//								    	EObject inputPackage =models.get(i).getModel();
//								    	choiceOfValues = inputPackage.eContents();
//								    }
//								
//								}
//							}
//							return choiceOfValues;
//						}

						public IItemLabelProvider getLabelProvider(Object objecti) {
							List<EObject> choiceOfValues = new ArrayList<EObject>();
							objecti = getChoiceOfValues(object);
							final IItemLabelProvider labelProvider = super.getLabelProvider(objecti);
							return new IItemLabelProvider() {
								@Override
								public String getText(final Object objecti) {
									String label = labelProvider.getText(objecti);
									if (label != null) {
										if (objecti instanceof EObject) {
											EObject prindi = ((EObject) objecti).eContainer();
											if (prindi instanceof EPackage) {
												String emriprindit = ((EPackage) prindi).getName();
												label = String.format("%s \u2219 %s", label, emriprindit + "/" + label);
											} else if (prindi instanceof EClass) {
												String emriprindit = ((EClass) prindi).getName();
												EObject gjyshi = prindi.eContainer();
												String emrigjyshit = ((EPackage) gjyshi).getName();
												label = String.format("%s \u2219 %s", label,
														emrigjyshit + "/" + emriprindit + "/" + label);
											}
										}
									}
									return label;
								}
								@Override
								public Object getImage(final Object object) {
									return labelProvider.getImage(object);
								}
							};

						}					
				}
						
						
						
						
						
						
						
						
						);
	}



	/**
	 * This adds a property descriptor for the EEnum Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEEnumLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_EEnumLiteral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_EEnumLiteral_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__EENUM_LITERAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_target_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_operator_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_condition_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_comment_feature", "_UI_MappingRule_type"),
				 MappingPackage.Literals.MAPPING_RULE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_RULE__CHILD_RULES);
			childrenFeatures.add(MappingPackage.Literals.MAPPING_RULE__CHILD_HELPERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MappingRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MappingRule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingRule_type") :
			getString("_UI_MappingRule_type") + " " + label;
	}



	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MappingRule.class)) {
			case MappingPackage.MAPPING_RULE__NAME:
			case MappingPackage.MAPPING_RULE__OPERATOR:
			case MappingPackage.MAPPING_RULE__CONDITION:
			case MappingPackage.MAPPING_RULE__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MappingPackage.MAPPING_RULE__CHILD_RULES:
			case MappingPackage.MAPPING_RULE__CHILD_HELPERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_RULE__CHILD_RULES,
				 MappingFactory.eINSTANCE.createMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING_RULE__CHILD_HELPERS,
				 MappingFactory.eINSTANCE.createHelperStatement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MappingEditPlugin.INSTANCE;
	}

}
