/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Loc#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.rPG.Loc#getTipe <em>Tipe</em>}</li>
 *   <li>{@link mdsd.rPG.Loc#getEff <em>Eff</em>}</li>
 *   <li>{@link mdsd.rPG.Loc#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getLoc()
 * @model
 * @generated
 */
public interface Loc extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mdsd.rPG.RPGPackage#getLoc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdsd.rPG.Loc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tipe</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipe</em>' reference.
   * @see #setTipe(Type)
   * @see mdsd.rPG.RPGPackage#getLoc_Tipe()
   * @model
   * @generated
   */
  Type getTipe();

  /**
   * Sets the value of the '{@link mdsd.rPG.Loc#getTipe <em>Tipe</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipe</em>' reference.
   * @see #getTipe()
   * @generated
   */
  void setTipe(Type value);

  /**
   * Returns the value of the '<em><b>Eff</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eff</em>' containment reference.
   * @see #setEff(ActualNumbers)
   * @see mdsd.rPG.RPGPackage#getLoc_Eff()
   * @model containment="true"
   * @generated
   */
  ActualNumbers getEff();

  /**
   * Sets the value of the '{@link mdsd.rPG.Loc#getEff <em>Eff</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eff</em>' containment reference.
   * @see #getEff()
   * @generated
   */
  void setEff(ActualNumbers value);

  /**
   * Returns the value of the '<em><b>Team</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team</em>' reference.
   * @see #setTeam(Team)
   * @see mdsd.rPG.RPGPackage#getLoc_Team()
   * @model
   * @generated
   */
  Team getTeam();

  /**
   * Sets the value of the '{@link mdsd.rPG.Loc#getTeam <em>Team</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Team</em>' reference.
   * @see #getTeam()
   * @generated
   */
  void setTeam(Team value);

} // Loc
