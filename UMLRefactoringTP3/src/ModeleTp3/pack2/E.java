/**
 */
package ModeleTp3.pack2;

import ModeleTp3.Int;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModeleTp3.pack2.E#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModeleTp3.pack2.Pack2Package#getE()
 * @model
 * @generated
 */
public interface E extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Int)
	 * @see ModeleTp3.pack2.Pack2Package#getE_X()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getX();

	/**
	 * Sets the value of the '{@link ModeleTp3.pack2.E#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Int value);

} // E
