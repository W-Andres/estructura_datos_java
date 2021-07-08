import java.util.Scanner;
/*2. Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.*/
public class AprbRprb {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String name = nombre.nextLine();

        Scanner nota1 = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        float n1 = nota1.nextFloat();
        Scanner nota2 = new Scanner(System.in);
        System.out.println("Ingrese la segunda nota: ");
        float n2 = nota2.nextFloat();
        Scanner nota3 = new Scanner(System.in);
        System.out.println("Ingrese la tercera nota: ");
        float n3 = nota3.nextFloat();
        
        float promedio = ((n1 + n2 + n3) / 3);

        if (promedio > 3) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
