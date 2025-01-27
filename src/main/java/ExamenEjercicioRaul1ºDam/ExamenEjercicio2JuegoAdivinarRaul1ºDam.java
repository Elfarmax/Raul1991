/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjercicioRaul1ºDam;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class ExamenEjercicio2JuegoAdivinarRaul1ºDam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(10) + 1;
        int intentos = 3;
        int numeroUsuario;
        boolean adivinado = false;
        
        System.out.println(" *********************************************");
        System.out.println(" * Bienvenido al juego de adivinar el numero *");
        System.out.println(" *********************************************");
        System.out.println("");
        System.out.println(" He elegido un numero entre 1 y 10. Tienes " + intentos + "intentos para adivinarlos. ");
        
        for( int i = 1; i <= intentos; i++) {
            System.out.println(" Intento " + i);
            System.out.print(" Ingresa tu numero: ");
            numeroUsuario = scanner.nextInt();
            
         if (numeroUsuario == numeroSecreto) {
            System.out.println("¡Felicidades! Has adivinado el número.");
            adivinado = true;
            break;
        }else if (numeroUsuario < numeroSecreto) {
            System.out.println(" El numero es mayor ");
             System.out.println("");     
        }else {
            System.out.println(" El numero es menor ");
            System.out.println("");
        }
    }
         
        if(!adivinado) {
            System.out.println(" Lo siento, se te han agotado los intentos. El numero era: " + numeroSecreto);
            System.out.println(" Gracias por jugar ");
}
    scanner.close();
    }
}