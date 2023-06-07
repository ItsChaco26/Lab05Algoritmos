package cr.ac.ucr.ie.algoritmos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); // se crear el Scanner para leer las entradas en consola
        int opcion = 0; // se inicializa la variable opcion en 0, de esa forma entra en el While
        while (opcion != 11) { //While que permitirá ejecutar el menú hasta que el usuario ingrese 4, la opción salir.
            StringBuilder sb = new StringBuilder("Menu Principal"); //StringBuilder donde se almacena el contenido del Menú Principal
            sb.append("\nSeleccione una opción válida: \n")
                    .append("1): ").append("Ingresar datos\n")
                    .append("2): ").append("Borrar nodo\n")
                    .append("3): ").append("Recorrer el árbol\n")
                    .append("4): ").append("Salir");
            System.out.println(sb);
            try {
                opcion = sn.nextInt(); // Se asigna un dato tipo int a la variable opción para proceder a evaluarla en el switch y ejecutar un método o acciones especificas
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.exit(0);
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