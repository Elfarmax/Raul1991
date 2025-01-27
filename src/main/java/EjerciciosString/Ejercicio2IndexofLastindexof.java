/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosString;

/**
 *
 * @author raul.de1
 */
public class Ejercicio2IndexofLastindexof {
    public static void main(String[] args) {
        String texto = "El gato y el ratón están en el jardín";
        int primeraAparion = texto.indexOf("El");
        int ultimaAparicion = texto.lastIndexOf("el");
        System.out.println(" La primera aparicion de 'el': " + primeraAparion);
        System.out.println(" La ultima aparicion de 'el': " + ultimaAparicion);
        
    }
    
}
