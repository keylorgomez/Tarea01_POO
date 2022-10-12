package gomez.keylor.ui;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        SeleccionarOpcion();
    }

    public static void SeleccionarOpcion(){
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("\n**** Sistema de registro de Propiedades *****");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Listar clientes.");
            System.out.println("3. Crear cuenta.");
            System.out.println("4. Realizar depósito.");
            System.out.println("5. Realizar retiro.");
            System.out.println("6. Mostrar saldo.");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            EjecutarOpcion(opcion);
        } while (opcion != 0);
    }

    public static void EjecutarOpcion(int opcion){
        switch (opcion){
            case 0:
                System.out.println("Gracias por su visita :)");
                break;
            default:
                System.out.println("La opción seleccionada es incorrecta");
                break;
        }
    }
}
