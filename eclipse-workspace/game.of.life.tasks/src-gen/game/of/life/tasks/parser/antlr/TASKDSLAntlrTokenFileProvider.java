/*
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TASKDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("game/of/life/tasks/parser/antlr/internal/InternalTASKDSL.tokens");
	}
}