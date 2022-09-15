package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //-------------------------------
    // Atributos
    //-------------------------------
    private JButton BMayor;
    private JButton BBorrar;
    private JButton BSalir;
    
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
        
        BMayor = new JButton("Mayor");
        BMayor.setBounds(7, 20, 150, 30);
        BMayor.setActionCommand("HallarMayor");
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
