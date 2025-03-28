/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author Alumno
 */
public class EJE2 {
    
    
    public static void main(String[] args) {
        String input = "12,34";
        

        input = input.replace(',', '.');

        try {
           
            double number = Double.parseDouble(input);
            System.out.println("Número convertido: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a número.");
        }
    }
}


