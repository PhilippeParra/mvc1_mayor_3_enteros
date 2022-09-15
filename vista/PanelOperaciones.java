package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    //-------------------------------
    // Atributos
    //-------------------------------
    private JButton BMayor;
    private JButton BMenor;
    private JButton Bclear;
    
    //-------------------------------
    // Metodos
    //-------------------------------
    
    //Metodo constructor
    public PanelOperaciones()
    {
        BMayor = new JButton("Mayor");
        BMayor.setFont(new Font("Arial", Font.BOLD, 25));
        BMayor.setBounds(10, 100, 50, 30);
        this.add(BMayor);

        BMenor = new JButton("Menor");
        BMenor.setFont(new Font("Arial", Font.BOLD, 25));
        BMenor.setBounds(10, 100, 50, 30);
        this.add(BMenor);

        Bclear = new JButton("Borrar");
        Bclear.setFont(new Font("Arial", Font.BOLD, 25));
        Bclear.setBounds(10, 100, 50, 30);
        this.add(Bclear);

        this.setBackground(Color.BLUE);
    }    
}
