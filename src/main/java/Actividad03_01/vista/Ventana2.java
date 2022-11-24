/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad03_01.vista;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jenniferzumba
 */
public class Ventana2 extends JFrame {
    public List<JPanel> jPanelList;
    public List<JButton> jButtonList;

    public Ventana2() throws HeadlessException {
        this.setTitle("FlowLayout");
        this.setSize(600, 100);
        this.setResizable(false);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanel();
        this.iniciarButton();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);

    }

    public void iniciarPanel() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(new FlowLayout());

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));

    }
    public void iniciarButton(){
        this.jButtonList = new ArrayList();
        this.jButtonList.add(new JButton("Button 1"));
        this.jButtonList.add(new JButton("2"));
        this.jButtonList.add(new JButton("button 3"));
        this.jButtonList.add(new JButton("Long-Named Button 4"));
        this.jButtonList.add(new JButton("Button 5"));
         this.jButtonList.add(new JButton("Hola5"));
        
        this.jPanelList.get(0).add(this.jButtonList.get(0));
         this.jPanelList.get(0).add(this.jButtonList.get(1));
          this.jPanelList.get(0).add(this.jButtonList.get(2));
           this.jPanelList.get(0).add(this.jButtonList.get(3));
           this.jPanelList.get(0).add(this.jButtonList.get(4));
         
    }

    
}
