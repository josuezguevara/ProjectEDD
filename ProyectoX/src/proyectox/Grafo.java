package proyectox;

import java.util.ArrayList;

public class Grafo {
    ArrayList<Nodo_Grafo> nodos = new ArrayList();

    public Grafo() {
    }

    public ArrayList<Nodo_Grafo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo_Grafo> nodos) {
        this.nodos = nodos;
    }

    @Override
    public String toString() {
        return "Grafo: " + nodos;
    }
}