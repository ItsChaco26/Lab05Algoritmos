package org.example.model;

public class Nodo {
    private int key;
    private String nombre;
    private String apellidos;
    private String carrera;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    // Constructor de la clase Nodo
    public Nodo(int key, String nombre, String apellidos, String carrera) {
        this.key = key;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
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
