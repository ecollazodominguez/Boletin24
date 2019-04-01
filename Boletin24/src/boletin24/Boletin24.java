/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz lay = new Interfaz();
        lay.crearInterfaz();
        Paleta ven = new Paleta();
        ven.setVisible(true);
        ven.setDefaultCloseOperation(3);
    }
    
}
