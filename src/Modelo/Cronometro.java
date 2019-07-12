/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.joda.time.DateTime;
import org.joda.time.Minutes;

/**
 *
 * @author Daniela Chaux
 */
public class Cronometro {
    private Usuario persona;
    private DateTime inicio;
    private DateTime fin;
    private Minutes total;

    public Cronometro(Usuario persona) {
        this.persona = persona;
        
    }

    public Usuario getPersona() {
        return persona;
    }

    public void setPersona(Usuario persona) {
        this.persona = persona;
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

    public Minutes getTotal() {
        return total;
    }

    public void setTotal(Minutes total) {
        this.total = total;
    }
}
