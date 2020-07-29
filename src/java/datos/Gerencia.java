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
public class Gerencia {
        
    private int id_ger;
    private String nombre_ger;
    
    public Gerencia(){

    }

    public Gerencia(int id_ger, String nombre_ger) {
        this.id_ger = id_ger;
        this.nombre_ger = nombre_ger;
    }

    public int getId_ger() {
        return id_ger;
    }

    public void setId_ger(int id_ger) {
        this.id_ger = id_ger;
    }

    public String getNombre_ger() {
        return nombre_ger;
    }

    public void setNombre_ger(String nombre_ger) {
        this.nombre_ger = nombre_ger;
    }

    
    public ArrayList<Gerencia> listaGerencia(){
        
            ArrayList LGerencia=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.gerencias";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LGerencia.add(new Gerencia(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LGerencia;
    }

}
