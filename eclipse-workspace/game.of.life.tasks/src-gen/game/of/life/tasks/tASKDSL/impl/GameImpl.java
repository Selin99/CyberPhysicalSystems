/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.Cell;
import game.of.life.tasks.tASKDSL.Game;
import game.of.life.tasks.tASKDSL.GameStatus;
import game.of.life.tasks.tASKDSL.GridSize;
import game.of.life.tasks.tASKDSL.StartGrid;
import game.of.life.tasks.tASKDSL.TASKDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.GameImpl#getName <em>Name</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.GameImpl#getGameStatus <em>Game Status</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.GameImpl#getGridSize <em>Grid Size</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.GameImpl#getStartGrid <em>Start Grid</em>}</li>
 *   <li>{@link game.of.life.tasks.tASKDSL.impl.GameImpl#getAllCells <em>All Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends ModelImpl implements Game
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getGameStatus() <em>Game Status</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGameStatus()
   * @generated
   * @ordered
   */
  protected EList<GameStatus> gameStatus;

  /**
   * The cached value of the '{@link #getGridSize() <em>Grid Size</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridSize()
   * @generated
   * @ordered
   */
  protected EList<GridSize> gridSize;

  /**
   * The cached value of the '{@link #getStartGrid() <em>Start Grid</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartGrid()
   * @generated
   * @ordered
   */
  protected EList<StartGrid> startGrid;

  /**
   * The cached value of the '{@link #getAllCells() <em>All Cells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllCells()
   * @generated
   * @ordered
   */
  protected EList<Cell> allCells;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameImpl()
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
    return TASKDSLPackage.Literals.GAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TASKDSLPackage.GAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GameStatus> getGameStatus()
  {
    if (gameStatus == null)
    {
      gameStatus = new EObjectContainmentEList<GameStatus>(GameStatus.class, this, TASKDSLPackage.GAME__GAME_STATUS);
    }
    return gameStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GridSize> getGridSize()
  {
    if (gridSize == null)
    {
      gridSize = new EObjectContainmentEList<GridSize>(GridSize.class, this, TASKDSLPackage.GAME__GRİD_SİZE);
    }
    return gridSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StartGrid> getStartGrid()
  {
    if (startGrid == null)
    {
      startGrid = new EObjectContainmentEList<StartGrid>(StartGrid.class, this, TASKDSLPackage.GAME__START_GRİD);
    }
    return startGrid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Cell> getAllCells()
  {
    if (allCells == null)
    {
      allCells = new EObjectContainmentEList<Cell>(Cell.class, this, TASKDSLPackage.GAME__ALL_CELLS);
    }
    return allCells;
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
      case TASKDSLPackage.GAME__GAME_STATUS:
        return ((InternalEList<?>)getGameStatus()).basicRemove(otherEnd, msgs);
      case TASKDSLPackage.GAME__GRİD_SİZE:
        return ((InternalEList<?>)getGridSize()).basicRemove(otherEnd, msgs);
      case TASKDSLPackage.GAME__START_GRİD:
        return ((InternalEList<?>)getStartGrid()).basicRemove(otherEnd, msgs);
      case TASKDSLPackage.GAME__ALL_CELLS:
        return ((InternalEList<?>)getAllCells()).basicRemove(otherEnd, msgs);
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
      case TASKDSLPackage.GAME__NAME:
        return getName();
      case TASKDSLPackage.GAME__GAME_STATUS:
        return getGameStatus();
      case TASKDSLPackage.GAME__GRİD_SİZE:
        return getGridSize();
      case TASKDSLPackage.GAME__START_GRİD:
        return getStartGrid();
      case TASKDSLPackage.GAME__ALL_CELLS:
        return getAllCells();
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
      case TASKDSLPackage.GAME__NAME:
        setName((String)newValue);
        return;
      case TASKDSLPackage.GAME__GAME_STATUS:
        getGameStatus().clear();
        getGameStatus().addAll((Collection<? extends GameStatus>)newValue);
        return;
      case TASKDSLPackage.GAME__GRİD_SİZE:
        getGridSize().clear();
        getGridSize().addAll((Collection<? extends GridSize>)newValue);
        return;
      case TASKDSLPackage.GAME__START_GRİD:
        getStartGrid().clear();
        getStartGrid().addAll((Collection<? extends StartGrid>)newValue);
        return;
      case TASKDSLPackage.GAME__ALL_CELLS:
        getAllCells().clear();
        getAllCells().addAll((Collection<? extends Cell>)newValue);
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
      case TASKDSLPackage.GAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TASKDSLPackage.GAME__GAME_STATUS:
        getGameStatus().clear();
        return;
      case TASKDSLPackage.GAME__GRİD_SİZE:
        getGridSize().clear();
        return;
      case TASKDSLPackage.GAME__START_GRİD:
        getStartGrid().clear();
        return;
      case TASKDSLPackage.GAME__ALL_CELLS:
        getAllCells().clear();
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
      case TASKDSLPackage.GAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TASKDSLPackage.GAME__GAME_STATUS:
        return gameStatus != null && !gameStatus.isEmpty();
      case TASKDSLPackage.GAME__GRİD_SİZE:
        return gridSize != null && !gridSize.isEmpty();
      case TASKDSLPackage.GAME__START_GRİD:
        return startGrid != null && !startGrid.isEmpty();
      case TASKDSLPackage.GAME__ALL_CELLS:
        return allCells != null && !allCells.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GameImpl
