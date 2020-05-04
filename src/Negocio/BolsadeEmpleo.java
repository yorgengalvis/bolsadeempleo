package Negocio;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class BolsadeEmpleo {

    //se crea e instancia una linkedList de aspirantes
    private LinkedList<Aspirante> aspirantes = new LinkedList<>();

    public BolsadeEmpleo() {
    }

    //Agrega aspirantes a la linkedList
    public void AgregarAspirantes(Aspirante aspirante) {
        aspirantes.push(aspirante);
    }

    /*Imprime los elementos del linkedList con un iterator y
    como son objetos se imprimen con la informacion detallada con toString()*/
    public LinkedList mostrarListaAspirantes() {
    return this.aspirantes;
    }

    public void ordenarPorNombre() {

        Collections.sort(aspirantes, new Comparator<Aspirante>() {
            @Override
            public int compare(Aspirante p1, Aspirante p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                return p2.getNombre().compareTo(p1.getNombre());
            }
        });
    }

    public void ordenarPorEdad() {

        Collections.sort(aspirantes, new Comparator<Aspirante>() {
            @Override
            public int compare(Aspirante p1, Aspirante p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
            }
        });
    }

    public void ordenarPorProfesion() {

        Collections.sort(aspirantes, new Comparator<Aspirante>() {
            @Override
            public int compare(Aspirante p1, Aspirante p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                return p2.getProfesion().compareTo(p1.getProfesion());
            }
        });
    }

    public void ordenarPorExperiencia() {

        Collections.sort(aspirantes, new Comparator<Aspirante>() {
            @Override
            public int compare(Aspirante p1, Aspirante p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                return new Integer(p2.getAniosExperiencia()).compareTo(new Integer(p1.getAniosExperiencia()));
            }
        });
    }

    /*Busca el objeto aspirante mediante su nombre si no lo encuentra se muestra un mensaje con el error*/
    /**
     *
     * @param nombre
     * @return
     */
    public Aspirante buscarPorNombre(String nombre) {

        Aspirante buscado = null;
        for (Aspirante a : aspirantes) {

            if (a.getNombre().equalsIgnoreCase(nombre)) {
                buscado = a;
            }

        }

        if (buscado == null) {
            return null;
        }
        return buscado;
    }

    /*Busca el  aspirante con mayor años de experiencia*/
    public Aspirante aspiranteConMayorExp() {

        Aspirante aspMayor = aspirantes.getFirst();

        for (Aspirante a : aspirantes) {

            if (aspMayor.getAniosExperiencia() < a.getAniosExperiencia()) {
                aspMayor = a;
            }
        }

        return aspMayor;
    }

    /*Busca el  aspirante mas joven*/
    public Aspirante aspiranteMasJoven() {

        Aspirante aspMenor = aspirantes.getFirst();

        for (Aspirante a : aspirantes) {
            if (aspMenor.getEdad() > a.getEdad()) {
                aspMenor = a;
            }
        }

        return aspMenor;
    }

    /*Busca el  aspirante mayor*/
    public Aspirante aspiranteMayor() {

        Aspirante aspMayor = aspirantes.getFirst();

        for (Aspirante a : aspirantes) {

            if (aspMayor.getEdad() < a.getEdad()) {
                aspMayor = a;
            }
        }

        return aspMayor;
    }

    /*Busca el  aspirante y lo elimina(contrata)*/
    public boolean contratarAspirante(String nombre) {
        boolean v = false;
        Iterator<Aspirante> iter = aspirantes.iterator();
        while (iter.hasNext()) {
            Aspirante ob = iter.next();
            if (ob.getNombre().equals(nombre)) {
                iter.remove();
                v = true;
                break;
            }
        }
        return v;
    }

    /*Busca aspirantes con experiencias menores a la dada y los elimina*/
    public int eliminarAspirantesPorExperiencia(int anio) {

        int v = 0;

        Iterator<Aspirante> iter = aspirantes.iterator();
        while (iter.hasNext()) {
            Aspirante ob = iter.next();
            if (ob.getAniosExperiencia() < anio) {
                iter.remove();
                v++;
                break;
            }
        }

        return v;
    }

    public boolean buscarAspirantesConNombresRepetidos() {
        int v = 0;
        boolean repe = false;
        Aspirante repet = aspirantes.getFirst();

        for (Aspirante o : aspirantes) {

            if (o.getNombre().equals(repet.getNombre())) {
                repe = true;
                v++;
            }
        }
        System.out.println("Cantidad que se repite nombres de aspirantes" + v);
        return repe;
    }
    
    public String mostrarInfoDetalladaAspirante(String nombre){
        String msg = "";
        for(Aspirante a: aspirantes){
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                msg = a.toString2();
                break;
            }
        }
        return msg;
    }

}
