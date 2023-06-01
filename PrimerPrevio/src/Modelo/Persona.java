/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String documentoDeIdentidad;
    private int edad;
    private String numeroDeTelefono;
    private boolean haGanadoRifa;
    private String refrigerioSeleccionado;

    public Persona(String nombre, String apellido, String documentoDeIdentidad, int edad, String numeroDeTelefono, boolean haGanadoRifa, String refrigerioSeleccionado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
        this.haGanadoRifa = haGanadoRifa;
        this.refrigerioSeleccionado = refrigerioSeleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(String documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public boolean isHaGanadoRifa() {
        return haGanadoRifa;
    }

    public void setHaGanadoRifa(boolean haGanadoRifa) {
        this.haGanadoRifa = haGanadoRifa;
    }

    public String getRefrigerioSeleccionado() {
        return refrigerioSeleccionado;
    }

    public void setRefrigerioSeleccionado(String refrigerioSeleccionado) {
        this.refrigerioSeleccionado = refrigerioSeleccionado;
    }
    
}
