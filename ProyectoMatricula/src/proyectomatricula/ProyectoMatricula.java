/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatricula;

import java.io.*;
import java.util.*;

/**
 *
 * @author Edwin
 */
public class ProyectoMatricula {

    /**
     * @param args the command line arguments
     */
    //static Maestros maestros[]=new Maestros[5];
    
    static int cantidad;
    static ArrayList<Maestros> maestros=new ArrayList<Maestros>();
    static ArrayList<Alumnos> alumnos=new ArrayList<Alumnos>();
    static ArrayList<AlumnoSatisfecho> alumnos2=new ArrayList<AlumnoSatisfecho>();
    public static void main(String[] args) {
        // TODO code application logic here
       
       Menu();
        
       
    }
    

    public static void AgregarMaestro()
    {
        String salida="  ";
        Scanner entrada=new Scanner(System.in);
       Scanner e=new Scanner(System.in);
       System.out.println("Escriba un numero:");
       int numero=entrada.nextInt();
       String nombre = null;
       String nombre2 = null;
       String clase=null;
       int edificio=0;
       int aula=0;
       int hora = 0;
       int minuto = 0;
       String tiempo=" ";
      
       
       while (numero!=0)
       {
          
          System.out.println("escriba algo:");
          nombre2=e.nextLine();
          System.out.println("Ingrese el Nombre del maestro:");
          nombre=e.nextLine();
          System.out.println("Ingrese la Clase:");
          clase=e.nextLine();
            System.out.println("Ingrese el numero de edificio:");
            edificio=e.nextInt();
            if(edificio>6)
                edificio=1;
         
            System.out.println("Ingrese el numero de aula:");
            aula=e.nextInt();
            if(aula>80)
                aula=1;
          
            System.out.println("Ingrese la hora:");
            hora=e.nextInt();
            if(hora == 7 || hora == 8|| hora == 10|| hora == 11)
                tiempo="AM";
            else if(hora==1|| hora == 2|| hora == 3|| hora == 5|| hora == 6)
                tiempo="PM";
            
          
            System.out.println("Ingrese los minuto:");
            minuto=e.nextInt();
            if(minuto>50)
                minuto=00;
          
          System.out.println("Escriba un numero:");
          numero=entrada.nextInt();
          
          Maestros m = new Maestros(nombre, clase, edificio, aula, new Horas(hora,minuto));
          maestros.add(m);
          salida=salida+" "+nombre+" | "+clase+" | "+edificio+"/"+aula+"  "+hora+":"+minuto+" "+tiempo+"|||||";
          System.out.println();

       }
                 
       try{
           File archivo=new File("MaestrosDisponibles.txt");
           BufferedWriter output = new BufferedWriter(new FileWriter(archivo));
           output.write(salida);
           output.close();
      }catch (Exception ex){
         ex.printStackTrace();
      }
       
       
    }

    
    public static void AgregarAlumnos()
    {
        String salida="  ";
        Scanner entrada=new Scanner(System.in);
       Scanner e=new Scanner(System.in);
       System.out.println("Escriba un numero:");
       int numero=entrada.nextInt();
       String nombre = null;
       String nombre2 = null;
       String clase=null;
       int edificio=0;
       int aula=0;
       int disponibilidad=0;
       
       while (numero!=0)
       {
          
          System.out.println("escriba algo:");
          nombre2=e.nextLine();
          System.out.println("Ingrese el Nombre del Alumno:");
          nombre=e.nextLine();
          System.out.println("Ingrese la Clase:");
          clase=e.nextLine();
            System.out.println("Ingrese el numero de edificio:");
            edificio=e.nextInt();
            if(edificio>6)
                edificio=1;
         
            System.out.println("Ingrese el numero de aula:");
            aula=e.nextInt();
            if(aula>80)
                aula=1;
          
           System.out.println("Ingrese la cantidad disponible en el aula:");
            disponibilidad=e.nextInt();
            if(disponibilidad>40)
               disponibilidad=40;
          
          System.out.println("Escriba un numero:");
          numero=entrada.nextInt();
          
          Alumnos a = new Alumnos(nombre, clase, edificio, aula, disponibilidad);
          alumnos.add(a);
          salida=salida+" "+nombre+" | "+clase+" | "+edificio+"/"+aula+"  "+disponibilidad+"|||||";
          System.out.println();

       }
                 
       try{
           File archivo=new File("Alumnos.txt");
           BufferedWriter output = new BufferedWriter(new FileWriter(archivo));
           output.write(salida);
           output.close();
      }catch (Exception ex){
         ex.printStackTrace();
      }
       
       
    }
    
    public static void SatisfaccionAlumno()
    {
        String salida="  ";
        Scanner entrada=new Scanner(System.in);
       Scanner e=new Scanner(System.in);
       System.out.println("Escriba la cantidad de clases qeu va a llevar:");
       int cantidad=entrada.nextInt();
       String nombre = null;
       String clase=null;
       int hora=0;
       int minuto=0;
       String tiempo=null;
       
       
       for (int i=0; i<cantidad; i++){
          
          System.out.println("Ingrese el Nombre del Alumno:");
          nombre=e.nextLine();
          System.out.println("Ingrese la Clase:");
          clase=e.nextLine();
            
           System.out.println("Ingrese la hora:");
            hora=e.nextInt();
            if(hora == 7 || hora == 8|| hora == 10|| hora == 11)
                tiempo="AM";
            else if(hora==1|| hora == 2|| hora == 3|| hora == 5|| hora == 6)
                tiempo="PM";
            
          
            System.out.println("Ingrese los minuto:");
            minuto=e.nextInt();
            if(minuto>50)
                minuto=00;
              
         // System.out.println("Escriba un numero:");
         // numero=entrada.nextInt();
          
          AlumnoSatisfecho a = new AlumnoSatisfecho(nombre, clase,  new Horas(hora,minuto));
          alumnos2.add(a);
          salida=salida+" "+nombre+" | "+clase+" | "+hora+":"+minuto+" "+tiempo+"|||||";
          System.out.println();

       }
                 
       try{
           File archivo=new File("AlumnoSatisfecho.txt");
           BufferedWriter output = new BufferedWriter(new FileWriter(archivo));
           output.write(salida);
           output.close();
      }catch (Exception ex){
         ex.printStackTrace();
      }
       
       
    }
    
    

    public static void Menu()
    {
       Scanner entrada=new Scanner(System.in);

       int opcion;
       do{
           System.out.print("\nMenu\n"+
                   "1. Agregar Maestro\n"+
                   "2. Agregar Alumnos\n"+
                   "3. Satisface Alumno\n"+
                   "4. Salir\n\n");
           System.out.print("Escoja una opcion:");
           opcion=entrada.nextInt();

           switch(opcion)
           {
               case 1:
                   AgregarMaestro();
                   break;

               case 2:
                   AgregarAlumnos();
                   break;

               case 3:
                   SatisfaccionAlumno();

               case 4:
                   System.exit(0);
               default:
                   System.out.println("Opcion invalida\n");
                   break;
           }
       } while(opcion !=4);
    }

    
    
}
