/*
    Crear programa que muestre el producto de los primeros 10 números impares.
    Primeros 10 números impares: 1,3,5,7,9,11,13,15,17,19
 */
package productonumimp;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class productoNumImpares {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int numero;
        long producto = 1;
        System.out.println("\tPRODUCTO DE LOS 10 PRIMEROS NÚMEROS IMPARES");
        System.out.print("\nNúmeros impares: ");
        for (numero = 1; numero <= 19; numero += 2) {
            System.out.print(numero + " ");
            producto *= numero;
        }

        System.out.println("\nEl producto es: " + producto);

    }
}
