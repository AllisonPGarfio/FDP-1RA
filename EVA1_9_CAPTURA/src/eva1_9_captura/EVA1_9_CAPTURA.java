/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        int Edad;
        double Promedio;
        Scanner input= new Scanner(System.in);//creamos el scanner
        
        System.out.println("Introduce el Nombre Completo:");
        Nombre = input.nextLine();//captura texto el nextline
        
        System.out.println("Introduce la Edad:");
        Edad = input.nextInt();
        
        System.out.println("Introduce el Promedio:");
        Promedio = input.nextDouble();
        //CAPTURAR
        
        
        System.out.println("El Nombre capturado es:");
        System.out.println(Nombre);
        
        System.out.println("La Edad capturada es:");
        System.out.println(Edad);

        
        System.out.println("El Promedio capturado es:P");
        System.out.println(Promedio);


    }
    
}
