/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1= input.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
       
        if(num1>num2){
            System.out.println("El numero mayor es: "+num1);
        }else{
            if(num2>num1){ //IF anidados
            System.out.println("El numero mayor es: "+num2); 
               
        }else{
               System.out.println("Los dos numeros son iguales");
            }
        }
    }
    
}
