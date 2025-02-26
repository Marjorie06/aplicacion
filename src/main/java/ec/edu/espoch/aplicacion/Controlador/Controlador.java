/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.aplicacion.Controlador;

import ec.edu.espoch.aplicacion.Modelo.GestionarPersona;
import ec.edu.espoch.aplicacion.Modelo.Persona;
import ec.edu.espoch.aplicacion.Vista.Vista;

/**
 *
 * @author SO-LAB-PC5
 */
public class Controlador {
    private Vista objVista;
    private Persona objPersona;
    private GestionarPersona objGestionarPersona;

    public Controlador(Vista objVista, Persona objPersona) {
        this.objVista = objVista;
        this.objPersona = objPersona;
    }
    public void ingresar(){
        try {
            if (objVista != null) {
                Persona objPersona = new Persona();
                objPersona.setNombre(objVista.getNombre());
                objPersona.setApellido(objVista.getApellido());
                objPersona]= Integer.parseInt(objVista.getEdad());
                GestorPersona.prueba(objPersona);

            
        } catch (Exception e) {
             objVista.respuesta("No agregado , ingresa bien los datos");
        }
    }
    
}
    
      
            