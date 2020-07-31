/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.*;
import conexion.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author patri
 */
public class InsertDatos {
    
     public static boolean agregarDatos(GuardaDatos InsertDatos){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO datos (gerencia,departamento,area,encargado,requerimineto) VALUES ('"+InsertDatos.getGerencia()+"','"+InsertDatos.getDepartamento()+"',"+InsertDatos.getArea()+",'"+InsertDatos.getEncargado()+"','"+InsertDatos.getRequerimineto()+"')");
    agregado=true;
    st.close();
   }
   c.desconectar();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
    
}
