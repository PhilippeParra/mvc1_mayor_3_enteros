package controlador;

import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //-------------------------------
    // Atributos
    //-------------------------------
    private VentanaPrincipal venPrin;
    private Mayor3Enteros model;

    //-------------------------------
    // Metodos
    //-------------------------------

    //Modelo constructor
    public Controlador(VentanaPrincipal pVenPrin, Mayor3Enteros pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.BMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.BBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.BSalir.addActionListener(this);
    }

    //modelo de atencion a eventos
    public void actionPerformed(ActionEvent ae)
    {
        //identificar el comando generado (hallar Mayor, borrar, salir)
        String comando = ae.getActionCommand();
        {
            if(comando.equals("hallarMayor"))
            {
                try
                {
                    this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.gettx()));
                    this.model.setY(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getty()));
                    this.model.setZ(Integer.parseInt(this.venPrin.miPanelEntradaDatos.gettz()));
                    this.model.hallarMayor();
                    this.venPrin.miPanelResultados.mostrarResultado(this.model.getMayor());
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos. \nLos datos deben ser enteros", "Suma 3 Enteros" , JOptionPane.ERROR_MESSAGE);
                }
            }
            if(comando.equals("Borrar"))
            {
                JOptionPane.showMessageDialog(null, "Los datos seran borrados." , "Suma 3 enteros" , JOptionPane.WARNING_MESSAGE);
                this.venPrin.miPanelEntradaDatos.borrar();
                this.venPrin.miPanelResultados.Borrar();
            }
            if(comando.equals("Salir"))
            {
                JOptionPane.showMessageDialog(null, "El programa se cerrará" , "Suma 3 enteros" , JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        }
    }
}
