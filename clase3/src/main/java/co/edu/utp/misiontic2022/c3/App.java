package co.edu.utp.misiontic2022.c3;

//El diagrama de clases que sera utilizado para el ejercicio de herencia, composición y agregación esta en la presentación #3 de la unidad 1 slide #17

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona objPersona1 = new Empleado("Byron", 20, 10546.32);
        Persona objPersona2 = new Cliente("Javier", 30, "(032) 446 23 45");

        //polimorfismo: capasidad dque tiene un metodo de comportarse de diferentes maneras, según el objeto que lo llame. Eje: mostrar()
        objPersona1.mostrar();
        objPersona2.mostrar();

        System.out.println(objPersona1);
        System.out.println(objPersona2);

        //Se crea el objeto de empresa para validar la relación entre empresa y empleado
        //Composición -->Relación fuerte -->Se hace a través del atrivuto de la clase.
        Empresa objEmpresa = new Empresa("MisionTIC2022", (Empleado) objPersona1);
        System.out.println(objEmpresa);

        //Agregación -->Relación débil --> Se hace a través de un parámetro de un método de la clase Empresa.
        
    }
}
