/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatricula;

/**
 *
 * @author Edwin
 */
public class AlumnoSatisfecho {
    private String nombre;
    private String clase;
    private Horas hora;
    
    public AlumnoSatisfecho(String n, String c, Horas h){
        nombre=n;
        clase=c;
        
        hora=h;
        
    }
          
   public String toString()
   {
      String s=nombre+"  "+clase+"  "+hora;
      return s;
   }
}
