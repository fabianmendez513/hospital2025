package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class tablaPanel {
    private JScrollPane tableScroll;

        String[] columnas = { "ID", "Nombre", "Edad" };

// Datos de la tabla
    Object[][] datos = {
        { 1, "Ana", 20 },
        { 2, "Luis", 22 },
        { 3, "María", 19 }
        
        
};

        DefaultTableModel base = new DefaultTableModel(datos, columnas);

        JTable tabla = new JTable(base);

        JScrollPane scrollPane = new JScrollPane(tabla);
    public JScrollPane getTable() {
        return tableScroll;

    }
}
