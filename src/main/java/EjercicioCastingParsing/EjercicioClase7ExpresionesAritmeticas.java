/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCastingParsing;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase7ExpresionesAritmeticas {
    public static void main(String[] args) {
        int numeroEntero = 7;
        double numeroDecimal = 8.75;
        
        int resultado = (int) (numeroEntero + numeroDecimal);
        int resultado2 = (int) Math.round(numeroEntero + numeroDecimal);
        
        System.out.println(" El valor original:" + (numeroEntero + numeroDecimal));
        System.out.println(" El valor castineado: " + resultado);
        System.out.println(" EL valor redondeado: " + resultado2);
    }
    
}
