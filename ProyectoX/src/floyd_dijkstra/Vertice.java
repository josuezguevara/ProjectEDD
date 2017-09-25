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
public class Vertice {
    int peso;
    int procedencia;

    public Vertice() {
    }

    public Vertice(int peso, int procedencia) {
        this.peso = peso;
        this.procedencia = procedencia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(int procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Vertice{" + "peso=" + peso + ", procedencia=" + procedencia + '}';
    }
    
    
    
            
    
}
