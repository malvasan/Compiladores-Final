/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.expr.parser;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import ucsp.compiladores.expr.parser.ExpresionesParser.ExpContext;


public class AlgumaSemanticoUtils {
    
    public static List<String> erroresSemanticos = new ArrayList<>();

    public static void adicionarErrorSemantico(Token t, String mensaje) {
        int linea = t.getLine();
        int columna = t.getCharPositionInLine();
        erroresSemanticos.add(String.format("Error semantico %d:%d - %s", linea, columna, mensaje));
    }
    
    public static TablaDeSimbolos.TipoAlguma verificarTipo(TablaDeSimbolos tabla, ExpresionesParser.ExpContext ctx) {
        
        if (ctx.LITNUMERAL() != null) {
            return TablaDeSimbolos.TipoAlguma.ENTERO;
        }
        if (ctx.LITSTRING() != null) {
            return TablaDeSimbolos.TipoAlguma.CONJUNTO_CARACTERES;
        }
        if (ctx.TRUE()!= null) {
            return TablaDeSimbolos.TipoAlguma.BOOLEANO;
        }
        if (ctx.FALSE()!= null) {
            return TablaDeSimbolos.TipoAlguma.BOOLEANO;
        }
        if (ctx.var() != null) {
            String nombreVar = ctx.var().ID().getText();
            if (!tabla.existe(nombreVar)) {
            adicionarErrorSemantico(ctx.var().ID().getSymbol(), "Variable " + nombreVar +
           " no fue declarada antes de uso"); //getSymbol retorna el token que tiene línea y columna
            return TablaDeSimbolos.TipoAlguma.INVALIDO;
            }
            return verificarTipo(tabla, nombreVar);
        }
        if (ctx.tipo()!= null) {
            String strTipoVar =ctx.tipo().getText();
            switch (strTipoVar) {
            case "int":
                return TablaDeSimbolos.TipoAlguma.ENTERO;
            case "bool":
                return TablaDeSimbolos.TipoAlguma.BOOLEANO;
            case "char":
                return TablaDeSimbolos.TipoAlguma.CARACTER;
            case "string":
                return TablaDeSimbolos.TipoAlguma.CONJUNTO_CARACTERES;
            case "[] char":
                return TablaDeSimbolos.TipoAlguma.CONJUNTO_CARACTERES;
            default:
                break;
            }
        }
        if (ctx.exp()!= null) {
            if (ctx.CorcheteDerecho()== null && ctx.ParentesisDerecho()== null && ctx.NOT()== null) {
                TablaDeSimbolos.TipoAlguma ret = null;
                for (ExpContext ta : ctx.exp()) {
                    TablaDeSimbolos.TipoAlguma aux = verificarTipo(tabla, ta);
                    if (ret == null) {
                        ret = aux;
                    } else if (ret != aux && aux != TablaDeSimbolos.TipoAlguma.INVALIDO) {
                        adicionarErrorSemantico(ctx.start, "Expresión " + ctx.getText() + " contiene tipos incompatibles");
                        ret = TablaDeSimbolos.TipoAlguma.INVALIDO;
                    }
                }
                return ret;
            }
        }
        return TablaDeSimbolos.TipoAlguma.INVALIDO;
}

    
    
    public static TablaDeSimbolos.TipoAlguma verificarTipo(TablaDeSimbolos tabla, String nombreVar) {
        return tabla.verificar(nombreVar);
    }
}
