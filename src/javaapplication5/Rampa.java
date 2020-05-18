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
public class Rampa {
  private int escalones;
  private int altura;
  private int pendiente;
  
     /**  Constructor*/
  
  public Rampa(int numero1,int numero2, int numero3)
  {
        escalones=numero1;
        altura=numero2;
        pendiente=numero3;
    }
    

  /** Metodo de calculo*/
    public float longitudrampa()
    {
        /**int longitud = altura*escalones*100/pendiente;*/
        return ((float)altura*escalones*100/pendiente);
    }
    
    
}

