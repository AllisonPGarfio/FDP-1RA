/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_booleanas;

/**
 *
 * @author garfi
 */
public class EVA1_12_OPERACIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Radio = 5; //Declaro e inicializo
        boolean Resultado;//True o False
        //Operadores booleanos
        Resultado = Radio < 0;
        System.out.println("Radio (5) < 0 es:");
        System.out.println(Resultado);
        
        Resultado = Radio > 0;
        System.out.println("Radio (5) > 0 es:");
        System.out.println(Resultado);
        
        Resultado = Radio == 0;
        System.out.println("Radio (5) == 0 es:");
        System.out.println(Resultado);
        
        // "==" comparación
    }
    
}
