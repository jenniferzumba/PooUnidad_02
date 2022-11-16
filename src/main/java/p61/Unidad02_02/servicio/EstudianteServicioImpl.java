/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.Unidad02_02.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.unidad02_02modelo.Estudiante;
import p61.unidad02_02modelo.Jugador;

/**
 *
 * @author jenniferzumba
 */
public class EstudianteServicioImpl implements EstudianteService{
    private ArrayList<Estudiante> estudianteList;

    public EstudianteServicioImpl() {
        this.estudianteList=new ArrayList<>();
        
    }
    

    public ArrayList<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(ArrayList<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    @Override
    public String toString() {
        var retorno= "EstudianteServicio{" + "estudianteList=" + estudianteList + '}';
        
        for (var estudiante:this.estudianteList){
            retorno+=estudiante.toString();
            
        }
        return retorno;
    }

    @Override
    public void crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return this.estudianteList;
    }
    

    @Override
    public void eliminar(Estudiante estudiante) {
         this.estudianteList.remove(estudiante);
        
            
        
           
    }
    
    
    

    
    
}
