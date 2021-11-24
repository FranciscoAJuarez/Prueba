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
public class Venta {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public Venta(){
        
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
        
    }
    
    public ArrayList<Producto> getProductos(){
      
        return productos;
        
    }
    
}
