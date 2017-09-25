/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectox;

/**
 *
 * @author usuario
 */

import java.lang.*;

public class Excepcion {//clase que se encarga si el usuario ingreso un dato incorrecto

    public String excepcion(String expresion) throws Exception {
        String expresion_limpia = sin_espacios(expresion);
        if (sihayParentesis(expresion_limpia)) {
            if (sihayOperadores(expresion_limpia)) {
                return expresion_limpia;
            } else {
                expresion_limpia = "O";
            }
        } else {
            expresion_limpia = "P";
        }
        return expresion_limpia;
    }

    private String sin_espacios(String expresion) {
        String aux = "";
        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i) != ' ') {
                aux = aux + expresion.charAt(i);
            }
        }
        return aux;
    }

    private boolean sihayParentesis(String expresion) {
        Object aux;
        Stack pila = new Stack();
        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i) == '(') {
                pila.add_pila(expresion.charAt(i));
            } else if (expresion.charAt(i) == ')') {
                if (pila.vacia()) {
                    return false;
                } else {
                    aux = pila.sacar_pila();
                }
            }
        }
        return (pila.vacia() == true);
    }

    private boolean sihayOperadores(String expresion) {//retorna falsa si son operadores

        String Exp_sinparent = limpiarParentesis(expresion);
        if (Operador(Exp_sinparent.charAt(0)) || (Operador(Exp_sinparent.charAt(Exp_sinparent.length() - 1)))) {//si al inicio o  final de la expresion tiene parentesis
            return false;
        } else {
            boolean sw = true;
            for (int i = 1; i < Exp_sinparent.length() - 1; i++) {
                if (Operador(Exp_sinparent.charAt(i)) && (Operador(Exp_sinparent.charAt(i + 1)))) {
                    return false;
                }
            }
            return sw;
        }
    }

    private String limpiarParentesis(String expresion) {
        String aux = "";
        for (int i = 0; i < expresion.length(); i++) {
            if ((expresion.charAt(i) != '(') && (expresion.charAt(i) != ')')) {
                aux = aux + expresion.charAt(i);
            }
        }
        return aux;
    }

    private boolean Operador(char x) {//meotodo para saber si es un operador
        boolean sw = false;
        switch (x) {
            case '+':
                sw = true;
                break;
            case '-':
                sw = true;
                break;
            case '*':
                sw = true;
                break;
            case '/':
                sw = true;
                break;
            case '^':
                sw = true;
                break;

        }
        return sw;
    }
}
