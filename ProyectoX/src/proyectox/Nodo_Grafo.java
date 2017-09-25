package proyectox;

import java.util.ArrayList;

public class Nodo_Grafo {
    ArrayList<Arista> arista = new ArrayList();
    String color;

    public Nodo_Grafo() {
    }

    public Nodo_Grafo(String color) {
        this.color = color;
    }

    public ArrayList<Arista> getArista() {
        return arista;
    }

    public void setArista(ArrayList<Arista> arista) {
        this.arista = arista;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}