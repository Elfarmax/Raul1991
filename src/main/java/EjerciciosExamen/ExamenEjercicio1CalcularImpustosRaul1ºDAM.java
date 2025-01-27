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
public class ExamenEjercicio1CalcularImpustosRaul1ºDAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println(" ********************************************");
            System.out.println(" * Bienvenido a la Calculadora de Impuestos *");
            System.out.println(" ********************************************");
            System.out.println("");
            System.out.println(" Seleccione una opcion ");
            System.out.println(" 1. Calcular impuesto ");
            System.out.println(" 2. 'Salir' ");
            System.out.println("");
            int opcion = scanner.nextInt();

            if (opcion == 2) {
                System.out.println(" 'Salir gracias por jugar' ");
                System.out.println("");
                
            } else if (opcion == 1) {
                System.out.print(" Ingrese el dinero: ");
                System.out.println("");
                double dinero = scanner.nextDouble();
                
                if (dinero <= 0) {
                    System.out.println(" El dinero debe ser positivo. ");
                }
                
                System.out.println("");
                System.out.println(" Seleccione la opcion de la tasa de impuesto: ");
                System.out.println(" 1. (10% IVA reducido) ");
                System.out.println(" 2. (21% IVA estandar) ");
                System.out.println(" 3. (25% Impuesto especial) ");
                System.out.println("");
                int tasa = scanner.nextInt();

                double tasaImpuesto = 0;
                if (tasa == 1) {
                    tasaImpuesto = 10;
                } else if (tasa == 2) {
                    tasaImpuesto = 21;
                } else if (tasa == 3) {
                    tasaImpuesto = 25;
                } else {
                    System.out.println(" Opcion no valida. ");
                }

                double impuesto = dinero * tasaImpuesto / 100;
                double total = dinero + impuesto;

                System.out.println(" Impuesto calculado: " + impuesto);
                System.out.println(" Dinero total (con impuesto): "  + total);
                System.out.println("");
                
            } else {
                System.out.println(" Opcion no valida. ");
                scanner.close();
            }
        }

    }
}

