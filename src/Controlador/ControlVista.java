
package Controlador;

import Negocio.Aspirante;
import java.util.LinkedList;

public class ControlVista {
    private ControlNegocio control;
    private LinkedList<Aspirante> aspirantes = new LinkedList<>();

    public ControlVista() {
       control = new ControlNegocio();
    }
    
    public void agregarAspirante(String nombre, String profesion, int aniosExperiencia, int edad, String telefono, String rutaFoto){
        Aspirante aspirante = new Aspirante(nombre, profesion, aniosExperiencia, edad, telefono, rutaFoto);
        control.agregarHojaVida(aspirante);
    }
    
    public String listarAspirantes(){
        aspirantes = control.listarAspirantes();
        String msg = "";
        for(Aspirante a: control.listarAspirantes()){
            msg += a.toString() + "\n";
        }
        return msg;
    }
    
    public String infoDetalladaAspirante(String nombre){
        return control.mostrarInfoDetalladaAspirante(nombre);
    }
    
    public String buscarPorNombre(String nombre){        
       Aspirante aspirante = control.buscarAspirantePorNombre(nombre);
       return infoDetalladaAspirante(aspirante.getNombre());
    }
    
    public void ordenarLista(int tipo){
        if (tipo == 0) {
            control.ordenarPorExperiencia(aspirantes);
        }else if (tipo == 1) {
            control.ordenarPorEdad(aspirantes);
        }else if (tipo == 2) {
            control.ordenarPorProfesion(aspirantes);
        }
    }
    
    public String aspiranteConMasExperiencia(){
       Aspirante aspirante = control.buscarAspiranteConMasExperiencia(aspirantes);
       return infoDetalladaAspirante(aspirante.getNombre());
    }
    
    public String aspiranteMasJoven(){
        Aspirante aspirante = control.bucarAspiranteMasJoven(aspirantes);
        return infoDetalladaAspirante(aspirante.getNombre());
    }
    
    public void contratarAspirante(String nombre){
        control.contratarAspirante(nombre);
    }
    
    public void eliminarAspirantesConMenorExperienciaQueEstablecida(int anios){
        control.eliminarAspiranteCuyaExperienciaSeaMenorQueEstablecida(anios);
    }
    
}
