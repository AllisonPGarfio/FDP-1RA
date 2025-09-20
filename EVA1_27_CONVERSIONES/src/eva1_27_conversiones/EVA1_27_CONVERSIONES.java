package eva1_27_conversiones;

public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
        int temp;
        double temDec = 25.7;
        temp = (int)temDec;//Convierte el doble a entero //casting 
        System.out.println(temp);
        
        double tempDec2;
        tempDec2 = temp;
        System.out.println(tempDec2);
        
        String cade, mensaje;
        cade="LA TEMPERATURA ES: ";
        mensaje = cade+temp;//CONCATENACIÓN
        System.out.println(mensaje);
    }
    
}
