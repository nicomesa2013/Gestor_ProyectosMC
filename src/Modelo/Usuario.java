/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author Daniela Chaux
 */
public class Usuario {
    private String nombre;
    private Long id;
    @ManyToMany
    private List<Proyecto> proyectos;
    private List<Registro> registroSuspensiones;
    private List<Registro> registroTrabajos;

    public Usuario(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
        this.proyectos = new ArrayList();
        this.registroSuspensiones = new ArrayList<>();
        this.registroTrabajos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Registro> getRegistroSuspensiones() {
        return registroSuspensiones;
    }

    public void setRegistroSuspensions(List<Registro> registroSuspensiones) {
        this.registroSuspensiones = registroSuspensiones;
    }

    public List<Registro> getRegistroTrabajos() {
        return registroTrabajos;
    }

    public void setRegistroTrabajos(List<Registro> registroTrabajos) {
        this.registroTrabajos = registroTrabajos;
    }
    
    
}
