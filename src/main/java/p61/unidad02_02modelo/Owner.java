/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_02modelo;

import java.util.ArrayList;

/**
 *
 * @author jenniferzumba
 */
public class Owner {
    private String cedula;
    private String nombre;
    private ArrayList<Telefono> telefonoList;

    public Owner(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefonoList=new ArrayList<Telefono>();
    }
    public void nuevoTelefono(String n,int e,String tT,String op){
        var telefono=new Telefono(n,e,tT,op);
        this.telefonoList.add(telefono);
       
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Telefono> getTelefonoList() {
        return telefonoList;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefonoList(ArrayList<Telefono> telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {
        var retorno= "Owner{" + "cedula=" + cedula + ", nombre=" 
                + nombre+"\n";
        
        for (var telefono:this.telefonoList){
            retorno+=telefono.toString()+"\n";
            
        }
      //  for (var i=0;i<this.telefonoList)
        
        
        return retorno;
    }
    
    
    
    
}
