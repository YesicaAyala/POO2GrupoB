/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Valentina Parada <1152253> <sarithvalentinapr@ufps.edu.co>
 */
public class Parroquia {
    
    Feligres feligres;

    Parroquia(String cedula, String nombre, String direccion, String telefono, Integer estrato, String estado){
        this.feligres= new Feligres(cedula, nombre, direccion, telefono, estrato, estado);
    }
    
   
    public double CalcularDiezmo(){
        double diezmo=0;
        if(feligres.getEstrato()==1){
            diezmo=250000.00;
        }
        if(feligres.getEstrato()>1&&feligres.getEstrato()<4){
            diezmo=500000.00;
        }
        if(feligres.getEstrato()>3){
            diezmo=1000000.00;
        }
        return diezmo;
    }
    
    
    
}
