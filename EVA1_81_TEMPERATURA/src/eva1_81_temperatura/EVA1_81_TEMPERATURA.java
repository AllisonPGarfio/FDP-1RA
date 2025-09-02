/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_81_temperatura;

/**
 *
 * @author garfi
 */
public class EVA1_81_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Far, Cent;
        
        Far=40;
        Cent=(5*(Far-32))/9;
        
        System.out.println("Los grados Fahrenheit 40 a Celsius es:");
        System.out.println(Cent);
    }
    
}
