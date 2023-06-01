/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    private String tipoDeGrupo;
    private String noticiasRecientes;
    private Usuario propietario;
    protected ArrayList<Usuario> integrantes;

    public Grupo(String nombre, String descripcion, String tipoDeGrupo, String noticiasRecientes, Usuario propietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoDeGrupo = tipoDeGrupo;
        this.noticiasRecientes = noticiasRecientes;
        this.propietario = propietario;
        this.integrantes=new ArrayList<>();
    }
    
    public void agregarIntegrante(Usuario u){
    boolean rta=true;
    for(int i=0; rta&&i<integrantes.size();i++){
        rta=!integrantes.get(i).equals(u);
    }
    if(rta){
        integrantes.add(u);
    }
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeGrupo() {
        return tipoDeGrupo;
    }

    public void setTipoDeGrupo(String tipoDeGrupo) {
        this.tipoDeGrupo = tipoDeGrupo;
    }

    public String getNoticiasRecientes() {
        return noticiasRecientes;
    }

    public void setNoticiasRecientes(String noticiasRecientes) {
        this.noticiasRecientes = noticiasRecientes;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }
    
}
