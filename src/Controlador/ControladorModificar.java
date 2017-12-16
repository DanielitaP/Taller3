/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import curso.modelo.ModeloModificar;
import java.sql.SQLException;

/**
 *
 * @author Cèsar
 */
public class ControladorModificar {
    
    private ModeloModificar modeloModificar;
    
    public void modificaAlumno(int rut, String apellido) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificaAlumno(rut, apellido);
    }
}
