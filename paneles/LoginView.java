package paneles;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;
import ventanas.*;
import control.LoginControler; // Importa el control de los suarios 

public class LoginView {

    public JPanel panelLogin;
    public JFrame frame; 
    public LoginControler loginControler; //No se podrías validar usuarios.
    public JTextField entradaCorreo; // Hacer estos campos accesibles a toda la clase
    public JPasswordField entradaContra;
    
    public LoginView(JFrame frame){ 
        this.frame = frame; 
        this.loginControler = new LoginControler(); 

        panelLogin = new JPanel();
        panelLogin.setSize(500,800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Título
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panelLogin.add(titulo, gbc);

        // Entrada de correo (ahora es variable de instancia)
        entradaCorreo = new JTextField(" ");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        // Entrada contraseña (ahora es variable de instancia)
        entradaContra = new JPasswordField();
        entradaContra.setSize(new Dimension(100, 50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        // Botón
        JButton entradaBoton = new JButton("Ingresar");
        entradaBoton.setPreferredSize(new Dimension(100, 30));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(entradaBoton, gbc);

        // Acción del botón con validación
        entradaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                validarLogin(); // Llamar al método de validación
            }
        });
    }
    
    // Método para validar el login
    private void validarLogin() {
        // Obtener los datos ingresados
        String usuario = entradaCorreo.getText().trim();
        String contraseña = new String(entradaContra.getPassword());
        
        // Validar que no estén vacíos
      
        
        // Usar el controlador para validar
        if (loginControler.validacionDatos(usuario, contraseña)) {
            // Login exitoso
            
            
            frame.dispose(); // Cerrar ventana de login En pocas palabras cierra el frame Nota sin esto no ce sierra la ventana el proceso de la aplicación seguirá ejecutándose en segundo plano (consumiendo memoria).importante
            new DashBoard(); // Abrir dashboard
        } else {
            // Login fallido
            
            
            // Limpiar campos
            entradaCorreo.setText("");
            entradaContra.setText("");
            entradaCorreo.requestFocus(); // Regresar el foco al campo usuario
        }
    }

    public JPanel getJPanel(){
        return panelLogin;
    }
}