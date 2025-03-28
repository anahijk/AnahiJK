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
public class Ejercicio4 {
    
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.print("Ingrese el nombre de la receta: ");
        String nombreReceta = scanner.nextLine();

        System.out.print("Ingrese los ingredientes principales: ");
        String ingredientes = scanner.nextLine();

        System.out.print("Ingrese el tiempo de preparación (en minutos): ");
        int tiempoPreparacion = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese la dificultad (baja, media, alta): ");
        String dificultad = scanner.nextLine();

        
        System.out.println("\nReceta de Cocina");
        System.out.println("Nombre: " + nombreReceta);
        System.out.println("Ingredientes principales: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultad);

        
      
    }
}

