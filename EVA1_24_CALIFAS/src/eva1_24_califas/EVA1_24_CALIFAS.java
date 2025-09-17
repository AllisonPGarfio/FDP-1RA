
package eva1_24_califas;

import java.util.Scanner;


public class EVA1_24_CALIFAS {

 
    public static void main(String[] args) {
        int cali;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Agregue su calificación: ");
        cali = input.nextInt();
        
        if(cali>=90 && cali<=100){
            System.out.println("SU LETRA CORRESPONDIENTE ES A");
        }else if(cali>=80 && cali<=89){
            System.out.println("SU LETRA CORRESPONDIENTE ES B");
        }else if(cali>=70 && cali<=79){
            System.out.println("SU LETRA CORRESPONDIENTE ES C");
        }else if(cali>=60 && cali<=69){
            System.out.println("SU LETRA CORRESPONDIENTE ES D");
        }else if(cali>=0 && cali<=59){
            System.out.println("SU LETRA CORRESPONDIENTE ES F");
        }else{
            System.out.println("SU CALIFICACIÓN ES INCORRECTA!!");
        }
    }
    
}
