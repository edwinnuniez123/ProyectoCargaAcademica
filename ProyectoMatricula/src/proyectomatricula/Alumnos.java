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
public class Alumnos {
    private String nombre;
    private String clase;
    private int edificio;
    private int aula;
    
    
    public Alumnos(String n, String c, int e, int a){
        nombre=n;
        clase=c;
        edificio=e;
        aula=a;
       
        
        
    }
    
    
   public String toString()
   {
      String s=nombre+"  "+clase+"  "+edificio+"  "+aula;
      return s;
   }
}
