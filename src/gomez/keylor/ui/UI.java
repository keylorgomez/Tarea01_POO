package gomez.keylor.ui;

import gomez.keylor.bl.Banco;

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
            case 1:
                agregarCliente();
                break;
            case 0:
                System.out.println("Gracias por su visita :)");
                break;
            default:
                System.out.println("La opción seleccionada es incorrecta");
                break;
        }
    }

    public static void agregarCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el número de identificacion: ");
        String identificacion = entrada.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (DD-MM-AAAA): ");
        String fechaNacimiento = entrada.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese la dirección de habitación: ");
        String direccion= entrada.nextLine();

        String resultado= Banco.RegistrarCliente(nombre, identificacion, fechaNacimiento, edad, direccion);
        System.out.println(resultado);
    }

    public  static void mostrarClientes(){
        for (String clienteTemp : Banco.clientesRegistrados()){
            System.out.println(clienteTemp);
        }
    }
}
