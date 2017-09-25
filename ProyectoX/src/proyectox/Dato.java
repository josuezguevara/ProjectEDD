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
public class Dato {

    private String valor;
    private boolean operador;

    public Dato() {
        operador = false;
        valor = "";
    }

    public Dato(String va, boolean op) {
        valor = va;
        operador = op;
    }

    public void setValor(String va) {
        this.valor = va;
    }

    public void setOperador(boolean op) {
        this.operador = op;
    }

    public String getValor() {
        return valor;
    }

    public boolean getOperador() {
        return operador;
    }
}
