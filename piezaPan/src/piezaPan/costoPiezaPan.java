/*
    La pieza de pan cuesta 5 soles
    Si se compraron  de 50´piezas a más, cada pieza costará a 4.5 soles
    Si se compraron  de 100 a más, cada pieza costará a 4 soles
    Programa que pida capturar la cantidad de piezas que el cliente compr+o, y
    el total que pagará.
 */
package piezaPan;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class costoPiezaPan {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        double piezasPan;
        double totalaPgar = 1.0;

        System.out.println("\tPIEZAS DE PAN");

        System.out.println("---------------------------------------------------------");
        System.out.println("\n\t--COSTOS--");
        System.out.println("1. Si se compra más de 50 piezas, cada pieza costará: " + 4.5 + " soles"
                + "\n2. Si se compra más de 100, cada pieza costará " + 4 + " soles.");
        System.out.println("---------------------------------------------------------");

        System.out.print("\nDigite la cantidad de piezas a comprar: ");
        piezasPan = sc.nextDouble();

        if (piezasPan > 0 && piezasPan < 50) {
            totalaPgar = piezasPan * 5;
        }
        if (piezasPan >= 50 && piezasPan < 100) {
            totalaPgar = piezasPan * 4.5;
        } 
        if(piezasPan>=100){
            totalaPgar = piezasPan * 4;
        }
            

        System.out.println("\n\t...PROCESANDO...");
        System.out.println("---------------------------------------------------------");
        System.out.print("Total a pagar: " + totalaPgar + " soles");

    }
}
