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
import mx.ug.analisis.Fecha;
import mx.ug.utilidades.Conexion;

/**
 *
 * @author Lanix
 */
public class FechaSQL {
     public static List<Fecha> obtenerFecha(){
        List<Fecha> lstFecha=new ArrayList<>();
        String query = "Select idFecha,FechaAnalisis,FechaImpres FROM Fecha";
        Connection cn=Conexion.getConexion();
        try{
            PreparedStatement pst=cn.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int idFecha=rs.getInt(1);
                String fechaAnalisis=rs.getString(2);
                String fechaInpres=rs.getString(3);
                Fecha fe=new Fecha();
                fe.setIdFecha(idFecha);
                fe.setFechaAnalisis(fechaAnalisis);
                fe.setFehcaImpres(fechaInpres);
                lstFecha.add(fe);           
                }
            }
        catch (SQLException ex){
            ex.printStackTrace();        
    }      
        return lstFecha;
        
    }    
    public static void main(String[] args) {
        List<Fecha> lstFecha= obtenerFecha();
        for (Fecha fecha : lstFecha) {
            System.out.println(fecha);
        }
    }
}
