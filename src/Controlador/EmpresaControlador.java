/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import java.util.Date;
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
    
    private List<Proyecto> proyectos=new ArrayList<Proyecto>();
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
    public Usuario getUsuario(Long id){
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId().equals(id))
                return usuarios.get(i); 
        }
        return null;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void agregarProyecto(String nombre){
        
        Proyecto proyecto = new Proyecto(nombre);
        proyectos.add(proyecto);
    }
    public void agregarUsusarioAProyecto(int posicion, Usuario usuario){
        boolean bandera = false;
        Proyecto proyecto = proyectos.get(posicion);
        if(usuarios == null){
            usuarios = new ArrayList<>();  
        }
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId().equals(usuario.getId())){
                proyecto.getUsuarios().add(usuarios.get(i));
                usuarios.get(i).getProyectos().add(proyecto);
                bandera = true;
                break;
            }    
        }
        if(!bandera){
            proyecto.getUsuarios().add(usuario);
            usuario.getProyectos().add(proyecto);
            usuarios.add(usuario);
        }   
    }
    public void agregarTareaAProyecto(int posicion, Tarea tarea){
        List<Tarea> tareasP = new ArrayList<>();
        tareasP = proyectos.get(posicion).getTareas();
        tareasP.add(tarea);
        proyectos.get(posicion).setTareas(tareasP);
    }
    public void agregarRTrabajo(RegistroTrabajo registroTrabajo){
        Usuario usuario = registroTrabajo.getUsuario();
        usuario.getRegistroTrabajos().add(registroTrabajo);
    }
    public void agregarRSuspension( RegistroSuspension registroSuspension){
       Usuario usuario = registroSuspension.getUsuario();
       usuario.getRegistroSuspensiones().add(registroSuspension);
    }
}
