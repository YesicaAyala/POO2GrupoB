/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author HP
 */
public class Estudiante {
    private String nombre;
    private boolean derechoAVoto;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.derechoAVoto = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDerechoAVoto() {
        return derechoAVoto;
    }

    public void setDerechoAVoto(boolean derechoAVoto) {
        this.derechoAVoto = derechoAVoto;
    }
    
}
