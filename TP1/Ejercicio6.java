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
public class Ejercicio6 {
    public  static void main (String[]args){
        String gusto;
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingres un gusto de helado:");
        gusto= leer.nextLine().toLowerCase();
        if (gusto.equals("Chocolate")
                || gusto.equals("vainilla")
                || gusto.equals("frutilla")
                || gusto.equals("dulce de leche")){
                
                System.out.println("Si tenemos"+gusto);
    
    }else{
    System.out.println("No tenemos ese gusto");
        

                
    }
    }
}