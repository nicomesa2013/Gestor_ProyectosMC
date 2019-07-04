/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
class Tarea {
    private Date contador;
    private List<Receso> receso;
    private boolean estado;

    public Tarea(Date contador, List<Receso> receso, boolean estado) {
        this.contador = contador;
        this.receso = receso;
        this.estado = estado;
    }

    public Date getContador() {
        return contador;
    }

    public void setContador(Date contador) {
        this.contador = contador;
    }

    public List<Receso> getReceso() {
        return receso;
    }

    public void setReceso(List<Receso> receso) {
        this.receso = receso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
} 