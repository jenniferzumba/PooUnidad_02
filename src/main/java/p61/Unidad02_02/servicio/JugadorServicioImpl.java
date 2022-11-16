/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.Unidad02_02.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.unidad02_02modelo.Jugador;

/**
 *
 * @author jenniferzumba
 */
public class JugadorServicioImpl implements  JugadorService{
    private ArrayList<Jugador> jugadorList;
    
    

    public JugadorServicioImpl() {
        this.jugadorList = new ArrayList<>();
    }
    
   
    @Override
    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);
        
    }

    @Override
    public void modificar(int codigo, Jugador jugadorModificado) {
        var indice=0;
        this.jugadorList.set(indice, jugadorModificado);
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var jugador:this.jugadorList){
            if(jugador.getCodigo()==codigo){
                this.jugadorList.remove(indice);
                break;
                
            }
            else{
                indice++;
            }
        }
    }

    public ArrayList<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(ArrayList<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }
    

    @Override
    public List<Jugador> list() {
        return this.jugadorList;
    }
     @Override
    public String toString() {
        var retorno= "JugadorServicio{" + "jugadorList=" + jugadorList ;
        
        for(var jugador:this.jugadorList){
            retorno+=jugador.toString()+"\n";
            
        }
        return retorno;
    }

    
    
    
    
    
}
