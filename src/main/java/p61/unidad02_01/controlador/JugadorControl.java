/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.controlador;

import java.time.LocalDate;
import java.time.Month;
import p61.Unidad02_02.servicio.JugadorServicioImpl;
import p61.unidad02_02modelo.Jugador;

/**
 *
 * @author jenniferzumba
 */
public class JugadorControl {
    private  JugadorServicioImpl jugadorServicioImpl;

    public JugadorControl() {
        this.jugadorServicioImpl = jugadorServicioImpl;
    }
    
    public String crear(String[] data){
        var retorno=" no se pudo crear el jugador";
        var codigo=Integer.valueOf(data[0]).intValue();
        var nombre=data[1];
        var peso=Double.valueOf(data[2]).doubleValue();
        var estatura=Integer.valueOf(data[3]).intValue();
        var year=Integer.valueOf(data[4]).intValue();
        var mes=Integer.valueOf(data[5]).intValue();
        var dia=Integer.valueOf(data[6]).intValue();
        
        if (peso<0 ||estatura<0){
            retorno+= " el peso y la estatura no son correctas";          
        }
        else{var jugador =new Jugador(codigo,nombre,peso,estatura,LocalDate.of(year, mes, dia));
        this.jugadorServicioImpl.crear(jugador);
        retorno=" jugador"+ jugador.getNombre()+" creado correctamente";
                   
        }
        
        return retorno;
        
       
    }
   /* public String  eliminar(String []data){
        var retorno=" no se puede eliminar al jugador";
       // var codigo 
        
    } */
    
}
