/*
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import game.of.life.tasks.tASKDSL.Game


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TASKDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val root = resource.allContents.head as Game; 
    	if (root !== null) { 
       	fsa.generateFile("GameInfo.txt", TextGenerator.toText(root)) 
    } 
	}
}