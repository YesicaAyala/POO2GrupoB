/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String claveAcceso;
    private String email;
    private Comentario[] comentarios;
    private int cntComment;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nick, int edad, String claveAcceso, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.claveAcceso = claveAcceso;
        this.email = email;
        this.comentarios=new Comentario[10];
    }
    
    @Override
    public boolean equals(Object otro){
        boolean igual=false;
        if(otro instanceof Usuario o){
            igual=o!=null&&this!=null&&(this.getApellido()==o.getApellido()&&this.getNombre()==o.getNombre());
        }
        return igual;
    }

    public String comentar(String s){
        String c;
        if(cntComment<comentarios.length){
            String text=s;
        Fecha f=new Fecha();
        Comentario comentario =new Comentario(text, f);
        
        cntComment++;
        c="Comentario publicado con éxito";
        }
        else{
            c="Haz llegado al límite de comentarios";
        }
        return c;
    }
    
    public void subirFotografía(String nombre, String txt){
        Fotografia nueFoto=new Fotografia(nombre, txt);
        
    }
    
    public void etiquetarEnFoto(){
        
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
