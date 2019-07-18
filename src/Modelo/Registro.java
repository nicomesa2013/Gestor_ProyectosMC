/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Minutes;

/**
 *
 * @author Daniela Chaux
 */
public abstract class Registro{
    private String descripcion;
    private DateTime inicio;
    private DateTime fin;
    private Duration contador;
    private Usuario usuario;

    public Registro(DateTime inicio, Usuario usuario) {
        this.inicio = inicio;
        this.usuario = usuario;
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

    public Duration getContador() {
        return contador;
    }

    public void setContador(Duration contador) {
        this.contador = contador;
    }

    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
