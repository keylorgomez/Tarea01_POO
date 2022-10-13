package gomez.keylor.bl;

/**
 * @author Keylor Gómez Rodríguez
 * @version 2.0
 * @since 12-10-22
 *
 * Se encarga de gestionar la clase cuenta y de establecer cada uno de sus atributos
 */
public class Cuenta {
    //Atributos clase cuenta
    /**
     * Acá se asignan cada uno de los atributos asociados a la clase Cuenta
     */
    private String idetificacion;
    private String numeroCuenta;
    private double saldo;

    //Gnerando los getters and Setters

    /**
     * Se crean los métodos getters and setteres de cada uno de los atributos
     * @return retornan los atributos o permiten modificarlos
     */
    public String getIdetificacion() {
        return idetificacion;
    }

    public void setIdetificacion(String idetificacion) {
        this.idetificacion = idetificacion;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //Generando un constructor que reciba todos los parametros

    /**
     *
     * @param idetificacion es de tipo String y permite asociar a quien pertenece la cuenta
     * @param numeroCuenta es de tipo String y representa el número de cuenta de los clientes
     * @param saldo es de tipo double y posee el saldo de la cuenta
     */
    public Cuenta(String idetificacion, String numeroCuenta, double saldo) {
        this.idetificacion = idetificacion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Generando una sobrecarga

    /**
     * Se genera una sobrecarga
     */
    public Cuenta(){

    }


    //Creando un toString

    /**
     * Metodo que devuelve los atributos en formato String
     * @return String con el estado del objeto
     */
    @Override
    public String toString() {
        return "\nCuenta: \n" +
                "Número de identificacion: " + idetificacion + "\n" +
                "Número de cuenta: " + numeroCuenta +"\n"+
                "Saldo: " + saldo+"\n\n";
    }
}
