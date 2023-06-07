package cr.ac.ucr.ie.algoritmos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); //Se crear el Scanner para leer las entradas en consola
        int opcion = 0; //Se inicializa la variable opcion en 0, de esa forma entra en el While
        while (opcion != 6) { //While que permitirá ejecutar el menú hasta que el usuario ingrese 11 la opción salir.
            StringBuilder sb = new StringBuilder("Menu Principal"); //StringBuilder donde se almacena el contenido del Menú Principal
            sb.append("\nSeleccione una opción válida: \n")
                    .append("1): ").append("Inserción en Árbol ABB\n")
                    .append("2): ").append("Borrar elementos de Árbol ABB\n")
                    .append("3): ").append("Método de recorrido: PREORDEN\n")
                    .append("4): ").append("Método de recorrido: ENORDEN\n")
                    .append("5): ").append("Método de recorrido: POSTORDEN\n")
                    .append("6): ").append("Salir");
            System.out.println(sb);
            try {
                opcion = sn.nextInt(); //Se asigna un dato tipo int a la variable opción para proceder a eveluarla en el switch y ejecutar un método o acciones especificas
                switch (opcion) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                    case 6:
                        System.exit(0); //Se termina la ejecución del programa.
                        break;
                    default:
                        System.out.println("Se digitó un número incorrecto");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error. Debe ingresar números."); //Se arroja la excepción en caso de que ingrese un dato erróneo
                sn.nextLine();
            }
        }
    }
}