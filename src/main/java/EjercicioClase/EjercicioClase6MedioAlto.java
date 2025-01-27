/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase6MedioAlto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Ingresa nombres (escribe 'fin' para terminar):");
        String nombre;
        while (!(nombre = scanner.nextLine()).equalsIgnoreCase("fin")) {
            nombres.add(nombre);
        }

        // Imprimir cantidad de nombres
        System.out.println("Cantidad de nombres ingresados: " + nombres.size());

        if (!nombres.isEmpty()) {
            // Nombre más largo y más corto
            String nombreMasLargo = "", nombreMasCorto = nombres.get(0);

            for (String n : nombres) {
                if (n.length() > nombreMasLargo.length()) nombreMasLargo = n;
                if (n.length() < nombreMasCorto.length()) nombreMasCorto = n;
            }

            System.out.println("Nombre más largo: " + nombreMasLargo);
            System.out.println("Nombre más corto: " + nombreMasCorto);

            // Mostrar nombres que comienzan con 'A'
            System.out.println("Nombres que comienzan con 'A':");
            for (String n : nombres) {
                if (n.toLowerCase().startsWith("a")) {
                    System.out.println(n);
                }
            }
        }

        scanner.close();
    }
}

