package tienda.dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import tienda.dominio.Producto;
import tienda.dominio.Venta;

/**
 *
 * @author Exe2020
 */
public class VentaTest {
    
    public VentaTest() {
    }
    
   
    
     /*Test of agregarProducto method, of class Venta.
 */
    @Test
    public void agregarUnasolaProductoALaVentaSinProductos(){
        //definicion de datos lo que tenemos y con que contamos
        
        Venta venta=new Venta();
        Producto producto=new Producto();
        System.out.println("Se agregará un producto a la Venta");
        //ejecucion
        venta.agregarProducto(producto);
        
        //Comprobación
        
        Assert.assertEquals(1,venta.getProductos().size());
        System.out.println("Producto agregado a la venta exitosamente");
        
    }
}

 