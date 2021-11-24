/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.dominio;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Exe2020
 */
public class TalleTest {
    
    public TalleTest() {
    }
    
    

    @Test
    public void AgregarUnTalleAunaProducto() {
        
        Talle talle= new Talle();
        Producto producto=new Producto();
        System.out.println("Se agregará un talle al producto seleccionado");
        //ejecucion
        producto.agregarTalle(talle);
        
        //Comprobación
    
       Assert.assertEquals(1,producto.getTalle().size());
        System.out.println("Talle agregado al producto exitosamente");
        
    }
    
}
