/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author HP
 */
public class Carga extends Animal {
    private double pesoLimite;
    private double pesoActualCargado;

    public Carga(String Nombre, int Edad, String Genero, String Estado,double pesoLimite, double pesoActualCargado) {
        super(Nombre, Edad, Genero, Estado);
        this.pesoLimite = pesoLimite;
        this.pesoActualCargado = pesoActualCargado;
    }
    
    public boolean Cargar() {
        return false;
    }

    public double getPesoLimite() {
        return pesoLimite;
    }

    public double getPesoActualCargado() {
        return pesoActualCargado;
    }

    public void setPesoLimite(double pesoLimite) {
        this.pesoLimite = pesoLimite;
    }

    public void setPesoActualCargado(double pesoActualCargado) {
        this.pesoActualCargado = pesoActualCargado;
    }
    
    
}
