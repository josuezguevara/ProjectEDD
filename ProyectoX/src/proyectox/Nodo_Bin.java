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
public class Nodo_Bin {
 public int frecuencia;
    public char c;
    public Nodo_Bin izquierda;
    public Nodo_Bin derecha;

    public Nodo_Bin(int frecuencia, char c, Nodo_Bin izquierda, Nodo_Bin derecha) {
        this.frecuencia = frecuencia;
        this.c = c;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Nodo_Bin() {
        
    }

    public Nodo_Bin agregarNodo(Nodo_Bin nodo1, Nodo_Bin nodo2) {
        if (nodo1.frecuencia < nodo2.frecuencia) {
            izquierda = nodo1;
            derecha = nodo2;
        } else {
            derecha = nodo1;
            izquierda = nodo2;
        }
        frecuencia = nodo1.frecuencia + nodo2.frecuencia;

        return this;
    }
   
}
