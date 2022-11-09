/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jenniferzumba
 */
public class Mascota {
    private String nombre;
    private String tipoAnimal;
    private String raza;
    private double peso;
    private Owner owner;

    public Mascota(String nombre, String tipoAnimal, String raza, double peso, Owner owner) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.peso = peso;
        this.owner = owner;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public Owner getOwner() {
        return owner;
    }
    

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + 
                ", tipoAnimal=" + tipoAnimal + ", raza=" +
                raza + ", peso=" + peso + ", owner=" + owner + '}'+"\n";
    }
    
    
    
}
