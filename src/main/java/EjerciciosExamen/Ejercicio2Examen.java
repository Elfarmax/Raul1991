/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExamen;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class Ejercicio2Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        while (true){
            
            System.out.println(" Seleccione que área quieres calcular: ");
            System.out.println(" 1 a Círculo ");
            System.out.println(" 2 a Cuadrado");
            System.out.println(" 3 a Rectángulo");
            System.out.println(" 4 a Triángulo");
            System.out.println(" 5 a Trapécio");
            System.out.println(" 6 Salir ");
         
        int opcion = scanner.nextInt();
        if (opcion == 6){
            System.out.println(" Has elegido Salir ");
        break;
            }
        
        
        double area;
            
            switch (opcion) {
            case 1:
                System.out.println(" Has elegido el radio del Círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * radio * radio;
                System.out.println(" El resultado es: " + area);
                break;
            case 2:
                System.out.println(" Has elegido el lado del Cuadrado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                System.out.println(" El resultado es: " + area);
                break;
            case 3:
                System.out.println(" Introduce la base: ");
                double base = scanner.nextDouble();
                System.out.println(" Introduce la altura:");
                double altura = scanner.nextDouble();
                area = base * altura;
                System.out.println(" El resultado del es: " + area);
                break;
            case 4:
                System.out.println(" Introduce la base: ");
                double baseTrian = scanner.nextDouble();
                System.out.println(" Introduce la altura: ");
                double alturaTrian = scanner.nextDouble();
                area = baseTrian * alturaTrian / 2;
                System.out.println(" El resultado del es: " + area);
                break;
            case 5:
                System.out.println(" Introduce la basemenor: ");
                double basemayor = scanner.nextDouble();
                System.out.println(" Introduce la basemayor: ");
                double basemenor = scanner.nextDouble();
                System.out.println(" Introduce la altura: ");
                double alturaTrape = scanner.nextDouble();
                area = (basemayor + basemenor) * alturaTrape / 2;
                System.out.println(" El resultado del es: " + area);
            }
            System.out.println();
            System.out.println();
        }
    }
}