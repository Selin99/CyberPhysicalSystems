/*
 * generated by Xtext 2.28.0
 */
package game.of.life.tasks.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import game.of.life.tasks.ide.contentassist.antlr.internal.InternalTASKDSLParser;
import game.of.life.tasks.services.TASKDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TASKDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TASKDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TASKDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGameAccess().getAlternatives_4(), "rule__Game__Alternatives_4");
			builder.put(grammarAccess.getAvActionAccess().getAlternatives(), "rule__AvAction__Alternatives");
			builder.put(grammarAccess.getGameAccess().getGroup(), "rule__Game__Group__0");
			builder.put(grammarAccess.getGridSizeAccess().getGroup(), "rule__GridSize__Group__0");
			builder.put(grammarAccess.getGameStatusAccess().getGroup(), "rule__GameStatus__Group__0");
			builder.put(grammarAccess.getStartGridAccess().getGroup(), "rule__StartGrid__Group__0");
			builder.put(grammarAccess.getAvActionAccess().getGroup_0(), "rule__AvAction__Group_0__0");
			builder.put(grammarAccess.getAvActionAccess().getGroup_1(), "rule__AvAction__Group_1__0");
			builder.put(grammarAccess.getAvActionAccess().getGroup_2(), "rule__AvAction__Group_2__0");
			builder.put(grammarAccess.getAvActionAccess().getGroup_3(), "rule__AvAction__Group_3__0");
			builder.put(grammarAccess.getCellAccess().getGroup(), "rule__Cell__Group__0");
			builder.put(grammarAccess.getGameAccess().getNameAssignment_1(), "rule__Game__NameAssignment_1");
			builder.put(grammarAccess.getGameAccess().getGameStatusAssignment_2(), "rule__Game__GameStatusAssignment_2");
			builder.put(grammarAccess.getGameAccess().getGridSizeAssignment_3(), "rule__Game__GridSizeAssignment_3");
			builder.put(grammarAccess.getGameAccess().getStartGridAssignment_4_0(), "rule__Game__StartGridAssignment_4_0");
			builder.put(grammarAccess.getGameAccess().getAllCellsAssignment_4_1(), "rule__Game__AllCellsAssignment_4_1");
			builder.put(grammarAccess.getGridSizeAccess().getHAssignment_1(), "rule__GridSize__HAssignment_1");
			builder.put(grammarAccess.getGridSizeAccess().getLAssignment_3(), "rule__GridSize__LAssignment_3");
			builder.put(grammarAccess.getGameStatusAccess().getGsAssignment_1(), "rule__GameStatus__GsAssignment_1");
			builder.put(grammarAccess.getStartGridAccess().getXCAssignment_2(), "rule__StartGrid__XCAssignment_2");
			builder.put(grammarAccess.getStartGridAccess().getYCAssignment_4(), "rule__StartGrid__YCAssignment_4");
			builder.put(grammarAccess.getAvActionAccess().getBirthAssignment_0_1(), "rule__AvAction__BirthAssignment_0_1");
			builder.put(grammarAccess.getAvActionAccess().getOvercrowdAssignment_1_1(), "rule__AvAction__OvercrowdAssignment_1_1");
			builder.put(grammarAccess.getAvActionAccess().getXisoAssignment_2_1(), "rule__AvAction__XisoAssignment_2_1");
			builder.put(grammarAccess.getAvActionAccess().getSurAssignment_3_1(), "rule__AvAction__SurAssignment_3_1");
			builder.put(grammarAccess.getCellAccess().getNameAssignment_1(), "rule__Cell__NameAssignment_1");
			builder.put(grammarAccess.getCellAccess().getXAssignment_3(), "rule__Cell__XAssignment_3");
			builder.put(grammarAccess.getCellAccess().getYAssignment_5(), "rule__Cell__YAssignment_5");
			builder.put(grammarAccess.getCellAccess().getNNoAssignment_7(), "rule__Cell__NNoAssignment_7");
			builder.put(grammarAccess.getCellAccess().getSAssignment_9(), "rule__Cell__SAssignment_9");
			builder.put(grammarAccess.getCellAccess().getAvActionAssignment_11(), "rule__Cell__AvActionAssignment_11");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TASKDSLGrammarAccess grammarAccess;

	@Override
	protected InternalTASKDSLParser createParser() {
		InternalTASKDSLParser result = new InternalTASKDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TASKDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TASKDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}