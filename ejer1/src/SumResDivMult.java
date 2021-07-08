/*1. Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar en pantalla “La <operación> de <número 1> y <número 2> es igual a <resultado> ”.*/
import java.util.Scanner;

public class SumResDivMult {
    public static void main(String[] args) {
        var a = new Scanner(System.in);
        System.out.println("\n Ingrese primer número: ");
        int pmernum = a.nextInt();
        var b = new Scanner(System.in);
        System.out.println("\n Ingrese segundo número: ");
        int segnum = b.nextInt();
                
        System.out.println("\n El resultado de la - es: " +  (pmernum - segnum) + "\n El resultado de la * es: " + (pmernum * segnum) + "\n El resultado de la + es: " + (pmernum + segnum) + "\n El resultado de la / es: " + (pmernum / segnum));
    }
    
}