/*
    El programa pedirá 10 números enteros.
    Y mostrará el promedio de los que sean negativos.
    También el promedio de los positivos.
    Y nos dirá cuántos ceros fueron negativos
 */
package promedionum;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class PromedioNum {

    public static void main(String[] args) {
        //Lector de Datos 
        Scanner sc = new Scanner(System.in);

        //Variables
        double numero;
        int cantidadPos = 0, cantidadNeg = 0, cantidadCeros = 0;
        double suma_pos = 0, suma_neg = 0, promedioPos = 0, promedioNeg = 0;

        System.out.println("\tPROMEDIO DE NÚMEROS");
        System.out.println("--------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite el "+ (i+1) + "° número: ");
            numero = sc.nextDouble();
            if (numero > 0) {
                cantidadPos++;
                suma_pos += numero;
            }
            if (numero < 0) {
                cantidadNeg++;
                suma_neg += numero;
            }
            if (numero == 0) {
                cantidadCeros++;
            }
        }

        //Promedios
        promedioPos = suma_pos / cantidadPos;
        promedioNeg = suma_neg / cantidadNeg;

        System.out.println("--------------------------------------");
        //Muestra de Resultados
        if (cantidadNeg == 0) {
            System.out.println("\nERROR.. no se pudo hallar la media negativa");
        } else {
            System.out.println("\nLa cantidad de números negativos es: " + cantidadNeg);
            System.out.println("El promedio de los números negativos  es: " + promedioNeg);
        }

        if (cantidadPos == 0) {
            System.out.println("\nERROR.. no se pudo hallar la media positiva");
        } else {
            System.out.println("\nLa cantidad de números positivos es: " + cantidadPos);
            System.out.println("El promedio de los números poditivos es: " + promedioPos);
        }

        System.out.println("\nLa cantidad de ceros es: " + cantidadCeros);

    }

}
