/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Minutes;



/**
 *
 * @author Daniela Chaux
 */
public class RegistroTrabajo {
    private String descripcion;
    private DateTime inicio;
    private DateTime fin;
    private Minutes contador;
    private Usuario usuario;
    private Tarea tarea;

    public RegistroTrabajo(DateTime inicio, Usuario usuario, Tarea tarea) {
        this.inicio = inicio;
        this.usuario = usuario;
        this.tarea = tarea;
    }
    
    public String getDescripcion() {
        return descripcion; 
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public DateTime getInicio() {
        return inicio;
    }

    public void setInicio(DateTime inicio) {
        this.inicio = inicio;
    }

    public DateTime getFin() {
        return fin;
    }

    public void setFin(DateTime fin) {
        this.fin = fin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Minutes getContador() {
        return contador;
    }

    public void setContador(Minutes contador) {
        this.contador = contador;
    }
    
    
}
