/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Exe2020
 */
public class ConexionMySQL {
    
    Connection conectar=null;
    
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdtienda","root","");
            
//            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion "+e.getMessage());
            
            
            
        }
        return conectar;
    }
    


//    public Connection conexion;
//    public Statement sentencia;
//    public ResultSet resultado;
//
//    public void ConectarBasedeDatos() {
//        try {
//            final String Controlador = "com.mysql.jdbc.Driver";
//            Class.forName(Controlador);
//            final String url_bd = "jdbc:mysql://localhost:8080/tienda";
//            conexion = DriverManager.getConnection(url_bd, "root", "");
//            sentencia = conexion.createStatement();
//        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    public void DesconectarBasedeDatos() {
//        try {
//            if (conexion != null) {
//                if (sentencia != null) {
//                    sentencia.close();
//                }
//                conexion.close();
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            System.exit(1);
//        }
//    }
//
//    public Connection getConnection() {
//        return conexion;
//    }
}
