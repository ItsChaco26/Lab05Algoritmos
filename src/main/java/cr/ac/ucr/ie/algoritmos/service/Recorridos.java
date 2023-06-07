package cr.ac.ucr.ie.algoritmos.service;

import cr.ac.ucr.ie.algoritmos.model.Nodo;

public class Recorridos {


    public void recorridoENORDEN(Nodo nodoRaiz) {
        if (nodoRaiz == null) {
            System.out.println("El árbol no contiene elementos.");
        } else {
            recorridoENORDEN(nodoRaiz.getNodoIzq());
            System.out.println(nodoRaiz.getKey());
            recorridoENORDEN(nodoRaiz.getNodoDer());
        }
    }

    public void recorridoPREORDEN(Nodo nodoRaiz){
        if(nodoRaiz==null)
            System.out.println("El árbol no contiene elementos.");
        else{

            System.out.println(nodoRaiz.getKey());
            recorridoPREORDEN(nodoRaiz.getNodoIzq());
            recorridoPREORDEN(nodoRaiz.getNodoDer());

        }

    }

    public void recorridoPOSTORDEN(Nodo nodoRaiz) {
        if (nodoRaiz == null) {
            System.out.println("El árbol no contiene elementos.");
        } else {
            recorridoPOSTORDEN(nodoRaiz.getNodoIzq());
            recorridoPOSTORDEN(nodoRaiz.getNodoDer());
            System.out.println(nodoRaiz.getKey());
        }
    }

}
