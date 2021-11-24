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
public class Color {
    private ArrayList<Color> colores = new ArrayList<>();
  
    

     public void agregarColor(Color color){
        colores.add(color);
        
    }
    
     
    public ArrayList<Color> getColor(){
      
        return colores;
        
    }
}