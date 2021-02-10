/*
    El programa nos pedirá 6 calificaciónes a introducir, y al final nos dirá cuántos
    aprobaron, cuántos obtuvieron calificación de excelencia, y cuántos reprobaron
 */
package alumnoaprobado;

import java.util.Scanner;
import sun.nio.cs.ext.IBM856;

/**
 *
 * @author eduardo
 */
public class AlumnoAprobado {

    public static void main(String[] args) {
        //Objeto Scanner 
        Scanner sc = new Scanner(System.in);

        //Variables
        double calificacion[] = new double[6];
        int desaprobados = 0;
        int aprobados = 0;
        int excelente = 0;

        //Pedimos datos al usuario
        System.out.println("\tINGRESO DE NOTAS");
        System.out.println("------------------------------------");
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Alumno N°" + (i + 1) + ": ");
            do {
                System.out.print(" Digite calificación: ");
                calificacion[i] = sc.nextDouble();
            } while (calificacion[i] < 0 || calificacion[i] > 20);
            if (calificacion[i] < 11) {
                desaprobados++;
            }
            if (calificacion[i] >= 11 && calificacion[i] < 19) {
                aprobados++;
            }
            if (calificacion[i] >= 19) {
                excelente++;
            }
        }
        System.out.println("\n------------------------------------");
        System.out.println("Alumnos Desaprobados");
        if(desaprobados==0){
          System.out.println("No hay ningún alumno desaprobado");
        }
        else{
            System.out.println(" Cantidad: " + desaprobados);
          for(int i=0;i<calificacion.length;i++){
           if (calificacion[i] < 11) {
                System.out.println("   Alumno N°" + (i+1) + " >> Nota: " + calificacion[i]);
            }
        }
        }
        
        System.out.println("------------------------------------");
        System.out.println("\nAlumnos Aprobados");
        if(aprobados==0){
          System.out.println("No hay ningún alumno aprobado");
        }
        else{
            System.out.println(" Cantidad: " + aprobados);
          for(int i=0;i<calificacion.length;i++){
           if (calificacion[i] >= 11 && calificacion[i] < 19) {
                System.out.println("   Alumno N°" + (i+1) + " >> Nota: " + calificacion[i]);
            }
        }
        }
        
        System.out.println("\n------------------------------------");
        System.out.println("Alumnos Excelente");
        if(excelente==0){
          System.out.println("No hay ningún alumno excelente");
        }
        else{
            System.out.println(" Cantidad: " + excelente);
          for(int i=0;i<calificacion.length;i++){
           if (calificacion[i] >=19) {
                System.out.println("   Alumno N°" + (i+1) + " >> Nota: " + calificacion[i]);
            }
        }
        }
        
       

    }
}
