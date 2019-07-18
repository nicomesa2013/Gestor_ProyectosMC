/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;
import org.joda.time.DateTime;




/**
 *
 * @author Daniela Chaux
 */
@Entity
public class RegistroTrabajo extends Registro implements Serializable{
    @ManyToOne
    private Tarea tarea;
    @ManyToOne
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
