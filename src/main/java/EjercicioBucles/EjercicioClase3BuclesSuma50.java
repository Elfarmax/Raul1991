/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucles;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase3BuclesSuma50 {
    public static void main(String[] args) {
        int suma = 0;

//Bucle for para sumar los primeros 50 números
for (int i = 1; i <= 50; i++){
    suma += i;// Aquí sumamos el valor de i
    System.out.println("Suma de los primeros 50 números" + suma);
        }
    }
}
/* Otra forma de hacerlo
public class EjercicioClase3Bucles {
    public static void main(String[] args) {
        int n = 50;
        int suma = n * (n + 1) / 2;
        
        System.out.println("Suma de los primeros 50 números" + suma);*/