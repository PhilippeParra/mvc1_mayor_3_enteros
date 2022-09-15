package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

import java.awt.Color;

public class PanelResultados extends JPanel
{
    //-------------------------------
    // Atributos
    //-------------------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
    //-------------------------------
    // Metodos
    //-------------------------------
    
    //Metodo constructor
    public PanelResultados()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        taResultado = new JTextArea();
        spResultado = new JScrollPane();
        spResultado.setBounds(10 , 20 , 460, 150);
        this.add(spResultado);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        this.setBackground(Color.RED);
    }   

    //Borrar

    public void Borrar()
    {
        taResultado.setText("");
    }
}
