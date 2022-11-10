/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02vista;

import java.time.LocalDate;
import java.time.Month;
import p61.unidad02_02modelo.Atencion;
import p61.unidad02_02modelo.Mascota;
import p61.unidad02_02modelo.Owner;

/**
 *
 * @author jenniferzumba
 */
public class Principal02_02 {
    public static void main(String[]args){
        var juana =new Owner("096487365426","juana moreno avila ");
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
        System.out.println(atencion.toString());
        
        
        
       
    }
    
}
