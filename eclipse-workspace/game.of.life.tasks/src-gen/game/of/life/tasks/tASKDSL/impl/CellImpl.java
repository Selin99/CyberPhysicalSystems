/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.Cell;
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
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getX <em>X</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getY <em>Y</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getNNo <em>NNo</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getS <em>S</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.CellImpl#getA <em>A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getNNo() <em>NNo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNNo()
   * @generated
   * @ordered
   */
  protected static final int NNO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNNo() <em>NNo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNNo()
   * @generated
   * @ordered
   */
  protected int nNo = NNO_EDEFAULT;

  /**
   * The default value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected static final String S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected String s = S_EDEFAULT;

  /**
   * The default value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected static final String A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected String a = A_EDEFAULT;

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
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNNo()
  {
    return nNo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNNo(int newNNo)
  {
    int oldNNo = nNo;
    nNo = newNNo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__NNO, oldNNo, nNo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setS(String newS)
  {
    String oldS = s;
    s = newS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__S, oldS, s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setA(String newA)
  {
    String oldA = a;
    a = newA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.CELL__A, oldA, a));
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
      case TASKDSLPackage.CELL__X:
        return getX();
      case TASKDSLPackage.CELL__Y:
        return getY();
      case TASKDSLPackage.CELL__NNO:
        return getNNo();
      case TASKDSLPackage.CELL__S:
        return getS();
      case TASKDSLPackage.CELL__A:
        return getA();
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
      case TASKDSLPackage.CELL__X:
        setX((Integer)newValue);
        return;
      case TASKDSLPackage.CELL__Y:
        setY((Integer)newValue);
        return;
      case TASKDSLPackage.CELL__NNO:
        setNNo((Integer)newValue);
        return;
      case TASKDSLPackage.CELL__S:
        setS((String)newValue);
        return;
      case TASKDSLPackage.CELL__A:
        setA((String)newValue);
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
      case TASKDSLPackage.CELL__X:
        setX(X_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__Y:
        setY(Y_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__NNO:
        setNNo(NNO_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__S:
        setS(S_EDEFAULT);
        return;
      case TASKDSLPackage.CELL__A:
        setA(A_EDEFAULT);
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
      case TASKDSLPackage.CELL__X:
        return x != X_EDEFAULT;
      case TASKDSLPackage.CELL__Y:
        return y != Y_EDEFAULT;
      case TASKDSLPackage.CELL__NNO:
        return nNo != NNO_EDEFAULT;
      case TASKDSLPackage.CELL__S:
        return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
      case TASKDSLPackage.CELL__A:
        return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", nNo: ");
    result.append(nNo);
    result.append(", s: ");
    result.append(s);
    result.append(", a: ");
    result.append(a);
    result.append(')');
    return result.toString();
  }

} //CellImpl
