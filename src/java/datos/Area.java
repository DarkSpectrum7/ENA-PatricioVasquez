/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Area {
    
    private int id_ar;
    private String nombre_ar;
    
    public Area(){

    }

    public Area(int id_ar, String nombre_ar) {
        this.id_ar = id_ar;
        this.nombre_ar = nombre_ar;
    }

    public int getId_ar() {
        return id_ar;
    }

    public void setId_ar(int id_ar) {
        this.id_ar = id_ar;
    }

    public String getNombre_ar() {
        return nombre_ar;
    }

    public void setNombre_ar(String nombre_ar) {
        this.nombre_ar = nombre_ar;
    }


    
        public ArrayList<Area> listaArea(){
        
            ArrayList LArea=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.areas";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LArea.add(new Area(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LArea;
    }
    
}
