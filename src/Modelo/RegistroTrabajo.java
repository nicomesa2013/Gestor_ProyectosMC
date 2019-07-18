/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.joda.time.DateTime;




/**
 *
 * @author Daniela Chaux
 */
public class RegistroTrabajo extends Registro{
    private Tarea tarea;
    private Proyecto proyecto;

    public RegistroTrabajo(DateTime inicio, Usuario usuario, Tarea tarea, Proyecto proyecto) {
        super(inicio, usuario);
        this.tarea = tarea;
        this.proyecto = proyecto;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
}
