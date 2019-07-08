/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Daniela Chaux
 */
public class RegistroSuspension {
    private String tipoSuspesion;
    private Date inicio;
    private Date fin;
    private Usuario usuario;

    public RegistroSuspension(Date inicio, Usuario usuario) {
        this.inicio = inicio;
        this.usuario = usuario;
    }

    public String getTipoSuspesion() {
        return tipoSuspesion;
    }

    public void setTipoSuspesion(String tipoSuspesion) {
        this.tipoSuspesion = tipoSuspesion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
