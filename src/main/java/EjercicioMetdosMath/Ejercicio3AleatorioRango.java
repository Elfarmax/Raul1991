/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioMetdosMath;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class Ejercicio3AleatorioRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el rango inferior ");
        int rangoinferior = scanner.nextInt();
        System.out.println(" Ingrese el rango superior ");
        int rangosuperior = scanner.nextInt();
        
        int numeroaleAtorio = (int)(Math.random() * (rangosuperior - rangoinferior + rangoinferior) + rangoinferior);
        
        
        System.out.println(" Número aleatorio entre " + rangoinferior + " y " + rangosuperior + " es " + numeroaleAtorio);
        scanner.close();
        
    }
    
}
