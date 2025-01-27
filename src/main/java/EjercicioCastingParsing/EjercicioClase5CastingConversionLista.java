/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCastingParsing;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase5CastingConversionLista {
    public static void main(String[] args) {
        List<String> listaTexto = Arrays.asList("10", "20", "30");
        List<Integer> listaEnteros = new ArrayList<>();
        
        for (String numero : listaTexto) {
            listaEnteros.add(Integer.parseInt(numero));
        }
        System.out.println(" Lista de enteros: " + listaEnteros);
        
    }
    
}
