/*
    El programa pedirá elegeir la cantidad de sueldos, y después los 
    introducimos con el teclado. Al final mostraá en pantalla cuál 
    sueldo es el mayor.
*/
package mayorsueldo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class MayorSueldo {

    public static void main(String[] args) {
      //Objeto Scanner
      Scanner sc = new Scanner(System.in);
      
      //Variables
      int cantidadSueldos;
      double mayorSueldo = 0;
      
      //Pedimos datos al usuario
      System.out.println("\tEL MAYOR SUELDO INGRESADO");
      System.out.println("---------------------------------------");
      System.out.print("Ingrese la cantidad de sueldos a digitar: ");
      cantidadSueldos = sc.nextInt();
      System.out.println("---------------------------------------");
      
      //Empleo un arreglo de sueldos
      double sueldos[] = new double[cantidadSueldos];
      
      //Ingresamos los sueldos mediante las ventanas emergentes 
      for(int i=0; i<sueldos.length;i++){
        sueldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sueldo N° "+ (i+1) + ": "));
        if(sueldos[i]>mayorSueldo){
           mayorSueldo = sueldos[i];
        }
      }
      //Muestra de Datos por ventana emergente
      JOptionPane.showMessageDialog(null,"MAYOR SUELDO:  " + mayorSueldo + " soles");
      
      
      //Muestra de datos por consola
      System.out.println("---------------------------------------");
      System.out.println("LISTA DE  SUELDOS INGRESADOS");
       for(int i=0; i<sueldos.length;i++){
        System.out.println("  N°" + (i+1) + ": " + sueldos[i] + " soles");
       }
      System.out.println("\nEl mayor sueldo ingresado es: " + mayorSueldo + " soles");  
    }
    
}
