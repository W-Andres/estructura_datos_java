package co.edu.utp.misiontic2022;

public class Sistema_De_inversion {
    Integer pTiempo=0;
    Double pCapital=0.0;
    Double pInteres=0.0;

    //Constructor
    public Sistema_De_inversion(Integer pTiempo, Double pCapital, Double pInteres){
        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;
    }

    //Metodos: ecuaciones 
    public Double interesSimple(){
        Double a = pCapital * (pInteres / 100) * pTiempo;
        return a;
    }

    public Double interesCompuesto(){
        Double a = pCapital*(Math.pow((1+pInteres/100),pTiempo)-1);
        return a;
    }

    public void compararInversion(Double a, Double b){

        if ((a !=0) && (b !=0)){
            System.out.println("El interés simple es: "+ b + ", el interés compuesto es: " + a +", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + (a-b));
        } else {
            System.out.println("Faltan datos para calcular la diferencia en el total de intereses ");
        }
        
        
    }

}


