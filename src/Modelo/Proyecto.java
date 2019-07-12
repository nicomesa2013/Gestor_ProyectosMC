/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author Daniela Chaux
 */
@Entity
@Table(name = "projects")
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "project_name", nullable = false)
    private String nombre;
    
    @ManyToOne
    private List<Tarea> tareas;
    @ManyToOne
    private List<Usuario> usuarios;
    public Proyecto(){
        
    }
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList();
        this.tareas = new ArrayList(); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> persona) {
        this.usuarios = persona;
    }
}
