/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Daniela Chaux
 */
@Entity
@Table (name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre_tarea", nullable = false)
    private String nombre;
    
    @Column(name = "descripcion_tarea")
    private String descripcion;
    
    @ManyToOne
    private Proyecto proyecto;
    
    @OneToMany
    private List<Cronometro> tiempo;//Tiempo de cada perso 
    
    @Column(name = "estado_tarea")
    private boolean estado; 

    public Tarea(String nombre, String descripcion, Proyecto proyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = false;
        this.proyecto = proyecto;
        this.tiempo = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cronometro> getTiempo() {
        return tiempo;
    }

    public void setTiempo(List<Cronometro> contador) {
        this.tiempo = contador;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
} 