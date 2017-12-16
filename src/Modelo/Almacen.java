/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cèsar
 */
public class Almacen {
    
    private int Codigo_Almacen;
    private String Nombre_Almacen;

    public Almacen() {
    }

    public Almacen(int Codigo_Almacen, String Nombre_Almacen) {
        this.Codigo_Almacen = Codigo_Almacen;
        this.Nombre_Almacen = Nombre_Almacen;
    }

    public int getCodigo_Almacen() {
        return Codigo_Almacen;
    }

    public void setCodigo_Almacen(int Codigo_Almacen) {
        this.Codigo_Almacen = Codigo_Almacen;
    }

    public String getNombre_Almacen() {
        return Nombre_Almacen;
    }

    public void setNombre_Almacen(String Nombre_Almacen) {
        this.Nombre_Almacen = Nombre_Almacen;
    }
    
    
    
    
    
}
