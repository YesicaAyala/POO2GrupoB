/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class RedSocial {
    //agregar usuario, agregar foto
    protected ArrayList<Usuario> usuarios;
    protected ArrayList<Grupo> grupos;
   
    public RedSocial(){
        this.usuarios= new ArrayList<>();
        this.grupos= new ArrayList<>();
    }
    public void agregarUsuario(Usuario u){
    boolean rta=true;
    for(int i=0; rta&&i<usuarios.size();i++){
        rta=!usuarios.get(i).equals(u);
    }
    if(rta){
        usuarios.add(u);
    }
    }
    
    public void registrarUsuario(String nombre, String apellido, String nick, int edad, String claveAcceso, String email){
        Usuario nuevo=new Usuario(nombre, apellido, nick, edad, claveAcceso, email);
        agregarUsuario(nuevo);
    }
    
    
    
}
