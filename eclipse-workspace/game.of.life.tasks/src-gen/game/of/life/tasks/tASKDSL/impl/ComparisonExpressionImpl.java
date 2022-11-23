/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.ComparisonExpression;
import game.of.life.tasks.tASKDSL.Expression;
import game.of.life.tasks.tASKDSL.TASKDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.ComparisonExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.ComparisonExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.ComparisonExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonExpressionImpl extends ExpressionImpl implements ComparisonExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonExpressionImpl()
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
    return TASKDSLPackage.Literals.COMPARİSON_EXPRESSİON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT, oldLeft, newLeft);
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
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.COMPARİSON_EXPRESSİON__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT, oldRight, newRight);
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
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT, newRight, newRight));
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
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT:
        return basicSetLeft(null, msgs);
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT:
        return basicSetRight(null, msgs);
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
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT:
        return getLeft();
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__OPERATOR:
        return getOperator();
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT:
        return getRight();
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
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT:
        setLeft((Expression)newValue);
        return;
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__OPERATOR:
        setOperator((String)newValue);
        return;
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT:
        setRight((Expression)newValue);
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
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT:
        setLeft((Expression)null);
        return;
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT:
        setRight((Expression)null);
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
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__LEFT:
        return left != null;
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case TASKDSLPackage.COMPARİSON_EXPRESSİON__RİGHT:
        return right != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //ComparisonExpressionImpl
