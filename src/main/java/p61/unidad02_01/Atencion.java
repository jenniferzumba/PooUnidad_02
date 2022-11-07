/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01;

import java.time.LocalDate;

/**
 *
 * @author jenniferzumba
 */
public class Atencion {
    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private int cantidadRecetas;
    private Receta[] recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo, Mascota mascota, int cantidadRecetas) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetas;
         this.recetaList = new Receta[this.cantidadRecetas];
    }

   
    

   
     public void nuevaReceta(String medicamentos,int cantidad,String indicaciones, int posicion){
         var receta = new Receta(medicamentos,cantidad,indicaciones);
         this.recetaList[posicion]=receta;
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

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public void setRecetaList(Receta[] recetaList) {
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

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    @Override
    public String toString() {
        return "Atencion{" + "fecha=" + fecha + ", "
                + "veterinario=" + veterinario + ", costo="
                + costo + ", mascota=" + mascota + ", cantidadRecetas=" 
                + cantidadRecetas + ", recetaList 1 =" + recetaList[0].toString()
                +"receta 2="+recetaList[1].toString()+"receta 3="+recetaList[2].toString() +'}';
    }
    
    
    
    
}
