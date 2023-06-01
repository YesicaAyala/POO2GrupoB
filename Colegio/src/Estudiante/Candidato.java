/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author HP
 */
public class Candidato {
    private String nombre, grupo, apellido, lema;
    private int grado, numeroTarjeton;

    public Candidato() {
    }

    public Candidato(String nombre, String grupo, String apellido, String lema, int grado, int numeroTarjeton) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.apellido = apellido;
        this.lema = lema;
        this.grado = grado;
        this.numeroTarjeton = numeroTarjeton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getNumeroTarjeton() {
        return numeroTarjeton;
    }

    public void setNumeroTarjeton(int numeroTarjeton) {
        this.numeroTarjeton = numeroTarjeton;
    }
    
}
