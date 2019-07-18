/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.joda.time.DateTime;


/**
 *
 * @author Daniela Chaux
 */
public class RegistroSuspension extends Registro{
    
    public RegistroSuspension(DateTime inicio, Usuario usuario) {
        super(inicio, usuario);
    }
}
