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
import mx.ug.analisis.Paciente;
import mx.ug.utilidades.Conexion;

/**
 *
 * @author Lanix
 */
public class PacienteSQL {
    public static List<Paciente> obtenerPaciente(){
        List<Paciente> lstPaciente=new ArrayList<>();
        String query = "Select idPaciente,NombrePaciente,ApellidoP,ApellidoM,Edad from paciente";
        Connection cn=Conexion.getConexion();
        try{
            PreparedStatement pst=cn.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int idPaciente=rs.getInt(1);
                String nombre=rs.getString(2);
                String apellidoP=rs.getString(3);
                String apellidoM=rs.getString(4);
                int edad=rs.getInt(5);
                
                Paciente p=new Paciente();
                
                p.setIdPaciente(idPaciente);
                p.setNombre(nombre);
                p.setApellidoP(apellidoP);
                p.setApellidoM(apellidoM);
                p.setEdad(edad);
                
                lstPaciente.add(p);           
                }
            }
        catch (SQLException ex){
            ex.printStackTrace();        
    }      
        return lstPaciente;
        
    }    
    public static void main(String[] args) {
        List<Paciente> lstPaciente= obtenerPaciente();
        for (Paciente paciente : lstPaciente) {
            System.out.println(paciente);
        }
    }   
}
