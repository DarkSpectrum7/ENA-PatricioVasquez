/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patri
 */
public class Conexion {
    private static Connection cn = null;
    private static String URL = "jdbc:mysql://localhost:3306/requerimiento?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static String usuario = "root";
    private static String contrasena = "root";
    private static PreparedStatement pstm = null;
    private static ResultSet rs = null;
    private static String sql = "";
    private String Driver="com.mysql.jdbc.Driver";
    private Connection conex;
    
/*public class Conexion {
    Connection cn;
    String url = "jdbc:mysql://localhost:3306/requerimiento?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String drv = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String contrasena = "root";
    PreparedStatement pstm = null;
    ResultSet rs = null;
    String sql = ""; */

/*    public Connection getConexion() {

        try {
            Class.forName(drv);//driver
            cn = DriverManager.getConnection(url, usuario, contrasena);
            pstm = cn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e);
        }
        return cn;
    }*/
    
    
    
    public static Connection getConexion() throws SQLException {
  
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cn = DriverManager.getConnection(URL, usuario, contrasena);

        return cn;
    }
    
    public ResultSet getDatos(String com){
        try {
            this.getConexion();
            rs = pstm.executeQuery(com);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return rs;
    }
    
        public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName(Driver);
        conex=DriverManager.getConnection(URL, usuario,contrasena);
    }
    public void desconectar() throws SQLException{
        conex.close();
    }
}
