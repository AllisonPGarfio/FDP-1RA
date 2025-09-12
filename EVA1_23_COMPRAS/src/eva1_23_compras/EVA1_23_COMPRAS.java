/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_23_COMPRAS {
      final static String Cred = "SI";
      final static String Efec = "SI";
    public static void main(String[] args) {
        String C, E;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("USTED CUENTA CON CREDITO??");
        C = input.nextLine();
        
        System.out.println("USTED CUENTA CON EFECTIVO??");
        E = input.nextLine();
        
        
        if(C.equals(Cred) || E.equals(Efec))
           System.out.println("USTED PUEDE PAGAR");
    else
         System.out.println("USTED NO PUEDE PAGAR");
     }
    }
    
