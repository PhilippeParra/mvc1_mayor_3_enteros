package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //-------------------------------
    // Atributos
    //-------------------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;


    //-------------------------------
    // Metodos
    //-------------------------------

    //Metodo Constructor
    public VentanaPrincipal()
    {
        //Definicion del contenedor de la ventana
        this.setLayout(null);

        //Creacion y adicion de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,475,210);
        this.add(miPanelEntradaDatos);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,225,475,60);
        this.add(miPanelOperaciones);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,290,475,180);
        this.add(miPanelResultados);

        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(510,510);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}