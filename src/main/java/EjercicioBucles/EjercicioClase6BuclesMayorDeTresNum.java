/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucles;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class EjercicioClase6BuclesMayorDeTresNum{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println(" Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println(" Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        

        if ( num1 > num2 && num1 > num3 ){
            System.out.println(" El número es mayor: " + num1);
        }else if ( num2 > num3 && num2 > num1){
            System.out.println(" El número es mayor: " + num2);
        }else{
            System.out.println(" El numero mayor es: " + num3);
        }
        scanner.close();
    }
}