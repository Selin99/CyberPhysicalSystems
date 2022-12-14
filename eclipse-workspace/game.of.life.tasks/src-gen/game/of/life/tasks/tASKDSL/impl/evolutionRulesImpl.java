/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.Result;
import game.of.life.tasks.tASKDSL.Status;
import game.of.life.tasks.tASKDSL.TASKDSLPackage;
import game.of.life.tasks.tASKDSL.evolutionRules;
import game.of.life.tasks.tASKDSL.logicalRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>evolution Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.evolutionRulesImpl#getNNo <em>NNo</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.evolutionRulesImpl#getL <em>L</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.evolutionRulesImpl#getComparedNo <em>Compared No</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.evolutionRulesImpl#getS <em>S</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.evolutionRulesImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class evolutionRulesImpl extends MinimalEObjectImpl.Container implements evolutionRules
{
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
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final logicalRelation L_EDEFAULT = logicalRelation.EQUAL;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected logicalRelation l = L_EDEFAULT;

  /**
   * The default value of the '{@link #getComparedNo() <em>Compared No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparedNo()
   * @generated
   * @ordered
   */
  protected static final int COMPARED_NO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getComparedNo() <em>Compared No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparedNo()
   * @generated
   * @ordered
   */
  protected int comparedNo = COMPARED_NO_EDEFAULT;

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
   * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected static final Result RESULT_EDEFAULT = Result.BIRTH;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected Result result = RESULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected evolutionRulesImpl()
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
    return TASKDSLPackage.Literals.EVOLUT??ON_RULES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.EVOLUT??ON_RULES__NNO, oldNNo, nNo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public logicalRelation getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setL(logicalRelation newL)
  {
    logicalRelation oldL = l;
    l = newL == null ? L_EDEFAULT : newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.EVOLUT??ON_RULES__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getComparedNo()
  {
    return comparedNo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComparedNo(int newComparedNo)
  {
    int oldComparedNo = comparedNo;
    comparedNo = newComparedNo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.EVOLUT??ON_RULES__COMPARED_NO, oldComparedNo, comparedNo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.EVOLUT??ON_RULES__S, oldS, s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Result getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResult(Result newResult)
  {
    Result oldResult = result;
    result = newResult == null ? RESULT_EDEFAULT : newResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.EVOLUT??ON_RULES__RESULT, oldResult, result));
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
      case TASKDSLPackage.EVOLUT??ON_RULES__NNO:
        return getNNo();
      case TASKDSLPackage.EVOLUT??ON_RULES__L:
        return getL();
      case TASKDSLPackage.EVOLUT??ON_RULES__COMPARED_NO:
        return getComparedNo();
      case TASKDSLPackage.EVOLUT??ON_RULES__S:
        return getS();
      case TASKDSLPackage.EVOLUT??ON_RULES__RESULT:
        return getResult();
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
      case TASKDSLPackage.EVOLUT??ON_RULES__NNO:
        setNNo((Integer)newValue);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__L:
        setL((logicalRelation)newValue);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__COMPARED_NO:
        setComparedNo((Integer)newValue);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__S:
        setS((Status)newValue);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__RESULT:
        setResult((Result)newValue);
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
      case TASKDSLPackage.EVOLUT??ON_RULES__NNO:
        setNNo(NNO_EDEFAULT);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__L:
        setL(L_EDEFAULT);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__COMPARED_NO:
        setComparedNo(COMPARED_NO_EDEFAULT);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__S:
        setS(S_EDEFAULT);
        return;
      case TASKDSLPackage.EVOLUT??ON_RULES__RESULT:
        setResult(RESULT_EDEFAULT);
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
      case TASKDSLPackage.EVOLUT??ON_RULES__NNO:
        return nNo != NNO_EDEFAULT;
      case TASKDSLPackage.EVOLUT??ON_RULES__L:
        return l != L_EDEFAULT;
      case TASKDSLPackage.EVOLUT??ON_RULES__COMPARED_NO:
        return comparedNo != COMPARED_NO_EDEFAULT;
      case TASKDSLPackage.EVOLUT??ON_RULES__S:
        return s != S_EDEFAULT;
      case TASKDSLPackage.EVOLUT??ON_RULES__RESULT:
        return result != RESULT_EDEFAULT;
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
    result.append(" (nNo: ");
    result.append(nNo);
    result.append(", l: ");
    result.append(l);
    result.append(", comparedNo: ");
    result.append(comparedNo);
    result.append(", s: ");
    result.append(s);
    result.append(", result: ");
    result.append(result);
    result.append(')');
    return result.toString();
  }

} //evolutionRulesImpl
