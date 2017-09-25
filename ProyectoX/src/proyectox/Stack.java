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
public class Stack {

    private Object v[];
    private int tope, max;

    public Stack() {
        max = 100;
        v = new Object[max];
        tope = -1;
    }

    public Stack(int max) {
        this.max = max;
        v = new Object[max];
        tope = -1;
    }

    public boolean vacia() {
        return tope == -1;
    }

    public boolean llena() {
        return tope == max - 1;
    }

    public void add_pila(Object dato) {//agregar dato a la pila
        if (!llena()) {
            v[++tope] = dato;
        } else {
            System.out.println("La pila esta llena!");
        }
    }

    public Object sacar_pila() {//sacar de la pila
        Object dato = null;
        if (!vacia()) {
            dato = v[tope--];
        } else {
            System.out.println("La Pila esta vacia!");
        }
        return dato;
    }

    public Object Tope() {
        if (!vacia()) {
            return v[tope];
        } else {
            return null;
        }
    }
}
