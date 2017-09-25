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
public class Nodo_Exp {

    private Nodo_Exp Hijo_Izquierda;
    private Dato Data;
    private Nodo_Exp Hijo_Derecha;

    public Nodo_Exp() {
        Data = new Dato();
        Hijo_Izquierda = null;
        Hijo_Derecha = null;
    }

    public Nodo_Exp(Dato dato) {
        this.Data = dato;
        this.Hijo_Izquierda = null;
        this.Hijo_Derecha = null;
    }

    public Nodo_Exp(Nodo_Exp Hizquierda, Dato dato, Nodo_Exp Hder) {
        this.Data.setValor(dato.getValor());
        this.Data.setOperador(dato.getOperador());
        this.Hijo_Izquierda = Hizquierda;
        this.Hijo_Derecha = Hder;
    }

    public void setData(Dato dato) {
        this.Data.setValor(dato.getValor());
        this.Data.setOperador(dato.getOperador());
    }

    public void setHijoIzquierda(Nodo_Exp Hizq) {
        this.Hijo_Izquierda = Hizq;
    }

    public void setHijoDerecha(Nodo_Exp Hder) {
        this.Hijo_Derecha = Hder;
    }

    public Dato getData() {
        return this.Data;
    }

    public Nodo_Exp getHijoIzquierda() {
        return this.Hijo_Izquierda;
    }

    public Nodo_Exp getHijoDerecha() {
        return this.Hijo_Derecha;
    }
}
