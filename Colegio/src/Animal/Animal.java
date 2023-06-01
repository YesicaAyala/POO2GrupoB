/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;
/**
 *
 * @author HP
 */

public class Animal {
    private String nombre, genero, cualidades;
    private int identificacion, edad;
    private Tipo tipo;

    public Animal() {
    }

    public Animal(String nombre, String genero, String cualidades, int identificacion, int edad, Tipo tipo) {
        this.nombre = nombre;
        this.genero = genero;
        this.cualidades = cualidades;
        this.identificacion = identificacion;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCualidades() {
        return cualidades;
    }

    public void setCualidades(String cualidades) {
        this.cualidades = cualidades;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
     
}
