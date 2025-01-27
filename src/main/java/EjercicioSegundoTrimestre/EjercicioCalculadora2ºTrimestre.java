/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSegundoTrimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class EjercicioCalculadora2ºTrimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        
        while (continuar){
            try{
                System.out.println("**********************************");
                System.out.println(" Bienvenido a la calculadora JAVA ");
                System.out.println("**********************************");
                // Solicitar primer número
                System.out.println(" Introduce el primer numero entero: ");
                int num1 = scanner.nextInt();   
                
                
                // Solicitar operador
                System.out.println(" Introduce el operador (+, -, *, /): \"");
                char operador = scanner.next().charAt(0);
                
                
                // Solicitar segundo número
                System.out.println(" Ingrese el segundo numero entero: ");
                int num2 = scanner.nextInt();
                
                // Validar operador y realizar operación
                int resultado;
                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        System.out.println(" Resultado: " + num1 + " + " + num2 + " = " + resultado);
                        break;
                    case '-':
                        resultado = num1 - num2 ;
                        System.out.println(" Resultado: " + num1 + " - " + num2 + " = " + resultado);
                        break;
                    case '*':
                        resultado = num1 * num2;
                        System.out.println(" Resultado: " + num1 + " * " + num2 + " = " + resultado);
                        break;
                    case '/':
                    if (num2 == 0){
                        throw new ArithmeticException(" No se puede dividir entre cero.");
                    }
                    resultado = num1 / num2;
                        System.out.println(" Resultado: " + num1 + " / " + num2 + " = " + resultado);
                        break;
                        default:
                            System.out.println("Error: Operador no válido. Por favor, utiliza (+, -, *, /).");
                            continue;
                    }
                
                    // Preguntar al usuario si quiere continuar
                    System.out.println(" ¿Quieres realizar otra operacion? (s/n): ");
                    char respuesta = scanner.next().charAt(0);
                    if (respuesta != 's' && respuesta != 'S'){
                        continuar = false;
                    } 
            }catch (InputMismatchException e){
                    System.out.println("Error: Entrada no válida. Por favor, introduce números enteros.");
                    scanner.nextLine(); // Limpiar buffer del scanner
                    
            }catch (ArithmeticException e){
                    System.out.println("Error: " + e.getMessage());
            }catch (Exception e){
                    System.out.println("Ha ocurrido un error inesperado. Por favor, inténtalo de nuevo.");
                }
            }
            System.out.println(" ¡Gracias por usar la calculadora!");
            scanner.close();      
    }
}
