// Generated from ucsp\compiladores\expr\parser\Expresiones.g4 by ANTLR 4.9.1
package ucsp.compiladores.expr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpresionesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpresionesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExpresionesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ExpresionesParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(ExpresionesParser.NlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(ExpresionesParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ExpresionesParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExpresionesParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ExpresionesParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ExpresionesParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(ExpresionesParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ExpresionesParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#tipobase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipobase(ExpresionesParser.TipobaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#declvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclvar(ExpresionesParser.DeclvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(ExpresionesParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#cmdif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdif(ExpresionesParser.CmdifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#cmdwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdwhile(ExpresionesParser.CmdwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#cmdasign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdasign(ExpresionesParser.CmdasignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(ExpresionesParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#listaexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaexp(ExpresionesParser.ListaexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#cmdreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdreturn(ExpresionesParser.CmdreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpresionesParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionesParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ExpresionesParser.ExpContext ctx);
}