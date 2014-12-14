/**
 */
package ModeleTp3.pack2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ModeleTp3.pack2.Pack2Package
 * @generated
 */
public interface Pack2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pack2Factory eINSTANCE = ModeleTp3.pack2.impl.Pack2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C</em>'.
	 * @generated
	 */
	C createC();

	/**
	 * Returns a new object of class '<em>D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>D</em>'.
	 * @generated
	 */
	D createD();

	/**
	 * Returns a new object of class '<em>E</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E</em>'.
	 * @generated
	 */
	E createE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Pack2Package getPack2Package();

} //Pack2Factory
