/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author raul.de1
 */
public class EjercicioClase7MedioAlto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> jugadores = new HashMap<>();

        System.out.println("Ingresa los nombres y puntuaciones de los jugadores (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre del jugador: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;

            System.out.print("Puntuación de " + nombre + ": ");
            int puntuacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            jugadores.put(nombre, puntuacion);
        }

        // Jugador con la puntuación más alta
        String mejorJugador = "";
        int puntuacionMaxima = -1;
        for (Map.Entry<String, Integer> entrada : jugadores.entrySet()) {
            if (entrada.getValue() > puntuacionMaxima) {
                puntuacionMaxima = entrada.getValue();
                mejorJugador = entrada.getKey();
            }
        }
        System.out.println("Jugador con la puntuación más alta: " + mejorJugador + " (" + puntuacionMaxima + ")");

        // Filtrar jugadores con puntuación mayor a un valor
        System.out.print("Ingresa un valor para filtrar puntuaciones mayores: ");
        int valor = scanner.nextInt();
        System.out.println("Jugadores con puntuación mayor a " + valor + ":");
        for (Map.Entry<String, Integer> entrada : jugadores.entrySet()) {
            if (entrada.getValue() > valor) {
                System.out.println(entrada.getKey() + " (" + entrada.getValue() + ")");
            }
        }

        // Verificar si hay empates
        boolean hayEmpate = jugadores.values().stream().distinct().count() < jugadores.size();
        if (hayEmpate) {
            System.out.println("¡Existen jugadores con la misma puntuación!");
        } else {
            System.out.println("No hay empates.");
        }

        scanner.close();
    }
}
