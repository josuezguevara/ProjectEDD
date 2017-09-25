/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectox;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Calculadora {

    public Calculadora() {
    }

    public double calcular(String Expresion) throws Exception {//calculamos el resultado
        double resultado = 0;
        String aux = Expresion;
        Excepcion excep = new Excepcion();//clase responsable que el usaurio no ingrese letras o parentesis sin completar
        aux = excep.excepcion(aux);
        if (aux.equals("P") || aux.equals("O")) {
            if (aux.equals("P")) {
                throw new Exception("Verificar los paréntesis. Gracias.");
            } else {
                throw new Exception("El número de operadores no es correcto. Gracias.");
            }
        } else {
            Expresion ex;
            ex = new Expresion(aux);
            ArrayList exp = ex.CompletoPrefija();
            if ((exp.size() != 0) && (exp.size() != 2)) {//validamos si la expresion esta escrita bien
                Arbol_Exp ar_exp = new Arbol_Exp(exp);
                resultado = ar_exp.Evaluar();
            } else {
                throw new Exception("Verifique la expresión. Gracias.");
            }
        }
        return resultado;
    }
}
