/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class In_Requerimiento {
        
    private int id_ger;
    private String nombre_ger;
    
    private int id_dep;
    private String nombre_dep;
    private int id_depGer;
    
    private int id_ar;
    private String nombre_ar;
    
    private int id_en;
    private String nombre_en;
    private int id_arEn;

    public In_Requerimiento(){

    }

    public In_Requerimiento(int id_ger, String nombre_ger) {
        this.id_ger = id_ger;
        this.nombre_ger = nombre_ger;
    }

    public In_Requerimiento(int id_dep, String nombre_dep, int id_depGer) {
        this.id_dep = id_dep;
        this.nombre_dep = nombre_dep;
        this.id_depGer = id_depGer;
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

    public int getId_depGer() {
        return id_depGer;
    }

    public void setId_depGer(int id_depGer) {
        this.id_depGer = id_depGer;
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

    public int getId_arEn() {
        return id_arEn;
    }

    public void setId_arEn(int id_arEn) {
        this.id_arEn = id_arEn;
    }

    public ArrayList<In_Requerimiento> listaGerencia(){
        
            ArrayList LGerencia=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.gerencias";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LGerencia.add(new In_Requerimiento(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LGerencia;
    }
    
    public ArrayList<In_Requerimiento> listaDepartamento(){
        
            ArrayList LDepartamento=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.departamentos";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LDepartamento.add(new In_Requerimiento(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LDepartamento;
    }

    public ArrayList<In_Requerimiento> listaArea(){
        
            ArrayList LArea=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.areas";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LArea.add(new In_Requerimiento(rs.getInt(1),
                                       rs.getString(2)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LArea;
    }

    public ArrayList<In_Requerimiento> listaEncargado(){
        
            ArrayList LEncargado=new ArrayList();
            Conexion conex=new Conexion();
            String sql="SELECT * FROM requerimiento.encargados";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                LEncargado.add(new In_Requerimiento(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return LEncargado;
    }

}
