
package TP1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio3 {
    
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el nombre del empleado
        System.out.print("Ingrese su nombre: ");
        String nombreEmpleado = scanner.nextLine();

        // Solicitar y leer la edad del empleado
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Solicitar y leer el salario del empleado
        System.out.print("Ingrese su salario: ");
        double salario = scanner.nextDouble();

        // Mostrar los datos ingresados
        System.out.println("\n--- Datos del Empleado ---");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);

       
    }
}
    





