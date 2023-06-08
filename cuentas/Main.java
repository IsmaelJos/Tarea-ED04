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
        retirar_cuenta(cuenta1,900);
        ingresar_cuenta(cuenta1,1000);
    }


    /**
     * @param cuenta
     * @param cantidad
     * Funcion que se podria llamar desde el main
     * Usa la funcion retirar en el CCuenta propuesto  
     */
    public static void retirar_cuenta (CCuenta cuenta, float cantidad){
        try {
            System.out.println("Extracción en cuenta");
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
    }
    /**
     * @param cuenta
     * @param cantidad
     * Funcion que se podria llamar desde el main
     * Usa la funcion ingresar en el CCuenta propuesto  
     */
    public static void ingresar_cuenta (CCuenta cuenta, float cantidad){
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
    }
    
}