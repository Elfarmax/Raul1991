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
public class EjercicioClase13CelsiusFahrenheit {
    public static double celsiusFahrenheit( double celsius){
     return (celsius *9 / 5) + 32;
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Ingrese los grados celsius: ");
        
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusFahrenheit(celsius);
        System.out.println(" Los grados celsius equivalen a: " + fahrenheit);
        scanner.close();
    }
}
