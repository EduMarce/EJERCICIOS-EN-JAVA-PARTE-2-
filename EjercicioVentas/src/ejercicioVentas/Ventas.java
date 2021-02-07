
/*
    EJERCICIO 1
    Vamos ingresar 30 ventas de un mes, y nos va indicar cuales  y cuantas,
    superaron los 2000 soles.
 */
package ejercicioVentas;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ventas {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        String nombreMes;
        int contador = 0;

        //Arreglo de cuentas
        int cuentasMes[] = new int[30];
        System.out.println("\tCONTROL DE CUENTAS");
        System.out.println("-------------------------------");
        System.out.print("\nMes: ");
        nombreMes = sc.nextLine();

        //Ingreso de las cuentas
        System.out.println("Ingreso de Cuentas");
        for (int i = 0; i < cuentasMes.length; i++) {
            System.out.print("Cuenta " + (i + 1) + ": ");
            cuentasMes[i] = sc.nextInt();
        }

        //Validación de cuentas
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("CUENTAS QUE SUPERAN");
        for (int i = 0; i < cuentasMes.length; i++) {
            if (cuentasMes[i] > 2000) {
                contador++;
                System.out.println("Cuenta " + (i + 1) + ": " + cuentasMes[i] + " soles");
            }
        }

        System.out.print("\nTotal de Cuentas Superadas: " + contador + "\n");

    }
}
