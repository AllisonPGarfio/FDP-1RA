/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

public class EVA1_14_IF_VOTAR {


    public static void main(String[] args) {
         int Año, Edad;
         Scanner input = new Scanner(System.in);
         
         System.out.println("Introduce el año de nacimiento: ");
         Año = input.nextInt();
         Edad = 2025 - Año;
         
         if(Edad >= 18){
             System.out.println("Usted SI puede votar");
         }else{
             System.out.println("Usted no cumple la mayoria de edad, por lo cual NO puede votar");
         }
    } 
}
