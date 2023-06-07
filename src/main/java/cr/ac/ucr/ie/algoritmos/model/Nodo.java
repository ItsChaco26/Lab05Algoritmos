package cr.ac.ucr.ie.algoritmos.model;

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

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }

}
