
package Interface;

import Negocio.Aspirante;
import java.util.LinkedList;

public interface ReglasNegocio {
    
    public void agregarHojaVida(Aspirante aspirante);
    public LinkedList<Aspirante> listarAspirantes();
    public String mostrarInfoDetalladaAspirante(String nombre);
    public Aspirante buscarAspirantePorNombre(String nombre);
    public void ordenarPorExperiencia(LinkedList<Aspirante> aspirantes);
    public void ordenarPorEdad(LinkedList<Aspirante> aspirantes);
    public void ordenarPorProfesion(LinkedList<Aspirante> aspirantes);
    public Aspirante buscarAspiranteConMasExperiencia(LinkedList<Aspirante> aspirantes);
    public Aspirante bucarAspiranteMasJoven(LinkedList<Aspirante> aspirantes);
    public void contratarAspirante(String nombre);
    public void eliminarAspiranteCuyaExperienciaSeaMenorQueEstablecida(int anios);
    
}
