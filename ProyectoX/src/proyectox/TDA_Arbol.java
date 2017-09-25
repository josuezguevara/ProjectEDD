package proyectox;

import java.util.ArrayList;

public class TDA_Arbol {

    private ArrayList<Arbol> listaarbol = new ArrayList();
    private ArrayList<Nodo> listanodo = new ArrayList();
    private Object dato;
    private Arbol raiz;
    private Nodo izquierda;
    private Nodo derecha;
    private int nivel = 0;

    public TDA_Arbol() {
        //this();
    }

    public void crearArbol(Object x) {
        raiz = new Arbol();
        listaarbol.add(new Arbol());
        nivel = 1;

    }

    public Object desctruirArbol() {
        Object x;
        if (existe()) {
            raiz = (null);
            listaarbol.remove(raiz);
        }
        return listaarbol;

    }

    public boolean existe() {
        if (nivel == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void CrearNodoIzquierda(Object x) {
        izquierda = new Nodo(dato);
        listanodo.add(0, izquierda);
    }

    public void CrearNodoDerecha(Object x) {
        derecha = new Nodo(dato);
        listanodo.add(0, derecha);

    }
}