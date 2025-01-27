/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSegundoTrimestre;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


/**
 *
 * @author raul.de1
 */
public class EjercicioFechas2ºTrimestreJAVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        while ( continuar ){
            try {
                // Solicitar la fecha al usuario
                System.out.println("Introduce una fecha (dd/mm/yyyy): ");
                String inputFecha = scanner.nextLine();
                
                // Verificar si el formato es válido
                LocalDate fecha = LocalDate.parse(inputFecha,formatter);
                
                LocalDate fechaMinima = LocalDate.of(1900,1,1);
                LocalDate fechaActual = LocalDate.now();
                
                if (fecha.isBefore(fechaMinima)){
                    System.out.println("Error: La fecha no puede ser anterior al 01/01/1900.");
                }else if (fecha.isAfter(fechaActual)){
                    System.out.println("Error: La fecha no puede ser posterior a la fecha actual.");                    
                }else {
                    // Si la fecha es válida, mostrar mensaje de éxito
                    System.out.println("La fecha introducida es válida: " + fecha.format(formatter));
                }
                
                
            } catch (DateTimeParseException e) {
                System.out.println("Error: El formato de la fecha debe ser dd/mm/aaaa.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado. Por favor, inténtalo de nuevo.");
            }
        // Preguntar al usuario si quiere continuar
            System.out.print("¿Quieres validar otra fecha? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
        }   
    }
            System.out.println("¡Gracias por usar el programa de validación de fechas!");
            scanner.close(); 
    }
}
