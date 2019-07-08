/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Daniela Chaux
 */
public class RegistroTrabajo {
    private String descripcion;
    private Cronometro contador;

    public RegistroTrabajo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cronometro getContador() {
        return contador;
    }

    public void setContador(Cronometro contador) {
        this.contador = contador;
    }
    
    
    
    
    
    
}
