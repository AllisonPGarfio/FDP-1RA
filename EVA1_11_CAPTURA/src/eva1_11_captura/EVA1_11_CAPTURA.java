/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculo de velocidad
        //Solicitar distancia (M) y tiempo(S)
        //Calcular la velocidad (M/S)
        //Declarar variables y scanner 
        Scanner input = new Scanner(System.in);
        double D,T,V,KM;
        //Solicitar datos
        System.out.println("El valor de la distancia en metros es: ");
        D = input.nextDouble();
        
        System.out.println("El valor del tiempo en segundos es: ");
        T = input.nextDouble();
        //Realizar calculos 
         V=D/T;
         KM=V*3.6;
        //Mostrar Resultados
        System.out.println("La velocidad en metros por segundo es: ");
        System.out.println(V);
         System.out.println("La velocidad  en Kilometros por hora es: ");
        System.out.println(KM);
    }
    
}
