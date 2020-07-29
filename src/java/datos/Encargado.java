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
public class Encargado {
    
    private int id_en;
    private String nombre_en;

        public Encargado(){

    }

    public Encargado(int id_en, String nombre_en) {
        this.id_en = id_en;
        this.nombre_en = nombre_en;
    }

    public int getId_en() {
        return id_en;
    }

    public void setId_en(int id_en) {
        this.id_en = id_en;
    }

    public String getNombre_en() {
        return nombre_en;
    }

    public void setNombre_en(String nombre_en) {
        this.nombre_en = nombre_en;
    }
    
    
        public ArrayList<Encargado> listaEncargado(){
        
            ArrayList LEncargado=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.encargados";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LEncargado.add(new Encargado(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LEncargado;
    }
}
