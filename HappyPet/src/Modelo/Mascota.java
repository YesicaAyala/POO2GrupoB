/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Mascota {
    private String codigo, nombre, raza;
    private Size tamaño;
    
      public Mascota() {
    }
      
    public Mascota(String codigo, String nombre, String raza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
       if (tamaño == Size.PEQUE) {
           return "Pequeño";
       } else if (tamaño == Size.MEDIANO) {
           return "Mediano";
       } else {
           return "Grande";
       }
    }

    public void setSize(int peso) {
       if (peso<10) {
           this.tamaño = Size.PEQUE;
       } else if (peso<25) {
           this.tamaño = Size.MEDIANO;
       } else {
           this.tamaño = Size.GRANDE;
       }
    }

}
