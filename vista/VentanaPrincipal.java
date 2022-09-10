package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //-------------------------------
    // Atributos
    //-------------------------------


    //-------------------------------
    // Metodos
    //-------------------------------

    //Metodo Constructor
    public VentanaPrincipal()
    {
        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}