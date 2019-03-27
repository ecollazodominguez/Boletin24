/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.*;
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
        String[] listaA = {"Elemento Lista1","Elemento Lista2","Elemento Lista3"};
        
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
            //marco
            this.setTitle("Boletin24");
            this.setSize(600, 700);
            // 1º panel
            etiq1.setBounds(150,100,50,50);
            etiq2.setBounds(140,150,100,50);
            liText1.setBounds(300,100,180,40);
            liText2.setBounds(300,170,180,45);
            b1.setBounds(160,280,130,40);
            b2.setBounds(350,280,130,40);
            pan1.setLayout(null);
            pan1.setBounds(10,10,577,350);
            pan2.setLayout(null);
            pan2.setBounds(10,375,577,290);
            // 2º panel
            lista.setBounds(40,20,170,200);
            lista.setListData(listaA);
            b3.setBounds(260,80,100,50);
            tArea.setBounds(400,50,130,170);
            tArea.setText("AREA DE TEXTO");
            // 3º panel
            pan3.setBackground(Color.LIGHT_GRAY);
        }
        
        public void crearInterfaz(){
            //metodo compoñentes para iniciar
            compoInit();
            //1º panel arriba
        pan1.add(etiq1);
        pan1.add(etiq2);
        pan1.add(liText1);
        pan1.add(liText2);
        pan1.add(b1);
        pan1.add(b2);
            //2º panel abajo
        pan2.add(lista);
        pan2.add(b3);
        pan2.add(tArea);
            //3º panel que contendrá los anteriores
        pan3.setLayout(new BoxLayout(pan3,BoxLayout.Y_AXIS));
        pan3.add(pan1);
        pan3.add(pan2);
        this.add(pan1);            
        this.add(pan2);
        this.add(pan3);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        }
}
