package Controlador;

import Interface.ReglasNegocio;
import Negocio.Aspirante;
import Negocio.BolsadeEmpleo;
import java.util.LinkedList;

public class ControlNegocio implements ReglasNegocio {

    private BolsadeEmpleo bolsadeEmpleo = new BolsadeEmpleo();

    public ControlNegocio() {

    }

    @Override
    public void agregarHojaVida(Aspirante aspirante) {
        bolsadeEmpleo.AgregarAspirantes(aspirante);
    }

    @Override
    public LinkedList<Aspirante> listarAspirantes() {
        return bolsadeEmpleo.mostrarListaAspirantes();
    }

    @Override
    public String mostrarInfoDetalladaAspirante(String nombre) {
        return bolsadeEmpleo.mostrarInfoDetalladaAspirante(nombre);
    }

    @Override
    public Aspirante buscarAspirantePorNombre(String nombre) {
        return bolsadeEmpleo.buscarPorNombre(nombre);
    }

    @Override
    public void ordenarPorExperiencia(LinkedList<Aspirante> aspirantes) {
        bolsadeEmpleo.ordenarPorExperiencia();
    }

    @Override
    public void ordenarPorEdad(LinkedList<Aspirante> aspirantes) {
        bolsadeEmpleo.ordenarPorEdad();
    }

    @Override
    public void ordenarPorProfesion(LinkedList<Aspirante> aspirantes) {
        bolsadeEmpleo.ordenarPorProfesion();
    }

    @Override
    public Aspirante buscarAspiranteConMasExperiencia(LinkedList<Aspirante> aspirantes) {
        return bolsadeEmpleo.aspiranteConMayorExp();
    }

    @Override
    public Aspirante bucarAspiranteMasJoven(LinkedList<Aspirante> aspirantes) {
        return bolsadeEmpleo.aspiranteMasJoven();
    }
    
    @Override
    public Aspirante buscarMayorEdad(LinkedList<Aspirante> aspirantes){
        return bolsadeEmpleo.aspiranteMayor();
    }

    @Override
    public void contratarAspirante(String nombre) {
        bolsadeEmpleo.contratarAspirante(nombre);
    }

    @Override
    public void eliminarAspiranteCuyaExperienciaSeaMenorQueEstablecida(int anios) {
        bolsadeEmpleo.eliminarAspirantesPorExperiencia(anios);
    }

}
