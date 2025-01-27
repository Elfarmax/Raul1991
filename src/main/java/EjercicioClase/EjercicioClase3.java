/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author raul.de1
 */
import java.util.Scanner;

enum Day {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
public class EjercicioClase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un día de la semana (por ejemplo, LUNES: ");
        Day dia = Day.valueOf(scanner.next().toUpperCase());
        
        switch (dia){
        case SABADO,DOMINGO -> System.out.println("Es fin de semana.");
    }
    scanner.close();
    }   
}
