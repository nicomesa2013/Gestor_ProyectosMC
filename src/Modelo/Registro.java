/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;


/**
 *
 * @author Daniela Chaux
 */
@Entity
public abstract class Registro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column
    private String descripcion;
    
    @Column
    private DateTime inicio;
    
    @Column
    private DateTime fin;
    
    @Column
    private Duration contador;
    
    @ManyToOne
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
