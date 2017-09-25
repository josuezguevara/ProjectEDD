/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectox;

/**
 *
 * @author usuario
 */
public class Comprension {
    private static char charArray[]; //convertimos el string a arreglo de chars
    private static int tabla_frecuencia[] = new int[0x7f]; //mantiene la frecuencia del objeto
    private static Nodo_Bin miNodo[]; //es la la cola de prioridad, el arbol final generado se guarda en la pos 0
    private static int lengthTabla = 0;//el size de la tabla que contiene los caractteres
    private static Arbol_Bin miArbol; 
    private static int lengthdelNodo = 0;
    public static Descomprension hC; //La clase que se encarga de descomprimir  el  Arbol_Bin

    public Comprension(String texto) {
        FrecuenciaTabla(texto);
        OrdenarNodo();
        Nodo_Bin x = CrearNodo();
        hC = new Descomprension(x, charArray);
    }

    public static void FrecuenciaTabla(String texto) {
        int i;
        charArray = texto.toCharArray();
        for (i = 0; i < charArray.length; i++) {
            tabla_frecuencia[getAscii(charArray[i])] += 1;
        }
    }

    public static int getAscii(char substringValue) {
        return substringValue & 0x7f;
    }

    public static void OrdenarNodo() {
        int cont = 0;
        //int j = 0;
        for (int i = 0; i < tabla_frecuencia.length; i++) {
            if (tabla_frecuencia[i] > 0) {
                cont++;
            }
        }

        lengthTabla = cont;
        cont = 0;
        miNodo = new Nodo_Bin[lengthTabla];

        for (int i = 0; i < 127; i++) {
            if (tabla_frecuencia[i] != 0) {
                miNodo[cont] = new Nodo_Bin(tabla_frecuencia[i], (char) i, null, null);
                cont++;
            }
        }
        lengthdelNodo = miNodo.length;
        sort();

    }

    public static Nodo_Bin CrearNodo() {
        for (int i = 1; i < lengthdelNodo; i++) {
            try {
                if (miNodo[1].frecuencia >= miNodo[0].frecuencia) {
                    miArbol = new Arbol_Bin(miNodo[0], miNodo[i]);
                    miNodo[0] = miArbol;
                    moverObjetos(i, lengthdelNodo);
                    lengthdelNodo -= 1;
                    i -= 1;
                    sort();
                } else {
                    if (i + 1 < lengthdelNodo) {
                        miArbol = new Arbol_Bin(miNodo[i], miNodo[i + 1]);
                        miNodo[1] = miArbol;
                        moverObjetos(i + 1, lengthdelNodo);
                        sort();
                        lengthdelNodo -= 1;
                        i -= 1;
                    } else {
                        miNodo[1] = miNodo[i];
                        miNodo[0] = new Arbol_Bin(miNodo[0], miNodo[1]);
                    }
                }
            } catch (Exception e) {
                
            }
        }
        return miNodo[0];
    }

    private static void moverObjetos(int index, int length) {
        try {
            for (int i = index; i < length; i++) {
                miNodo[i] = miNodo[i + 1];
            }

        } catch (Exception e) {
            
        }
    }

    private static void sort() {
        Nodo_Bin temp;
        for (int i = lengthdelNodo - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (miNodo[j].frecuencia > miNodo[j + 1].frecuencia) {
                    temp = miNodo[j + 1];
                    miNodo[j + 1] = miNodo[j];
                    miNodo[j] = temp;
                }

                if (miNodo[j].frecuencia == miNodo[j + 1].frecuencia && miNodo[j].izquierda != null) {
                    temp = miNodo[j + 1];
                    miNodo[j + 1] = miNodo[j];
                    miNodo[j] = temp;
                }
            }
        }
    }
}
