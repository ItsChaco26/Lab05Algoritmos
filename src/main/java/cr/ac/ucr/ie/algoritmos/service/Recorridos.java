package cr.ac.ucr.ie.algoritmos.service;

import cr.ac.ucr.ie.algoritmos.model.Nodo;



public class Recorridos {
    public void recorridoENORDEN(Nodo raiz) {
        recorridoINORDENRecursivo(raiz);
    }

    private void recorridoINORDENRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }

        recorridoINORDENRecursivo(nodo.getNodoIzq());
        System.out.println(nodo.toString());
        recorridoINORDENRecursivo(nodo.getNodoDer());
    }

    public void recorridoPREORDEN(Nodo raiz) {
        recorridoPREORDENRecursivo(raiz);
    }

    private void recorridoPREORDENRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.toString());
        recorridoPREORDENRecursivo(nodo.getNodoIzq());
        recorridoPREORDENRecursivo(nodo.getNodoDer());
    }

    public void recorridoPOSTORDEN(Nodo raiz) {
        recorridoPostOrdenRecursivo(raiz);
    }

    private void recorridoPostOrdenRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        recorridoPostOrdenRecursivo(nodo.getNodoIzq());
        recorridoPostOrdenRecursivo(nodo.getNodoDer());
        System.out.println(nodo.toString());

    }
}
