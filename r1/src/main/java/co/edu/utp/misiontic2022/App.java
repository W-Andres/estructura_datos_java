package co.edu.utp.misiontic2022;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sistema_De_inversion a = new Sistema_De_inversion(36, 3500000.0, 1.18);
        Double b = a.interesSimple();
        Double c = a.interesCompuesto();
        a.compararInversion(c, b);
    }
}
