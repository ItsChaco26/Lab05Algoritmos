package cr.ac.ucr.ie.algoritmos;

public class Nodo {
    private int data;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    // Constructor de la clase Nodo
    public Nodo(int data) {
        this.data = data;
        nodoIzq = null;
        nodoDer = null;
    }
}
