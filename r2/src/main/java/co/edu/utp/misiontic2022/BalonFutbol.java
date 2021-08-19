package co.edu.utp.misiontic2022;

public class BalonFutbol extends balon{
    //Constantes

    private final static String MARCABASE = "adidas";
    //Atributos
    private String marca;
    
    //Constructor
    public BalonFutbol() {
        this.precio = PRECIOBASE;
        this.color = COLORBASE;
        this.tamaño = TAMAÑOBASE;
        marca = MARCABASE;
    }

    //Constructor con 2 parametros, preciosBase, tamaño
    public BalonFutbol(Double precio, Integer tamaño) {
        this.precio = precio;
        super.tipoTamaño(tamaño);
        this.color = COLORBASE;
        this.marca = MARCABASE;
    }

    public BalonFutbol(double precioBase, Integer tamaño, String color, String marca) {
        super(precioBase, tamaño, color);
        this.marca = marca;
    }

    public double precioFinal() {
        //Invocamos el metodo precioFinal del metodo padre
        double adicion = super.precioFinal();
        switch (this.marca) {
            case "adidas":
                adicion += 50;
                break;
            case "puma":
                adicion += 30;
                break;
            case "golty":
                adicion += 70;
                break;
        }
        return adicion;
    }
}
