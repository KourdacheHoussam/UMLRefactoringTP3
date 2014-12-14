/**
 */
package ModeleTp3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ModeleTp3.ModeleTp3Package
 * @generated
 */
public interface ModeleTp3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeleTp3Factory eINSTANCE = ModeleTp3.impl.ModeleTp3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int</em>'.
	 * @generated
	 */
	Int createInt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeleTp3Package getModeleTp3Package();

} //ModeleTp3Factory
