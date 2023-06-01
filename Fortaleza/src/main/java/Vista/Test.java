/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Profesores.*;
import Universidad.*;
import Departamento.*;

/**
 *
 * @author HP
 */
public class Test {
    Fortaleza fortaleza = new Fortaleza(6);
    Departamento DepartamentoCatedraticos = new Departamento("Catedraticos");
    Catedratico catedratico = new Catedratico("Juan Tira Torres",1234,"Fisico De Particulas",DepartamentoCatedraticos,14,16,30000);
    Catedratico catedratico2 = new Catedratico("Esteban Quito Paredes",1235,"Ingeniero Agropecuario",DepartamentoCatedraticos,13,12,20000);
    Departamento DepartamentoOcasinales = new Departamento("Ocasionales");
    Ocasional ocasional = new Ocasional("Juan Tira Torres Jr",1236,"Fisico De Particulas",DepartamentoOcasinales,18000);
    Ocasional ocasional2 = new Ocasional("Esteban Quito Paredes Jr",1237,"Ingeniero Agropecuario",DepartamentoOcasinales,18000);
    Departamento DepartamentoDePlanta = new Departamento("De planta");
    Planta planta = new Planta("Juan Tira Torres Abuelo",1232,"Fisico De Particulas",DepartamentoOcasinales,18000,20,1000,"Viejo",24,"01/03/1989");
    Planta planta2 = new Planta("Esteban Quito Paredes Abuelo",1233,"Ingeniero Agropecuario",DepartamentoOcasinales,18000,20,1000,"Viejo",24,"01/03/1989");
}   
