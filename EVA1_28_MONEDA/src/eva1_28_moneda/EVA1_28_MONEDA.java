/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_28_MONEDA {

    public static void main(String[] args) {
       int usu;
       double val = Math.random();
       Scanner input = new Scanner(System.in);
       
       System.out.println("ELIGE AGUILA O SELLO (1/0): ");
       usu = input.nextInt();
       
       if(val>0.5 && usu==1){
           System.out.println("AGUILA, ACERTASTE!!");
       }else if(val<0.5 && usu==1){
           System.out.println("SELLO, PERDISTE!!");
       }else if(val<0.5 && usu==0){
           System.out.println("SELLO, ACERTASTE!!");
       }else if(val>0.5 && usu==0){
           System.out.println("AGUILA, ACERTASTE!!");
       }else if(val>0.5 && usu==0){
           System.out.println("AGUILA, PERDISTE!!");
       }else{
           System.out.println("NUMERO INCORRECTO");
       }
    }
    
}
