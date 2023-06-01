/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author HP
 */
public class Animal {
    protected String Nombre;
    protected int Edad;
    protected String Genero;
    protected String Estado;
    
    public Animal() {
    }

    public Animal(String Nombre, int Edad, String Genero, String Estado) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Estado = Estado;
    }
    
    public void comer(){
    
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
