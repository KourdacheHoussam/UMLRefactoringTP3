/**
 */
package ModeleTp3.pack2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ModeleTp3.pack2.Pack2Factory
 * @model kind="package"
 * @generated
 */
public interface Pack2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pack2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ModeleTp3/pack2.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModeleTp3.pack2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pack2Package eINSTANCE = ModeleTp3.pack2.impl.Pack2PackageImpl.init();

	/**
	 * The meta object id for the '{@link ModeleTp3.pack2.impl.CImpl <em>C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeleTp3.pack2.impl.CImpl
	 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getC()
	 * @generated
	 */
	int C = 0;

	/**
	 * The number of structural features of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModeleTp3.pack2.impl.DImpl <em>D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeleTp3.pack2.impl.DImpl
	 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getD()
	 * @generated
	 */
	int D = 1;

	/**
	 * The number of structural features of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_FEATURE_COUNT = C_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Foo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D___FOO = C_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int D_OPERATION_COUNT = C_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ModeleTp3.pack2.impl.EImpl <em>E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeleTp3.pack2.impl.EImpl
	 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getE()
	 * @generated
	 */
	int E = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E__X = 0;

	/**
	 * The number of structural features of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ModeleTp3.pack2.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C</em>'.
	 * @see ModeleTp3.pack2.C
	 * @generated
	 */
	EClass getC();

	/**
	 * Returns the meta object for class '{@link ModeleTp3.pack2.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>D</em>'.
	 * @see ModeleTp3.pack2.D
	 * @generated
	 */
	EClass getD();

	/**
	 * Returns the meta object for the '{@link ModeleTp3.pack2.D#foo() <em>Foo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Foo</em>' operation.
	 * @see ModeleTp3.pack2.D#foo()
	 * @generated
	 */
	EOperation getD__Foo();

	/**
	 * Returns the meta object for class '{@link ModeleTp3.pack2.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E</em>'.
	 * @see ModeleTp3.pack2.E
	 * @generated
	 */
	EClass getE();

	/**
	 * Returns the meta object for the containment reference '{@link ModeleTp3.pack2.E#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see ModeleTp3.pack2.E#getX()
	 * @see #getE()
	 * @generated
	 */
	EReference getE_X();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pack2Factory getPack2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ModeleTp3.pack2.impl.CImpl <em>C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeleTp3.pack2.impl.CImpl
		 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getC()
		 * @generated
		 */
		EClass C = eINSTANCE.getC();

		/**
		 * The meta object literal for the '{@link ModeleTp3.pack2.impl.DImpl <em>D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeleTp3.pack2.impl.DImpl
		 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getD()
		 * @generated
		 */
		EClass D = eINSTANCE.getD();

		/**
		 * The meta object literal for the '<em><b>Foo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation D___FOO = eINSTANCE.getD__Foo();

		/**
		 * The meta object literal for the '{@link ModeleTp3.pack2.impl.EImpl <em>E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeleTp3.pack2.impl.EImpl
		 * @see ModeleTp3.pack2.impl.Pack2PackageImpl#getE()
		 * @generated
		 */
		EClass E = eINSTANCE.getE();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E__X = eINSTANCE.getE_X();

	}

} //Pack2Package
