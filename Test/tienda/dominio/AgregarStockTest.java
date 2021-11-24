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
public class AgregarStockTest {
    
    public AgregarStockTest() {
    }
    /**
     * Test of agregarStock method, of class Stock.
     */
    @Test
    public void testAgregarUnProductoAlStock() {
        System.out.println("Se agregará un producto al Stock existente");
        Stock stock=new Stock();
        Producto producto=new Producto();
        //ejecucion
        producto.agregarStock(stock);
        //Comprobación
        Assert.assertEquals(1,producto.getStock().size());
        System.out.println("Stock agregado en un producto exitoso\n");
         
    }
    /**
     * Test of quitarStock method, of class Stock.
     */
    @Test
    public void testDescontarDelProductoUnaUnidadDeStock() {
        System.out.println("Se aliminara un producto al Stock existente");
        Stock stock=new Stock();
        Producto producto=new Producto();
        //ejecucion
        producto.quitarStock(stock);
        //Comprobación
        Assert.assertEquals(0,producto.getStock().size());
        System.out.println("Stock eliminado de un producto exitoso\n");
    }   
}
