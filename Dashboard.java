package paneles;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{

    public Dashboard(){
        this.setTitle("Doctor Marco");
        this.setSize(1900,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        this.add(new BannerPanel().getPanel(), BorderLayout.NORTH);
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        this.add(new TablePanel().getTable(), BorderLayout.CENTER);
        
        this.setVisible(true);
    }

    public JFrame getDashFrame(){
        return this;
    }
}