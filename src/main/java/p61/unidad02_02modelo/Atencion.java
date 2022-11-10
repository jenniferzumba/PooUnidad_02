/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02modelo;

import p61.modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jenniferzumba
 */
public class Atencion {
    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private ArrayList<Receta> recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo, Mascota mascota) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.recetaList = new ArrayList<Receta>();
    }

     public void nuevaReceta(String medicamentos,int cantidad,String indicaciones){
         var receta = new Receta(medicamentos,cantidad,indicaciones);
         this.recetaList.add(receta);
         System.out.println("\n");
     }
     

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setRecetaList(ArrayList<p61.unidad02_02modelo.Receta> recetaList) {
        this.recetaList = recetaList;
    }    

    public LocalDate getFecha() {
        return fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public ArrayList<p61.unidad02_02modelo.Receta> getRecetaList() {
        return recetaList;
    }
    

   

    @Override
    public String toString() {
        var retorno= "Atencion{" + "fecha=" + fecha + ", "
                + "veterinario=" + veterinario + ", costo="
                + costo + ", mascota=" +mascota   +'}'+"\n";
        
        for (var receta:this.recetaList){
            retorno+=receta.toString()+"\n";
        }
        
        
        /* for (var i =0;i<this.cantidadRecetas;i++){
             retorno+=this.recetaList[i].toString()+"\n";
         }*/
        
        return retorno;
    }
    
    
    
    
}
