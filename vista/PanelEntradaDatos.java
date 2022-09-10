package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //-------------------------------
    // Atributos
    //-------------------------------
    private JLabel LbTitulo;
    private JLabel LbX;
    private JLabel LbY;
    private JLabel LbZ;

    private JTextField tx;
    
    //-------------------------------
    // Metodos
    //-------------------------------
    
    //Metodo constructor
    public PanelEntradaDatos()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Crear y agregar etiqueta para titulo
        LbTitulo = new JLabel("MAYOR DE 3 ENTEROS", JLabel.CENTER);
        LbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        LbTitulo.setForeground(Color.BLUE);
        LbTitulo.setBounds(10,10,465,20);
        this.add(LbTitulo);

        LbX = new JLabel("X =");
        LbX.setFont(new Font("Arial", Font.BOLD, 25));
        LbX.setForeground(Color.BLACK);
        LbX.setBounds(10,60,40,40);
        this.add(LbX);

        LbY = new JLabel("Y =");
        LbY.setFont(new Font("Arial", Font.BOLD, 25));
        LbY.setForeground(Color.BLACK);
        LbY.setBounds(10,100,40,40);
        this.add(LbY);

        LbZ = new JLabel("Z =");
        LbZ.setFont(new Font("Arial", Font.BOLD, 25));
        LbZ.setForeground(Color.BLACK);
        LbZ.setBounds(11,140,40,40);
        this.add(LbZ);


        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

}
