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
public class Profesor {
    private String nombre;
    private int codigo;
    private String titulo;
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(String nombre, int codigo, String titulo, Departamento departamento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
     
}
