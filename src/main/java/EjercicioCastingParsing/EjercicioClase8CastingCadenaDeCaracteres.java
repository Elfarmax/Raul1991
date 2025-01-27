/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCastingParsing;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase8CastingCadenaDeCaracteres {
    public static void main(String[] args) {
        
        String numeroTexto = "7";
        
        char digitoChar = numeroTexto.charAt(0);
        int digitoEntero = Character.getNumericValue(digitoChar);
        
        System.out.println(" Caracter original: " + digitoChar);
        System.out.println(" Entero Convertido: " + digitoEntero);
    }
    
}
