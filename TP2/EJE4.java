/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;

public class EJE4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número: ");
        String numero1 = scanner.nextLine();

        System.out.print("Ingresa el segundo número: ");
        String numero2 = scanner.nextLine();

        
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

       
        int suma = num1 + num2;

        
        System.out.println("La suma es: " + suma);

      
    }
}
