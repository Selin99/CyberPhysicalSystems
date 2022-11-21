/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.tASKDSL.impl;

import game.of.life.tasks.tASKDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TASKDSLFactoryImpl extends EFactoryImpl implements TASKDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TASKDSLFactory init()
  {
    try
    {
      TASKDSLFactory theTASKDSLFactory = (TASKDSLFactory)EPackage.Registry.INSTANCE.getEFactory(TASKDSLPackage.eNS_URI);
      if (theTASKDSLFactory != null)
      {
        return theTASKDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TASKDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TASKDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TASKDSLPackage.MODEL: return createModel();
      case TASKDSLPackage.GAME: return createGame();
      case TASKDSLPackage.GRİD_SİZE: return createGridSize();
      case TASKDSLPackage.GAME_STATUS: return createGameStatus();
      case TASKDSLPackage.START_GRİD: return createStartGrid();
      case TASKDSLPackage.AV_ACTİON: return createavAction();
      case TASKDSLPackage.CELL: return createCell();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GridSize createGridSize()
  {
    GridSizeImpl gridSize = new GridSizeImpl();
    return gridSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GameStatus createGameStatus()
  {
    GameStatusImpl gameStatus = new GameStatusImpl();
    return gameStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartGrid createStartGrid()
  {
    StartGridImpl startGrid = new StartGridImpl();
    return startGrid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public avAction createavAction()
  {
    avActionImpl avAction = new avActionImpl();
    return avAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TASKDSLPackage getTASKDSLPackage()
  {
    return (TASKDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TASKDSLPackage getPackage()
  {
    return TASKDSLPackage.eINSTANCE;
  }

} //TASKDSLFactoryImpl