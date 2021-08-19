package co.edu.utp.misiontic2022;

/**
 * Hello world!
 *
 */
public class principal
{
    public static void main( String[] args )
    {
        balon intem[] = new balon[5];
        intem[0] = new balon();
        intem[1] = new BalonFutbol();
        intem[2] = new BalonVoleibol(200.0, 10, "negro", "exteriores");
        intem[3] = new balon();
        intem[4] = new BalonFutbol(700.0, 2, "red", "golty");
        PrecioTotal analisis1 = new PrecioTotal(intem);
        analisis1.mostrarTotales();
    }
}
