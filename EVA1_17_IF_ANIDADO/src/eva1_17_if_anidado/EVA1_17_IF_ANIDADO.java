/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_if_anidado;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_17_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int Dia;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Ingresa el numero del dia de la semana: ");
      Dia= input.nextInt();
      
      if(Dia == 1){
          System.out.println("Domingo");         
      } else if(Dia == 2){
          System.out.println("Lunes");
      }else if(Dia == 3){
          System.out.println("Martes");
      }else if(Dia == 4){
          System.out.println("Miercoles");
      }else if(Dia == 5){
          System.out.println("Jueves");
      }else if(Dia == 6){
          System.out.println("Viernes");
      }else if(Dia == 7){
          System.out.println("Sabado");
      }else{
          System.out.println("NO es un dia de la semana");
      }
    }
    
}
