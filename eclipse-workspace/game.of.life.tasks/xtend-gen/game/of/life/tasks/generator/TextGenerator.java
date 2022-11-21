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
        int _gs = g.getGs();
        _builder.append(_gs, "    ");
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
        _builder.append("X-Cord:");
        int _xC = ig.getXC();
        _builder.append(_xC);
        _builder.newLineIfNotEmpty();
        _builder.append("Y-Cord:");
        int _yC = ig.getYC();
        _builder.append(_yC);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    {
      EList<Cell> _allCells = root.getAllCells();
      for(final Cell c : _allCells) {
        _builder.append("\t\t    ");
        _builder.append("\t", "\t\t    ");
        String _name_1 = c.getName();
        _builder.append(_name_1, "\t\t    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("X Coordinate:");
        int _x = c.getX();
        _builder.append(_x, "\t\t    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("Y Coordinate: ");
        int _y = c.getY();
        _builder.append(_y, "\t\t    ");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("Neighbor Number: ");
        int _nNo = c.getNNo();
        _builder.append(_nNo, "\t\t    ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("Life Status: ");
        int _s = c.getS();
        _builder.append(_s, "\t\t    ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("Available Action: ");
        _builder.newLine();
        _builder.append("\t\t    ");
        {
          int _birth = c.getAvAction().getBirth();
          boolean _tripleNotEquals = (_birth != 0);
          if (_tripleNotEquals) {
            _builder.append(" BIRTH ");
            int _birth_1 = c.getAvAction().getBirth();
            _builder.append(_birth_1, "\t\t    ");
            _builder.append(" ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        {
          int _overcrowd = c.getAvAction().getOvercrowd();
          boolean _tripleNotEquals_1 = (_overcrowd != 0);
          if (_tripleNotEquals_1) {
            _builder.append(" DEATH BY OVERCROWDING ");
            int _overcrowd_1 = c.getAvAction().getOvercrowd();
            _builder.append(_overcrowd_1, "\t\t    ");
            _builder.append(" ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        {
          int _sur = c.getAvAction().getSur();
          boolean _tripleNotEquals_2 = (_sur != 0);
          if (_tripleNotEquals_2) {
            _builder.append(" SURVIVAL");
            int _sur_1 = c.getAvAction().getSur();
            _builder.append(_sur_1, "\t\t    ");
            _builder.append(" ");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          int _xiso = c.getAvAction().getXiso();
          boolean _notEquals = (_xiso != 0);
          if (_notEquals) {
            _builder.append(" DEATH BY ISOLATION");
            int _xiso_1 = c.getAvAction().getXiso();
            _builder.append(_xiso_1);
            _builder.append("  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("SEPARATOR \"  &\" AFTER \"=====\"» ");
        _builder.newLine();
        _builder.append("\t\t    ");
        _builder.append("\n", "\t\t    ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
