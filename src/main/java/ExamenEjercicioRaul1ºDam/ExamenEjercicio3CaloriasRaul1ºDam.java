/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjercicioRaul1ºDam;

import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class ExamenEjercicio3CaloriasRaul1ºDam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println(" ********************************* ");
            System.out.println(" *=== Calculadora de Calorias ===* ");
            System.out.println(" ********************************* ");
            System.out.println("");
            System.out.println(" Seleccione una opcion del 1 al 4 ");
            System.out.println(" 1. Correr ");
            System.out.println(" 2. Caminar ");
            System.out.println(" 3. Ciclismo ");
            System.out.println(" 4. 'Salir' ");

            opcion = scanner.nextLine();

            if (opcion.equals("4")) {
                System.out.print(" 'Estas seguro de que desea salir (s/n):' ");
                String confirmarSalida = scanner.nextLine();
                if (confirmarSalida.equalsIgnoreCase("s")) {
                    continuar = false;
                    System.out.println(" 'Gracias por usar la calculadora de calorias.' ");
                }
            } else {
                System.out.print(" Ingrese el tiempo en minutos: ");
                double tiempo = scanner.nextDouble();
                scanner.nextLine();


                if (tiempo <= 0) {
                    System.out.println(" El tiempo debe ser un numero positivo. ");
                    continue;
                }

                double calorias = 0;
                switch (opcion) {
                    case "1":
                        calorias = 11.4 * tiempo;
                        break;
                    case "2":
                        calorias = 5.4 * tiempo; 
                        break;
                    case "3":
                        calorias = 8.5 * tiempo;
                        break;
                    default:
                        System.out.println(" Opcion no valida. ");
                        continue;
                       
                }
                System.out.println(" Calorias quemadas: " + calorias);
                System.out.println(" Gracias ");
            }
        }

        scanner.close();
    }
}


