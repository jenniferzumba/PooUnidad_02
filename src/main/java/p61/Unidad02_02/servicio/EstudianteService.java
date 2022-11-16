/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.Unidad02_02.servicio;

import java.util.List;
import p61.unidad02_02modelo.Estudiante;

/**
 *
 * @author jenniferzumba
 */
public interface EstudianteService {
    
    public abstract void crear(Estudiante estudiante);
    public abstract List<Estudiante>list();
    public abstract void eliminar(Estudiante estudiante);
    
    
    
    
}
