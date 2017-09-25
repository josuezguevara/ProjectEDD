package proyectox;

public class Nodo {

    private Object dato;
    private Nodo hijoizquierda;
    private Nodo hijoderecha;
    private Nodo hermanoderecha;
    private Nodo hermanoizquierda;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo(Object dato, Nodo hijoizquierda, Nodo hijoderecha, Nodo hermanoderecha, Nodo hermanoizquierda, Nodo izquierda, Nodo derecha) {
        this.dato = dato;
        this.hijoizquierda = hijoizquierda;
        this.hijoderecha = hijoderecha;
        this.hermanoderecha = hermanoderecha;
        this.hermanoizquierda = hermanoizquierda;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getHijoizquierda() {
        return hijoizquierda;
    }

    public void setHijoizquierda(Nodo hijoizquierda) {
        this.hijoizquierda = hijoizquierda;
    }

    public Nodo getHijoderecha() {
        return hijoderecha;
    }

    public void setHijoderecha(Nodo hijoderecha) {
        this.hijoderecha = hijoderecha;
    }

    public Nodo getHermanoderecha() {
        return hermanoderecha;
    }

    public void setHermanoderecha(Nodo hermanoderecha) {
        this.hermanoderecha = hermanoderecha;
    }

    public Nodo getHermanoizquierda() {
        return hermanoizquierda;
    }

    public void setHermanoizquierda(Nodo hermanoizquierda) {
        this.hermanoizquierda = hermanoizquierda;
    }

}
