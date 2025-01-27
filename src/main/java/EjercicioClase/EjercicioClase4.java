/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase4 {
    
    public static void main(String[] args) {
      int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array normal");
        
        for (int i = 0; i < numeros.length; i++){
        System.out.println(" " + numeros[i]);
    }
        System.out.println("Array invertida");
      for (int i = numeros.length - 1; i >= 0; i --){
        System.out.println(numeros[i] + " ");
    }
  }
}
