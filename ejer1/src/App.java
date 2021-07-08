import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");// Mostrar texto en pantalla

        // "sc" es el objeto que permite acceder a los metodos de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Invocar el método "saludar"
        System.out.print("Digite su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(saludar(nombre));

        // Invocar el método "dtNumero"
        System.out.print("Digite un número; ");
        int num = sc.nextInt();
        System.out.println((dtNumero(num)));

        // Invocar el método "conversionGrados"
        System.out.print("Digite los grados centígrados: ");
        double c = sc.nextDouble();
        System.out.println("Grados Fahrenheit: " + conversionGrados(c));

        // Invocar el método "operadorCondicional"
        System.out.print("Digite un número; ");
        int n1 = sc.nextInt();
        System.out.println(operadorCondicional(n1));

    }

    public static String saludar(String msg) {
        return "Hola " + msg + "!";
        // Implemente un algoritmo que dado un nombre en una variable de tipo
        // cadena,imprima un aludo en consola.
    }

    public static String dtNumero(int n) {
        return "doble=" + (n * 2) + " Triple=" + (n * 3);
        // Escribe un programa Java que lee un número entero por teclado y obtiene y
        // muestra por pantalla el doble y el triple de ese número.
    }

    public static double conversionGrados(double c) {
        return 32 + (9 * (c / 5));
        // Escribe un programa que lea una cantidad de grados centígrados y la pase a
        // grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
    }

    public static String operadorCondicional(int n) {
        return n % 2 == 0 ? n + "es par" : n + " es impar";

        // String resultado = "";
        // if (n % 2 == 0){
        // resultado = n + "es par";
        // }else{
        // resultado = n + "es impar";
        // }
        // return resultado;

        // Escribe un programa java que lea una variable de tipo entero y asígnale un
        // valor.A continuación muestra un mensaje indicando si la variable es par o
        // impar.Utiliza el operador condicional ( ? : ) para resolverlo. Ej: “14 es
        // par” o “15 es impar
    }
}
