package vistas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPanel {
private JPanel panelLogin;
//METODO CONSTRUCTOR
public LoginPanel() {
panelLogin = new JPanel();
panelLogin.setSize(500,800);
panelLogin.setOpaque(true);

panelLogin.setLayout(new GridBagLayout());

//Administrador de diseño
GridBagConstraints gbc = new GridBagConstraints();
gbc.insets = new Insets(10, 80, 10, 80);
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.weightx = 1.0;


//TITULO
JLabel titulo = new JLabel("Login");
titulo.setHorizontalAlignment(SwingConstants.CENTER);
gbc .gridx =0;
gbc.gridy = 0;
gbc.gridwidth = 2;
gbc.anchor = GridBagConstraints.CENTER;

panelLogin.add(titulo, gbc);


//ENTRADA CORREO
JTextField enttradaCorreo = new JTextField("Correo: ");
enttradaCorreo.setSize(new Dimension(100,50));
gbc.gridx =1;
gbc.gridy = 1;


panelLogin.add(enttradaCorreo,gbc);

//ENTRADA CONTRA
JPasswordField entradaContraseña = new JPasswordField("Contraseña: ");
entradaContraseña.setSize(new Dimension(100,50));
gbc .gridx = 1;
gbc.gridy = 2;

panelLogin.add(entradaContraseña,gbc);

//BOTON

JButton btnIngresar = new JButton("Ingresar ");
btnIngresar.setSize(new Dimension(100,50));
gbc .gridx = 1;
gbc.gridy = 3;
gbc.anchor = GridBagConstraints.EAST;
gbc.fill = GridBagConstraints.NONE;


panelLogin.add(btnIngresar,gbc);

}


public JPanel getJPanel(){
return panelLogin;



}
}
