/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.expr.parser;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    
    
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        ExpresionesLexer lexer = new ExpresionesLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpresionesParser parser = new ExpresionesParser(tokens);
        ExpresionesParser.ProgramaContext arbol = parser.programa();
        AlgumaSemantico as = new AlgumaSemantico();
        as.visitPrograma(arbol);
        AlgumaSemanticoUtils.erroresSemanticos.forEach((s) -> System.out.println(s));
    }
}
