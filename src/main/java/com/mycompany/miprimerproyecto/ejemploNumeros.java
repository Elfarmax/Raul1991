/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;


/**
 *
 * @author raul.de1
 */

import java.util.Scanner;
public class ejemploNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int opcion;
           
            do{
                System.out.println("Ingrese un Número entre 1 y 3 (0 para salir):");
                opcion = sc.nextInt();
                
                if (opcion == 0){
                    System.out.println("Saliendo...");
                    break;
                }
                
                switch (opcion){
                    case 1:
                        System.out.println("Seleccionaste opcion 1.");
                        break;
                    case 2: System.out.println("Seleccionaste opcion 2.");
                    break;
                    case 3:
                        System.out.println("Seleccionaste opcion 3.");
                    default:
                        System.out.println("Número no válido.");
                        break;
                }
            } while (opcion != 0);
            sc.close();
        }     
    }
}
