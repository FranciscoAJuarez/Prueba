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
public class Producto {
    private ArrayList<Color> colores = new ArrayList<>();
    
    
    public void agregarColor(Color color){
        colores.add(color);
        
    }
    
    public ArrayList<Color> getColor(){
      
        return colores;
        
    }
     private ArrayList<Talle> talles = new ArrayList<>();
    
    
    public void agregarTalle(Talle talle){
        talles.add(talle);
        
    }
    
    public ArrayList<Talle> getTalle(){
      
        return talles;
        
    }
    private ArrayList<Stock> cantidad = new ArrayList<>();
    
    
    public void agregarStock(Stock existencia){
        cantidad.add(existencia);
        
    }

    
    public void quitarStock(Stock existencia){
        cantidad.remove(existencia);
        
    }
    
    public ArrayList<Stock> getStock(){
      
        return cantidad;
        
    }
    
}