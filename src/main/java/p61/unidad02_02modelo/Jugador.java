/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02modelo;

import java.time.LocalDate;

/**
 *
 * @author jenniferzumba
 */
public class Jugador {
    private int codigo;
    private String nombre;
    private double peso;
    private int estatura;
    private LocalDate fecha;

    public Jugador(int codigo, String nombre, double peso, int estatura, LocalDate fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.fecha = fecha;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    private int calcularEdad(){
        var yearActual=LocalDate.now().getYear();
        return yearActual-this.fecha.getYear();
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo=" + codigo + ", nombre=" 
                + nombre + ", peso=" + peso + ", estatura=" + estatura + 
                ", fecha=" + fecha + this.calcularEdad()+'}';
    }
    

     
    
    
}
