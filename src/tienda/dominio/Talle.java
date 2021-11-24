/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.dominio;

import java.util.ArrayList;

/**
 *
 * @author Exe2020
 */
public class Talle {
    private ArrayList<Talle> talles = new ArrayList<>();
  
    

     public void agregarTalle(Talle talle){
        talles.add(talle);
        
    }
    
     
    public ArrayList<Talle> getTalle(){
      
        return talles;
        
    }
}
