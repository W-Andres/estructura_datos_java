package co.edu.utp.misiontic2022.c3;

public class Persona{

    private String nombre;
    private int edad;

    //Constructor
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
    //extends, super, y polimorfismo: cpacidad que tiene un codigo para adaptarse a la necesidad del metodo 
    public void mostrar(){

    }
}