import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaEjemplo extends JFrame {

public TablaEjemplo() {
setTitle("Ejemplo de Tabla");
setSize(500, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);

String[] columnas = { "ID", "Nombre", "Edad" };

Object[][] datos = {
{ 1, "Ana", 20 },
{ 2, "Luis", 22 },
{ 3, "María", 19 }
};

DefaultTableModel base = new DefaultTableModel(datos, columnas);

JTable tabla = new JTable(base);

JScrollPane scrollPane = new JScrollPane(tabla);

add(scrollPane, BorderLayout.CENTER);
}

public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new TablaEjemplo().setVisible(true);
});
}
}

