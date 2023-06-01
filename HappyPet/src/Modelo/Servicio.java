/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Servicio {
    private String codigo;
    private String descripcion;
    
public Servicio() {
    }
    
    public Servicio(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int calcularServicio (String tamaño, int servicio) {
       int valor = 0;
       if (tamaño == "Pequeño") {
           if (servicio== 1) valor= 15000;
           else if (servicio== 2) valor= 5000;
           else if (servicio== 3) valor= 5000;
           else valor= 2000;
       }else if (tamaño == "Mediano") {
           if (servicio== 1) valor= 25000;
           else if (servicio== 2) valor= 5000;
           else if (servicio== 3) valor= 10000;
           else valor= 4000;
       }else {
           if (servicio== 1) valor= 30000;
           else if (servicio== 2) valor= 5000;
           else if (servicio== 3) valor= 15000;
           else valor= 6000;
       }
        return valor;
}
}


