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
public class EjerciciosClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca la temperatura en Celsius");
        double temperatura = scanner.nextDouble();
        
        if (temperatura >30){
            System.out.println("El clima es Caluroso");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("El clima es Templado");
        } else {
        System.out.println("El clima es Frío");
        }
        scanner.close();
    }
}
  // PROGRAMA DE TEMPERATURAS