/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.dominio;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Exe2020
 */
public class ColorTest {
    
    public ColorTest() {
    }
    
   
    /**
     * Test of agregarColor method, of class Color.
     */
    @Test
    public void testAgregarUnColorAunaProducto() {
      
        //definicion de datos lo que tenemos y con que contamos
        Color color=new Color();
        Producto producto=new Producto();
        System.out.println("Se agregará un color al producto seleccionado");
        
        //ejecucion
        producto.agregarColor(color);
        
        //Comprobación
        Assert.assertEquals(1,producto.getColor().size());
        System.out.println("Color agregado al producto exitosamente");
   
    
    }
}