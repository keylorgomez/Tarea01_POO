package gomez.keylor.ui;

import gomez.keylor.bl.Banco;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Keylor Gómez Rodríguez
 * @version 2.0
 * @since 12-10-22
 *
 * Ejecuta todas las funciones establecidas en el controlador
 */
public class UI {

    public static void main(String[] args) {
        SeleccionarOpcion();
    }

    /**
     * Función que muestra el menú de opciones
     */
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

    /**
     * Funcion que analiza la opcion selecionada y ejecuta
     * @param opcion opcion selecionada del menu
     */
    public static void EjecutarOpcion(int opcion){
        switch (opcion){
            case 1:
                agregarCliente();
                break;
            case 2:
                mostrarClientes();
                break;
            case 3:
                nuevaCuenta();
                break;
            case 4:
                RealizarDeposito();
                break;
            case 5:
                RealizarRetiro();
                break;
            case 6:
                ConsultarSaldo();
                break;
            case 0:
                System.out.println("Gracias por su visita :)");
                break;
            default:
                System.out.println("La opción seleccionada es incorrecta");
                break;
        }
    }

    /**
     * Funcion en la que se ingresan los datos requeridos para crear un usuario
     */
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

    /**
     * Función que lista cada uno de los clientes que se encuentran en el sistema
      */
    public  static void mostrarClientes(){
        for (String clienteTemp : Banco.clientesRegistrados()){
            System.out.println(clienteTemp);
        }
    }

    /**
     * Funcion en la que se ingresan los datos requeridos para crear una nueva cuenta
     */
    public static void nuevaCuenta(){
        Random numeroAleatorio= new Random();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de identificación del cliente: ");
        String identificacion = entrada.nextLine();

        // Calculo del número de cuenta
        int n=numeroAleatorio.nextInt(1234567-1026849)+1026849;
        String numeroCuenta= String.valueOf(n);

        System.out.print("Ingrese el saldo que va a tener la cuenta (Debe ser mayor o igual a ₡50.000 colones): ");
        double saldo=entrada.nextDouble();

        String resultado=Banco.CrearCuenta(identificacion,numeroCuenta,saldo);
        System.out.println(resultado);
    }

    /**
     * Funcion en la que se ingresan los datos para generar un deposito en la cuenta
     */
    public  static void RealizarDeposito(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta del cliente: ");
        String numeroCuenta=entrada.nextLine();
        System.out.print("Ingrese la cantidad que desea depositar: ₡");
        int deposito=entrada.nextInt();

        double resultado=Banco.GenerarDeposito(numeroCuenta,deposito);
        if (resultado>0){
            System.out.println("El depósito se realizó con éxito");
        }else{
            System.out.println("NO se pudo realizar el depósito. Algún dato se ingresó de manera erronea");
        }
    }

    /**
     * Funcion en la que se ingresan los datos necesarios para  realizar un retiro de dinero de la cuenta
     */
    public static void RealizarRetiro(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta del cliente: ");
        String numeroCuenta=entrada.nextLine();
        System.out.print("Ingrese la cantidad que desea retirar: ₡");
        int retiro=entrada.nextInt();

        double resultado=Banco.GenerarRetiro(numeroCuenta,retiro);
        if (resultado==-1){
            System.out.println("No se pueden realizar retiros superiores a la cantidad de dinero que posee la cuenta.");
        }else if(resultado==0){
            System.out.println("El numero de cuenta ingresado no se encuentra registrado en el sistema.");
        }else{
            System.out.println("El retiro se realizó con éxito");
        }
    }

    /**
     * Funcion en la que se ingresan los datos requiridos para mostrar el saldo correspondiente de cada cuenta
     */
    public static void ConsultarSaldo(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta del cliente: ");
        String numeroCuenta=entrada.nextLine();

        double resultado=Banco.MostrarSaldo(numeroCuenta);
        if (resultado>0){
            System.out.println("Su saldo en la cuenta es: ₡"+resultado);
        }else if(resultado==0){
            System.out.println("Su cuenta no posee fondos");
        } else {
            System.out.println("El numero de cuenta ingresado no se encuentra registrado en el sistema.");
        }
    }

}
