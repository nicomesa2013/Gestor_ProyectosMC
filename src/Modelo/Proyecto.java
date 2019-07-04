/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
public class Proyecto {
    private List<Tarea> tareasNT;
    private Persona persona;

    public Proyecto(List<Tarea> tareasNT, Persona persona) {
        this.tareasNT = tareasNT;
        this.persona = persona;
    }

    public List<Tarea> getTareasNT() {
        return tareasNT;
    }

    public void setTareasNT(List<Tarea> tareasNT) {
        this.tareasNT = tareasNT;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
