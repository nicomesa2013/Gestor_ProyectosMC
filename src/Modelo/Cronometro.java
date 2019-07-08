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
public class Cronometro {
    private Usuario persona;
    private Date inicio;
    private Date fin;

    public Cronometro(Usuario persona) {
        this.persona = persona;
    }

    public Usuario getPersona() {
        return persona;
    }

    public void setPersona(Usuario persona) {
        this.persona = persona;
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
    
    
}
