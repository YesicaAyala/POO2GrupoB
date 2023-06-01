/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;
import Animal.Animal;
/**
 *
 * @author HP
 */

public class Personero extends Candidato{
    private Animal mascota;

    public Personero(String nombre, String grupo, String apellido, String lema, int grado, int numeroTarjeton, Animal mascota) {
        super(nombre, grupo, apellido, lema, grado, numeroTarjeton);
        this.mascota = mascota;
    }

    public Animal getMascota() {
        return mascota;
    }

    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }
    
}
