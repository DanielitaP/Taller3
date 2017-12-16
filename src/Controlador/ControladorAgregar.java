/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloAgrega;
import java.sql.SQLException;

/**
 *
 * @author Cèsar
 */
public class ControladorAgregar {
    private ModeloAgrega modeloAgrega;
    
    public void agregaProducto(int codigo_producto, String nombre_producto, String marca_producto) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaProducto(codigo_producto, nombre_producto, marca_producto);
    }
    
    public void agregaCurso(int cod, String nombreCurso) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaCurso(cod, nombreCurso);
    }
    
}
