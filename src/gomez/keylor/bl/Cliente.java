package gomez.keylor.bl;

/**
 * @author Keylor Gómez Rodríguez
 * @version 2.0
 * @since 12-10-2022
 *
 * En esta clase se gestionan todos los objetos cliente, cada uno de sus atributos y constructores
 */
public class Cliente {

    /**
     * Acá se definen todos los atributos asociados a la clase Cliente
     */
    // Creando Atributos clase Cliente
    private String nombre;
    private String identificacion;
    private String fechaNacimiento;
    private int edad;
    private String direccion;



    //Creando los getters and setters

    /**
     * En estos métodos que generan todos los getters and setters asociados a la clase
     * @return la obtención o la manera de asignar un valor a cada una de las variables
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    //Creando un constructor que reciba todos los parametros

    /**
     *
     * @param nombre es de tipo String y coresponde al nombre del cliente
     * @param identificacion es de tipo string y corresponde al número de cédula del cliente
     * @param fechaNacimiento es de tipo String y corresponde a la fecha de nacimiento del cliente
     * @param edad es de tipo entero y corresponde a la edad del cliente
     * @param direccion es de tipo String y cooresponde a la dirección de habitación del cliente
     */
    public Cliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //Creando el toString

    /**
     *
     * @return retorna el objeto en formato String
     */

    @Override
    public String toString() {
        return "\nCliente: \n" +
                "Nombre: " + nombre + "\n" +
                "Número de identificacion: " + identificacion + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Edad: " + edad +"\n"+
                "Direccion: " + direccion+"\n \n";
    }
}
