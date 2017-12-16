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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cèsar
 */
public class ModeloLista {
    
    public ArrayList<Producto> getListadoProducto() throws SQLException{
        ArrayList<Producto> listProducto = null;
        String sql="SELECT NOMBRE_PRODUCTO, MARCA_PRODUCTO FROM A_PRODUCTO";
        PreparedStatement preparedStatement;
        try {
            listProducto=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Producto producto = new Producto();
            producto.setNombre_producto(resultSet.getString("NOMBRE_PRODUCTO"));
            producto.setMarca_producto(resultSet.getString("MARCA_PRODUCTO"));
            listProducto.add(producto);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProducto;
    }
    
    public ArrayList<Almacen> getListadoALmacen() throws SQLException{
        ArrayList<Almacen> listAlmacen = null;
        String sql="SELECT NOMBRE_ALMACEN FROM A_ALMACEN";
        PreparedStatement preparedStatement;
        try {
            listAlmacen=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Almacen almacen = new Almacen();
            almacen.setNombre_Almacen(resultSet.getString("NOMBRE_ALMACEN"));
            listAlmacen.add(almacen);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAlmacen;
    }
    
}
