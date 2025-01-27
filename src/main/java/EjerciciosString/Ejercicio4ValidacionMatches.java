/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosString;

/**
 *
 * @author raul.de1
 */
public class Ejercicio4ValidacionMatches {
    public static void main(String[] args) {
        String correo = "Usuario@dominio.com";
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}.com$";
        
        if (correo.matches(regex)){
           System.out.println("Cumple los requisitos");
        } else{
            System.out.println("No cumple los requisitos");
        }
    }   
}
