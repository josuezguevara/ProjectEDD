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
public class Arbol_Exp {

    private Nodo_Exp Raiz;
    private int cant_nodos;

    public Arbol_Exp() {
        this.Raiz = null;
        this.cant_nodos = 0;
    }

    public Arbol_Exp(ArrayList expresion) {
        Object aux = expresion.get(0);//capturamos el primer dato
        Dato dato = new Dato();
        dato.setValor(aux.toString());
        if (operador(aux)) {//es operador
            dato.setOperador(true);
        } else {//es operando
            dato.setOperador(false);
        }
        Nodo_Exp nodo;
        Nodo_Exp nodo2 = new Nodo_Exp(dato);
        Stack pila = new Stack();//clase pila
        boolean antesOperando = false;
        Raiz = nodo2;
        for (int i = 1; i < expresion.size(); i++) {
            Object aux2 = expresion.get(i);
            Dato dato_aux = new Dato(aux2.toString(), false);
            if (operador(aux2)) {
                dato_aux.setOperador(true);
            }
            nodo = new Nodo_Exp(dato_aux);
            if (antesOperando) {
                nodo2 = (Nodo_Exp) pila.sacar_pila();
                nodo2.setHijoDerecha(nodo);
            } else {
                nodo2.setHijoIzquierda(nodo);
                pila.add_pila(nodo2);
            }
            nodo2 = nodo;
            if (operador(expresion.get(i))) {//si es operador 
                antesOperando = false;
            } else {//si no lo es
                antesOperando = true;
            }
        }

    }

    public boolean Hoja(Nodo_Exp R) {//rotorna los hijos vacios
        return ((R.getHijoIzquierda() == null) && (R.getHijoDerecha() == null));
    }

    public void setRaiz(Nodo_Exp R) {
        if (R != null) {
            this.Raiz = R;
            cant_nodos++;
        } else {
            this.Raiz = R;
        }
    }

    public Nodo_Exp getRaiz() {
        return this.Raiz;
    }

    public int getNodos() {
        return cant_nodos;
    }

    private boolean operador(Object c) {//metodo para saber si es un operador el que ingreso
        char operadores[] = {'+', '-', '*', '/', '^'};
        boolean existe = false;
        char aux = c.toString().charAt(0);//convertimos el objeto a string luego a char
        for (int i = 0; ((i < 5) && (!existe)); i++) {
            if (aux == operadores[i]) {
                existe = true;
            }
        }
        return existe;
    }

    public double Evaluar() {
        return Evaluar(Raiz);
    }

    private double Evaluar(Nodo_Exp nodo) {//metodo donde evualuamos la expresion
        double res = 0;
        if (nodo == null) {
            return res = 0;
        } else {
            if (Hoja(nodo)) // Operando
            {
                String aux = nodo.getData().getValor();
                res = Double.parseDouble(aux);
            } else {//operador
                double vizq = Evaluar(nodo.getHijoIzquierda());
                double vder = Evaluar(nodo.getHijoDerecha());
                Character caracter = nodo.getData().getValor().charAt(0);//pasamos a char con La clase Character
                switch (caracter) {
                    case '+':
                        res = vizq + vder;
                        break;
                    case '-':
                        res = vizq - vder;
                        break;
                    case '*':
                        res = vizq * vder;
                        break;
                    case '/':
                        res = vizq / vder;
                        break;
                    case '^':
                        res = Math.pow(vizq, vder);
                        break;
                    default:;
                        break;
                }
            }
        }
        return res;
    }
}
