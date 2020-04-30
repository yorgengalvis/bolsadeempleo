package Negocio;

//Yorgen es gay y el lo sabe
public class Aspirante {
    
    private String nombre;
    private int edad;
    private String profesion;
    private int aniosExperiencia;
    private String telefono;
    private String rutaFoto;

    public Aspirante() {
    }

    public Aspirante(String nombre, int edad, String profesion, int aniosExperiencia, String telefono, String rutaFoto) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
        this.telefono = telefono;
        this.rutaFoto = rutaFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
 
    //Comentario
    
}
