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
public class EJE5{
    
   
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese dos números como cadenas de texto
        System.out.print("Ingresa el primer número: ");
        String numero1 = scanner.nextLine();
        
        System.out.print("Ingresa el segundo número: ");
        String numero2 = scanner.nextLine();
        
        // Convertir las cadenas a enteros
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        // Verificar si los dos números son iguales
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }
        
      
    }
}

