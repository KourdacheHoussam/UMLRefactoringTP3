/**
 */
package ModeleTp3.pack2.impl;

import ModeleTp3.ModeleTp3Package;

import ModeleTp3.impl.ModeleTp3PackageImpl;

import ModeleTp3.pack1.Pack1Package;

import ModeleTp3.pack1.impl.Pack1PackageImpl;

import ModeleTp3.pack2.Pack2Factory;
import ModeleTp3.pack2.Pack2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pack2PackageImpl extends EPackageImpl implements Pack2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEClass = null;

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
	 * @see ModeleTp3.pack2.Pack2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pack2PackageImpl() {
		super(eNS_URI, Pack2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Pack2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pack2Package init() {
		if (isInited) return (Pack2Package)EPackage.Registry.INSTANCE.getEPackage(Pack2Package.eNS_URI);

		// Obtain or create and register package
		Pack2PackageImpl thePack2Package = (Pack2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pack2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pack2PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModeleTp3PackageImpl theModeleTp3Package = (ModeleTp3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeleTp3Package.eNS_URI) instanceof ModeleTp3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeleTp3Package.eNS_URI) : ModeleTp3Package.eINSTANCE);
		Pack1PackageImpl thePack1Package = (Pack1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pack1Package.eNS_URI) instanceof Pack1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pack1Package.eNS_URI) : Pack1Package.eINSTANCE);

		// Create package meta-data objects
		thePack2Package.createPackageContents();
		theModeleTp3Package.createPackageContents();
		thePack1Package.createPackageContents();

		// Initialize created meta-data
		thePack2Package.initializePackageContents();
		theModeleTp3Package.initializePackageContents();
		thePack1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePack2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pack2Package.eNS_URI, thePack2Package);
		return thePack2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC() {
		return cEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getD() {
		return dEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getD__Foo() {
		return dEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE() {
		return eEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE_X() {
		return (EReference)eEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pack2Factory getPack2Factory() {
		return (Pack2Factory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cEClass = createEClass(C);

		dEClass = createEClass(D);
		createEOperation(dEClass, D___FOO);

		eEClass = createEClass(E);
		createEReference(eEClass, E__X);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModeleTp3Package theModeleTp3Package = (ModeleTp3Package)EPackage.Registry.INSTANCE.getEPackage(ModeleTp3Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dEClass.getESuperTypes().add(this.getC());

		// Initialize classes, features, and operations; add parameters
		initEClass(cEClass, ModeleTp3.pack2.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dEClass, ModeleTp3.pack2.D.class, "D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getD__Foo(), null, "foo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(eEClass, ModeleTp3.pack2.E.class, "E", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE_X(), theModeleTp3Package.getInt(), null, "x", null, 1, 1, ModeleTp3.pack2.E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //Pack2PackageImpl
