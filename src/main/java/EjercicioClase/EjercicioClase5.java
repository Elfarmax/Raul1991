/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         
        int numeroSecreto = random.nextInt(50) + 1;
        int intentos = 0;
        int intento;
       
        
        do {
            System.out.println("Ingrese un número entre 1 y 50: ");
            intento = scanner.nextInt();
            intentos++;
            
            if (intento < 1 || intento > 50) {
                System.out.println("El numero está fuera del rango.");
                continue; // Salta al siguiente intento
            }
      
            if (intentos > numeroSecreto) {
            System.out.println("El numero es mayor.");
            
            }else if (intento < numeroSecreto) {
            System.out.println("El número es menor"); 
            }
        } while (intento != numeroSecreto);
        
        System.out.println("¡Correcto! Has adivinado el numero en " + intentos + " intentos.");
        scanner.close();
            
    }                 
}
    
       

    
 

    
