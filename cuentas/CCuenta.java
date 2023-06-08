/*
 * El Documento forma parte de el paquete cuentas
 */
package cuentas;
/*
 *  Clase CCuenta con los valores nombre, cuenta, saldo y tipoInterés
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /*
     * Constructores
     */

    public CCuenta()
    {
    }

    /**
     * @param nom nombre de la CCuenta
     * @param cue Numero cuenta de la CCuenta
     * @param sal saldo de la CCuenta
     * @param tipo tipo de CCuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    /*
     * geters & seters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public double estado()
    {
        return saldo;
    }

    /*
     * Funciones para ingresar y retirar en la CCuenta
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}