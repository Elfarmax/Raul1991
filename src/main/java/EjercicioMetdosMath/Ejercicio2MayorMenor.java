/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioMetdosMath;

import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class Ejercicio2MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println(" Ingrese el primer número: ");
        int num1 = scanner.nextInt();
            System.out.println(" Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
            System.out.println(" Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int maximo1 = Math.max(num1, num2);
        int maximo2 = Math.max (maximo1, num3);   
            System.out.println(" El número mayor es: " + maximo2);
        
        scanner.close();
    }
    
}
