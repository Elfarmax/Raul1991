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

public class convertidorCelsius {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados celsius: ");
        double celsius = Scanner.nextDouble();
        double fahrenheit = (celsius *9/5)+ 32;
        System.out.println("La temperatura en fahrenheit es: "+ fahrenheit);
    }
}
