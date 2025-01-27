/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author raul.de1
 */
import java.util.Scanner;
import java.util.Random;
        
public class ejercicioAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(10) + 1;
        int intentos = 3;
        int numeroUsuario;
        boolean adivinado = false;
        
        System.out.println("¡Bienvenido al juego de adivinar el numero!");
        System.out.println("He elegido un numero entre 1 y 10. Tienes " + intentos + "intentos para adivinarlos.");
        
        for( int i = 1; i <= intentos; i++) {
            System.out.println("Intento" + i +": Ingresa tu número.");
            numeroUsuario = scanner.nextInt();
           
         if (numeroUsuario == numeroSecreto) {
            System.out.println("¡Felicidades! Has adivinado el número.");
            adivinado = true;
            break;
        }else if (numeroUsuario < numeroSecreto) {
            System.out.println("El numero es mayor"); 
        }else {
            System.out.println("El numero es menor");
        }
    }
    if(!adivinado) {
            System.out.println("Lo siento, se te han agotado los intentos. El numero era: +  numeroSecreto");
}
    scanner.close();
}
}

