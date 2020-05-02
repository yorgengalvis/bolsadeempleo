package Negocio;

public class Aspirante {
    
    private String nombre;
    private String profesion;
    private int aniosExperiencia;
    private int edad;
    private String telefono;
    private String rutaFoto;

    public Aspirante() {
    }

    public Aspirante(String nombre, String profesion, int aniosExperiencia, int edad, String telefono, String rutaFoto) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Aspirante{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", aniosExperiencia=" + aniosExperiencia + ", telefono=" + telefono + '}';
    }
    
    


   
        
        
        
    
    


}