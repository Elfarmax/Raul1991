/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucles;

import java.util.Scanner;

public class EjercicioClase7BuclesCalificaciones {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); 
     // Solicitar cinco calificaciones al usuario
        System.out.print("Introduce la primera calificación: ");
        double cal1 = scanner.nextDouble();
        
        System.out.print("Introduce la segunda calificación: ");
        double cal2 = scanner.nextDouble();
        
        System.out.print("Introduce la tercera calificación: ");
        double cal3 = scanner.nextDouble();
        
        System.out.print("Introduce la cuarta calificación: ");
        double cal4 = scanner.nextDouble();
        
        System.out.print("Introduce la quinta calificación: ");
        double cal5 = scanner.nextDouble();
              
          double promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
        
        // Mostrar el promedio
        System.out.println("El promedio es: " + promedio);
        
         if (promedio >=5){
             System.out.println("Esta aprobado");
                   
         }else{
             System.out.println("esta suspenso");
         }
         scanner.close();
          }
     }

