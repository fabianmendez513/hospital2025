package paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

import javax.swing.*;


private JPanel panelLogin;



    public LoginPanel(){
        panelLogin = new JPanel();
        panelLogin.setSize(500 , 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground (Color.PINK);
        panelLogin.setLayout(new GridBagLayout());

        //Adminisrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(alignment);
        gbc.gridx= 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo , gbc);

        JTextField entradacorreo = new JTextField();
        entradacorreo.setSize ( new Dimension (100, 50));
        gbc.gridx = 1 ;
        gbc.gridy = 1 ;
        panelLogin.add(entradacorreo , gbc );

        JPasswordField entradaContraseña = new JPasswordField();
        entradaContraseña.setSize(new Dimension(100,50));
        gbc.gridx = 1 ;
        gbc.gridy = 1 ;
        panelLogin.add(entradaContraseña , gbc);

        JButton btnIngresar = new JButton ("Ingresar");
        gbc.gridx = 1 ;
        gbc.gridy = 1 ;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(btnIngresar, gbc);

        btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                System.out.println("Boton Presionado");

                String entradaUsuario = entradaCorreo.getTex

            }
        });


    }

    public JPanel getPanel(){
        return panelLogin;
    }

