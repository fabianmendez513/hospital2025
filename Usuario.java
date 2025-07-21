
import java.time.chrono.ThaiBuddhistChronology;

public class Usuario {

    String nombre;
    String apellido;
    int edad;

    public Usuario (){

    }
    

    public Usuario(String nombre ,String apellido , int edad ){
        this.nombre = nombre ;
        this.apellido = apellido;
        this.edad = edad;

    }

public String getNombre(){
    return this.nombre;
}

public String getApellido (){
    return this.apellido;
}

public String getEdad (){
    return this.edad;
}

public void setEdad (int eada) {
    this.edad= edad;
}


}
