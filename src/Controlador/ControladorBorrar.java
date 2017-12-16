/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import curso.modelo.ModeloBorrar;
import java.sql.SQLException;

/**
 *
 * @author Cèsar
 */
public class ControladorBorrar {
    
    private ModeloBorrar modeloBorrar;
    
    public void borrarAlumno(int rut) throws SQLException{
        modeloBorrar=new ModeloBorrar();
        modeloBorrar.borrarAlumno(rut);
    }
    
    public void borrarCurso(int cod) throws SQLException{
        modeloBorrar=new ModeloBorrar();
        modeloBorrar.borrarCurso(cod);
    }
    
    
    
}
