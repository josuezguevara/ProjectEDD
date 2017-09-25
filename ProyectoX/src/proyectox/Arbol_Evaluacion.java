package proyectox;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arbol_Evaluacion extends Arbol_Abstracto{
    private Empleado raiz;
    private ArrayList <Arbol_Evaluacion> arbol = new ArrayList();

    public Arbol_Evaluacion(Empleado raiz) {
        this.raiz = raiz;
    }

    public Empleado getRaiz() {
        return raiz;
    }

    public void setRaiz(Empleado raiz) {
        this.raiz = raiz;
    }

    public ArrayList<Arbol_Evaluacion> getArbol() {
        return arbol;
    }

    public void setArbol(ArrayList<Arbol_Evaluacion> arbol) {
        this.arbol = arbol;
    }

    private String printRoot() {
        return "•" + raiz.getNombre() + " " + raiz.getEvaluacion() + "\n";
    }
    
    private String printHijo(String espacio) {
        String empleados = "";
        for (Arbol_Evaluacion t : arbol) {
            empleados += espacio + "-> " + t.getRaiz().getNombre() + " " + t.getRaiz().getEvaluacion() + "\n";
            if (!t.isHoja()) {
                empleados += t.printHijo(espacio + "   ");
            }
        }
        return empleados;
    }
    
    public void Evaluaciones() {
        if (!isHoja()) {
            int acum = 0;
            for (Arbol_Evaluacion t : arbol) {
                if (t.isHoja()) {
                    acum += t.getRaiz().getValor();
                } else {
                    t.Evaluaciones();
                    acum += t.getRaiz().getEvaluacion();
                }
                raiz.setEvaluacion(acum/arbol.size());
            }
        }
    }
    
    @Override
    public String print() {
        String empleados = "";
        empleados += printRoot();
        empleados += printHijo("   ");
        return empleados;
    }

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }

    @Override
    public void raiz(Object objeto) {
        if (objeto instanceof Empleado)
            raiz = (Empleado) objeto;
    }

    @Override
    public void hoja(Object padre, Object hijo) {
        if (padre instanceof Empleado && hijo instanceof Empleado && raiz != null) {
            if(raiz.equals((Empleado)padre)) {
                arbol.add(new Arbol_Evaluacion((Empleado)hijo));
            } else {
                arbol.forEach((t) -> {
                   t.hoja(padre, hijo);
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente");
        }
    }

    @Override
    public void remove(Object objeto) {
        if (objeto instanceof Empleado) {
            if (raiz.equals(objeto)) {
                clear();
            } else {
                for (int i = 0; i < arbol.size(); i++) {
                    arbol.get(i).remove(objeto);
                    if (arbol.get(i).isEmpty()) {
                        arbol.remove(i);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No es un empleado!");
        }
    }

    @Override
    public void clear() {
        raiz = null;
        arbol.clear();
    }

    @Override
    public boolean exists(Object objeto) {
        if (objeto instanceof Integer) {
            int id = (Integer) objeto;
            if (id == raiz.getId()) {
                return true;
            } else {
                if (arbol.stream().anyMatch((t) -> (t.exists(objeto)))) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public boolean isHoja() {
        return arbol.isEmpty();
    }
    
    public void CambiarEmpleado(String nombre, String area, int valor, Empleado empleado) {
        if (raiz.equals(empleado)) {
            if (!nombre.equals(raiz.getNombre())) {
                raiz.setNombre(nombre);
                empleado.setNombre(nombre);
                JOptionPane.showMessageDialog(null, "El nombre se ha modificado exitosamente");
            }
            if (!area.equals(raiz.getArea())) {
                raiz.setArea(area);
                empleado.setArea(area);
                JOptionPane.showMessageDialog(null, "El área se ha modificado exitosamente");
            }
            if (isHoja()) {
                if (valor!= raiz.getValor()) {
                    raiz.setValor(valor);
                    empleado.setValor(valor);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Ocurrió un error!");
            }
        } else {
            arbol.forEach((t) -> {
               t.CambiarEmpleado(nombre, area, valor, empleado);
            });
        }
    }
}
