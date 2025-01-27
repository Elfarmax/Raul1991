/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int numero;

        System.out.println("Ingrese una serie de números enteros positívos (0 para terminar):"); 
        
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            
            if (numero %2 == 0){
                sumaPares += numero;
            }
             
        } while(numero != 0);
        
        System.out.println("La suma de los nùmeros pares es: " + sumaPares);
        scanner.close();
                
    }
}
//Programa de sumas otra forma

//import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
/**public class EjercicioClase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (true) {
            System.out.print("Ingresa un número entero positivo (0 para terminar):");
            int numero = scanner.nextInt();
        
            if (numero == 0){
                break;
            } else if (numero > 0 && numero %2 == 0){
                suma += numero;
            }
             
        } 
        
        System.out.println("La suma de los nùmeros pares es: " + suma);
        scanner.close();
   */             