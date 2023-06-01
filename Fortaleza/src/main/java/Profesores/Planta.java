/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profesores;

import Departamento.Departamento;

/**
 *
 * @author HP
 */
public class Planta extends Profesor{
    private int salarioBasico;
    private int puntosSalariales;
    private int valorPunto;
    private String categoria;
    private int numeroResolucionNombramiento;
    private String fechaNombramiento;

    public Planta(String nombre, int codigo, String titulo, Departamento departamento,int salarioBasico, int puntosSalariales, int valorPunto, String categoria, int numeroResolucionNombramiento, String fechaNombramiento) {
        super(nombre, codigo, titulo, departamento);
        this.salarioBasico = salarioBasico;
        this.puntosSalariales = puntosSalariales;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
        this.fechaNombramiento = fechaNombramiento;
    }

    public int calcularSalario(){
    return this.salarioBasico+this.puntosSalariales* this.valorPunto;
    }
    
    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getPuntosSalariales() {
        return puntosSalariales;
    }

    public void setPuntosSalariales(int puntosSalariales) {
        this.puntosSalariales = puntosSalariales;
    }

    public int getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(int valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroResolucionNombramiento() {
        return numeroResolucionNombramiento;
    }

    public void setNumeroResolucionNombramiento(int numeroResolucionNombramiento) {
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
    
    
    
    
    
}
