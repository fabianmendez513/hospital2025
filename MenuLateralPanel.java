package paneles;

import javax.awt.Color;
import javax.swing.JPanel;

public class  MenuLateralPanel extends JPanel {

    public MenuLateralPanel(){
    this.Size(300,1000);
    this.setOpaque(true);
    this.setBackground(Color RED);
    }

public JPanel getJPanel(){
    return this;
    }
}


