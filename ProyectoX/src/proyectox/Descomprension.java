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
public class Descomprension {
    private Nodo_Bin Nodo_raiz;
    private char c;
    private char charArray[];
    public String binario_final = "";

    public Descomprension(Nodo_Bin miNodo, char[] charArray) {
        String temp;
        Nodo_raiz = miNodo;
        this.charArray = charArray;
        for (int i = 0; i < charArray.length; i++) {
            temp = binario(Nodo_raiz, "", charArray[i]);
            binario_final += temp + " ";
        }
    }

    public String binario(Nodo_Bin raizNodo, String texto, char myChar) {
        String bin_final = "";
        if (raizNodo != null) {//si la raiz no esta vacia
            if (raizNodo.izquierda != null) {
                bin_final = binario(raizNodo.izquierda, texto + "0", myChar);
            }
            if (raizNodo.c == myChar) {
                return texto;
            } else {
                if (bin_final == "") {
                    return binario(raizNodo.derecha, texto + "1", myChar);
                } else {
                    return bin_final;
                }
            }
        } else {
            return "";
        }
    }
}
