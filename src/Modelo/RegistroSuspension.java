/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.Minutes;

/**
 *
 * @author Daniela Chaux
 */
public class RegistroSuspension {
    private String tipoSuspesion;
    private DateTime inicio;
    private DateTime fin;
    private Minutes contador;
    private Usuario usuario;

    public RegistroSuspension(DateTime inicio, Usuario usuario) {
        this.inicio = inicio;
        this.usuario = usuario;
    }

    public String getTipoSuspesion() {
        return tipoSuspesion;
    }

    public void setTipoSuspesion(String tipoSuspesion) {
        this.tipoSuspesion = tipoSuspesion;
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

    public Minutes getContador() {
        return contador;
    }

    public void setContador(Minutes contador) {
        this.contador = contador;
    }

    
    
    
    
    
        
}
