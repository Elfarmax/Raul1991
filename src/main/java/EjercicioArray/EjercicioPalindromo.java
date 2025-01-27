/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArray;
import java.util.Stack;
/**
 *
 * @author raul.de1
 */
public class EjercicioPalindromo {
    public static boolean esPalindromo(String palabra) {
        Stack<Character> pila = new Stack<>();
        for (char c : palabra.toCharArray()){
            pila.push(c);
        }
        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()){
            invertida.append(pila.pop());
        }
        return palabra.equals(invertida.toString());
    }
    public static void main(String[] args) {
        String palabra = "radar";
        System.out.println("¿Es palíndromo? " + esPalindromo(palabra));
    }
}
