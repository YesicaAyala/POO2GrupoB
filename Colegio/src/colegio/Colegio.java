/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;

import Estudiante.Estudiante;
import Estudiante.Personero;
import Estudiante.Representante;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Colegio {
    
   private ArrayList <Estudiante> estudiante = new ArrayList (); 
   private ArrayList <Personero> personero = new ArrayList ();
   private ArrayList <Representante> representante = new ArrayList ();
   private ArrayList <Integer> cantidadDeVotosPersonero = new ArrayList ();
   private ArrayList <Integer> cantidadDeVotosRepresentante = new ArrayList ();
   private int votosValidos;
   private int votosNulos;
   private int votosEnBlanco;

    public Colegio() {
    }
    
    public boolean votar(String nombre, int numeroTarjetonRepresentante, int numeroTarjetonPersonero) {
        
        return false;
        
    }
    public void agregarEstudiante () {
        
    }
    public void agregarPersonero () {
        
    }
    public void agregarRepresentante () {
        
    }
    public String contarVotosPersonero () {
        
       return null;
        
    }
    public String contarVotosRepresentantes () {
        
       return null;
        
    }
}

