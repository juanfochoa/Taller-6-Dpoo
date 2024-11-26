package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
    /**
     * El comando para el botón para crear un nuevo restaurante
     */
    private static final String NUEVO = "nuevo";

    /**
     * El comando para el botón para ver todos los restaurantes en el mapa
     */
    private static final String VER = "ver";

    private JButton butNuevo;
    private JButton butVerTodos;
    private VentanaPrincipal ventanaPrincipal;

    public PanelBotones( VentanaPrincipal ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        // Agrega el botón para crear un nuevo restaurante
        // TODO completar
        
        butNuevo = new JButton("Nuevo Restaurante");
        butNuevo.setActionCommand(NUEVO); // Comando para identificar el botón
        butNuevo.addActionListener(this); // Añadir el ActionListener
        add(butNuevo);

        // Agrega el botón para ver todos los restaurantes
        // TODO completar
        
        butVerTodos = new JButton("Ver Todos");
        butVerTodos.setActionCommand(VER); // Comando para identificar el botón
        butVerTodos.addActionListener(this); // Añadir el ActionListener
        add(butVerTodos);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( NUEVO ) )
        {
            ventanaPrincipal.mostrarVetanaNuevoRestaurante( );
        }
        else if( comando.equals( VER ) )
        {
            ventanaPrincipal.mostrarVentanaMapa( );
        }
    }
}
