package proyectox;
public interface TDA_Grafo {
    public void print();
    public boolean AgregarNodo();
    public boolean AgregarArista(int n_principio, int n_fin, int peso);
    public boolean BorrarArista(int pos_principio, int pos_final);
    public boolean BorrarNodo(int pos);
    public void delete();
}
