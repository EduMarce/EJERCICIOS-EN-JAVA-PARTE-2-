/*
    Crear un programa pra la gestión de facturas de una empresa que se dedica a la venta de
    azucar por kilos. En cada factura se ingresará el código del producto vendido, además se
    ingresará la cantidad de kilos vendida, y el total a pagar por kilos.
    De 5 facturas introducidas, se pide:  Facturación Total, cantidad de kilos vendidas, y cuántas
    facturas fueron emitidas por más de 1000 soles.
 */
package gestiónFactura;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class EmpresaAzucar {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        String código[] = new String[5];
        double cantidadKilos[] = new double[5];
        double precioventa[] = new double[5];
        double valorFactura[] = new double[5];
        double FacturacionTotal = 0;
        double totalKilos = 0;
        int contador = 0;

        //Pedimos los datos al usuario
        System.out.println("\tFACTURAS DE LA EMPRESA");
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura " + (i + 1) + "");
            System.out.print(" Código: ");
            código[i] = sc.next();
            do {
                System.out.print(" Cantidad de Kilos: ");
                cantidadKilos[i] = sc.nextDouble();
            } while (cantidadKilos[i] < 0.0);
            do {
                System.out.print(" Precio: ");
                precioventa[i] = sc.nextDouble();
            } while (precioventa[i] < 0.0);

            valorFactura[i] = precioventa[i] * cantidadKilos[i];
            FacturacionTotal += valorFactura[i];
            totalKilos += cantidadKilos[i];
            if (valorFactura[i] > 1000) {
                contador++;
            }
        }

        System.out.println("--------------------------------");
        System.out.println(" Valor de las facturas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura " + (i + 1) + ": " + valorFactura[i] + " soles");
        }
        System.out.println("--------------------------------");
        System.out.println("\nFacturación Total: " + FacturacionTotal + " soles");
        System.out.println("Cantidad total de kilos vendido: " + totalKilos + " kilos");
        System.out.println("--------------------------------");
        System.out.println("\nCantidad de facturas que sobrepasaron: " + contador);
        System.out.println("Código " + "\tValor Factura");
        for (int i = 0; i < 5; i++) {
            if (valorFactura[i] > 1000) {
                System.out.println(código[i] + "\t" + valorFactura[i] + " soles");
            }
        }

    }
}
