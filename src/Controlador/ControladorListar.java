/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import curso.modelo.Alumno;
import curso.modelo.Curso;
import curso.modelo.ModeloLista;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cèsar
 */
public class ControladorListar {
    
    private ModeloLista modeloLista;
    
    public ArrayList <Alumno> getListadoAlumno() throws SQLException{
        modeloLista = new ModeloLista();
        return modeloLista.getListadoAlumno(); 
    }
    
    public ArrayList <Curso> getListadoCurso() throws SQLException{
        modeloLista = new ModeloLista();
        return modeloLista.getListadoCurso(); 
    }
    
}
