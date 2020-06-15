/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import java.util.Collection;

import mdsd.rPG.MoveE;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Rule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move E</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.MoveEImpl#getExtraRule <em>Extra Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveEImpl extends EffectImpl implements MoveE
{
  /**
   * The cached value of the '{@link #getExtraRule() <em>Extra Rule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraRule()
   * @generated
   * @ordered
   */
  protected EList<Rule> extraRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoveEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RPGPackage.Literals.MOVE_E;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Rule> getExtraRule()
  {
    if (extraRule == null)
    {
      extraRule = new EObjectContainmentEList<Rule>(Rule.class, this, RPGPackage.MOVE_E__EXTRA_RULE);
    }
    return extraRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RPGPackage.MOVE_E__EXTRA_RULE:
        return ((InternalEList<?>)getExtraRule()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RPGPackage.MOVE_E__EXTRA_RULE:
        return getExtraRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.MOVE_E__EXTRA_RULE:
        getExtraRule().clear();
        getExtraRule().addAll((Collection<? extends Rule>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.MOVE_E__EXTRA_RULE:
        getExtraRule().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.MOVE_E__EXTRA_RULE:
        return extraRule != null && !extraRule.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MoveEImpl
