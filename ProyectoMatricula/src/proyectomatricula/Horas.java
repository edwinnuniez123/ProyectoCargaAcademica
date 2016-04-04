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
public class Horas {
    
    private int hora;
    private int minuto;
   
    public Horas(int h, int m)
    {
       hora=h;
       minuto=m;
    }

    
    
   


    public String toString()
    {
        String l=hora+":"+minuto;
        return l;
    }
}
