/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucles;

import java.util.Scanner;
/**
 *
 * @author raul.de1
 */
public class EjercicioClase5BuclesFactoriales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        int factorial = 1;
        
        int i = numero;
        while (i > 1){
            factorial *= i;
            i--;
        }
        System.out.println("EL Factorial de " + numero + " Es: " + factorial);
    }
}
        
        
        
