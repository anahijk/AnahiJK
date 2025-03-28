/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alumno
 */

public class EJE6 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcion;

        do {
            System.out.print("Ingresa 1 para lanzar el dado | Ingresa 2 para salir: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                int numero = random.nextInt(6) + 1; 
                
                System.out.println("El número es: " + numero);
            } else if (opcion == 2) {
                System.out.println("Te retiraste de la ronda :(");
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 2);

       
    }
}

    

