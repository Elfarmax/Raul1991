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
public class EjercicioClase9BuclesAñoBisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el número ");
        int año = scanner.nextInt();
       
        if (( año % 4 == 0 && año % 100 !=0) || (año % 400 == 0)){
            System.out.println(año + " Es un año bisiesto ");
        } else{
            System.out.println(año + " No es un año bisiesto ");
        }
        scanner.close();
        
    }
}
