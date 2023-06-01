/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import Modelo.Mascota;
import Modelo.Servicio;
import Modelo.Size;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
public class Controlador implements ActionListener {
    private Formulario formulario = null;
    private Mascota mascota;
    private Servicio servicio;
    private ArrayList <Mascota> mascotas = new ArrayList();
    
    public Controlador (Formulario formulario, Mascota mascota, Servicio servicio) {
        this.formulario = formulario; 
        this.mascota = mascota;
        this.servicio = servicio;
        this.mascotas = new ArrayList();
        
        ActionListener (this);
    }
     public void ActionListener (ActionListener controlador){
         formulario.btnSave.addActionListener(controlador);
         formulario.btnShow.addActionListener(controlador);
         formulario.btnCalculate.addActionListener(controlador);
     }
     public void actionPerformed (ActionEvent evento) {
         try {
          if (evento.getActionCommand().contentEquals("Calcular Servicio")){
          int valor= 0;
          
              if (formulario.chkShower.isSelected()) {
             valor += servicio.calcularServicio(mascota.getSize(), 1);
          } 
              if (formulario.chkVacuna.isSelected()) {
             valor += servicio.calcularServicio(mascota.getSize(), 2);
          }  
              if (formulario.chkHairCut.isSelected()) {
             valor += servicio.calcularServicio(mascota.getSize(), 3);
          } 
              if (formulario.chkNails.isSelected()) {
             valor += servicio.calcularServicio(mascota.getSize(), 4);
          }
             formulario.jTextArea1.setText("Valor Del Servicio: " + valor);
          } else if (evento.getActionCommand().contentEquals("Guardar")) {
              mascota.setCodigo(formulario.txtCode.getText());
              mascota.setNombre(formulario.txtName.getText());
              mascota.setRaza(formulario.txtBreed.getText());
              mascota.setSize(Integer.parseInt(formulario.txtSize.getText()));
              mascotas.add(mascota);
            formulario.jTextArea1.setText("Datos Guardados");  
            formulario.txtSize.setText(mascota.getSize());
          } else if (evento.getActionCommand().contentEquals("Mostrar Datos")) {
              int codigo= Integer.parseInt(formulario.txtCode.getText()); 
              Mascota mascotaCopia = new Mascota ();
              mascotaCopia.setCodigo(codigo + "");
              boolean encontrado = false;
              Mascota m = null;
                for (int i= 0; i < mascotas.size(); i++) {
                m = mascotas.get(i);
            if (m.getCodigo().equals(mascotaCopia.getCodigo())) {
               encontrado = true;
             break;
             }
            }
            if (encontrado) {
               formulario.txtCode.setText(m.getCodigo());
               formulario.txtName.setText(m.getNombre());
               formulario.txtBreed.setText(m.getRaza());
               formulario.txtSize.setText(m.getSize());
               formulario.jTextArea1.setText("Datos Encontrados"); 
            } else  { 
             formulario.jTextArea1.setText("Datos No Encontrados");
             formulario.txtName.setText("");
             formulario.txtBreed.setText("");
             formulario.txtSize.setText("");
             }
          }
         }catch (Exception e) {
             e.printStackTrace();
         }
     }
}
