/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucsp.compiladores.expr.parser;

import java.util.LinkedList;
import java.util.List;

public class Ambitos {
    
    private LinkedList<TablaDeSimbolos> pilaDeTablas;
    
    public Ambitos() {
        pilaDeTablas = new LinkedList<>();
        crearNuevoAmbito();
    }
    public void crearNuevoAmbito() {
        pilaDeTablas.push(new TablaDeSimbolos());
    }
    public TablaDeSimbolos verAmbitoActual() {
        return pilaDeTablas.peek();
    }
    public List<TablaDeSimbolos> recorrerAmbitosAnidados() {
        return pilaDeTablas;
    }
    public void abandonarAmbito() {
        pilaDeTablas.pop();
    }
}
