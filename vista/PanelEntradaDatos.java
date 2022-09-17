package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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
    private JLabel LbImagen;
    private ImageIcon iImagen;
    private JLabel LbX;
    private JLabel LbY;
    private JLabel LbZ;

    private JTextField tx;
    private JTextField ty;
    private JTextField tz;
    
    //-------------------------------
    // Metodos
    //-------------------------------
    
    //Metodo constructor
    public PanelEntradaDatos()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        //Crear y agregar etiqueta para titulo
        LbTitulo = new JLabel("MAYOR DE 3 ENTEROS", JLabel.CENTER);
        LbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        LbTitulo.setForeground(Color.BLUE);
        LbTitulo.setBounds(0,10,465,20);
        this.add(LbTitulo);

        // creacion y adicion de imagen
        iImagen = new ImageIcon(getClass().getResource("mayorQue.png"));
        LbImagen = new JLabel(iImagen);
        LbImagen.setBounds(310, 60, 100, 100);
        this.add(LbImagen);

        LbX = new JLabel("X =" , JLabel.RIGHT);
        LbX.setFont(new Font("Arial", Font.BOLD, 25));
        LbX.setForeground(Color.BLACK);
        LbX.setBounds(50,50,40,40);
        this.add(LbX);

        LbY = new JLabel("Y =" , JLabel.RIGHT);
        LbY.setFont(new Font("Arial", Font.BOLD, 25));
        LbY.setForeground(Color.BLACK);
        LbY.setBounds(50,100,40,40);
        this.add(LbY);

        LbZ = new JLabel("Z =" , JLabel.RIGHT);
        LbZ.setFont(new Font("Arial", Font.BOLD, 25));
        LbZ.setForeground(Color.BLACK);
        LbZ.setBounds(50,150,40,20);
        this.add(LbZ);

        tx = new JTextField();
        tx.setFont(new Font("Arial", Font.BOLD, 20));
        tx.setBounds(120, 60, 120, 20);
        tx.setForeground(Color.BLACK);
        this.add(tx);

        ty = new JTextField();
        ty.setFont(new Font("Arial", Font.BOLD, 20));
        ty.setBounds(120, 100, 120, 20);
        this.add(ty);

        tz = new JTextField();
        tz.setFont(new Font("Arial", Font.BOLD, 20));
        tz.setBounds(120, 140, 120, 20);
        this.add(tz);

    }

    // metodos de acceso a la informacion
    public String gettx()
    {
        return tx.getText();
    }
    
    public String getty()
    {
        return ty.getText();
    }

    public String gettz()
    {
        return tz.getText();
    }

    //metodo para borrar las cajas de texto
    public void borrar()
    {
        tx.setText("");
        ty.setText("");
        tz.setText("");
    }

}
