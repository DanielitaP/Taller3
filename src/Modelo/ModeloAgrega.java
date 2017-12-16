/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Cèsar
 */
public class ModeloAgrega {
    
    //private ArrayList<Curso> cursos;
    private Producto producto;
    
    public void agregaProducto(int codigo_producto, String nombre_producto, String marca_producto) throws SQLException{
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into A_PRODUCTO (CODIGO_PRODUCTO, NOMBRE_PRODUCTO, MARCA_PRODUCTO) VALUES ("+codigo_producto+", '"+nombre_producto+"', '"+marca_producto+"')";
        dec.executeUpdate(query1);
        
    }
    
    public void agregaAlmacen(int codigo_almacen, String nombre_almacen) throws SQLException{
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into A_ALMACEN (CODIGO_ALMACEN, NOMBRE_ALMACEN) VALUES ("+codigo_almacen+", '"+nombre_almacen+"')";
        dec.executeUpdate(query1);
        
    }
    
}
