/*
    Crearemos un arreglo de 5 posiciones, para almacenar números enteros,
    y el programa al finalizar nos dirá cuál es el mayor de esos 5.
*/
package MayorElemento;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class mayorElemento_Array {
    public static void main(String[]args){
     //Objeto Scaner
     Scanner sc = new Scanner(System.in);
     
     //Variables
     int mayorNumero = 0;
     
     //Creamos el arreglo
     int numeros[] = new int[5]; //5 posiciones
     
     //LLenamos el arreglo
     System.out.println("\tARREGLO DE 5 NÚMEROS");
     System.out.println("---------------------------------------");
     for(int i=0;i<numeros.length;i++){
        System.out.print("Número " +(i+1)+ ": ");
        numeros[i] = sc.nextInt();
     }
     
     //Analizamos el mayor de los números del arreglo
     for(int i=0;i<numeros.length;i++){
        if(numeros[i]>mayorNumero)
            mayorNumero = numeros[i];
        
        
     }
     System.out.println("---------------------------------------");
     System.out.println("\tLISTA DE NÚMEROS INGRESADOS");
     for(int i=0;i<numeros.length;i++){
        System.out.print(numeros[i] + " ");
     }
     System.out.println("\nEl mayor número ingresado es: " + mayorNumero);
    
    
    }
}
