/*
    Crear un programa que nos pida capturar números positivos.
    Y calcular la media o promedio de esos números.
 */
package SumaNumPos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class sumaNumPOS {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int numero;
        double sumaNumeros = 0;
        int contador_pos = 0;
        double resultado;

        System.out.println("\t\tPROMEDIO DE NÚMEROS");
        System.out.println("-----------------------------------------------------");
        System.out.println("¡Ingrese solo números positivos, sino el programa se detendrá!");
        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            if (numero > 0) {
                sumaNumeros += numero;
                contador_pos++;
            }

        } while (numero > 0);

        if (contador_pos == 0) {
            System.out.println("ERROR..., Imposible calcular la media");
        } else {
            resultado = sumaNumeros / contador_pos;
            System.out.println("-----------------------------------------------------");
            System.out.println("Ingresaste: " + contador_pos + " números correctamente");
            System.out.println("El promedio de los números ingresados es: " + resultado);
        }

    }
}
