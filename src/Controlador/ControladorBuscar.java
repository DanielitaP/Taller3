/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import curso.modelo.Alumno;
import curso.modelo.ModeloBusca;
import java.sql.SQLException;

/**
 *
 * @author Cèsar
 */
public class ControladorBuscar {
    
    private ModeloBusca modeloBusca;
    
     public Alumno buscarAlumnoRut(int rut) throws SQLException{
         modeloBusca=new ModeloBusca();
         return modeloBusca.buscarAlumnoRut(rut);
         
     }

    public ModeloBusca getModeloBusca() {
        return modeloBusca;
    }

    public void setModeloBusca(ModeloBusca modeloBusca) {
        this.modeloBusca = modeloBusca;
    }
    
}
