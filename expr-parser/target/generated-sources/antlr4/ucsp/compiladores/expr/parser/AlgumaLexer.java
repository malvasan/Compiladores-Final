// Generated from ucsp\compiladores\expr\parser\Expresiones.g4 by ANTLR 4.9.1
package ucsp.compiladores.expr.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TIPO_VAR=16, 
		NUMINT=17, NUMREAL=18, CADENA=19, OP_ARIT1=20, OP_ARIT2=21, OP_REL=22, 
		OP_BOOL=23, VARIABLE=24, COMENTARIO=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TIPO_VAR", "NUMINT", 
			"NUMREAL", "CADENA", "ESC_SEQ", "OP_ARIT1", "OP_ARIT2", "OP_REL", "OP_BOOL", 
			"VARIABLE", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACIONES'", "'ALGORITMO'", "'('", "')'", "'ASIGNAR'", 
			"'A'", "'LEER'", "'IMPRIMIR'", "'SI'", "'ENTONCES'", "'SINO'", "'MIENTRAS'", 
			"'INICIO'", "'FIN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", "CADENA", "OP_ARIT1", 
			"OP_ARIT2", "OP_REL", "OP_BOOL", "VARIABLE", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expresiones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009f\n\21"+
		"\3\22\6\22\u00a2\n\22\r\22\16\22\u00a3\3\23\6\23\u00a7\n\23\r\23\16\23"+
		"\u00a8\3\23\3\23\6\23\u00ad\n\23\r\23\16\23\u00ae\3\24\3\24\3\24\7\24"+
		"\u00b4\n\24\f\24\16\24\u00b7\13\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00cb\n\30"+
		"\3\31\3\31\3\32\3\32\7\32\u00d1\n\32\f\32\16\32\u00d4\13\32\3\33\3\33"+
		"\7\33\u00d8\n\33\f\33\16\33\u00db\13\33\3\33\5\33\u00de\n\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26-\27"+
		"/\30\61\31\63\32\65\33\67\34\3\2\n\4\2))^^\4\2--//\4\2,,\61\61\4\2QQ["+
		"[\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00f3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7I\3\2\2\2"+
		"\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23f\3\2\2\2"+
		"\25o\3\2\2\2\27r\3\2\2\2\31{\3\2\2\2\33\u0080\3\2\2\2\35\u0089\3\2\2\2"+
		"\37\u0090\3\2\2\2!\u009e\3\2\2\2#\u00a1\3\2\2\2%\u00a6\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00ba\3\2\2\2+\u00bd\3\2\2\2-\u00bf\3\2\2\2/\u00ca\3\2\2\2\61"+
		"\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d5\3\2\2\2\67\u00e3\3\2\2\29:\7"+
		"<\2\2:\4\3\2\2\2;<\7F\2\2<=\7G\2\2=>\7E\2\2>?\7N\2\2?@\7C\2\2@A\7T\2\2"+
		"AB\7C\2\2BC\7E\2\2CD\7K\2\2DE\7Q\2\2EF\7P\2\2FG\7G\2\2GH\7U\2\2H\6\3\2"+
		"\2\2IJ\7C\2\2JK\7N\2\2KL\7I\2\2LM\7Q\2\2MN\7T\2\2NO\7K\2\2OP\7V\2\2PQ"+
		"\7O\2\2QR\7Q\2\2R\b\3\2\2\2ST\7*\2\2T\n\3\2\2\2UV\7+\2\2V\f\3\2\2\2WX"+
		"\7C\2\2XY\7U\2\2YZ\7K\2\2Z[\7I\2\2[\\\7P\2\2\\]\7C\2\2]^\7T\2\2^\16\3"+
		"\2\2\2_`\7C\2\2`\20\3\2\2\2ab\7N\2\2bc\7G\2\2cd\7G\2\2de\7T\2\2e\22\3"+
		"\2\2\2fg\7K\2\2gh\7O\2\2hi\7R\2\2ij\7T\2\2jk\7K\2\2kl\7O\2\2lm\7K\2\2"+
		"mn\7T\2\2n\24\3\2\2\2op\7U\2\2pq\7K\2\2q\26\3\2\2\2rs\7G\2\2st\7P\2\2"+
		"tu\7V\2\2uv\7Q\2\2vw\7P\2\2wx\7E\2\2xy\7G\2\2yz\7U\2\2z\30\3\2\2\2{|\7"+
		"U\2\2|}\7K\2\2}~\7P\2\2~\177\7Q\2\2\177\32\3\2\2\2\u0080\u0081\7O\2\2"+
		"\u0081\u0082\7K\2\2\u0082\u0083\7G\2\2\u0083\u0084\7P\2\2\u0084\u0085"+
		"\7V\2\2\u0085\u0086\7T\2\2\u0086\u0087\7C\2\2\u0087\u0088\7U\2\2\u0088"+
		"\34\3\2\2\2\u0089\u008a\7K\2\2\u008a\u008b\7P\2\2\u008b\u008c\7K\2\2\u008c"+
		"\u008d\7E\2\2\u008d\u008e\7K\2\2\u008e\u008f\7Q\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7H\2\2\u0091\u0092\7K\2\2\u0092\u0093\7P\2\2\u0093 \3\2\2\2\u0094"+
		"\u0095\7G\2\2\u0095\u0096\7P\2\2\u0096\u0097\7V\2\2\u0097\u0098\7G\2\2"+
		"\u0098\u0099\7T\2\2\u0099\u009f\7Q\2\2\u009a\u009b\7T\2\2\u009b\u009c"+
		"\7G\2\2\u009c\u009d\7C\2\2\u009d\u009f\7N\2\2\u009e\u0094\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\"\3\2\2\2\u00a0\u00a2\4\62;\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4$\3"+
		"\2\2\2\u00a5\u00a7\4\62;\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\60"+
		"\2\2\u00ab\u00ad\4\62;\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af&\3\2\2\2\u00b0\u00b5\7)\2\2\u00b1"+
		"\u00b4\5)\25\2\u00b2\u00b4\n\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9(\3\2\2\2\u00ba"+
		"\u00bb\7^\2\2\u00bb\u00bc\7)\2\2\u00bc*\3\2\2\2\u00bd\u00be\t\3\2\2\u00be"+
		",\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0.\3\2\2\2\u00c1\u00cb\7@\2\2\u00c2"+
		"\u00c3\7@\2\2\u00c3\u00cb\7?\2\2\u00c4\u00cb\7>\2\2\u00c5\u00c6\7>\2\2"+
		"\u00c6\u00cb\7?\2\2\u00c7\u00c8\7>\2\2\u00c8\u00cb\7@\2\2\u00c9\u00cb"+
		"\7?\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca"+
		"\u00c5\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\60\3\2\2"+
		"\2\u00cc\u00cd\t\5\2\2\u00cd\62\3\2\2\2\u00ce\u00d2\t\6\2\2\u00cf\u00d1"+
		"\t\7\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\64\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\7\'\2"+
		"\2\u00d6\u00d8\n\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00de\7\17\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\33\2\2\u00e2"+
		"\66\3\2\2\2\u00e3\u00e4\t\t\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\34\2"+
		"\2\u00e68\3\2\2\2\r\2\u009e\u00a3\u00a8\u00ae\u00b3\u00b5\u00ca\u00d2"+
		"\u00d9\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}