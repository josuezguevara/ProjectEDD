package proyectox;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this(null);
    }

    public Arbol(Nodo raiz) {
        this.setRaiz(raiz);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
