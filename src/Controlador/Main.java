/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import  modelo.BolsadeEmpleo;

public class Main {
   
    public static void main(String[] args) {
    
    BolsadeEmpleo bolsa = new BolsadeEmpleo();
    
    bolsa.AgregarAspirantes("Andrey","ingeniero", 4,19, "315546464","fkkkfkkd");
    bolsa.AgregarAspirantes("Brayam","medico", 5,15, "315546464","fkkkfkkd");
    bolsa.AgregarAspirantes("oliveros","policia", 2,17, "315546464","fkkkfkkd");
    bolsa.AgregarAspirantes("andrew","politico o rata", 6,18, "315546464","fkkkfkkd");
    
       bolsa.mostrarListaAspirantes();
        
        System.out.println("******************/***Lista de aspirantes ordenada por edad*****/******************");
       bolsa.ordenarPorEdad();
       bolsa.mostrarListaAspirantes();
         System.out.println("******************/***Lista de aspirantes ordenada por Experiencia*****/******************");
       bolsa.ordenarPorExperiencia();
       bolsa.mostrarListaAspirantes();
         System.out.println("******************/***Lista de aspirantes ordenada por Nombres*****/******************");
       bolsa.ordenarPorNombre();
       bolsa.mostrarListaAspirantes();
         System.out.println("******************/***Lista de aspirantes ordenada por Profesion*****/******************");
       bolsa.ordenarPorProfesion();
       bolsa.mostrarListaAspirantes();
       
       
       
       System.out.println("******************/***Metodos de busqueda*****/******************");
        System.out.println("Aspirante con mayor experiencia: "+bolsa.aspiranteConMayorExp());
        System.out.println("Aspirante mas joven: "+bolsa.aspiranteMasJoven());
        System.out.println("Aspirante mayor de edad: "+bolsa.aspiranteMayor());
        System.out.println("Aspirantes con nombres repetidos: "+bolsa.buscarAspirantesConNombresRepetidos());
        System.out.println("aspirante buscado por nombre: "+bolsa.buscarPorNombre("oliveros"));
        
         System.out.println("******************/***Metodos de eliminacion*****/******************");
        
        System.out.println("aspirante contratado: "+bolsa.contratarAspirante("Andrey")); 
        System.out.println("cantidad de aspirantes eliminados por poca experiencia: "+bolsa.eliminarAspirantesPorExperiencia(3));
        
      
        
    }
    
}
