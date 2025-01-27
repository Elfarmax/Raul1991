/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosString;

/**
 *
 * @author raul.de1
 */
public class Ejercicio3ReplaceAll {
    public static void main(String[] args) {
        String texto = "A123B456C789";
        String remplazo = texto.replaceAll("\\d", "*");
        System.out.println(" El remplazo de la cadena es: " + remplazo);
    }
    
}
