package cr.ac.ucr.ie.algoritmos.service;

import cr.ac.ucr.ie.algoritmos.model.Nodo;


        public class Recorridos {
            public void recorridoPREORDEN(Nodo nodoRaiz, int nivel) {
                if (nodoRaiz == null) {
                    if (nivel == 0) {
                        System.out.println("El árbol no contiene elementos.");
                    }
                } else {
                    for (int i = 0; i < nivel; i++) {
                        System.out.print("  ");
                    }

                    System.out.println(nodoRaiz.getKey());

                    recorridoPREORDEN(nodoRaiz.getNodoIzq(), nivel + 1);
                    recorridoPREORDEN(nodoRaiz.getNodoDer(), nivel + 1);
                }
            }

            public void recorridoENORDEN(Nodo nodoRaiz, int nivel) {
                if (nodoRaiz == null) {
                    if (nivel == 0) {
                        System.out.println("El árbol no contiene elementos.");
                    }
                } else {
                    recorridoENORDEN(nodoRaiz.getNodoIzq(), nivel + 1);
                    for (int i = 0; i < nivel; i++) {
                        System.out.print("  ");
                    }
                    System.out.println(nodoRaiz.getKey());
                    recorridoENORDEN(nodoRaiz.getNodoDer(), nivel + 1);
                }
            }

            public void recorridoPOSTORDEN(Nodo nodoRaiz, int nivel) {
                if (nodoRaiz == null) {
                    if (nivel == 0) {
                        System.out.println("El árbol no contiene elementos.");
                    }
                } else {
                    recorridoPOSTORDEN(nodoRaiz.getNodoIzq(), nivel + 1);
                    recorridoPOSTORDEN(nodoRaiz.getNodoDer(), nivel + 1);
                    for (int i = 0; i < nivel; i++) {
                        System.out.print("  ");
                    }
                    System.out.println(nodoRaiz.getKey());
                }
            }
        }
