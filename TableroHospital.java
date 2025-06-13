package paneles;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableroHospital extends JFrame {

    public TableroHospital() {
        setTitle("Tablero del Hospital");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana

        // Layout principal
        setLayout(new BorderLayout());

        // Panel de encabezado (NORTE)
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setBackground(new Color(25, 118, 210));
        JLabel titulo = new JLabel("Hospital Central");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelEncabezado.add(titulo);
        add(panelEncabezado, BorderLayout.NORTH);

        // Panel lateral del menú (OESTE)
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
        panelMenu.setBackground(new Color(227, 242, 253));
        String[] opciones = { "Inicio", "Pacientes", "Doctores", "Citas" };
        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            panelMenu.add(boton);
            panelMenu.add(Box.createRigidArea(new Dimension(0, 10)));
        }
        add(panelMenu, BorderLayout.WEST);

        // Panel de tabla (CENTRO)
        String[] columnas = { "Nombre", "Edad", "Especialidad" };
        Object[][] datos = {
            { "María López", 34, "Cardiología" },
            { "Juan Pérez", 45, "Neurología" },
            { "Lucía Gómez", 29, "Pediatría" }
        };

        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        return JFrame ;
    }
}