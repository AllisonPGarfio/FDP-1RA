/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_13_IF {

    public static void main(String[] args) {
        double Cali;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce la calificacion: ");
        Cali = input.nextDouble();
        
        if(Cali >= 70){//IF Solo evalua verdadero o falso
            System.out.println("Toma sus vacaciones");
        }else{
            System.out.println("se queda sin vacaciones");
        }
            
    }
    
}
