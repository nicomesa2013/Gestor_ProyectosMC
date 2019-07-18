/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Duration;


/**
 *
 * @  Daniela Chaux
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
    
    private List<Proyecto> proyectos=new ArrayList();
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
    public Usuario getUsuario(String nombre){
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario; 
            }
        }
        return null;
    }
    public Usuario getUsuario(Long id){
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario; 
            }
        }
        return null;
    }
    
    public Usuario getUsuario(Usuario usuario){
        for (Usuario usuario1 : usuarios) {
            if (usuario1.equals(usuario)) {
                return usuario1;
            }
        }
        for (int i = 0; i < proyectos.size(); i++) {
            Proyecto get = proyectos.get(i);
            
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
    public void cerrarRTarea(Duration duration, DateTime fin
            , boolean estado, String descripcion
            , RegistroTrabajo registroTrabajo
            , Tarea tarea, Usuario usuario){
        registroTrabajo.setFin(fin);
        registroTrabajo.setContador(duration);
        registroTrabajo.setDescripcion(descripcion);
        tarea.setEstado(estado);
        tarea.getTiempo().add(new Cronometro(usuario, duration));
    }

    public void cerrarRSuspension(Duration duration, DateTime fin,
            String descripcion, RegistroSuspension registroSuspension) {
        registroSuspension.setFin(fin);
        registroSuspension.setDescripcion(descripcion);
        registroSuspension.setContador(duration);
    }
    
    public Duration sumarTiemposTarea(Tarea tarea){
        Duration total = Duration.ZERO;
        for (int i = 0; i < tarea.getTiempo().size(); i++) {
            total = total.plus(tarea.getTiempo().get(i).getTotal());
        }
        return total;
    }
    
    public Duration sumarTiemposProyecto(Proyecto proyecto){
        Duration total = Duration.ZERO;
        for (int i = 0; i < proyecto.getTareas().size(); i++) {
            total = total.plus(sumarTiemposTarea(proyecto.getTareas().get(i)));
        }
        return total;
    }
    
    public Duration sumarTiemposUsuario(Usuario usuario, Proyecto proyecto){
        Duration total = Duration.ZERO;
        for (int i = 0; i < usuario.getRegistroTrabajos().size(); i++) {
            Proyecto proyectoRegistroT = ((RegistroTrabajo)(usuario.getRegistroTrabajos().get(i))).getProyecto();
            if(proyectoRegistroT.equals(proyecto)){//Busca los registros de un proyecto
                total = total.plus(usuario.getRegistroTrabajos().get(i).getContador());
            }
        }
        return total;
    }    

    public Duration sumarTiemposTareaU(Usuario usuario, Tarea tarea) {
        Duration total = Duration.ZERO;
        for (int i = 0; i < usuario.getRegistroTrabajos().size(); i++) {
            //Proyecto proyectoRT = ((RegistroTrabajo)(usuario.getRegistroTrabajos().get(i))).getProyecto();
            Tarea tareaRT = ((RegistroTrabajo)(usuario.getRegistroTrabajos().get(i))).getTarea();
            if(/*proyectoRT.equals(proyecto) &&*/ tareaRT.equals(tarea)){//Busca los registros de un proyecto
                total = total.plus(usuario.getRegistroTrabajos().get(i).getContador());
            }
        }
        return total;
    }

    public Duration sumarTiemposSuspensiones(List<Registro> registroSuspensiones) {
        Duration total = Duration.ZERO;
        for (int i = 0; i < registroSuspensiones.size(); i++) {
           total.plus(registroSuspensiones.get(i).getContador());
        }
        return total;
    }
    
    
}
