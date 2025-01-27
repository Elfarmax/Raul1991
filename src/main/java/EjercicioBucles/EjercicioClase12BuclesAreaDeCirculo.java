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
public class EjercicioClase12BuclesAreaDeCirculo {
    public static double areaCirculo (double radio){
        return Math.PI * radio * radio;
    }
    public static void main(String[] args) {
        System.out.println(" Ingrese el número del radio: ");
        Scanner sacnner = new Scanner(System.in);
        double radio = sacnner.nextDouble();
        double area = areaCirculo(radio);
        
        System.out.println(" El área del circulo " + radio + "es: " + area);
        sacnner.close();
    }
    
}
