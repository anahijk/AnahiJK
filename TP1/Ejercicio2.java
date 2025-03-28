/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

/**
 *
 * @author Alumno
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
       
        String nombreCompleto = "Anahi Conde";
        String empresa = "Cen Tech";
        String dominio = "CEN.TECH.COM.AR";

       
        System.out.println("Nombre de usuario: " + nombreCompleto);
        System.out.println("Nombre de empresa: " + empresa);
        System.out.println("Nombre dominio: " + dominio);

        
        String correo = generarCorreo(nombreCompleto, dominio);

       
        System.out.println("\nCreando Gmail….");
        System.out.println(correo);
    }

    public static String generarCorreo(String nombreCompleto, String dominio) {
       
        return nombreCompleto + "@" + dominio;
    }
}

