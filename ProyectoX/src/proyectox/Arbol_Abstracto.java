package proyectox;
public abstract class Arbol_Abstracto {
    public abstract String print();
    public abstract boolean isEmpty();
    public abstract void raiz(Object objeto);
    public abstract void hoja(Object padre, Object hijo);
    public abstract void remove(Object objeto);
    public abstract void clear();
    public abstract boolean exists(Object objeto);
    public abstract boolean isHoja();
}
