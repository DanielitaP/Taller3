/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cèsar
 */
public class ModeloBorrar {
    
    public void borrarProducto(int codigo_producto) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1= "DELETE FROM ALMACEN_PRODUCTO WHERE CODIGO_PRODUCTO="+codigo_producto;
        dec.addBatch(query1);
        String query2 = "DELETE FROM A_PRODUCTO WHERE CODIGO_PRODUCTO="+codigo_producto;
        dec.addBatch(query2);
        dec.executeBatch();
    }
    
     public void borrarAlmacen(int codigo_almacen) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="DELETE FROM ALMACEN_PRODUCTO WHERE CODIGO_ALMACEN="+codigo_almacen;
        dec.addBatch(query1);
        String query2="DELETE FROM A_ALMACEN WHERE CODIGO_ALMACEN="+codigo_almacen;
        dec.addBatch(query2);
        dec.executeBatch();
    }
    
}
