/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author Raul.de1
 */
import java.util.Scanner;

public class ejecicioArrays1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        int[] lista = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         for (int i=0;i<lista.length;i++){
              System.out.println(lista[i]);
              
         }

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        
        
       
        for (int i = 0; i <numeros.length; i++) {
            System.out.print("número" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros [i]; 
        }

       
        System.out.println("\nArray en el orden ingresado: ");
        for (int i = 0; 1 <numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            
            System.out.println("\n\nArray en orden inverso");
            for (int j = numeros.length - 1; j >= 0; i--){
                System.out.println("numeros [i]+");
            }
            System.out.println("\n\nSuma de todos los elementos: " +suma);
            
        }
    }
}


