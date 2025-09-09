/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double venta, descuento;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Ingrese el monto a pagar: ");
       venta = input.nextDouble();
       descuento = (venta*0.85); 
       
       if(venta>1000){
           System.out.println("Su monto a pagar es de: "+descuento);
  
       }else{
           System.out.println("Su monto a pagar no se le puede aplicar descuento, usted paga: "+venta);
       }
    }
    
}
