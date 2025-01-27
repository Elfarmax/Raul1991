/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSegundoTrimestre;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raul.de1
 */
public class PracticaEjercicio2Trimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(6);
        int opcion;
        
        do {
            System.out.println(" Bienvenido al menu ");
            System.out.println(" 1 Agrega un numero: ");
            System.out.println(" 2 Eliminar un numero: ");
            System.out.println(" 3 Buscar un numero: ");
            System.out.println(" 4 Mostrar todos los numeros: ");
            System.out.println(" 5 Ordenar los numeros: ");
            System.out.println(" 6 Sumar los numero: ");
            System.out.println(" 7 Salir: ");
            System.out.println(" 8 Seleccione un numero: ");
            
            opcion = scanner.nextInt();
            
            
            switch (opcion) {
                
                //añadir
                case 1:
                    System.out.println(" Introduce un numero: ");
                    int numeroAñadir = scanner.nextInt();
                    numeros.add(numeroAñadir);
                    System.out.println(" Perfectos añadidos ");
                    break;
                    
                    //eliminar
                case 2:
                    System.out.println(" Introduce un numero: ");
                    int numeroEliminar = scanner.nextInt();
                    numeros.add(numeroEliminar);
                    System.out.println(" Eliminado: ");
                    break;
                    
                    //buscar
                case 3:
                    System.out.println(" Introduce un numero: ");
                    int numeroBuscar = scanner.nextInt();
                    numeros.get(numeroBuscar);
                    System.out.println(" Encontrado: ");
                    break;
                    
                    //mostrar
                case 4:
                    System.out.println("numero en el array: " + numeros);
                    break;
                    
                    //ordenar
                case 5:
                    System.out.println(" Introduce un numero: ");
                    int numeroOrdenar = scanner.nextInt();
                    numeros.sort(null);
                    System.out.println(" Ordenados ");
                    break;
                    
                    //sumar
                case 6:
                    System.out.println(" INtroduce los numeros a sumar: ");
                    int sum = 0;
                    for ( int numero : numeros){
                        sum += numero;
                    }
                    System.out.println(" La suma es: ");
                    break;
                 
                    //salir
                case 7:
                    System.out.println(" Saliendo del programa. ");
                    break;
                    
                default:
                    System.out.println(" Opcion no valida. Intentalo de nuevo. ");
            }
        }while (opcion != 6);
        scanner.close();
        
       
        
    }
    
}
