package game.of.life.tasks.generator;

import game.of.life.tasks.tASKDSL.Cell;
import game.of.life.tasks.tASKDSL.Game;
import game.of.life.tasks.tASKDSL.avAction;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<avAction> getActions(final Game root) {
    List<avAction> actionlist = new ArrayList<avAction>();
    EList<Cell> _allCells = root.getAllCells();
    for (final Cell c : _allCells) {
      actionlist.add(c.getAvAction());
    }
    return actionlist;
  }

  public static Game getPersonPlanning(final Cell cell) {
    EObject _eContainer = cell.eContainer();
    return ((Game) _eContainer);
  }
}
