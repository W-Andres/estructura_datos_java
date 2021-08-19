package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
//import Modelo.dao
import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;
//Constructor
public class Requerimiento1 extends JFrame{
    public Requerimiento1() throws SQLException{
        initUI();
    }
    //Metodo
    private void initUI() throws SQLException{
        setLayout(new BorderLayout());
        String[]nombres = { "Ciudad","ID_Proyecto", "Banco_Vinculado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane pane1 = new JScrollPane(tabla);
        add(pane1, BorderLayout.CENTER);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    //Metodo mostrar 
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        //Requerimiento_1Dao requerimiento_1 = new Requerimiento_1Dao();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();
        String matris[][] = new String [lista.size()][4];

        for (int i = 0;  i< lista.size(); i++) {

            matris[i][0] = String.valueOf(lista.get(i).getID_Proyecto());
            matris[i][1] = lista.get(i).getCiudad();
            matris[i][2] = lista.get(i).getBanco_Vinculado();
            matris[i][3] = lista.get(i).getConstructora();

        }
        return matris;
    }
}