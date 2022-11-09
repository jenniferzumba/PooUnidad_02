/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jenniferzumba
 */
public class Receta {
    private String medicamento;
    private int cantidad;
    private String indicaciones;

    public Receta(String medicamento, int cantidad, String indicaciones) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.indicaciones = indicaciones;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    @Override
    public String toString() {
        return "Receta{" + "medicamento=" + 
                medicamento + ", cantidad=" + 
                cantidad + ", indicaciones=" + indicaciones + '}';
    }
    
    
    
    
}
