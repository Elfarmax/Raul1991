/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author raul.de1
 */
class Usuario {
    String nombre;
    boolean esPremium;
    
    public Usuario (String nombre, boolean esPremium){
        this.nombre = nombre;
        this.esPremium = esPremium;
    }
    
    public String obtenerSaludo(){
        return esPremium ? "¡ Hola " + nombre + "! Gracias por ser premium.": 
                           "¡Hola " + nombre + "! Considera ser un usuario premium y obten ventajas.";                
    }
}

public class ejercicioPracticaTernario {
    public static void main (String[]args) {
        Usuario usuario1 = new Usuario("Juan", true);
        Usuario usuario2 = new Usuario("Ana", false);
        
        System.out.println(usuario1.obtenerSaludo());
        System.out.println(usuario2.obtenerSaludo());
    }
}

