package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //-------------------------------
    // Atributos
    //-------------------------------
    public JButton BMayor;
    public JButton BBorrar;
    public JButton BSalir;
    
    //-------------------------------
    // Metodos
    //-------------------------------
    
    //Metodo constructor
    public PanelOperaciones()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
        
        BMayor = new JButton("Hallar Mayor");
        BMayor.setBounds(7, 20, 150, 30);
        BMayor.setActionCommand("hallarMayor");
        this.add(BMayor);

        BBorrar = new JButton("Borrar");
        BBorrar.setBounds(164, 20, 150, 30);
        BBorrar.setActionCommand("Borrar");
        this.add(BBorrar);

        BSalir = new JButton("Salir");
        BSalir.setBounds(321, 20, 150, 30);
        BSalir.setActionCommand("Salir");
        this.add(BSalir);

        this.setBackground(Color.BLUE);
    }    
}
