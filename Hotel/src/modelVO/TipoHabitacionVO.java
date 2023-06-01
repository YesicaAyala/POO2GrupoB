/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelVO;

/*
En Object Value se agregan solo los atributos del objeto, su constructor y
metodos constructores
*/

/**
 *
 * @author argue
 */
public class TipoHabitacionVO {
    
    // Atributos de la clase
    private int id;
    private String descripcion;
    private int tarifa;
    private int cantidad;
    
    public TipoHabitacionVO(){
        
    }

    public TipoHabitacionVO(int id, String descripcion, int tarifa, int cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
