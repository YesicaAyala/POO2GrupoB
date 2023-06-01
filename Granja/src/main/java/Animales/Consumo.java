/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author HP
 */
public class Consumo extends Animal {

    private double peso;
    
    public Consumo(String Nombre, int Edad, String Genero, String Estado,double peso) {
        super(Nombre, Edad, Genero, Estado);
        this.peso = peso;
    }
    
    public boolean sacrificar(){
    return false;
    }

    public boolean verificarPeso (){
            
        return false;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
