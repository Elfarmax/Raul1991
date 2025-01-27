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
public class EjercicioClase4Buclesmultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese un número: ");
        int num = scanner.nextInt();
        System.out.println();
                
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
    }
}
