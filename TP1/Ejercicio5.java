/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

import java.util.Scanner;



/**
 *
 * @author Alumno
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad; 

        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt(); // Leer la edad

        // Verificar si puede conducir
        if (edad >= 16) {
            System.out.println("Tienes permiso para conducir.");
        } else {
            System.out.println("No puedes conducir.");
        }

       
    }
}

