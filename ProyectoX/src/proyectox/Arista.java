package proyectox;
public class Arista {
    private String nodo1;
    private String nodo2;

    public Arista() {
    }

    public Arista(String nodo1, String nodo2) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }

    public String getNodo1() {
        return nodo1;
    }

    public void setNodo1(String nodo1) {
        this.nodo1 = nodo1;
    }

    public String getNodo2() {
        return nodo2;
    }

    public void setNodo2(String nodo2) {
        this.nodo2 = nodo2;
    }

    @Override
    public String toString() {
        return "Arista: " + nodo1 + " y " + nodo2;
    }
}