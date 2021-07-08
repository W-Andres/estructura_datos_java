import java.util.Scanner;
/*Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres=altura-110*/

public class PesoAlturaSexo {
    public static void main(String [] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Escriba Sexo");
        String gender = data.next();
        System.out.println("Escriba altura");
        int c = data.nextInt();
        System.out.println(gender);
        //sale del programa
        if(gender == ('m')){
            System.out.println("Peso ideal es: " + (c - 110 ));
        }
        else if (gender.equals("f") || gender.equals("F")){
            System.out.println("El peso ideal es: " + (c - 120));
        }
    }
    
}
