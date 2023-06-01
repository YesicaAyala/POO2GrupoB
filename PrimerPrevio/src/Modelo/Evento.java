/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Evento {
    
    private String ordenDeRegistro;
    private String numeroDeIdentificacion;
    private String descripción;

    public Evento() {
    }

    public Evento(String ordenDeRegistro, String numeroDeIdentificacion, String descripción) {
        this.ordenDeRegistro = ordenDeRegistro;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.descripción = descripción;
    }

    public String getOrdenDeRegistro() {
        return ordenDeRegistro;
    }

    public void setOrdenDeRegistro(String ordenDeRegistro) {
        this.ordenDeRegistro = ordenDeRegistro;
    }

    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    
}
