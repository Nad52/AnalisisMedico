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
import mx.ug.analisis.Medico;
import mx.ug.utilidades.Conexion;

/**
 *
 * @author Lanix
 */
public class MedicoSQL {
    public static List<Medico> obtenerMedico(){
        List<Medico> lstMedico=new ArrayList<>();
        String query = "Select idMedico,NombreMedico, ApellidoP,ApellidoM,Especialidad from medico";
        Connection cn=Conexion.getConexion();
        try{
            PreparedStatement pst=cn.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int idmedico=rs.getInt(1);
                String nombre=rs.getString(2);
                String apellidoP=rs.getString(3);
                String apellidoM=rs.getString(4);
                String especialidad=rs.getString(5);
                Medico me=new Medico();
                me.setIdMedico(idmedico);
                me.setNombreMed(nombre);
                me.setApellidoP(apellidoP);
                me.setApellidoM(apellidoM);
                me.setEspecialidad(especialidad);
                lstMedico.add(me);           
                }
            }
        catch (SQLException ex){
            ex.printStackTrace();        
    }      
        return lstMedico;
        
    }    
    public static void main(String[] args) {
        List<Medico> lstMedico= obtenerMedico();
        for (Medico medico : lstMedico) {
            System.out.println(medico);
        }
    }
}
