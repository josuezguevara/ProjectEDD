/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd_dijkstra;

import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Nodo {
    int nodoIni,nodofinal;
    int peso;
    int posicion;
    
    int nodoizquierda,nododerecha,nodopadre;
    Object elemento;
    ArrayList<Integer> adyacent = new ArrayList();
    
    int indice;

    public Nodo() {
        
    }

    public Nodo(int indice) {
        this.indice = indice;
    }
    
    

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNodoizquierda() {
        return nodoizquierda;
    }

    public void setNodoizquierda(int nodoizquierda) {
        this.nodoizquierda = nodoizquierda;
    }

    public int getNododerecha() {
        return nododerecha;
    }

    public void setNododerecha(int nododerecha) {
        this.nododerecha = nododerecha;
    }

    public int getNodopadre() {
        return nodopadre;
    }

    public void setNodopadre(int nodopadre) {
        this.nodopadre = nodopadre;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public ArrayList<Integer> getAdyacent() {
        return adyacent;
    }

    public void setAdyacent(ArrayList<Integer> adyacent) {
        this.adyacent = adyacent;
    }

    public boolean agregarAdyacent(int adyacent){
        this.adyacent.add(adyacent);
        return true;
    }
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

   
    
    
    
    
}
