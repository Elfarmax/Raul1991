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
public class EjerciciosRepaso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduzca el número: ");
        int num = scanner.nextInt();
        
        if ( num > 0){
            System.out.println(" El número es positivo ");
        }else if (num < 0){
            System.out.println(" El numero es negativo");
        }else{
            System.out.println(" El número es 0");
            scanner.close();
        }
    }
}


