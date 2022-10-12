package gomez.keylor.bl;

import java.util.ArrayList;

public class Banco {
    //Creando ArrayList para almacenar info importante
    static ArrayList<Cliente> listaClientes=new ArrayList<>();
    static ArrayList<Cuenta> listaCuentas=new ArrayList<>();
    static ArrayList<String> listaCedulas=new ArrayList<>();
    static ArrayList <String> listanumeroCuenta= new ArrayList<>();
    static ArrayList <Double> listaSaldosCuentas= new ArrayList<>();

    public static String RegistrarCliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion){
        boolean validarCed=false;
        for (int i=0;i<listaCedulas.size();i++){
            if (identificacion.equals(listaCedulas.get(i))){
                validarCed=true;
                break;
            }
        }
        if (validarCed==false){
            Cliente cliente1 = new Cliente(nombre,identificacion,fechaNacimiento,edad,direccion);
            listaClientes.add(cliente1);
            listaCedulas.add(cliente1.getIdentificacion());


            return "\nEl cliente: "+cliente1.getNombre()+", número de cédula: "+cliente1.getIdentificacion()+" ha sido registrado exitosamente.";
        }else{
            return "\nUn cliente con la cédula: "+ identificacion+" ya se encuentra regitrado, por lo que NO se puede registrar otra vez";
        }
    }

    public static String[] clientesRegistrados(){
        String listaClientesTemporal []= new String[listaClientes.size()];
        for(int contador=0;contador<listaClientesTemporal.length;contador++){
            listaClientesTemporal[contador]=listaClientes.get(contador).toString();
        }
        return  listaClientesTemporal;
    }

    public  static String CrearCuenta(String identificacion, String numeroCuenta, double saldo){
        boolean validarClient=false;
        for (int i=0;i<listaCedulas.size();i++){
            if (identificacion.equals(listaCedulas.get(i))){
                validarClient=true;
                break;
            }
        }
        if (validarClient==true){
            if (saldo>=50000){
                Cuenta cuenta1= new Cuenta(identificacion,numeroCuenta,saldo);
                listaCuentas.add(cuenta1);
                listanumeroCuenta.add(cuenta1.getNumeroCuenta());
                listaSaldosCuentas.add(cuenta1.getSaldo());

                return "Se registró la cuenta de manera exitosa, asociada al número de cédula: "+cuenta1.getIdetificacion()+"\n" +
                        "El número de su nueva cuenta es: "+cuenta1.getNumeroCuenta();
            }
            else{
                return "Para crear una cuenta el saldo debe ser igual o superior a ₡50.000 y la longitud de dígitos del número de cuenta debe ser igual a 7";
            }
        } else {
            return "No hay nigún cliente registrado bajo ese número de identificación.";
        }
    }
    public static double GenerarDeposito(String numeroCuenta, double deposito){
        boolean validarNumCuenta=false;
        int indice=0;
        double Saldocuenta;
        for(int i=0;i< listanumeroCuenta.size();i++){
            if(numeroCuenta.equals(listanumeroCuenta.get(i)) ){
                validarNumCuenta=true;
                indice=i;
                break;
            }
        }
        if (validarNumCuenta==true){
            if (deposito>0){
                Saldocuenta=listaSaldosCuentas.get(indice)+deposito;
                listaSaldosCuentas.set(indice,Saldocuenta);
            }

        }else{
            deposito=0;
        }
        return deposito;
    }

    public static double GenerarRetiro(String numeroCuenta, double retiro){
        boolean validarNumCuenta=false;
        int indice=0;
        double Saldocuenta;
        for(int i=0;i< listanumeroCuenta.size();i++){
            if(numeroCuenta.equals(listanumeroCuenta.get(i)) ){
                validarNumCuenta=true;
                indice=i;
                break;
            }
        }
        if (validarNumCuenta==true){
            if (retiro <= listaSaldosCuentas.get(indice) && retiro>0){
                Saldocuenta=listaSaldosCuentas.get(indice)-retiro;
                listaSaldosCuentas.set(indice,Saldocuenta);
            }else{
                retiro=-1;
            }
        }else{
            retiro=0;
        }

        System.out.println(listaSaldosCuentas);
        return retiro;
    }

    public static double MostrarSaldo(String numeroCuenta){
        boolean validarNumCuenta=false;
        int indice=0;
        double Saldocuenta;
        for(int i=0;i< listanumeroCuenta.size();i++){
            if(numeroCuenta.equals(listanumeroCuenta.get(i)) ){
                validarNumCuenta=true;
                indice=i;
                break;
            }
        }
        if (validarNumCuenta==true){
            Saldocuenta=listaSaldosCuentas.get(indice);
        }else {
            Saldocuenta=-1;
        }
        return Saldocuenta;
    }
}
