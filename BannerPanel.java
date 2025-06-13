package paneles;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class  BannerPanel{
    private JPanel panel ;


public BannerPanel() {
    panel = new JPanel();
    panel.setBackground(new Color (25 , 118 , 210));
    JLabel title = new JLabel("Hospital");
    title.setForeground(Color.WHITE);
    title.setFont(new Font("Arial" , Font.BOLD, 24));
    panel.add(title);
}

public JPanel getPanel(){
    return panel;
    }
}