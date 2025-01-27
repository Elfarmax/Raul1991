/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExamen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alejandro.risco
 */
public class Ejercicio3Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rondasGanadas = 0, rondasPerdidas = 0, rondasEmpatadas = 0;

        while (true) {
            System.out.println("Juego: Piedra, Papel o Tijera");
            System.out.println("1. Jugar una ronda");
            System.out.println("2. Ver marcador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("¡Gracias por jugar!");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su jugada (Piedra, Papel, Tijera): ");
                    String usuarioJugada = scanner.next().toLowerCase();

                    if (!usuarioJugada.equals("piedra") && !usuarioJugada.equals("papel") && !usuarioJugada.equals("tijera")) {
                        System.out.println("Jugada no válida. Intente de nuevo.");
                        break;
                    }

                    String[] opciones = {"piedra", "papel", "tijera"};
                    String computadoraJugada = opciones[random.nextInt(3)];
                    System.out.println("La computadora eligió: " + computadoraJugada);

                    if (usuarioJugada.equals(computadoraJugada)) {
                        System.out.println("¡Empate!");
                        rondasEmpatadas++;
                    } else if ((usuarioJugada.equals("piedra") && computadoraJugada.equals("tijera"))
                            || (usuarioJugada.equals("papel") && computadoraJugada.equals("piedra"))
                            || (usuarioJugada.equals("tijera") && computadoraJugada.equals("papel"))) {
                        System.out.println("¡Ganaste esta ronda!");
                        rondasGanadas++;
                    } else {
                        System.out.println("Perdiste esta ronda.");
                        rondasPerdidas++;
                    }
                    break;

                case 2:
                    System.out.println("\n--- Marcador ---");
                    System.out.println("Rondas ganadas: " + rondasGanadas);
                    System.out.println("Rondas perdidas: " + rondasPerdidas);
                    System.out.println("Rondas empatadas: " + rondasEmpatadas);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
