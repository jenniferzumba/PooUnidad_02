/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import javax.swing.JFrame;

/**
 *
 * @author jenniferzumba
 */
public class Principal {
    public  static void main(String[]args){
       /* var ventana0301=new JFrame();
        ventana0301.setTitle("ventana Unidad 03_01a");
        ventana0301.setSize(800,600);
        ventana0301.setLocation(200, 100);
        ventana0301.setVisible(true);
        ventana0301.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        var ventana2=new JFrame();
        ventana2.setTitle("ventana Unidad 03_01b");
        ventana2.setSize(600,600);
        ventana2.setLocation(300, 150);
        ventana2.setVisible(true);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        var ventana3=new JFrame();
        ventana3.setTitle("ventana unidad 03_01c");
        ventana3.setSize(500,600);
        ventana3.setLocation(300, 200);
        ventana3.setVisible(true);
        ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        var ventana4=new JFrame();
        ventana4.setTitle("ventana unidad 03_01c");
        ventana4.setSize(400,300);
        ventana4.setLocation(200, 200);
        ventana4.setVisible(true);
        ventana4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
        
        var ventana1=new Ventana0301a("ecuador");
        ventana1.iniciarComponentes();
       // var ventana2=new Ventana0301a("Qatar");
       // var ventana3=new Ventana0301a("Senegal");
       // var ventana4=new Ventana0301a("paises bajos");
        
        
        ventana1.setVisible(true);
        
       // ventana2.setVisible(true);
       // ventana3.setVisible(true);
       // ventana4.setVisible(true);
        
        
        
       
        
    }
    
}
