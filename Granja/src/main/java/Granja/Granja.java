/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Granja;
import Animales.*;
/**
 *
 * @author HP
 */
public class Granja {

    private Carga[] animalesDeCarga;
    private Consumo [] animalesDeConsumo;
    private Reproduccion [] animalesDeReproduccion;
    private Crias [] animalesDeCrianza;

    public Granja() {
    }

    public Granja(int cantidadAnimalesDeCarga, int cantidadAnimalesDeConsumo, int cantidadAnimalesDeReproduccion, int cantidadAnimalesDeCrianza) {
        this.animalesDeCarga = new Carga[cantidadAnimalesDeCarga];
        this.animalesDeConsumo = new Consumo [cantidadAnimalesDeConsumo];
        this.animalesDeReproduccion = new Reproduccion [cantidadAnimalesDeReproduccion];
        this.animalesDeCrianza = new Crias [cantidadAnimalesDeCrianza];
    }

    public Granja(Carga[] animalesDeCarga, Consumo[] animalesDeConsumo, Reproduccion[] animalesDeReproduccion, Crias[] animalesDeCrianza) {
        this.animalesDeCarga = animalesDeCarga;
        this.animalesDeConsumo = animalesDeConsumo;
        this.animalesDeReproduccion = animalesDeReproduccion;
        this.animalesDeCrianza = animalesDeCrianza;
    }
    
    public boolean agregarAnimalDeCarga(){
    return false;
    }
    
    public boolean agregarAnimalDeConsumo(){
    return false;
    }
    
    public boolean agregarAnimalDeReproduccion(){
    return false;
    }
    
    public boolean agregarAnimalDeCrianza(){
    return false;
    }

    public Carga[] getAnimalesDeCarga() {
        return animalesDeCarga;
    }

    public Consumo[] getAnimalesDeConsumo() {
        return animalesDeConsumo;
    }

    public Reproduccion[] getAnimalesDeReproduccion() {
        return animalesDeReproduccion;
    }

    public Crias[] getAnimalesDeCrianza() {
        return animalesDeCrianza;
    }

    public void setAnimalesDeCarga(Carga[] animalesDeCarga) {
        this.animalesDeCarga = animalesDeCarga;
    }

    public void setAnimalesDeConsumo(Consumo[] animalesDeConsumo) {
        this.animalesDeConsumo = animalesDeConsumo;
    }

    public void setAnimalesDeReproduccion(Reproduccion[] animalesDeReproduccion) {
        this.animalesDeReproduccion = animalesDeReproduccion;
    }

    public void setAnimalesDeCrianza(Crias[] animalesDeCrianza) {
        this.animalesDeCrianza = animalesDeCrianza;
    }
    
    
    
    
}
