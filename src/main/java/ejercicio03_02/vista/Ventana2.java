/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03_02.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jennifer zumba
 */
public class Ventana2 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldsList;
    private List<JComboBox> jComboBoxList;
    

    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarJPanel();
        this.iniciarJLabel();
        this.iniciarJComboBox();
        this.iniciarJButton();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarJPanel() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(8, 1));
        this.jPanelList.get(1).setBackground(Color.blue);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));

    }

    public void iniciarJLabel() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INFORMACION DE LA CARRERA"));
        jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));
        this.jLabelList.add(new JLabel("Periodo Academico:"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Sede:"));
        this.jLabelList.add(new JLabel("Jornada:"));
        this.jLabelList.add(new JLabel("Fecha de registro:"));
        this.jLabelList.add(new JLabel("01/12/2022"));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(7).add(this.jLabelList.get(8));

    }

    public void iniciarJComboBox() {
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.get(0).addItem("Arquitectura");
        this.jComboBoxList.get(0).addItem("Gastronomia");
        this.jComboBoxList.get(0).addItem("Derechos");
        this.jComboBoxList.get(0).addItem("Veterinara");
 
        this.jComboBoxList.get(1).addItem("Presencial");
        this.jComboBoxList.get(1).addItem("Virtual");

        this.jComboBoxList.get(2).addItem("Matriz Cuenca");
        this.jComboBoxList.get(2).addItem("Guayaquil");
        this.jComboBoxList.get(2).addItem("Quito");

        this.jComboBoxList.get(3).addItem("Selecione Una Opcion");
        this.jComboBoxList.get(3).addItem("Matutina");
        this.jComboBoxList.get(3).addItem("Diurna");

        this.jPanelList.get(3).add(this.jComboBoxList.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList.get(1));
        this.jPanelList.get(5).add(this.jComboBoxList.get(2));
        this.jPanelList.get(6).add(this.jComboBoxList.get(3));
    }
    
    public void iniciarJButton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(8).add(this.jButtonList.get(0));
        
        
    }

}