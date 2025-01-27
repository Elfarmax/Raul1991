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
public class EjercicioClase11BuclesVerificarNumeroPar {
    public static boolean esPar (int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresa el número: ");
        int numero = scanner.nextInt();
        
        
        if ( esPar(numero)){
            System.out.println(" El número " + numero + " es par. ");
        }else{
            
        }
        
        System.out.println(" El número " + numero + " es impar. ");
    scanner.close();
    }
}
