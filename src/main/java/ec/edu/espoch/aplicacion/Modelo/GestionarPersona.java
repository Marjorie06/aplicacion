/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.aplicacion.Modelo;

/**
 *
 * @author SO-LAB-PC5
 */
public class GestionarPersona {
    Persona vecPersona = new Persona [0];

   
    private String personasRegistradas(String a, String b, int c){
        return a+b+c;
    }
    public String agregarPersonas(Persona objPersona){
          int result=0;
        for (int i = 0; i<5; i++){
            if (vecPersona[i] != null){
                vecPersona[i]= new Persona();
        
            
        }
      // result = PersonasRegistradas(objPersona.getNombre(),objPersona.getApellido());    
       vecPersona[i].setNombre(objPersona.getNombre());
       vecPersona[i].setApellido(objPersona.getApellido());
       vecPersona[i].setResultado(result); 
        
    
    
     }
    }
}

        
   
 