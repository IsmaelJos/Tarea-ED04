/*
 * El documento forma parte de el paquete cuentas
 */
package cuentas;
/*
 *  Main de java donde empezara la ejecucion de el programa
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }


    /**
     * @param cuenta
     * @param cantidad
     * Funcion que se podria llamar desde el main
     * Usa las funciones ingresar y retirar en el CCuenta propuesto  
     */
    public static void operativa_cuenta (CCuenta cuenta, float cantidad){
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}