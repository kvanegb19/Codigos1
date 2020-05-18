/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author VANE
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Rampa rampa_1 = new Rampa(2,13,7); /** Creación del obteto rampa*/
    float resultado=rampa_1.longitudrampa(); /** llAMANDO AL METODO*/
    System.out.println("La longitud de la rampa es: %2f"+resultado+" cm");
    }
     }
