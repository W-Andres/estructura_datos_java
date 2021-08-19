package co.edu.utp.misiontic2022;

public class PrecioTotal {
    //Atributos
    private double totalBalon;
    private double totalFutbol;
    private double totalVoleibol;
    private balon[] balones;
    //private String[] enseres;
    
    //Constructor
    public PrecioTotal(balon[] balones) {
        this.totalBalon = 0;
        this.totalFutbol = 0;
        this.totalVoleibol = 0;
        this.balones = balones;
    }

    //Métodos
    public void mostrarTotales() {
        for (int i = 0; i < balones.length; i++) {
            if (balones[i] instanceof balon) {
                totalBalon += balones[i].precioFinal();
            }
            if (balones[i] instanceof BalonFutbol) {
                totalFutbol += balones[i].precioFinal();
            }
            if (balones[i] instanceof BalonVoleibol) {
                totalVoleibol += balones[i].precioFinal();
            }
        }
    System.out.println("La suma del precio de los balones es de " + totalBalon);
    System.out.println("La suma del precio de los balones de futbol es de " + totalFutbol);
    System.out.println("La suma del precio de los balones de voleibol es de " + totalVoleibol);    
    }
}
