/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Minutes;

/**
 *
 * @author Daniela Chaux
 */
public class Cronometro {
    private Usuario persona;
    private Duration total;

    public Cronometro(Usuario persona, Duration total) {
        this.persona = persona;
        this.total = total;
    }

    public Usuario getPersona() {
        return persona;
    }

    public void setPersona(Usuario persona) {
        this.persona = persona;
    }

    public Duration getTotal() {
        return total;
    }

    public void setTotal(Duration total) {
        this.total = total;
    }
}
