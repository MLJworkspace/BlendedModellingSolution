/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mapping.mapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mapping.mapping.HelperStatement;
import org.xtext.example.mapping.mapping.MappingFactory;
import org.xtext.example.mapping.mapping.MappingModel;
import org.xtext.example.mapping.mapping.MappingPackage;
import org.xtext.example.mapping.mapping.MappingRule;
import org.xtext.example.mapping.mapping.Metamodel;
import org.xtext.example.mapping.mapping.Operator;
import org.xtext.example.mapping.mapping.SourceMetamodel;
import org.xtext.example.mapping.mapping.TargetMetamodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingPackageImpl extends EPackageImpl implements MappingPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceMetamodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetMetamodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mapping.mapping.MappingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MappingPackageImpl()
  {
    super(eNS_URI, MappingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MappingPackage init()
  {
    if (isInited) return (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMappingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MappingPackageImpl theMappingPackage = registeredMappingPackage instanceof MappingPackageImpl ? (MappingPackageImpl)registeredMappingPackage : new MappingPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMappingPackage.createPackageContents();

    // Initialize created meta-data
    theMappingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMappingPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
    return theMappingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMappingModel()
  {
    return mappingModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMappingModel_Name()
  {
    return (EAttribute)mappingModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingModel_SourceMetamodels()
  {
    return (EReference)mappingModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingModel_MainSourceMetamodel()
  {
    return (EReference)mappingModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingModel_TargetMetamodels()
  {
    return (EReference)mappingModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingModel_Rules()
  {
    return (EReference)mappingModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSourceMetamodel()
  {
    return sourceMetamodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTargetMetamodel()
  {
    return targetMetamodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMappingRule()
  {
    return mappingRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMappingRule_Name()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingRule_Source()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingRule_EEnumLiteral()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingRule_Target()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMappingRule_Operator()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMappingRule_Condition()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMappingRule_Comment()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingRule_ChildRules()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMappingRule_ChildHelpers()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHelperStatement()
  {
    return helperStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHelperStatement_Statement()
  {
    return (EAttribute)helperStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHelperStatement_ChildRules()
  {
    return (EReference)helperStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHelperStatement_ChildHelpers()
  {
    return (EReference)helperStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMetamodel()
  {
    return metamodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMetamodel_Name()
  {
    return (EAttribute)metamodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMetamodel_Model()
  {
    return (EReference)metamodelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getOperator()
  {
    return operatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MappingFactory getMappingFactory()
  {
    return (MappingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mappingModelEClass = createEClass(MAPPING_MODEL);
    createEAttribute(mappingModelEClass, MAPPING_MODEL__NAME);
    createEReference(mappingModelEClass, MAPPING_MODEL__SOURCE_METAMODELS);
    createEReference(mappingModelEClass, MAPPING_MODEL__MAIN_SOURCE_METAMODEL);
    createEReference(mappingModelEClass, MAPPING_MODEL__TARGET_METAMODELS);
    createEReference(mappingModelEClass, MAPPING_MODEL__RULES);

    sourceMetamodelEClass = createEClass(SOURCE_METAMODEL);

    targetMetamodelEClass = createEClass(TARGET_METAMODEL);

    mappingRuleEClass = createEClass(MAPPING_RULE);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__NAME);
    createEReference(mappingRuleEClass, MAPPING_RULE__SOURCE);
    createEReference(mappingRuleEClass, MAPPING_RULE__EENUM_LITERAL);
    createEReference(mappingRuleEClass, MAPPING_RULE__TARGET);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__OPERATOR);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__CONDITION);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__COMMENT);
    createEReference(mappingRuleEClass, MAPPING_RULE__CHILD_RULES);
    createEReference(mappingRuleEClass, MAPPING_RULE__CHILD_HELPERS);

    helperStatementEClass = createEClass(HELPER_STATEMENT);
    createEAttribute(helperStatementEClass, HELPER_STATEMENT__STATEMENT);
    createEReference(helperStatementEClass, HELPER_STATEMENT__CHILD_RULES);
    createEReference(helperStatementEClass, HELPER_STATEMENT__CHILD_HELPERS);

    metamodelEClass = createEClass(METAMODEL);
    createEAttribute(metamodelEClass, METAMODEL__NAME);
    createEReference(metamodelEClass, METAMODEL__MODEL);

    // Create enums
    operatorEEnum = createEEnum(OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sourceMetamodelEClass.getESuperTypes().add(this.getMetamodel());
    targetMetamodelEClass.getESuperTypes().add(this.getMetamodel());

    // Initialize classes and features; add operations and parameters
    initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingModel_SourceMetamodels(), this.getSourceMetamodel(), null, "SourceMetamodels", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingModel_MainSourceMetamodel(), this.getSourceMetamodel(), null, "MainSourceMetamodel", null, 0, 1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingModel_TargetMetamodels(), this.getTargetMetamodel(), null, "TargetMetamodels", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingModel_Rules(), this.getMappingRule(), null, "Rules", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceMetamodelEClass, SourceMetamodel.class, "SourceMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(targetMetamodelEClass, TargetMetamodel.class, "TargetMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Source(), ecorePackage.getEObject(), null, "source", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_EEnumLiteral(), ecorePackage.getEEnumLiteral(), null, "EEnumLiteral", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Operator(), this.getOperator(), "operator", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_ChildRules(), this.getMappingRule(), null, "ChildRules", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_ChildHelpers(), this.getHelperStatement(), null, "ChildHelpers", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperStatementEClass, HelperStatement.class, "HelperStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHelperStatement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, HelperStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperStatement_ChildRules(), this.getMappingRule(), null, "ChildRules", null, 0, -1, HelperStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelperStatement_ChildHelpers(), this.getHelperStatement(), null, "ChildHelpers", null, 0, -1, HelperStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetamodel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetamodel_Model(), ecorePackage.getEPackage(), null, "model", null, 0, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(operatorEEnum, Operator.class, "Operator");
    addEEnumLiteral(operatorEEnum, Operator.ASSIGN);
    addEEnumLiteral(operatorEEnum, Operator.ADD);

    // Create resource
    createResource(eNS_URI);
  }

} //MappingPackageImpl
