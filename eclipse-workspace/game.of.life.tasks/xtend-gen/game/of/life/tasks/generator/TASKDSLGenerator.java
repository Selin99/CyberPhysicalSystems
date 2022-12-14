/**
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.generator;

import game.of.life.tasks.tASKDSL.Game;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TASKDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final Game root = ((Game) _head);
    String _lastSegment = resource.getURI().lastSegment();
    String rootPath = (_lastSegment + "/");
    if ((root != null)) {
      fsa.generateFile("GameInfo.txt", TextGenerator.toText(root));
      fsa.generateFile((rootPath + "RuleOfLife.java"), RulesOfLife.rulesOfLife(root));
      fsa.generateFile((rootPath + "GameOfLife.java"), GameOfLife.gameOfLife(root));
    }
  }
}
