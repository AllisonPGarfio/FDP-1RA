/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_20_ANTRO {
      final static String A_Cred = "SI";
    public static void main(String[] args) {
        String Credencial;
        String Edad;
        Scanner input = new Scanner(System.in);
        System.out.println("SISTEMA DE ACCESO");
        
        System.out.println("ANTRO");
        
        System.out.println("Usted es mayor de edad?  ");
        Edad = input.nextLine();
        
          if(Edad.equals(A_Cred)){
               System.out.println("Cuenta con credencial?");
                 Credencial = input.nextLine();
              if(Credencial.equals(A_Cred)){
            System.out.println("USTED PUEDE INGRESAR");
        }else{
            System.out.println("USTED NO PUEDE INGRESAR");
        }
          }
    }
    
}
      
