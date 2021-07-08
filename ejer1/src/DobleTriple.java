import java.util.Scanner;

public class DobleTriple {
    public static void main (String[] args) {
        var variable =  new Scanner(System.in);//Lo unico que cambia es
        System.out.println("\n Ingrese numero");//mensaje
        int numero = variable.nextInt();//utilizamos el metodo cap
        System.out.println("\n El doble del número es: " + (numero * 2) + "\n El triple del número es:" + (numero * 3));
    }
}
