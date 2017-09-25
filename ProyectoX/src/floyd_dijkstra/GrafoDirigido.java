/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd_dijkstra;

/**
 *
 * @author Usuario Dell
 */
public class GrafoDirigido {

    int[][] adyacencia;
    int size = 0;
    int nodosmax;
    int INF = (int) Double.POSITIVE_INFINITY;

    public GrafoDirigido(int nodosMaximos) {
        this.nodosmax = nodosMaximos;
        adyacencia = new int[nodosMaximos][nodosMaximos];
        for (int i = 0; i < nodosMaximos; i++) {
            for (int j = 0; j < nodosMaximos; j++) {
                adyacencia[i][j] = INF;
            }
        }
    }

    public boolean agregarNodo() {
        size++;
        return true;
    }

    public boolean agregarArista(int nodoi, int nodof, int peso) {
        if (nodoi < size && nodof < size) {
            adyacencia[nodoi][nodof] = peso;
            return true;
        } else {
            return false;
        }
    }

    public void imprimirGrafo() {
        System.out.print(" ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(" [" + i + "] ");
        }
        System.out.println(" ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(" [" + i + "] ");
            for (int j = 0; j < this.size; j++) {
                if (adyacencia[i][j] == INF) {
                    System.out.print( "[ 999 ]");
                } else {
                    System.out.print("[ "+adyacencia[i][j] + " ]");
                }
            }
            System.out.println("");
        }
    }
}
