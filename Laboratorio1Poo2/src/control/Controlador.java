/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
public class Controlador implements ActionListener {
    private LoginView login = null;
    private SigninView sign = null;
    private PrincipalPageView principal = null;
    private Usuario usuario = null;
    private ArrayList <Usuario> usuarios = new ArrayList();
   
    
    
    public Controlador () {
        System.out.println("Iniciado");
        this.sign = new SigninView();
        this.login = new LoginView();
        this.usuario = new Usuario();
        this.principal = new PrincipalPageView();
        login.show(true);
        ActionListener (this);
    }
     public void ActionListener (ActionListener controlador){
         login.btnIniciar.addActionListener(controlador);
         login.btnRegistrar.addActionListener(controlador);
         sign.btnRegistrar.addActionListener(controlador);
     }
     public void actionPerformed (ActionEvent evento) {
         
         try {
          if (evento.getActionCommand().contentEquals("INICIAR SESIÓN")){
              String name = login.jTextField1.getText();
              String pass = login.jPasswordField1.getText();
              Usuario usuarioFind = null;
              boolean find = false;
              for(int i = 0;i<usuarios.size();i++){
                  usuarioFind = usuarios.get(i);
                  if(usuarioFind.getNick().equals(name)&&usuarioFind.getClaveAcceso().equals(pass)){
                      find = true;
                      break;
                  }
              }
              if(find){
                  login.show(false);
                  principal.show(true);
              }
          }else if(evento.getActionCommand().contentEquals("REGISTRARSE")){
              login.show(false);
              sign.show(true);
          }else if(evento.getActionCommand().contentEquals("REGISTRARSE E IR A INICIO DE SESION")){
              usuario = new Usuario();    
              usuario.setApellido(sign.txtApellido.getText());
              usuario.setNombre(sign.txtNombre.getText());
              usuario.setEdad(Integer.parseInt(sign.txtEdad.getText()));
              usuario.setClaveAcceso(sign.txtPassword.getText());
              usuario.setEmail(sign.txtMail.getText());
              usuario.setNick(sign.txtNick.getText());
              usuarios.add(usuario);
              login.show(true);
              sign.show(false);
          }
         }catch (Exception e) {
             e.printStackTrace();
         }
     }
}
