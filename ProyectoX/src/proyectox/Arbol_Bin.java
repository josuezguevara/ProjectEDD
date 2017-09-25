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
public class Arbol_Bin  extends Nodo_Bin{
    private Nodo_Bin raiz;

    public Arbol_Bin() {
        raiz = null;
    }

    public Arbol_Bin(Nodo_Bin nodo1, Nodo_Bin nodo2) {
        raiz = super.agregarNodo(nodo1, nodo2);
    }

    public void insertarNodo(int freq, char c) {
        raiz.frecuencia = freq;
        raiz.c = c;
        raiz.izquierda = null;
        raiz.derecha = null;
    }

    public void insertarNodo(int freq, char c, Nodo_Bin izquierda, Nodo_Bin derecha) {
        raiz.frecuencia = freq;
        raiz.c = c;
        this.raiz.izquierda = izquierda;
        this.raiz.derecha = derecha;
    }

    public void insertarNodo(Nodo_Bin nodo) {
        this.raiz.frecuencia = nodo.frecuencia;
        this.raiz.c = nodo.c;
        this.raiz.izquierda = nodo.izquierda;
        this.raiz.derecha = nodo.derecha;
    }

    public void insertarNodo(Nodo_Bin nodo1, Nodo_Bin nodo2) {
        raiz = super.agregarNodo(nodo1, nodo2);
    }
}
