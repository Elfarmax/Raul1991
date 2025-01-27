/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExamen;

import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class Ejercicio1Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.println(" Seleccione a que moneda quieres convertir: ");
        System.out.println(" 1 a Dolares ");
        System.out.println(" 2 a Esterlinas");
        System.out.println(" 3 a Yenes Japoneses");
        System.out.println(" 4 Salir ");
         
        int opcion = scanner.nextInt();
        if (opcion == 4){
            System.out.println(" No se puede convertir, Saliendo");
            break;
        }
        System.out.println("Introduce los Euros a convertir: ");
        double euros = scanner.nextDouble();
        
        switch (opcion) {
            case 1:
                System.out.println(" Has elegido Cambio a Dolares: ");
                double conversionDolares = euros * 1.10;
                System.out.println(" El resultado es: " + conversionDolares);
                break;
            case 2:
                System.out.println(" Has elegido Cambio a Esterlinas: ");
                double conversionEsterlinas = euros * 0.86;
                System.out.println(" El resultado es: " + conversionEsterlinas);
                break;
            case 3:
                System.out.println(" Has elegido Cambio a yenes Japoneses: ");
                double conversionYenesJaponeses = euros * 150.20;
                System.out.println(" El resultado es: " + conversionYenesJaponeses);
                break;
                case 4:
                System.out.println(" No hay conversion, has elegido Salir");
                break;
            }
        System.out.println();
        System.out.println();
        }
    }
}
