/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cèsar
 */
public class ModeloModificar {
       //si saco este private string se marca la fila 24
    private String marca_producto;
    
    public void modificaProducto(int codigo_producto, String nombre_producto) throws SQLException{
        System.out.println("Modificar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="UPDATE A_PRODUCTO SET MARCA_PRODUTO='"+marca_producto+"' WHERE CODIGO_PRODUCTO="+codigo_producto;
        dec.executeUpdate(query1);
    }
    
}
