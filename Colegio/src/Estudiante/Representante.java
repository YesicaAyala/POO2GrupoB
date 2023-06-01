/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author HP
 */
public class Representante extends Candidato {
    private Estudiante formula;

    public Representante(String nombre, String grupo, String apellido, String lema, int grado, int numeroTarjeton, Estudiante formula) {
        super(nombre, grupo, apellido, lema, grado, numeroTarjeton);
        this.formula = formula;
    }

    public Estudiante getFormula() {
        return formula;
    }

    public void setFormula(Estudiante formula) {
        this.formula = formula;
    }
    
}
