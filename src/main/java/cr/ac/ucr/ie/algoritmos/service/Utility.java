package cr.ac.ucr.ie.algoritmos.service;

import cr.ac.ucr.ie.algoritmos.model.Nodo;

public class Utility {
    private Nodo raiz;

    public Utility() {
        raiz = null;
    }

    public void insertarNodo(int key, String nombre, String apellidos, String carrera) {
        raiz = insertarNodoRecursivo(raiz, key, nombre, apellidos, carrera);
    }

    private Nodo insertarNodoRecursivo(Nodo nodo, int key, String nombre, String apellidos, String carrera) {
        if (nodo == null) {
            return new Nodo(key, nombre, apellidos, carrera);
        }

        if (key < nodo.getKey()) {
            nodo.setNodoIzq(insertarNodoRecursivo(nodo.getNodoIzq(), key, nombre, apellidos, carrera));
        } else if (key > nodo.getKey()) {
            nodo.setNodoDer(insertarNodoRecursivo(nodo.getNodoDer(), key, nombre, apellidos, carrera));
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
            //El nodo no tiene hijos
            if (nodo.getNodoIzq() == null && nodo.getNodoDer() == null) {
                return null;
            }
            //El nodo tiene un solo hijo
            if (nodo.getNodoIzq() == null) {
                return nodo.getNodoDer();
            }
            if (nodo.getNodoDer() == null) {
                return nodo.getNodoIzq();
            }
            //El nodo tiene dos hijos
            Nodo hijo = buscarHijo(nodo.getNodoDer());
            nodo.setKey(hijo.getKey());
            nodo.setNombre(hijo.getNombre());
            nodo.setApellidos(hijo.getApellidos());
            nodo.setCarrera(hijo.getCarrera());
            nodo.setNodoDer(eliminarNodoRecursivo(nodo.getNodoDer(), hijo.getKey()));
        }
        return nodo;
    }

    private Nodo buscarHijo(Nodo nodo) {
        if (nodo.getNodoIzq() == null) {
            return nodo;
        }
        return buscarHijo(nodo.getNodoIzq());
    }

    public void imprimirEstructura() {
        imprimirEstructuraRecursivo(raiz, "");
    }

    private void imprimirEstructuraRecursivo(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.println(prefijo + "├── Key: " + nodo.getKey());
            String nuevoPrefijo = prefijo + "│   ";
            imprimirEstructuraRecursivo(nodo.getNodoIzq(), nuevoPrefijo + "├── ");
            imprimirEstructuraRecursivo(nodo.getNodoDer(), nuevoPrefijo + "└── ");
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }
}
