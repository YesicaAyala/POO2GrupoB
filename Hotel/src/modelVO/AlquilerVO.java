/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelVO;

import java.util.Date;

/**
 *
 * @author argue
 */
public class AlquilerVO {
    
    private Integer id;
    private Integer cantidad;
    private Date fecha;
    private UsuarioVO usuario;
    private TipoHabitacionVO habitacion;
    
    public AlquilerVO(){
        
    }

    public AlquilerVO(Integer id, Integer cantidad, Date fecha, UsuarioVO usuario, TipoHabitacionVO habitacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuario = usuario;
        this.habitacion = habitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    public TipoHabitacionVO getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(TipoHabitacionVO habitacion) {
        this.habitacion = habitacion;
    }

    
}
