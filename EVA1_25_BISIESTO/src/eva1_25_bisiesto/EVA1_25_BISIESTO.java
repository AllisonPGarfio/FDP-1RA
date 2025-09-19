package eva1_25_bisiesto;

import java.util.Scanner;

public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        int año;
        Scanner input = new Scanner(System.in);
        
        System.out.print("AGREGUE EL AÑO: ");
        año = input.nextInt();

        if(año%400==0 ){
            System.out.println("ESTE AÑO ES BISIESTO");
        }else if(año%100==0){
            System.out.println("ESTE AÑO NO ES BISIESTO");
        }else if(año % 4 == 0){
            System.out.println("ESTE AÑO ES BISIESTO");
        }else{
            System.out.println("ESTE AÑO NO ES BISIESTO");
        }
    }
    
}
