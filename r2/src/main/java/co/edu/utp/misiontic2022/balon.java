package co.edu.utp.misiontic2022;

public class balon {
    //Constantes 
    protected final static String COLORBASE = "negro";
    protected final static int TAMAÑOBASE = 1;
    protected final static double PRECIOBASE = 100;

    //Atributos 
    protected double precio;
    protected String color;
    protected int tamaño;

    //Constructores
    //1
    public balon() {
        this.precio = PRECIOBASE;
        this.color = COLORBASE;
        this.tamaño = TAMAÑOBASE;
    }
    //2
    public balon(Double precio, String color) {
        this.precio = precio;
        tipoColor(color);
        this.tamaño = TAMAÑOBASE;
    }
    //3
    public balon(Double precio, Integer tamaño, String color) {
        this.precio = precio;
        tipoColor(color);
        tipoTamaño(tamaño);
    }

    public void tipoColor(String color) {
        //Colores disponibles 
        String colores[] = { "negro", "cafe", "blanco", "rojo" };
        boolean encontrado = false;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLORBASE;
        }
    }
    
    public void tipoTamaño(int tamaño) {
        if (tamaño >= 1 && tamaño <= 6) {
            this.tamaño = tamaño;
        } else {
            this.tamaño = TAMAÑOBASE;
        }
    }
    //get y set
    public void setPrecio(Double precio) {
        this.precio = precio;
    }   
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio(){
        return precio;
    }

    public String getColor() {
        return color;
    }

    public Integer getTamaño() {
        return tamaño;
    }
    
    //Metodo de suma
    public double precioFinal(){
        double adicion = 0;
        switch (color) {
            case "negro":
                adicion += 100;
                break;
            case "cafe":
                adicion += 80;
                break;
            case "blanco":
                adicion += 70;
                break;
            case "rojo":
                adicion += 50;
                break;
        }
        
        if (tamaño == 1) {
            adicion += 200;
        }
        else if (tamaño == 2) {
            adicion += 300;
        }
        else if (tamaño == 3) {
            adicion += 400;
        }
        else if (tamaño == 4) {
            adicion += 500;
        }
        else if (tamaño == 5) {
            adicion += 600;
        }
        else if (tamaño == 6) {
            adicion += 700;
        }
        return precio + adicion;
    }
}
