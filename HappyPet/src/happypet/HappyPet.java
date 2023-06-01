/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happypet;

import Modelo.Mascota;
import Modelo.Servicio;
import Modelo.Size;
import Control.Controlador;
import Vista.Formulario;

/**
 *
 * @author HP
 */
public class HappyPet {
    private static Mascota mascota = null;
    private static Servicio servicio = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Formulario formulario = new Formulario();
         mascota= new Mascota ();
         servicio = new Servicio ();
         Controlador controlador = new Controlador (formulario, mascota, servicio);
    }
    
}
