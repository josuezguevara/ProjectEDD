/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectox;

import floyd_dijkstra.AlgoritmoDijsktra;
import floyd_dijkstra.CaminosCortos;
import java.security.Principal;
import java.util.Scanner;
import java1.uac.Grafo;
import java1.uac.GrafoCol;
import java1.uac.LimiteException;

/**
 *
 * @author Usuario Dell
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    Grafo<Integer> crear() throws LimiteException {
        Grafo<Integer> g = new GrafoCol<>();

        g.insVertice(0);
        g.insVertice(1);
        g.insVertice(2);
        g.insVertice(3);
        g.insVertice(4);

        g.insArco(0, 1, 55);
        g.insArco(0, 2, 110);
        g.insArco(0, 3, 79);

        g.insArco(2, 0, 123);
        g.insArco(2, 3, 40);
        g.insArco(2, 4, 180);

        g.insArco(3, 2, 89);
        g.insArco(3, 4, 105);

        return g;

    }

    public static void main(String[] args) throws LimiteException {
        // TODO code application logic here}
        char r = 's';
        int opcion;
        Scanner sc = new Scanner(System.in);
        while (r == 's' || r == 'S') {
            System.out.println(" Menu ");
            System.out.println("1 Floyd ");
            System.out.println("2 Dijkstra ");
            System.out.println("3 Ejercicios en GUI ");
            System.out.println("4 Salir ");
            System.out.println("Ingrese una opcion ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    CaminosCortos rutafloyd = new CaminosCortos(9);
                    long matrizA[][] = {
                        {0, 4, 5, 999999999, 999999999},
                        {999999999, 0, 3, 5, 7},
                        {5, 3, 0, 2, 999999999},
                        {999999999, 5, 999999999, 0, 4},
                        {999999999, 7, 999999999, 4, 0}};
                    System.out.println(rutafloyd.alritmoFloyd(matrizA));

                    break;
                case 2:
                    Project ob = new Project();
                    Grafo<Integer> crear = ob.crear();
                    System.out.println("Indique el vertice de origen ");
                    int origen = sc.nextInt();
                    AlgoritmoDijsktra camino = new AlgoritmoDijsktra(origen, crear);
                    camino.caminoMinimos();
                    System.out.println("Indique el vetice a llegar ");
                    int ruta = sc.nextInt();
                    camino.ruta(ruta);

                    break;
                case 3:
                    Ventana pr = new Ventana();

                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
