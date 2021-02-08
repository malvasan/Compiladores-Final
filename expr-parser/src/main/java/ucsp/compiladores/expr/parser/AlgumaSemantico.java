/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.expr.parser;

import ucsp.compiladores.expr.parser.TablaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends ExpresionesBaseVisitor<Void>{
    TablaDeSimbolos tabla;
    
    @Override
    public Void visitPrograma(ExpresionesParser.ProgramaContext ctx) {
        tabla = new TablaDeSimbolos();
        return super.visitPrograma(ctx);
    }
    
    @Override
    public Void visitDeclvar(ExpresionesParser.DeclvarContext ctx) {
        String nombreVar = ctx.ID().getText();
        String strTipoVar = ctx.tipo().tipobase().getText();
        TipoAlguma tipoVar = TipoAlguma.INVALIDO;
        switch (strTipoVar) {
            case "int":
                tipoVar = TipoAlguma.ENTERO;
                break;
            case "bool":
                tipoVar = TipoAlguma.BOOLEANO;
                break;
            case "char":
                tipoVar = TipoAlguma.CARACTER;
                break;
            case "string":
                tipoVar = TipoAlguma.CONJUNTO_CARACTERES;
                break;
            case "[]char":
                tipoVar = TipoAlguma.CONJUNTO_CARACTERES;
                break;
            default:
                break;
        }
        // Verificar si la variable ya fue declarada
        if (tabla.existe(nombreVar)) {
        AlgumaSemanticoUtils.adicionarErrorSemantico(ctx.ID().getSymbol(), "Variable" + nombreVar + " ya existe");
        } else {
        tabla.adicionar(nombreVar, tipoVar);
        }
        return super.visitDeclvar(ctx);
    }
    
    @Override
    public Void visitCmdasign(ExpresionesParser.CmdasignContext ctx) {
    TipoAlguma tipoExpresion = AlgumaSemanticoUtils.verificarTipo(tabla,ctx.exp());
    if (tipoExpresion != TipoAlguma.INVALIDO) {
        String nombreVar = ctx.var().ID().getText();
        if (!tabla.existe(nombreVar)) {
        AlgumaSemanticoUtils.adicionarErrorSemantico(ctx.var().ID().getSymbol(), "Variable " + nombreVar + " no fue declarada antes de uso");
        } 
        else {
            TipoAlguma tipoVariable = AlgumaSemanticoUtils.verificarTipo(tabla,nombreVar);
            if (tipoVariable != tipoExpresion && tipoExpresion != TipoAlguma.INVALIDO) {
                AlgumaSemanticoUtils.adicionarErrorSemantico(ctx.var().ID().getSymbol(), "Tipo de la variable " + nombreVar + " no es compatible con el tipo de la expresión");
            }
        }
    }
    return super.visitCmdasign(ctx);
    }
    
    @Override
    public Void visitExp(ExpresionesParser.ExpContext ctx) {
        AlgumaSemanticoUtils.verificarTipo(tabla, ctx);
        return super.visitExp(ctx);
    }
}
