/*
  Iremos capturando el número de control del alumno y su calificación, de un total de 5 alumnos.
  El programa nos irá mostrando en pantalla cualen han aprobado y desaprobado.
*/
package alumno_apro_repro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Alumno_Apro_Repro {

    public static void main(String[] args) {
        
        //Lector de Datos
        Scanner sc = new Scanner(System.in);
        
        //Variables 
        int idControl[] = new int[5];
        double notasAlumno[] = new double[5];
        int aprobado = 0, desaprobado = 0;
        
        //Pedimos los datos al usuario
        System.out.println("\tINGRESO DE NOTAS");
        System.out.println("\t------------------");
        
        //A traves de ventanas emergentes
        for(int i=0;i<5;i++){
           do{
             idControl[i] = Integer.parseInt(JOptionPane.showInputDialog("Alumno N° " + (i+1) + ": "+"\n" +(i+1)+".- Id Control:"));
             if(idControl[i]<=999 || idControl[i]>=10000){
               JOptionPane.showMessageDialog(null,"ERROR...");
               JOptionPane.showMessageDialog(null,"ID INVÁLIDO (mínimo 4 digitos)");
             }
           }while(idControl[i]<=999 || idControl[i]>=10000);
           
           do{
              notasAlumno[i] = Double.parseDouble(JOptionPane.showInputDialog((i+1)+ ".- Nota: "));
              if(notasAlumno[i]<0 || notasAlumno[i]>20){
               JOptionPane.showMessageDialog(null,"ERROR...");
               JOptionPane.showMessageDialog(null,"NOTA INVÁLIDA (mayor que 0)");
              }
           }while(notasAlumno[i]<=0 || notasAlumno[i]>20);
           
           if(notasAlumno[i]<11){
             desaprobado++;
           }
           if(notasAlumno[i]>=11){
             aprobado++;
           }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de aprobados: " + aprobado);
        JOptionPane.showMessageDialog(null, "Cantidad de desaprobados: " + desaprobado);
        
        
        //Muestra de datos ingresados a través de la consola
        System.out.println("\tALUMNOS INGRESADOS");
        System.out.println(" ID  " + "  NOTA");
        for(int i=0;i<5;i++){ 
            System.out.println(idControl[i] + "   " + notasAlumno[i]);
        }
        
        System.out.println("-----------------------------------");
        //Muestra de los alumnos aprobados y desaprobados
        System.out.println("Alumnos Aprobados");
        System.out.println(" ");
        for(int i=0;i<5;i++){
            if(notasAlumno[i]>=11){
                System.out.println("Alumno N°" + (i+1) + ": " + notasAlumno[i]);
           }
        }
        System.out.println("-----------------------------------");
        
        System.out.println("Alumnos Desaprobados");
        System.out.println(" ");
        for(int i=0;i<5;i++){
            if(notasAlumno[i]<11){
                System.out.println("Alumno N°" + (i+1) + ": " + notasAlumno[i]);
           }
        }
        System.out.println("-----------------------------------");
        
        System.out.println("Cantidad de alumnos aprobados: " + aprobado);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobado);
    }
    
}
