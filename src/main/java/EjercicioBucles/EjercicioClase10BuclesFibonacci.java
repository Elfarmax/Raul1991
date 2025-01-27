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
public class EjercicioClase10BuclesFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el número de términos de la secuencia Fibonacci
        System.out.print("Ingresa el número de la secuencia Fibonacci que deseas ver: ");
        int n = scanner.nextInt();  // El número de términos a generar

        // Validamos que el número ingresado sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            System.out.println("Secuencia de Fibonacci de " + n + " términos:");

            // Definimos las dos primeras variables de la secuencia
            int a = 0, b = 1;

            // Imprimimos los primeros términos de la secuencia
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                // Calculamos el siguiente número de la secuencia
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
        }
        
    }
    }
      