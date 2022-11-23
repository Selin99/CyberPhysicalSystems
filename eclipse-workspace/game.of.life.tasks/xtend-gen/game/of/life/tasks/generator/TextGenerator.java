package game.of.life.tasks.generator;

import game.of.life.tasks.tASKDSL.Game;
import game.of.life.tasks.tASKDSL.GridSize;
import game.of.life.tasks.tASKDSL.StartGrid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence toText(final Game root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Info of the game ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("GRID SIZE:");
    _builder.newLine();
    _builder.newLine();
    {
      EList<GridSize> _gridSize = root.getGridSize();
      for(final GridSize grdSize : _gridSize) {
        _builder.append("Height:");
        int _h = grdSize.getH();
        _builder.append(_h);
        _builder.newLineIfNotEmpty();
        _builder.append("Length:");
        int _l = grdSize.getL();
        _builder.append(_l);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
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
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.newLine();
    return _builder;
  }
}
