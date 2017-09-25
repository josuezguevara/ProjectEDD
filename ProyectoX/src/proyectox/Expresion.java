/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectox;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Expresion {
    private String expresion;

    public Expresion() {
        expresion = "";
    }

    public String getExpresion() {
        return expresion;
    }

    public String Infija() {
        ArrayList a = inFija();
        String aux = "[ ";
        for (int i = 0; i < a.size(); i++) {
            if ((i + 1) == a.size()) {
                aux = aux + a.get(i).toString();
            } else {
                aux = aux + a.get(i).toString() + "  ";
            }
        }
        aux = aux + " ]";
        return aux;
    }

    private ArrayList inFija() {
        ArrayList infija = new ArrayList();
        String Expr = Clasica();
        int n = Expr.length() - 1;
        for (int i = 0; i <= n; i++) {
            infija.add(Expr.charAt(i));
        }
        return infija;
    }

    public String Prefija() {
        ArrayList a = preFija();
        String aux = "[ ";
        for (int i = 0; i < a.size(); i++) {
            if ((i + 1) == a.size()) {
                aux = aux + a.get(i).toString();
            } else {
                aux = aux + a.get(i).toString() + "  ";
            }
        }
        aux = aux + " ]";
        return aux;
    }

    public String Completo() throws Exception {
        ArrayList a = CompletoPrefija();
        String aux = "[ ";
        for (int i = 0; i < a.size(); i++) {
            if ((i + 1) == a.size()) {
                aux = aux + a.get(i).toString();
            } else {
                aux = aux + a.get(i).toString() + "  ";
            }
        }
        aux = aux + " ]";
        return aux;
    }

    public ArrayList CompletoPrefija() throws Exception {
        ArrayList sep = Separar();
        ArrayList completo = new ArrayList();
        int n = sep.size() - 1, j = 0;
        ArrayList pfija = preFija();
        for (int i = 0; ((i < pfija.size()) && (j <= n)); i++) {
            Character e1 = (Character) pfija.get(i);
            if (Character.isLetter(e1)) {
                completo.add(sep.get(j));
                j++;
            } else {
                completo.add(e1);
            }
        }
        return completo;
    }

    private ArrayList preFija() {

        Character c, d, e;
        int i, prioridadCima, prioridadOper;
        ArrayList expPre = new ArrayList();
        Stack aux = new Stack();
        Stack med = new Stack();
        Stack pre = new Stack();
        String expresion = Clasica();
        for (i = 0; i < expresion.length(); i++) {
            aux.add_pila(new Character(expresion.charAt(i)));
        }

        while (!aux.vacia()) {
            c = (Character) aux.sacar_pila();
            if (c.charValue() == ')') {
                med.add_pila(c);
            } else {
                if (c.charValue() == '(') {
                    e = (Character) med.Tope();
                    while (e.charValue() != ')') {
                        c = (Character) med.sacar_pila();
                        pre.add_pila(c);
                        e = (Character) med.Tope();
                    }
                    c = (Character) med.sacar_pila();
                } else if (operador(c.charValue())) {
                    e = (Character) med.Tope();
                    prioridadCima = prioridad(e);
                    prioridadOper = prioridad(c);
                    while (!med.vacia() && (prioridadOper < prioridadCima)) {
                        d = (Character) med.sacar_pila();
                        pre.add_pila(d);
                        e = (Character) med.Tope();
                        prioridadCima = prioridad(e);
                    }
                    med.add_pila(c);
                } else {
                    pre.add_pila(c);
                }
            }
        }
        while (!med.vacia()) {
            c = (Character) med.sacar_pila();
            pre.add_pila(c);
        }
        while (!pre.vacia()) {
            c = (Character) pre.sacar_pila();
            expPre.add(c.charValue());
        }
        return expPre;
    }

    private boolean operador(char c) {//si es operador retorna true
        char operadores[] = {'+', '-', '*', '/', '^'};
        boolean op = false;
        for (int i = 0; ((i < 5) && (!op)); i++) {
            if (operadores[i] == c) {
                op = true;
            }
        }
        return op;
    }

    private int prioridad(Character op) {
        int r = 4;
        if (op != null) {
            switch (op.charValue()) {
                case ')':
                    r = 0;
                case '(':
                    r = 0;
                    break;
                case '+':
                    r = 1;
                case '-':
                    r = 1;
                    break;
                case '*':
                    r = 2;
                case '/':
                    r = 2;
                    break;
                case '^':
                    r = 3;
            }
        }
        return r;
    }

    public Expresion(String Exp) {
        this.expresion = Exp;
    }

    private ArrayList Separar() {
        int i = 0;
        int n = expresion.length() - 1;
        String aux1, aux2;
        aux2 = expresion;
        aux1 = "";
        ArrayList e = new ArrayList();
        while ((i <= n)) {
            while ((i <= n) && (!Character.isDigit(aux2.charAt(i)))) {
                i++;
            }
            aux1 = "";
            while ((i <= n) && ((Character.isDigit(aux2.charAt(i))) || (aux2.charAt(i) == '.'))) {
                aux1 = aux1 + aux2.charAt(i);
                i++;
            }
            if (escorrecto(aux1)) {
                e.add(aux1);
            }
        }
        return e;
    }

    private boolean escorrecto(String numero) {
        // Verificar que la cadena sea un numero float correcto.
        return true;
    }

    public String Valores() {
        ArrayList a = Separar();
        String aux = "[ ";
        for (int i = 0; i < a.size(); i++) {
            if ((i + 1) == a.size()) {
                aux = aux + a.get(i).toString();
            } else {
                aux = aux + a.get(i).toString() + " ";
            }
        }
        aux = aux + " ]";
        return aux;
    }

    public String Clasica() {
        String Cara = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int p = -1;
        String aux = expresion;
        int n = aux.length() - 1, i = 0;
        String aux1, aux2;
        aux1 = aux2 = "";
        while (i <= n) {
            while ((i <= n) && (!Character.isDigit(aux.charAt(i)))) {
                aux1 = aux1 + aux.charAt(i);
                i++;
            }
            aux2 = "";
            boolean sw = false;
            while ((i <= n) && (Character.isDigit(aux.charAt(i)) || aux.charAt(i) == '.')) {
                if (sw == false) {
                    sw = true;
                    p++;
                }
                aux2 = aux2 + aux.charAt(i);
                i++;
            }
            if ((p != -1) && (sw)) {
                aux1 = aux1 + Cara.charAt(p);
            }
        }
        return aux1;
    }
}
