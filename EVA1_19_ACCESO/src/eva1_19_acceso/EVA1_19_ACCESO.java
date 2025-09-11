/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_19_ACCESO {
    //CONSTANTES
     final static String Acceso_Usuario="ALLISON"; //final= Valor final //Static= para que se pueda usar dentro del Static
     final static String Acceso_Contra="HolaMundo";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Usuario, Contra;
       Scanner input = new Scanner(System.in);
       
       System.out.println("CONTROL DE ACCESO");
       System.out.println("Restaurante Doña Daira");
       
       System.out.println("Usuario: ");
       Usuario = input.nextLine();
       
       System.out.println("Contraseña: ");
       Contra = input.nextLine();
       
       if(Usuario.equals(Acceso_Usuario)){
           if(Contra.equals(Acceso_Contra)){
               System.out.println("ACCESO CONFIRMADO");
           }else{
                System.out.println("ACCESO DENEGADO");
           }
       }else{
           System.out.println("INCORRECTO");
       }
    }
    
}
