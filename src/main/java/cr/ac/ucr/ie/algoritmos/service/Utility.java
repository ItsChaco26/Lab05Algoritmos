package cr.ac.ucr.ie.algoritmos.service;

import cr.ac.ucr.ie.algoritmos.model.Nodo;

public class Utility {
    private Nodo raiz;

    public Utility() {
        raiz = null;
    }

    public void insertar(int key, String nombre, String apellidos, String carrera) {
        raiz = insertarRecursivo(raiz, key, nombre, apellidos, carrera);
    }

    private Nodo insertarRecursivo(Nodo nodo, int key, String nombre, String apellidos, String carrera) {
        if (nodo == null) {
            return new Nodo(key, nombre, apellidos, carrera);
        }

        if (key < nodo.getKey()) {
            nodo.setNodoIzq(insertarRecursivo(nodo.getNodoIzq(), key, nombre, apellidos, carrera));
        } else if (key > nodo.getKey()) {
            nodo.setNodoDer(insertarRecursivo(nodo.getNodoDer(), key, nombre, apellidos, carrera));
        }

        return nodo;
    }

    public void eliminarNodo(int key) {
        raiz = eliminarNodoRecursivo(raiz, key);
    }

    private Nodo eliminarNodoRecursivo(Nodo nodo, int key) {
        if (nodo == null) {
            return null;
        }
        if (key < nodo.getKey()) {
            nodo.setNodoIzq(eliminarNodoRecursivo(nodo.getNodoIzq(), key));
        } else if (key > nodo.getKey()) {
            nodo.setNodoDer(eliminarNodoRecursivo(nodo.getNodoDer(), key));
        } else {
            // Caso 1: El nodo no tiene hijos
            if (nodo.getNodoIzq() == null && nodo.getNodoDer() == null) {
                return null;
            }
            // Caso 2: El nodo tiene un solo hijo
            if (nodo.getNodoIzq() == null) {
                return nodo.getNodoDer();
            }
            if (nodo.getNodoDer() == null) {
                return nodo.getNodoIzq();
            }
            // Caso 3: El nodo tiene dos hijos
            Nodo sucesor = buscarHijo(nodo.getNodoDer());
            nodo.setKey(sucesor.getKey());
            nodo.setNombre(sucesor.getNombre());
            nodo.setApellidos(sucesor.getApellidos());
            nodo.setCarrera(sucesor.getCarrera());
            nodo.setNodoDer(eliminarNodoRecursivo(nodo.getNodoDer(), sucesor.getKey()));
        }

        return nodo;
    }

    private Nodo buscarHijo(Nodo nodo) {
        if (nodo.getNodoIzq() == null) {
            return nodo;
        }
        return buscarHijo(nodo.getNodoIzq());
    }

}
