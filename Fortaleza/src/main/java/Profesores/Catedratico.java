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
public class Catedratico extends Profesor{
    private int numeroContrato;
    private int horasSemanales;
    private int valorHora;

    public Catedratico(String nombre, int codigo, String titulo, Departamento departamento,int numeroContrato, int horasSemanales, int valorHora) {
        super(nombre, codigo, titulo, departamento);
        this.numeroContrato = numeroContrato;
        this.horasSemanales = horasSemanales;
        this.valorHora = valorHora;
    }

    public int calcularSalario(){
    return this.valorHora*this.horasSemanales;
    }
    
    public int getNumeroContrato() {
        return numeroContrato;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
