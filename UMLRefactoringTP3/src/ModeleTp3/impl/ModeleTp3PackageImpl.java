/**
 */
package ModeleTp3.impl;

import ModeleTp3.Int;
import ModeleTp3.ModeleTp3Factory;
import ModeleTp3.ModeleTp3Package;

import ModeleTp3.pack1.Pack1Package;

import ModeleTp3.pack1.impl.Pack1PackageImpl;

import ModeleTp3.pack2.Pack2Package;

import ModeleTp3.pack2.impl.Pack2PackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeleTp3PackageImpl extends EPackageImpl implements ModeleTp3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

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
	 * @see ModeleTp3.ModeleTp3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeleTp3PackageImpl() {
		super(eNS_URI, ModeleTp3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModeleTp3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeleTp3Package init() {
		if (isInited) return (ModeleTp3Package)EPackage.Registry.INSTANCE.getEPackage(ModeleTp3Package.eNS_URI);

		// Obtain or create and register package
		ModeleTp3PackageImpl theModeleTp3Package = (ModeleTp3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModeleTp3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModeleTp3PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Pack1PackageImpl thePack1Package = (Pack1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pack1Package.eNS_URI) instanceof Pack1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pack1Package.eNS_URI) : Pack1Package.eINSTANCE);
		Pack2PackageImpl thePack2Package = (Pack2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Pack2Package.eNS_URI) instanceof Pack2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Pack2Package.eNS_URI) : Pack2Package.eINSTANCE);

		// Create package meta-data objects
		theModeleTp3Package.createPackageContents();
		thePack1Package.createPackageContents();
		thePack2Package.createPackageContents();

		// Initialize created meta-data
		theModeleTp3Package.initializePackageContents();
		thePack1Package.initializePackageContents();
		thePack2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeleTp3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeleTp3Package.eNS_URI, theModeleTp3Package);
		return theModeleTp3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeleTp3Factory getModeleTp3Factory() {
		return (ModeleTp3Factory)getEFactoryInstance();
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
		intEClass = createEClass(INT);
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
		Pack1Package thePack1Package = (Pack1Package)EPackage.Registry.INSTANCE.getEPackage(Pack1Package.eNS_URI);
		Pack2Package thePack2Package = (Pack2Package)EPackage.Registry.INSTANCE.getEPackage(Pack2Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePack1Package);
		getESubpackages().add(thePack2Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModeleTp3PackageImpl
