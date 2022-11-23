package game.of.life.tasks.generator;

import game.of.life.tasks.tASKDSL.Cell;
import game.of.life.tasks.tASKDSL.Game;
import game.of.life.tasks.tASKDSL.GameStatus;
import game.of.life.tasks.tASKDSL.GridSize;
import game.of.life.tasks.tASKDSL.StartGrid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence toText(final Game root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("Info of the game ");
    String _name = root.getName();
    _builder.append(_name, "    ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      EList<GameStatus> _gameStatus = root.getGameStatus();
      for(final GameStatus g : _gameStatus) {
        _builder.append("    ");
        _builder.append("Game Status :");
        String _so = g.getSo();
        _builder.append(_so, "    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("GRID SIZE:");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<GridSize> _gridSize = root.getGridSize();
      for(final GridSize grdSize : _gridSize) {
        _builder.append("    ");
        _builder.append("Height:");
        int _h = grdSize.getH();
        _builder.append(_h, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("Length:");
        int _l = grdSize.getL();
        _builder.append(_l, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ACTIVE POSITIONS IN INITIAL GRID:");
    _builder.newLine();
    {
      EList<StartGrid> _startGrid = root.getStartGrid();
      for(final StartGrid ig : _startGrid) {
        _builder.append("X Coordinate:");
        int _xC = ig.getXC();
        _builder.append(_xC);
        _builder.newLineIfNotEmpty();
        _builder.append("Y Coordinate:");
        int _yC = ig.getYC();
        _builder.append(_yC);
        _builder.newLineIfNotEmpty();
        _builder.append("Neighbor  Number: ");
        int _nNo = ig.getNNo();
        _builder.append(_nNo);
        _builder.newLineIfNotEmpty();
        _builder.append("Life Status: ");
        String _s = ig.getS();
        _builder.append(_s);
        _builder.newLineIfNotEmpty();
        _builder.append("Next Generation: ");
        String _a = ig.getA();
        _builder.append(_a);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("ALL CELLS");
    _builder.newLine();
    {
      EList<Cell> _allCells = root.getAllCells();
      for(final Cell c : _allCells) {
        _builder.append("X Coordinate:");
        int _x = c.getX();
        _builder.append(_x);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("Y Coordinate: ");
        int _y = c.getY();
        _builder.append(_y);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("Neighbor Number: ");
        int _nNo_1 = c.getNNo();
        _builder.append(_nNo_1);
        _builder.newLineIfNotEmpty();
        _builder.append("Life Status: ");
        String _s_1 = c.getS();
        _builder.append(_s_1);
        _builder.newLineIfNotEmpty();
        _builder.append("Next Generation:  ");
        String _a_1 = c.getA();
        _builder.append(_a_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
