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
public class Ocasional extends Profesor{
    private int salarioBasico;

    public Ocasional(String nombre, int codigo, String titulo, Departamento departamento,int salarioBasico) {
        super(nombre, codigo, titulo, departamento);
        this.salarioBasico = salarioBasico;
    }
    
    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
}