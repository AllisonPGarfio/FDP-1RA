/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author garfi
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicitar la temperatura en farenheit 
        Scanner input = new Scanner(System.in);
        double Far, Cent;
        //captura:
        System.out.println("Temperatura en grados Farenheit: ");
        Far = input.nextDouble();
        //darle la temperatura en grados centigrados
        Cent=5*(Far-32)/9;
        System.out.println("La temperatura es: ");
        System.out.println(Cent);
    }
    
}
