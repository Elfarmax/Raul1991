/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author raul.de1
 */
public class ejercicioscondicionalanidado {
    public static void main(String[] args) {
        int numero = 10;
        
        if (numero > 0){
            if (numero %2 == 0){
                System.out.println("El numero es psitivo y par");
            }else {
                    System.out.println("El numero es negativo e impar");
                     }
                
        } else if (numero <0 ){
            if (numero %2 == 0) {
                    System.out.println("El numeroes negativo y par");
            } else {
                System.out.println( "El numero es negativo e impar");
                }
            }
        }
    }
