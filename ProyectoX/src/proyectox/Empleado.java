package proyectox;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private int id;
    private String area;
    private int valor;
    private int evaluacion;

    public Empleado() {
    }    

    public Empleado(String nombre, int id, String area, int valor) {
        this.nombre = nombre;
        this.id = id;
        this.area = area;
        this.valor = valor;
        this.evaluacion = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        if (evaluacion != 0) {
            this.evaluacion = evaluacion;
        } else {
            this.evaluacion = this.valor;     
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null) {
            return false;
        }
        if(getClass() != objeto.getClass()) {
            return false;
        }
        final Empleado otro = (Empleado) objeto;
        if (this.valor != otro.valor) {
            return false;
        }
        return Objects.equals(this.nombre, otro.nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return nombre + ", " + id;
    }
}
