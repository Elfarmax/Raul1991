/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioMetdosMath;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author raul.de1
 */
public class Ejercicio1AreaCircunferencia {
   public static void main(String[] args) {
        System.out.println(" Ingrese el número del radio: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;
        
        
        System.out.println(" El área del circulo es: " + area);
        System.out.println(" El área del circulo es: " + circunferencia);
        scanner.close();
    }
    
}