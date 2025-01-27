/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author raul.de1
 */
public class ejercicoSwitch {
    public static void main(String[] args) {
        int j = 1;
        
        for (int i = 0; i < 5; i++) {
            switch (i){
                case 0:
                case 2:
                    j = j + i;
                    break;
       
                case 1:
                    j = j * i;
                case 3:
                    j = j - i;
                    break;
                default:
                    j = i / j;
            }
        }
        System.out.println(j);
    }
}
