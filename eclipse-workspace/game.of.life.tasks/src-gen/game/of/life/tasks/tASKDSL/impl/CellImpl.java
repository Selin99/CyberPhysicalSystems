/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.Cell;
import game.of.life.tasks.tASKDSL.Status;
import game.of.life.tasks.tASKDSL.TASKDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getXC <em>XC</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getYC <em>YC</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getS <em>S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell
{
  /**
   * The default value of the '{@link #getXC() <em>XC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXC()
   * @generated
   * @ordered
   */
  protected static final int XC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXC() <em>XC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXC()
   * @generated
   * @ordered
   */
  protected int xC = XC_EDEFAULT;

  /**
   * The default value of the '{@link #getYC() <em>YC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYC()
   * @generated
   * @ordered
   */
  protected static final int YC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYC() <em>YC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYC()
   * @generated
   * @ordered
   */
  protected int yC = YC_EDEFAULT;

  /**
   * The default value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected static final Status S_EDEFAULT = Status.LIVE;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected Status s = S_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellImpl()
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
    return TASKDSLPackage.Literals.CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getXC()
  {
    return xC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXC(int newXC)
  {
    int oldXC = xC;
    xC = newXC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__XC, oldXC, xC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYC()
  {
    return yC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYC(int newYC)
  {
    int oldYC = yC;
    yC = newYC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__YC, oldYC, yC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Status getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setS(Status newS)
  {
    Status oldS = s;
    s = newS == null ? S_EDEFAULT : newS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__S, oldS, s));
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
      case TASKDSLPackage.CELL__XC:
        return getXC();
      case TASKDSLPackage.CELL__YC:
        return getYC();
      case TASKDSLPackage.CELL__S:
        return getS();
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
      case TASKDSLPackage.CELL__XC:
        setXC((Integer)newValue);
        return;
      case TASKDSLPackage.CELL__YC:
        setYC((Integer)newValue);
        return;
      case TASKDSLPackage.CELL__S:
        setS((Status)newValue);
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
      case TASKDSLPackage.CELL__XC:
        setXC(XC_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__YC:
        setYC(YC_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__S:
        setS(S_EDEFAULT);
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
      case TASKDSLPackage.CELL__XC:
        return xC != XC_EDEFAULT;
      case TASKDSLPackage.CELL__YC:
        return yC != YC_EDEFAULT;
      case TASKDSLPackage.CELL__S:
        return s != S_EDEFAULT;
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
    result.append(" (xC: ");
    result.append(xC);
    result.append(", yC: ");
    result.append(yC);
    result.append(", s: ");
    result.append(s);
    result.append(')');
    return result.toString();
  }

} //CellImpl
