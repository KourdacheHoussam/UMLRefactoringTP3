/**
 */
package ModeleTp3.pack1;

import ModeleTp3.Int;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModeleTp3.pack1.A#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModeleTp3.pack1.Pack1Package#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' containment reference.
	 * @see #setT(Int)
	 * @see ModeleTp3.pack1.Pack1Package#getA_T()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Int getT();

	/**
	 * Sets the value of the '{@link ModeleTp3.pack1.A#getT <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' containment reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(Int value);

} // A
