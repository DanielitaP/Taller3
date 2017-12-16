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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cèsar
 */
public class ModeloBusca {
    
    public Producto buscarProductoCodigo_producto(int codigo_producto) throws SQLException{
        System.out.println("Buscar registro...");
        String sql="SELECT CODIGO_PRODUCTO, NOMBRE_PRODUCTO, MARCA_PRODUCTO FROM A_PRODUCTO WHERE CODIGO_PRODUCTO="+codigo_producto;
        PreparedStatement preparedStatement;
        Producto producto=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            producto = new Producto();
            producto .setCodigo_producto(codigo_producto);
            producto .setNombre_producto(resultSet.getString("NOMBRE_PRODUCTO"));
            producto .setMarca_producto(resultSet.getString("MARCA_PRODUCTO"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto ;
    }
    
    public void buscarAlumnoNombre(String nombre){
        
    }
    
}
