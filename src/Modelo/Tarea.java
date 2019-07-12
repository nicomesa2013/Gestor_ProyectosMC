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
public class Tarea {
    private String nombre;
    private String descripcion;
    private Proyecto proyecto;
    private List<Cronometro> contador;//Tiempo de cada perso 
    private boolean estado; 

    public Tarea(String nombre, String descripcion, Proyecto proyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = false;
        this.proyecto = proyecto;
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

    public List<Cronometro> getContador() {
        return contador;
    }

    public void setContador(List<Cronometro> contador) {
        this.contador = contador;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
} 