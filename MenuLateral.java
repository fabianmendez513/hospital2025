package paneles;
import java.awt.*;
import javax.swing.*;

public class MenuLateral extends JPanel {

    String[] opciones = {"Inicio", "Pacientes", "Doctores"};

    public MenuLateral() {
        this.setPreferredSize(new Dimension(300, 1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);

        this.setLayout(new GridLayout(opciones.length, 1));

        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            this.add(boton);
        }
    }

    public JPanel getJPanel() {
        return this;
    }
}


