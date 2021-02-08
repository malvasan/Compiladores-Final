// Generated from ucsp\compiladores\expr\parser\Expresiones.g4 by ANTLR 4.9.1
package ucsp.compiladores.expr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpresionesParser}.
 */
public interface ExpresionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExpresionesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExpresionesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExpresionesParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExpresionesParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(ExpresionesParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(ExpresionesParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(ExpresionesParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(ExpresionesParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ExpresionesParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ExpresionesParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ExpresionesParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ExpresionesParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ExpresionesParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ExpresionesParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExpresionesParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExpresionesParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ExpresionesParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ExpresionesParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ExpresionesParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ExpresionesParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void enterTipobase(ExpresionesParser.TipobaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void exitTipobase(ExpresionesParser.TipobaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(ExpresionesParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(ExpresionesParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(ExpresionesParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(ExpresionesParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void enterCmdif(ExpresionesParser.CmdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void exitCmdif(ExpresionesParser.CmdifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdwhile(ExpresionesParser.CmdwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdwhile(ExpresionesParser.CmdwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#cmdasign}.
	 * @param ctx the parse tree
	 */
	void enterCmdasign(ExpresionesParser.CmdasignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#cmdasign}.
	 * @param ctx the parse tree
	 */
	void exitCmdasign(ExpresionesParser.CmdasignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(ExpresionesParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(ExpresionesParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(ExpresionesParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(ExpresionesParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#cmdreturn}.
	 * @param ctx the parse tree
	 */
	void enterCmdreturn(ExpresionesParser.CmdreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#cmdreturn}.
	 * @param ctx the parse tree
	 */
	void exitCmdreturn(ExpresionesParser.CmdreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpresionesParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpresionesParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionesParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ExpresionesParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionesParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ExpresionesParser.ExpContext ctx);
}