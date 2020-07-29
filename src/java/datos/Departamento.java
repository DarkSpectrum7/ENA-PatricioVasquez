/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;
import conexion.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author patri
 */
public class Departamento {
    
    private int id_dep;
    private String nombre_dep;

        public Departamento(){

    }
    
    public Departamento(int id_dep, String nombre_dep) {
        this.id_dep = id_dep;
        this.nombre_dep = nombre_dep;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public String getNombre_dep() {
        return nombre_dep;
    }

    public void setNombre_dep(String nombre_dep) {
        this.nombre_dep = nombre_dep;
    }
    
    public ArrayList<Departamento> listaDepartamento(){
        
            ArrayList LDepartamento=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.departamentos";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LDepartamento.add(new Departamento(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LDepartamento;
    }


    
}
