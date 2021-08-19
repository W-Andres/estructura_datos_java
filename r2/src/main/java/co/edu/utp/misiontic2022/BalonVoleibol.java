package co.edu.utp.misiontic2022;

public class BalonVoleibol extends balon {
    //Constantes
    private final static String SUELOBASE = "indefinido";

    //Atributos
    private String suelo;

    //Constructor

    public BalonVoleibol() {
        this.precio = PRECIOBASE;
        this.color = COLORBASE;
        this.tamaño = TAMAÑOBASE;
        this.suelo = SUELOBASE;
    }

    //Constructor con 2 parametros, precioBase, tamaño
    public BalonVoleibol(Double precio, String color) {
        this.precio = precio;
        super.tipoColor(color);
        this.suelo = SUELOBASE;
    }

    public BalonVoleibol(Double precioBase, Integer tamaño, String color, String suelo) {
        super(precioBase, tamaño, color);
        this.suelo = suelo;
    }

    public double precioFinal() {
        //Invocamos el método predioFinal del método padre
        double adicion = super.precioFinal();
        switch (this.suelo) {
            case "exteriores":
                adicion += 50;
                break;
            case "interiores":
                adicion += 30;
                break;
            case "indefinido":
                adicion += 20;
                break;
        }
        return adicion;
    }
}