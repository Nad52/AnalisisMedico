/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.ug.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mx.ug.analisis.Dieta;
import mx.ug.utilidades.Conexion;

/**
 *
 * @author bruja1
 */
public class DietaSQL {
    public static List<Dieta> obtenerDieta(){
        List<Dieta> lstDieta=new ArrayList<>();
        String query = "select idDieta,numeroDieta,fechaInicio,fechaFin from dieta;";
        Connection cn=Conexion.getConexion();
        try{
            PreparedStatement pst=cn.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int id=rs.getInt(1);
                int numDieta=rs.getInt(2);
                String fechainicio=rs.getString(3);
                String fechaFin=rs.getString(4);
                Dieta d=new Dieta();
                d.setIdDieta(id);
                d.setNumeroDieta(numDieta);
                d.setFechaInicio(fechainicio);
                d.setFechaFin(fechaFin);
                              
                lstDieta.add(d);
                }
            }
        catch (SQLException ex){
            ex.printStackTrace();        
    }      
        return lstDieta;
        
    }    
    public static void main(String[] args) {
        List<Dieta> lstDieta= obtenerDieta();
        for (Dieta dieta : lstDieta) {
            System.out.println(dieta);
        }
    }
    
}
