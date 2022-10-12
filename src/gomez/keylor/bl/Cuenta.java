package gomez.keylor.bl;

public class Cuenta {
    //Atributos clase cuenta
    private String idetificacion;
    private String numeroCuenta;
    private double saldo;

    //Gnerando los getters and Setters

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

    public Cuenta(String idetificacion, String numeroCuenta, double saldo) {
        this.idetificacion = idetificacion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Generando una sobrecarga

    public Cuenta(){

    }


    //Creando un toString

    @Override
    public String toString() {
        return "\nCuenta: \n" +
                "Número de identificacion: " + idetificacion + "\n" +
                "Número de cuenta: " + numeroCuenta +"\n"+
                "Saldo: " + saldo+"\n\n";
    }
}
