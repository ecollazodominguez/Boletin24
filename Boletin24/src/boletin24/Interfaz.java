/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author ecollazodominguez
 */
public class Interfaz extends JFrame {
        JPanel pan1,pan2,pan3;
        JLabel etiq1,etiq2;
        JTextField liText1,liText2;
        JButton b1,b2,b3;
        JList lista;
        JTextArea tArea;
        
        public void compoInit(){
            pan1 = new JPanel();
            pan2 = new JPanel();
            pan3 = new JPanel();
            etiq1 = new JLabel("NOME");
            etiq2 = new JLabel("PASSWORD");
            b1 = new JButton("PREMER");
            b2 = new JButton("LIMPAR");
            b3 = new JButton("BOTON");
            liText1 = new JTextField();
            liText2 = new JTextField();
            lista = new JList();
            tArea = new JTextArea();
            this.setTitle("Boletin24");
            this.setSize(600, 700);
            etiq1.setBounds(150,100,50,50);
            etiq2.setBounds(140,150,100,50);
            liText1.setBounds(300,100,180,40);
            liText2.setBounds(300,170,180,45);
            b1.setBounds(160,300,130,40);
            b2.setBounds(350,300,130,40);
            pan1.setLayout(null);
//            pan1.setBounds(250,200,350,250);
            pan1.setSize(600,350);
            pan1.setBackground(Color.yellow);
            pan2.setLayout(null);
//            pan2.setBounds(350,550,200,200);
pan2.setSize(600,350);
            pan2.setBackground(Color.red);
            b3.setBounds(350, 550, 100, 100);
        }
        
        public void crearInterfaz(){
            //metodo compoñentes para iniciar
            compoInit();
            //1º panel
        pan1.add(etiq1);
        pan1.add(etiq2);
        pan1.add(liText1);
        pan1.add(liText2);
        pan1.add(b1);
        pan1.add(b2);
            //2º panel
        pan2.add(lista);
        pan2.add(b3);
        pan2.add(tArea);
        pan3.setLayout(new BoxLayout(pan3,BoxLayout.Y_AXIS));
        pan3.add(pan1);
        pan3.add(pan2);
        this.add(pan3);
        this.add(pan1);            
        this.add(pan2);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        }
}
