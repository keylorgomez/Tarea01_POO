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
}
