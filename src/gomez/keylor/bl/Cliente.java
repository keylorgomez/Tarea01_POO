package gomez.keylor.bl;

public class Cliente {
    // Creando Atributos clase Cliente
    private String nombre;
    private String identificacion;
    private String fechaNacimiento;
    private int edad;
    private String direccion;

    //Creando los getters and setters


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

    public Cliente(String nombre, String identificacion, String fechaNacimiento, int edad, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //Creando el toString

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
