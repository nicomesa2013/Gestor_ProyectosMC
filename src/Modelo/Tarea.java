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
    private List<Cronometro> contador;//Tiempo de cada perso 
    private List<RegistroSuspension> registroSuspensions;
    private List<RegistroTrabajo> registroTrabajo;
    private boolean estado; 
    
} 