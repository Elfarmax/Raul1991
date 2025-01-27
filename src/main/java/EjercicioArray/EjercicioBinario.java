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
public class EjercicioBinario {
    public static String convertirABinario(int numero){
        Stack<Integer> pila = new Stack<>();
        while (numero > 0){
            pila.push(numero % 2);
            numero /= 2;
        }
        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()){
            binario.append(pila.pop());
        }
        return binario.toString();
    }
    
    public static void main(String[] args) {
        int numero = 13;
        System.out.println(convertirABinario(numero)); // 1101
    }
    
}

