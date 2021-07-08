/*Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) y calcule su número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 
28
Número de la suerte: 28*/
import java.util.Scanner;
public class numSuerte {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("\n Ingrese fecha de nacimiento");
        String numeroEnteroS = sc.nextLine();
        fecha(numeroEnteroS);
    } 
    public static void fecha(String x) {
        int puntero = 0;
        int numA = x.length();

        int a = Integer.parseInt(x.substring(0,2));
        int b = Integer.parseInt(x.substring(3,5));
        int c = Integer.parseInt(x.substring(6,numA));

        String number = String.valueOf(a+b+c);
        System.out.println(number);
        char [] digits1 = number.toCharArray();
        System.out.println(digits1);

        for(int i = 0; i < digits1.length; i++) {
            System.out.println(digits1[i]);
            puntero = Character.getNumericValue(puntero + digits1[i]);
            System.out.println("---"+puntero");
        }
        System.out.println("\n El numero de la suerte es: " + puntero);
    }
}
