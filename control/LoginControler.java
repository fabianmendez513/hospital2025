package control;
public package control;

public class LoginControler {
    
    String[][] usuariosYContraseñas = {
    {"brandon", "brandon"},           
    {"sofiaG", "passSofi98"},
    {"leo_kun", "lionKing#23"},
    {"valeria23", "val3r!aPass"},
    {"maxDev", "codeMaster1"},
    {"julio.m", "julioM123"},
    {"estrellaX", "starBright7"},
    {"camiloTech", "c4mTech2025"},
    {"flor_R", "floresRosa!"},
    {"natalyQ", "n4t_Queen"},
    {"kevinZeta", "z3t4Rulez"}
};


    public boolean validacionDatos(String EntradaUsuario, String EntradaContraseña) {

        for (int i = 0; i < usuariosYContraseñas.length; i++) {
            String usuarioCorrecto = usuariosYContraseñas[i][0];
            String contraseñaCorrecta = usuariosYContraseñas[i][1];
            
            if (usuarioCorrecto.equals(EntradaUsuario) && 
                contraseñaCorrecta.equals(EntradaContraseña)) {
                return true; 
            }
        }
        return true;
    }
}
