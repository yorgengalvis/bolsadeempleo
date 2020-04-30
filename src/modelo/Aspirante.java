
package modelo;

public class Aspirante {
    String nombre;
    int edad;
    int aniosExperiencia;
    String profesión;
    String imagen;

    public Aspirante(String nombre, int edad, int aniosExperiencia, String profesión, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.profesión = profesión;
        this.imagen = imagen;
    }

    public Aspirante() {
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

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
   
    
    
    
    
    
}
