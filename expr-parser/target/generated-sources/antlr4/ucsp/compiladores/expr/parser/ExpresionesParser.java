// Generated from ucsp\compiladores\expr\parser\Expresiones.g4 by ANTLR 4.9.1
package ucsp.compiladores.expr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpresionesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, END=3, WHILE=4, LOOP=5, FUN=6, RETURN=7, NEW=8, STRING=9, 
		INT=10, CHAR=11, BOOL=12, AND=13, OR=14, NOT=15, TRUE=16, FALSE=17, ParentesisIzquierdo=18, 
		ParentesisDerecho=19, DosPuntos=20, Coma=21, Menor=22, MenorIgual=23, 
		Mayor=24, MayorIgual=25, Asignar=26, NoIgual=27, CorcheteIzquierdo=28, 
		CorcheteDerecho=29, Mas=30, Menos=31, Multiplicacion=32, Division=33, 
		ID=34, LITNUMERAL=35, LITSTRING=36, BlockComment=37, Espacio=38, NL=39;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_nl = 2, RULE_global = 3, RULE_funcion = 4, 
		RULE_id = 5, RULE_bloque = 6, RULE_params = 7, RULE_parametro = 8, RULE_tipo = 9, 
		RULE_tipobase = 10, RULE_declvar = 11, RULE_comando = 12, RULE_cmdif = 13, 
		RULE_cmdwhile = 14, RULE_cmdasign = 15, RULE_llamada = 16, RULE_listaexp = 17, 
		RULE_cmdreturn = 18, RULE_var = 19, RULE_exp = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "nl", "global", "funcion", "id", "bloque", "params", 
			"parametro", "tipo", "tipobase", "declvar", "comando", "cmdif", "cmdwhile", 
			"cmdasign", "llamada", "listaexp", "cmdreturn", "var", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'end'", "'while'", "'loop'", "'fun'", "'return'", 
			"'new'", "'string'", "'int'", "'char'", "'bool'", "'and'", "'or'", "'not'", 
			"'true'", "'false'", "'('", "')'", "':'", "','", "'<'", "'<='", "'>'", 
			"'>='", "'='", "'<>'", "'['", "']'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "END", "WHILE", "LOOP", "FUN", "RETURN", "NEW", "STRING", 
			"INT", "CHAR", "BOOL", "AND", "OR", "NOT", "TRUE", "FALSE", "ParentesisIzquierdo", 
			"ParentesisDerecho", "DosPuntos", "Coma", "Menor", "MenorIgual", "Mayor", 
			"MayorIgual", "Asignar", "NoIgual", "CorcheteIzquierdo", "CorcheteDerecho", 
			"Mas", "Menos", "Multiplicacion", "Division", "ID", "LITNUMERAL", "LITSTRING", 
			"BlockComment", "Espacio", "NL"
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

	@Override
	public String getGrammarFileName() { return "Expresiones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpresionesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ExpresionesParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ExpresionesParser.NL, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(42);
				match(NL);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			decl();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN || _la==ID) {
				{
				{
				setState(49);
				decl();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				funcion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NlContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(ExpresionesParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ExpresionesParser.NL, i);
		}
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitNl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitNl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NL);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(60);
				match(NL);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalContext extends ParserRuleContext {
		public DeclvarContext declvar() {
			return getRuleContext(DeclvarContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			declvar();
			setState(67);
			nl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(ExpresionesParser.FUN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ParentesisIzquierdo() { return getToken(ExpresionesParser.ParentesisIzquierdo, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode ParentesisDerecho() { return getToken(ExpresionesParser.ParentesisDerecho, 0); }
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode END() { return getToken(ExpresionesParser.END, 0); }
		public TerminalNode DosPuntos() { return getToken(ExpresionesParser.DosPuntos, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FUN);
			setState(70);
			id();
			setState(71);
			match(ParentesisIzquierdo);
			setState(72);
			params();
			setState(73);
			match(ParentesisDerecho);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DosPuntos) {
				{
				setState(74);
				match(DosPuntos);
				setState(75);
				tipo();
				}
			}

			setState(78);
			nl();
			setState(79);
			bloque();
			setState(80);
			match(END);
			setState(81);
			nl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpresionesParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					declvar();
					setState(86);
					nl();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(93);
				comando();
				setState(94);
				nl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(ExpresionesParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(ExpresionesParser.Coma, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentesisDerecho:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				parametro();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Coma) {
					{
					{
					setState(103);
					match(Coma);
					setState(104);
					parametro();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpresionesParser.ID, 0); }
		public TerminalNode DosPuntos() { return getToken(ExpresionesParser.DosPuntos, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(DosPuntos);
			setState(114);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipobaseContext tipobase() {
			return getRuleContext(TipobaseContext.class,0);
		}
		public TerminalNode CorcheteIzquierdo() { return getToken(ExpresionesParser.CorcheteIzquierdo, 0); }
		public TerminalNode CorcheteDerecho() { return getToken(ExpresionesParser.CorcheteDerecho, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				tipobase();
				}
				break;
			case CorcheteIzquierdo:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CorcheteIzquierdo);
				setState(118);
				match(CorcheteDerecho);
				setState(119);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipobaseContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExpresionesParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(ExpresionesParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(ExpresionesParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ExpresionesParser.STRING, 0); }
		public TipobaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipobase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterTipobase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitTipobase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitTipobase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipobaseContext tipobase() throws RecognitionException {
		TipobaseContext _localctx = new TipobaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipobase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpresionesParser.ID, 0); }
		public TerminalNode DosPuntos() { return getToken(ExpresionesParser.DosPuntos, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterDeclvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitDeclvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitDeclvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(DosPuntos);
			setState(126);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public CmdifContext cmdif() {
			return getRuleContext(CmdifContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public CmdasignContext cmdasign() {
			return getRuleContext(CmdasignContext.class,0);
		}
		public CmdreturnContext cmdreturn() {
			return getRuleContext(CmdreturnContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				cmdif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				cmdwhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				cmdasign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				cmdreturn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				llamada();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ExpresionesParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ExpresionesParser.IF, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode END() { return getToken(ExpresionesParser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(ExpresionesParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ExpresionesParser.ELSE, i);
		}
		public CmdifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterCmdif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitCmdif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitCmdif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdifContext cmdif() throws RecognitionException {
		CmdifContext _localctx = new CmdifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			exp(0);
			setState(137);
			nl();
			setState(138);
			bloque();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(ELSE);
					setState(140);
					match(IF);
					setState(141);
					exp(0);
					setState(142);
					nl();
					setState(143);
					bloque();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(150);
				match(ELSE);
				setState(151);
				nl();
				setState(152);
				bloque();
				}
			}

			setState(156);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExpresionesParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(ExpresionesParser.LOOP, 0); }
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterCmdwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitCmdwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitCmdwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE);
			setState(159);
			exp(0);
			setState(160);
			nl();
			setState(161);
			bloque();
			setState(162);
			match(LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdasignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Asignar() { return getToken(ExpresionesParser.Asignar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdasignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdasign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterCmdasign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitCmdasign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitCmdasign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdasignContext cmdasign() throws RecognitionException {
		CmdasignContext _localctx = new CmdasignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdasign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			var(0);
			setState(165);
			match(Asignar);
			setState(166);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpresionesParser.ID, 0); }
		public TerminalNode ParentesisIzquierdo() { return getToken(ExpresionesParser.ParentesisIzquierdo, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TerminalNode ParentesisDerecho() { return getToken(ExpresionesParser.ParentesisDerecho, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(ParentesisIzquierdo);
			setState(170);
			listaexp();
			setState(171);
			match(ParentesisDerecho);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(ExpresionesParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(ExpresionesParser.Coma, i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitListaexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitListaexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listaexp);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParentesisDerecho:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NEW:
			case NOT:
			case TRUE:
			case FALSE:
			case ParentesisIzquierdo:
			case Menos:
			case ID:
			case LITNUMERAL:
			case LITSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				exp(0);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Coma) {
					{
					{
					setState(175);
					match(Coma);
					setState(176);
					exp(0);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ExpresionesParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterCmdreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitCmdreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitCmdreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdreturnContext cmdreturn() throws RecognitionException {
		CmdreturnContext _localctx = new CmdreturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdreturn);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(RETURN);
				setState(185);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpresionesParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CorcheteIzquierdo() { return getToken(ExpresionesParser.CorcheteIzquierdo, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CorcheteDerecho() { return getToken(ExpresionesParser.CorcheteDerecho, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(193);
					match(CorcheteIzquierdo);
					setState(194);
					exp(0);
					setState(195);
					match(CorcheteDerecho);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode LITNUMERAL() { return getToken(ExpresionesParser.LITNUMERAL, 0); }
		public TerminalNode LITSTRING() { return getToken(ExpresionesParser.LITSTRING, 0); }
		public TerminalNode TRUE() { return getToken(ExpresionesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExpresionesParser.FALSE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NEW() { return getToken(ExpresionesParser.NEW, 0); }
		public TerminalNode CorcheteIzquierdo() { return getToken(ExpresionesParser.CorcheteIzquierdo, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CorcheteDerecho() { return getToken(ExpresionesParser.CorcheteDerecho, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ParentesisIzquierdo() { return getToken(ExpresionesParser.ParentesisIzquierdo, 0); }
		public TerminalNode ParentesisDerecho() { return getToken(ExpresionesParser.ParentesisDerecho, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExpresionesParser.NOT, 0); }
		public TerminalNode Menos() { return getToken(ExpresionesParser.Menos, 0); }
		public TerminalNode Mas() { return getToken(ExpresionesParser.Mas, 0); }
		public TerminalNode Multiplicacion() { return getToken(ExpresionesParser.Multiplicacion, 0); }
		public TerminalNode Division() { return getToken(ExpresionesParser.Division, 0); }
		public TerminalNode Mayor() { return getToken(ExpresionesParser.Mayor, 0); }
		public TerminalNode Menor() { return getToken(ExpresionesParser.Menor, 0); }
		public TerminalNode MayorIgual() { return getToken(ExpresionesParser.MayorIgual, 0); }
		public TerminalNode MenorIgual() { return getToken(ExpresionesParser.MenorIgual, 0); }
		public TerminalNode Asignar() { return getToken(ExpresionesParser.Asignar, 0); }
		public TerminalNode NoIgual() { return getToken(ExpresionesParser.NoIgual, 0); }
		public TerminalNode AND() { return getToken(ExpresionesParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpresionesParser.OR, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpresionesListener ) ((ExpresionesListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpresionesVisitor ) return ((ExpresionesVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(203);
				match(LITNUMERAL);
				}
				break;
			case 2:
				{
				setState(204);
				match(LITSTRING);
				}
				break;
			case 3:
				{
				setState(205);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(206);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(207);
				var(0);
				}
				break;
			case 6:
				{
				setState(208);
				match(NEW);
				setState(209);
				match(CorcheteIzquierdo);
				setState(210);
				exp(0);
				setState(211);
				match(CorcheteDerecho);
				setState(212);
				tipo();
				}
				break;
			case 7:
				{
				setState(214);
				match(ParentesisIzquierdo);
				setState(215);
				exp(0);
				setState(216);
				match(ParentesisDerecho);
				}
				break;
			case 8:
				{
				setState(218);
				llamada();
				}
				break;
			case 9:
				{
				setState(219);
				match(NOT);
				setState(220);
				exp(2);
				}
				break;
			case 10:
				{
				setState(221);
				match(Menos);
				setState(222);
				exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(226);
						match(Mas);
						setState(227);
						exp(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(229);
						match(Menos);
						setState(230);
						exp(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(232);
						match(Multiplicacion);
						setState(233);
						exp(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(234);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(235);
						match(Division);
						setState(236);
						exp(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(238);
						match(Mayor);
						setState(239);
						exp(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(241);
						match(Menor);
						setState(242);
						exp(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(243);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(244);
						match(MayorIgual);
						setState(245);
						exp(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(246);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(247);
						match(MenorIgual);
						setState(248);
						exp(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(249);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(250);
						match(Asignar);
						setState(251);
						exp(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(252);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(253);
						match(NoIgual);
						setState(254);
						exp(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256);
						match(AND);
						setState(257);
						exp(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(OR);
						setState(260);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return var_sempred((VarContext)_localctx, predIndex);
		case 20:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\5\3<\n\3\3\4\3\4\7\4@\n\4\f"+
		"\4\16\4C\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b\7"+
		"\bc\n\b\f\b\16\bf\13\b\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\5\tq\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\17"+
		"\3\17\3\17\3\17\5\17\u009d\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00b4\n\23\f\23\16\23\u00b7\13\23\5\23\u00b9\n\23\3\24\3\24\3\24\5\24"+
		"\u00be\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00c8\n\25\f"+
		"\25\16\25\u00cb\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e2\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0108\n\26\f\26\16\26\u010b"+
		"\13\26\3\26\2\4(*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3"+
		"\3\2\13\16\2\u0120\2/\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nG\3\2"+
		"\2\2\fU\3\2\2\2\16\\\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24z\3\2\2\2\26|\3"+
		"\2\2\2\30~\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2\36\u00a0\3\2\2\2"+
		" \u00a6\3\2\2\2\"\u00aa\3\2\2\2$\u00b8\3\2\2\2&\u00bd\3\2\2\2(\u00bf\3"+
		"\2\2\2*\u00e1\3\2\2\2,.\7)\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\66\5\4\3\2\63\65\5\4\3\2\64\63\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29<"+
		"\5\n\6\2:<\5\b\5\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=A\7)\2\2>@\7)\2\2?>"+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DE\5\30\r\2"+
		"EF\5\6\4\2F\t\3\2\2\2GH\7\b\2\2HI\5\f\7\2IJ\7\24\2\2JK\5\20\t\2KN\7\25"+
		"\2\2LM\7\26\2\2MO\5\24\13\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\6\4\2QR"+
		"\5\16\b\2RS\7\5\2\2ST\5\6\4\2T\13\3\2\2\2UV\7$\2\2V\r\3\2\2\2WX\5\30\r"+
		"\2XY\5\6\4\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2"+
		"\2\2^\\\3\2\2\2_`\5\32\16\2`a\5\6\4\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db"+
		"\3\2\2\2de\3\2\2\2e\17\3\2\2\2fd\3\2\2\2gq\3\2\2\2hm\5\22\n\2ij\7\27\2"+
		"\2jl\5\22\n\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2pg\3\2\2\2ph\3\2\2\2q\21\3\2\2\2rs\7$\2\2st\7\26\2\2tu\5\24\13\2u"+
		"\23\3\2\2\2v{\5\26\f\2wx\7\36\2\2xy\7\37\2\2y{\5\24\13\2zv\3\2\2\2zw\3"+
		"\2\2\2{\25\3\2\2\2|}\t\2\2\2}\27\3\2\2\2~\177\7$\2\2\177\u0080\7\26\2"+
		"\2\u0080\u0081\5\24\13\2\u0081\31\3\2\2\2\u0082\u0088\5\34\17\2\u0083"+
		"\u0088\5\36\20\2\u0084\u0088\5 \21\2\u0085\u0088\5&\24\2\u0086\u0088\5"+
		"\"\22\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\7\3\2"+
		"\2\u008a\u008b\5*\26\2\u008b\u008c\5\6\4\2\u008c\u0095\5\16\b\2\u008d"+
		"\u008e\7\4\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5*\26\2\u0090\u0091\5\6"+
		"\4\2\u0091\u0092\5\16\b\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009c\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a\5\6\4\2\u009a"+
		"\u009b\5\16\b\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\5\2\2\u009f\35\3\2\2\2\u00a0"+
		"\u00a1\7\6\2\2\u00a1\u00a2\5*\26\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\5\16"+
		"\b\2\u00a4\u00a5\7\7\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8"+
		"\7\34\2\2\u00a8\u00a9\5*\26\2\u00a9!\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab"+
		"\u00ac\7\24\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\25\2\2\u00ae#\3\2\2"+
		"\2\u00af\u00b9\3\2\2\2\u00b0\u00b5\5*\26\2\u00b1\u00b2\7\27\2\2\u00b2"+
		"\u00b4\5*\26\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b9%\3\2\2\2\u00ba\u00bb\7\t\2\2"+
		"\u00bb\u00be\5*\26\2\u00bc\u00be\7\t\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\'\3\2\2\2\u00bf\u00c0\b\25\1\2\u00c0\u00c1\7$\2\2\u00c1"+
		"\u00c9\3\2\2\2\u00c2\u00c3\f\3\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\5"+
		"*\26\2\u00c5\u00c6\7\37\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca)\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\26\1\2\u00cd\u00e2\7%\2\2\u00ce\u00e2"+
		"\7&\2\2\u00cf\u00e2\7\22\2\2\u00d0\u00e2\7\23\2\2\u00d1\u00e2\5(\25\2"+
		"\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6"+
		"\7\37\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\7\24\2"+
		"\2\u00d9\u00da\5*\26\2\u00da\u00db\7\25\2\2\u00db\u00e2\3\2\2\2\u00dc"+
		"\u00e2\5\"\22\2\u00dd\u00de\7\21\2\2\u00de\u00e2\5*\26\4\u00df\u00e0\7"+
		"!\2\2\u00e0\u00e2\5*\26\3\u00e1\u00cc\3\2\2\2\u00e1\u00ce\3\2\2\2\u00e1"+
		"\u00cf\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1\u00d1\3\2\2\2\u00e1\u00d2\3\2"+
		"\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u0109\3\2\2\2\u00e3\u00e4\f\20\2\2\u00e4\u00e5\7"+
		" \2\2\u00e5\u0108\5*\26\21\u00e6\u00e7\f\17\2\2\u00e7\u00e8\7!\2\2\u00e8"+
		"\u0108\5*\26\20\u00e9\u00ea\f\16\2\2\u00ea\u00eb\7\"\2\2\u00eb\u0108\5"+
		"*\26\17\u00ec\u00ed\f\r\2\2\u00ed\u00ee\7#\2\2\u00ee\u0108\5*\26\16\u00ef"+
		"\u00f0\f\f\2\2\u00f0\u00f1\7\32\2\2\u00f1\u0108\5*\26\r\u00f2\u00f3\f"+
		"\13\2\2\u00f3\u00f4\7\30\2\2\u00f4\u0108\5*\26\f\u00f5\u00f6\f\n\2\2\u00f6"+
		"\u00f7\7\33\2\2\u00f7\u0108\5*\26\13\u00f8\u00f9\f\t\2\2\u00f9\u00fa\7"+
		"\31\2\2\u00fa\u0108\5*\26\n\u00fb\u00fc\f\b\2\2\u00fc\u00fd\7\34\2\2\u00fd"+
		"\u0108\5*\26\t\u00fe\u00ff\f\7\2\2\u00ff\u0100\7\35\2\2\u0100\u0108\5"+
		"*\26\b\u0101\u0102\f\6\2\2\u0102\u0103\7\17\2\2\u0103\u0108\5*\26\7\u0104"+
		"\u0105\f\5\2\2\u0105\u0106\7\20\2\2\u0106\u0108\5*\26\6\u0107\u00e3\3"+
		"\2\2\2\u0107\u00e6\3\2\2\2\u0107\u00e9\3\2\2\2\u0107\u00ec\3\2\2\2\u0107"+
		"\u00ef\3\2\2\2\u0107\u00f2\3\2\2\2\u0107\u00f5\3\2\2\2\u0107\u00f8\3\2"+
		"\2\2\u0107\u00fb\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0101\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a+\3\2\2\2\u010b\u0109\3\2\2\2\26/\66;AN\\dmpz\u0087\u0095\u009c"+
		"\u00b5\u00b8\u00bd\u00c9\u00e1\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}