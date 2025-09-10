/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_meses;

import java.util.Scanner;

public class EVA1_18_MESES {

    public static void main(String[] args) {
        int Mes;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Ingresa el numero del mes: ");
      Mes = input.nextInt();
      
      if(Mes== 1){
          System.out.println("Enero");     
      } else if(Mes == 2){
          System.out.println("Febrero");
      }else if(Mes == 3){
          System.out.println("Marzo");
      }else if(Mes == 4){
          System.out.println("Abril");
      }else if(Mes == 5){
          System.out.println("Mayo");
      }else if(Mes == 6){
          System.out.println("Junio");
      }else if(Mes == 7){
          System.out.println("Julio");
      }else if(Mes == 8){
          System.out.println("Agosto");
      }else if(Mes == 9){
          System.out.println("Septiembre");
      }else if(Mes == 10){
          System.out.println("Octubre");
      }else if(Mes == 11){
          System.out.println("Noviembre");
      }else if(Mes == 12){
          System.out.println("Diciembre");
      }else{
          System.out.println("NO es un mes");
      }
    }
 }
   
