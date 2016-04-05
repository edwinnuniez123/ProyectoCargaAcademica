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
public class Maestros {
    private String nombre;
    private String clase;
    private int edificio;
    private int aula;
    private int hora;
    
    public Maestros(String n, String c,int e, int a, int h){
        nombre=n;
        clase=c;
        edificio=e;
        aula=a;
        hora=h;
        
    }
          
   public String toString()
   {
      String s=nombre+"  "+clase+"  "+edificio+"  "+aula+"  "+hora;
      return s;
   }
}
