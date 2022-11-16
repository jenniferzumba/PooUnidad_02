/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02vista;

import java.time.LocalDate;
import java.time.Month;
import p61.Unidad02_02.servicio.EstudianteServicioImpl;
import p61.Unidad02_02.servicio.JugadorServicioImpl;
import p61.unidad02_01.controlador.JugadorControl;
import p61.unidad02_02modelo.Atencion;
import p61.unidad02_02modelo.Carrera;
import p61.unidad02_02modelo.Estudiante;
import p61.unidad02_02modelo.Jugador;
import p61.unidad02_02modelo.Mascota;
import p61.unidad02_02modelo.Owner;

/**
 *
 * @author jenniferzumba
 */
public class Principal02_02 {
    public static void main(String[]args){
       /* var juana =new Owner("096487365426","juana moreno avila ");
        juana.nuevoTelefono("962364532", 0, "movil personal", "bellacut");
        juana.nuevoTelefono("672651623735", 0, "casa", "etapa");
        juana.nuevoTelefono("029849572847", 0, "movil", "movistar");
        
        var mascota=new Mascota("pepito","Perro","chihuahua", 6, juana);
        
        var atencion=new Atencion(LocalDate.of(2022, Month.NOVEMBER, 10), "Dr Jose", 10.5, mascota);
        atencion.nuevaReceta("paracetamol", 3, "despues de cada comida");
        atencion.nuevaReceta("aspirina", 1, "tomarse una vez al dia");
        atencion.nuevaReceta("apronax", 2, "cada 12 horas");
         
        System.out.println(juana.toString());
        System.out.println(mascota.toString());
        System.out.println(atencion.toString());*/
        
      /*  
        var pedro= new Estudiante("743625716617", "pedro");
        var luis =new Estudiante("357715676364", "luis");
        var jaime=new Estudiante("62365635367156","Jaime");
        
        var tele=new Carrera("Ingenieria en telecomunicaciones",8);
        tele.agregarEstudiante(pedro);
        tele.agregarEstudiante(luis);
        
        var elec=new Carrera("Ingenieria electronica",8);
        elec.agregarEstudiante(pedro);
        elec.agregarEstudiante(luis);
        
        
       // System.out.println(tele.toString());
       // System.out.println(elec.toString());
        
        var baseDatosEstudiante=new EstudianteServicioImpl();
        baseDatosEstudiante.crear(jaime);
        baseDatosEstudiante.crear(luis);
        baseDatosEstudiante.crear(pedro);
        System.out.println(baseDatosEstudiante.list()+"\n");
        baseDatosEstudiante.eliminar(jaime);
        
        System.out.println(baseDatosEstudiante.list()+"\n");
        
        
        
        
        
        var ener =new Jugador(10,"Ener",80,175,LocalDate.of(1998, 05, 01));
        var byron =new Jugador(20,"Bryron",80,175,LocalDate.of(1999, 11, 01));
        var dominguez =new Jugador(30,"domingez",80,175,LocalDate.of(2000, 12, 01));
        var galindes=new Jugador(40,"galindes",80,175,LocalDate.of(2000, 03, 01));
        var galindezNuevo = new Jugador(50,"Hernán Galindez",80,175,LocalDate.of(1990, 02, 01));
        
        var jugadorDB = new JugadorServicioImpl();
        jugadorDB.crear(ener);
        jugadorDB.crear(byron);
        jugadorDB.crear(dominguez);
        jugadorDB.crear(galindes);
        System.out.println(jugadorDB.list()+"\n");
        jugadorDB.eliminar(20);
        jugadorDB.eliminar(30);
        System.out.println(jugadorDB.list()+"\n");
        jugadorDB.modificar(40, galindezNuevo);
        System.out.println(jugadorDB.list()+"\n");
        
    
        
        
        System.out.println("--------------------------------------------------------------------------------------");
        */
      var jugadorControl=new JugadorControl();
      var data=new String [7];
      data[0]="10";
      data[1]="Enner valencia";
      data[2]="85";
      data[3]="185";
      data[4]="1998";
      data[5]="06";
      data[6]="22";
      System.out.println(jugadorControl.crear(data));
      
  
       

        
        
        
        
        
       
        
        
        
        
        
        
       
    }
    
}
