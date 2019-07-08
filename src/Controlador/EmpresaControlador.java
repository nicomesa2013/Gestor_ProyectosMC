/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
public class EmpresaControlador {
    private static EmpresaControlador instance;
    
    private EmpresaControlador() {
        proyectos = new ArrayList();
        usuarios = new ArrayList();
    }

    public static EmpresaControlador getInstance() {
        if (instance == null) {
            instance = new EmpresaControlador();
        }
        return instance;
    }
    
    private List<Proyecto> proyectos;
    private List<Usuario> usuarios;
    
    
    public Proyecto getProyecto(int posicion){
        return proyectos.get(posicion);
    }
    public List<Proyecto> getProyectos() {
        return proyectos;
    }
    public Usuario getUsuario(int posicion){
        return usuarios.get(posicion);
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void agregarProyecto(int posicion, String nombre){
        if(proyectos == null){
            proyectos = new ArrayList<>();  
        }
        Proyecto proyecto = new Proyecto(nombre);
        proyectos.add(proyecto);
    }
    
    public void agregarUsuario(String nombre, Long id){
        if(usuarios == null){
            usuarios = new ArrayList<>();  
        }
        Usuario usuario = new Usuario(nombre, id);
        usuarios.add(usuario);
    }
    
    public void agregarUsusarioAProyecto(int posicion, Usuario usuario,Proyecto proyecto){
        boolean bandera = false;
        if(usuarios == null){
            usuarios = new ArrayList<>();  
        }
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i) == usuario){
                List<Proyecto> proyectosU = usuarios.get(i).getProyectos();
                proyectosU.add(proyecto);
                List<Usuario> usuariosP = proyectos.get(posicion).getUsuarios();
                usuariosP.add(usuario);
                proyectos.get(posicion).setUsuarios(usuariosP);
                usuarios.get(i).setProyectos(proyectosU);
                bandera = true;
                break;
            }    
        }
        if(!bandera){
            usuarios.add(usuario);
            List<Proyecto> proyectosU = new ArrayList();
            proyectosU.add(proyecto);
            List<Usuario> usuariosP = proyectos.get(posicion).getUsuarios();
            usuariosP.add(usuario);
            proyectos.get(posicion).setUsuarios(usuariosP);
        }   
    }
    public void agregarTareaAProyecto(int posicion, Tarea tarea, Proyecto proyecto){
        List<Tarea> tareasP = new ArrayList<>();
        tareasP = proyectos.get(posicion).getTareas();
        tareasP.add(tarea);
        proyectos.get(posicion).setTareas(tareasP);
    }
}
