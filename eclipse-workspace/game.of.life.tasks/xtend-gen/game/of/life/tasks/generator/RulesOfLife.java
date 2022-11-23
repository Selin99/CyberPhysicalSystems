package game.of.life.tasks.generator;

import com.google.common.base.Objects;
import game.of.life.tasks.tASKDSL.Game;
import game.of.life.tasks.tASKDSL.Result;
import game.of.life.tasks.tASKDSL.evolutionRules;
import game.of.life.tasks.tASKDSL.logicalRelation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RulesOfLife {
  public static CharSequence rulesOfLife(final Game Root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("       \t ");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("/* only code for surving cells, so no rule if result is dead cell */");
    _builder.newLine();
    _builder.append("               \t");
    _builder.append("boolean cellStatus = gameBoard[i][j];");
    _builder.newLine();
    {
      EList<evolutionRules> _evolutionRules = Root.getEvolutionRules();
      for(final evolutionRules evRule : _evolutionRules) {
        _builder.append("                ");
        _builder.append("if (surrounding ");
        CharSequence _relationOperator = RulesOfLife.getRelationOperator(Root);
        _builder.append(_relationOperator, "                ");
        _builder.append(" ");
        Result _result = evRule.getResult();
        _builder.append(_result, "                ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t                \t");
        _builder.append("/* rule B3 */");
        _builder.newLine();
        {
          Result _result_1 = evRule.getResult();
          boolean _equals = Objects.equal(_result_1, Result.BIRTH);
          if (_equals) {
            _builder.append("\t\t\t                \t");
            _builder.append("if (!cellStatus) { ");
            _builder.newLine();
            _builder.append("\t\t                \t\t\t\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t                \t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t                \t");
        _builder.append("/* rule B6 */");
        _builder.newLine();
        {
          Result _result_2 = evRule.getResult();
          boolean _equals_1 = Objects.equal(_result_2, Result.OVERCROWD);
          if (_equals_1) {
            _builder.append("\t\t\t                \t");
            _builder.append("if (!cellStatus) { ");
            _builder.newLine();
            _builder.append("\t\t\t                \t");
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t\t                \t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t                \t");
        _builder.append("/* rule S2 */");
        _builder.newLine();
        {
          Result _result_3 = evRule.getResult();
          boolean _equals_2 = Objects.equal(_result_3, Result.SURVIVE);
          if (_equals_2) {
            _builder.append("if (cellStatus) { ");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("survivingCells.add(new Point(i-1,j-1));");
            _builder.newLine();
            _builder.append("\t\t\t                \t\t");
            _builder.append("}\t\t                \t");
            _builder.newLine();
          }
        }
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence getRelationOperator(final Game root) {
    EList<evolutionRules> rules = root.getEvolutionRules();
    for (int i = 0; (i < rules.size()); i++) {
      {
        logicalRelation relnOperator = rules.get(i).getL();
        boolean _equals = Objects.equal(relnOperator, logicalRelation.EQUAL);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("==");
          return _builder;
        }
        boolean _equals_1 = Objects.equal(relnOperator, logicalRelation.GREATERTHAN);
        if (_equals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(">");
          return _builder_1;
        }
        boolean _equals_2 = Objects.equal(relnOperator, logicalRelation.LESSTHAN);
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<");
          return _builder_2;
        }
        boolean _equals_3 = Objects.equal(relnOperator, logicalRelation.GREATEROREQUAL);
        if (_equals_3) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(">=");
          return _builder_3;
        }
        boolean _equals_4 = Objects.equal(relnOperator, logicalRelation.LESSOREQUAL);
        if (_equals_4) {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("<=");
          return _builder_4;
        }
      }
    }
    return "INVALID OPERATOR";
  }
}
