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
import java.util.ArrayList;
import java1.uac.Grafo;
import java1.uac.LimiteException;

public class AlgoritmoDijsktra {

    private int mCostos[][];
    private int ultimo[]; //se guardan los caminos
    private int D[]; // se guarda los caminos minimos
    private boolean F[]; //vetices visitados
    private int s, n;

    public AlgoritmoDijsktra(int s, Grafo<Integer> g) throws LimiteException {
        n = g.ordenGrafo();
        this.s = s;
        mCostos = insMatriz(g);
        ultimo = new int[n];
        D = new int[n];
        F = new boolean[n];
    }

    public void caminoMinimos() {
        for (int i = 0; i < n; i++) {
            F[i] = false;
            D[i] = mCostos[s][i];
            ultimo[i] = n;
        }
        F[s] = true;
        D[s] = 0;

        for (int i = 0; i < n; i++) {
            int v = minimo();

            F[v] = true;

            for (int w = 0; w < n; w++) {
                if (!F[w]) {
                    if ((D[v] + mCostos[v][w]) < D[w]) {
                        D[w] = D[v] + mCostos[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Costo minimo a " + i + ": " + D[i]);
        }
    }

    public int minimo() {
        int mx = Grafo.inf;
        int v = 1;
        for (int i = 0; i < n; i++) {
            if (!F[i] && (D[i] <= mx)) {
                v = i;
            }
        }
        return v;
    }

    private int[][] insMatriz(Grafo<Integer> g) throws LimiteException {
        int t = g.ordenGrafo();
        mCostos = new int[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                mCostos[i][j] = g.costoArco(i, j);
            }
        }
        return mCostos;
    }

    ArrayList<Integer> ruta = new ArrayList<Integer>();

    public ArrayList<Integer> ruta(int j) {
        if (j !=n) {
            ruta(ultimo[j]);
            if (D[j] != Grafo.inf) {
                System.out.println("Se recorrio de " + ultimo[j] + " a " + j);
                ruta.add(ultimo[j]);
                if (!ruta.contains(ultimo[j])) {
                    ruta.add(ultimo[j]);
                }
                if (!ruta.contains(j)) {
                    ruta.add(j);
                }
            } else {
                ruta.clear();
                ruta.add(-1);
            }
            System.out.println("No es posible llegar al destino desde el origne: "+s);
        }
        return ruta;
    }
    
    public ArrayList<Integer>sacar_repetido(ArrayList<Integer>j){
        ArrayList<Integer> j2 = new ArrayList<Integer>();
        for (int i = 0; i < j.size(); i++) {
            if (!j2.contains(j.get(i))) {
                j2.add(j.get(i));
            }
        }
        return j2;
    }
}
