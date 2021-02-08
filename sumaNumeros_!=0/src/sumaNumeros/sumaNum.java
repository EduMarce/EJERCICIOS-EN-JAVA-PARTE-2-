/*
    Crear un programa que esté pidiendo números enteros.
    Cuando un cero se haya introducido, finalizará la captura de datos.
    Sumar los números y mostrar la suma en pantalla.
 */
package sumaNumeros;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class sumaNum {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //Variables
        int numero;
        int sumaNumeros = 0;
        System.out.println("\tINGRESO DE NÚMEROS PARA SUMAR");
        lineas();
        System.out.println("¡Si usted ingresa el 0, ya no se podrá seguir sumando!");
        do {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            sumaNumeros += numero;
        } while (numero != 0);
        lineas();
        System.out.print("\nLa suma de los números ingresados es: " + sumaNumeros + "\n");

    }

    static void lineas() {
        System.out.println("-------------------------------------------------");
    }
    
}
