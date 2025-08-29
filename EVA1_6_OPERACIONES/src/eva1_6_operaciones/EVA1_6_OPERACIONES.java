/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author garfi
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        double Radio;
        double Area;
        double Pi;
        //Inicialización
        Pi=3.1416;
        Radio=5;
        Area=Pi*Radio*Radio;
        
        System.out.println("El valor de un circulo de Radio 5 es: ");
        System.out.println(Area);
        
        Radio=100;
        Area=Pi*Radio*Radio;
        
        System.out.println("El valor de un circulo de Radio 100 es: ");
        System.out.println(Area);
    }
}
