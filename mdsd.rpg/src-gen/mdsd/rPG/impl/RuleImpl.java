/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.Attribute;
import mdsd.rPG.Proposition;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Rule;
import mdsd.rPG.Sum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getOr <em>Or</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getHits <em>Hits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected Proposition or;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Attribute target;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected Sum sum;

  /**
   * The default value of the '{@link #getHits() <em>Hits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHits()
   * @generated
   * @ordered
   */
  protected static final String HITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHits() <em>Hits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHits()
   * @generated
   * @ordered
   */
  protected String hits = HITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return RPGPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition getOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOr(Proposition newOr, NotificationChain msgs)
  {
    Proposition oldOr = or;
    or = newOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__OR, oldOr, newOr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOr(Proposition newOr)
  {
    if (newOr != or)
    {
      NotificationChain msgs = null;
      if (or != null)
        msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__OR, null, msgs);
      if (newOr != null)
        msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__OR, null, msgs);
      msgs = basicSetOr(newOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__OR, newOr, newOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Attribute)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.RULE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(Attribute newTarget)
  {
    Attribute oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSum(Sum newSum, NotificationChain msgs)
  {
    Sum oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__SUM, oldSum, newSum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSum(Sum newSum)
  {
    if (newSum != sum)
    {
      NotificationChain msgs = null;
      if (sum != null)
        msgs = ((InternalEObject)sum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__SUM, null, msgs);
      if (newSum != null)
        msgs = ((InternalEObject)newSum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__SUM, null, msgs);
      msgs = basicSetSum(newSum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__SUM, newSum, newSum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHits()
  {
    return hits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHits(String newHits)
  {
    String oldHits = hits;
    hits = newHits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__HITS, oldHits, hits));
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
      case RPGPackage.RULE__OR:
        return basicSetOr(null, msgs);
      case RPGPackage.RULE__SUM:
        return basicSetSum(null, msgs);
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
      case RPGPackage.RULE__OR:
        return getOr();
      case RPGPackage.RULE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case RPGPackage.RULE__SUM:
        return getSum();
      case RPGPackage.RULE__HITS:
        return getHits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.RULE__OR:
        setOr((Proposition)newValue);
        return;
      case RPGPackage.RULE__TARGET:
        setTarget((Attribute)newValue);
        return;
      case RPGPackage.RULE__SUM:
        setSum((Sum)newValue);
        return;
      case RPGPackage.RULE__HITS:
        setHits((String)newValue);
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
      case RPGPackage.RULE__OR:
        setOr((Proposition)null);
        return;
      case RPGPackage.RULE__TARGET:
        setTarget((Attribute)null);
        return;
      case RPGPackage.RULE__SUM:
        setSum((Sum)null);
        return;
      case RPGPackage.RULE__HITS:
        setHits(HITS_EDEFAULT);
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
      case RPGPackage.RULE__OR:
        return or != null;
      case RPGPackage.RULE__TARGET:
        return target != null;
      case RPGPackage.RULE__SUM:
        return sum != null;
      case RPGPackage.RULE__HITS:
        return HITS_EDEFAULT == null ? hits != null : !HITS_EDEFAULT.equals(hits);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (hits: ");
    result.append(hits);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
