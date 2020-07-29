package servlet;


import datos.Gerencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import conexion.*;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

 
@WebServlet(name = "Servlet", urlPatterns = {"/MenuPrincipal"})
public class Login extends HttpServlet {
    Connection con = null;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            boolean existeUsuario = false;
            //Guardamos los datos enviados desde index
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            //Establecemos la conexion
            con = Conexion.getConexion();
            String consulta = "select * from login where usuario = ? and pw = ?";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
 
            //String nombres="";
            //String apellidos="";
            while(rs.next()){
                //En caso de existir una coincidencia
                existeUsuario = true;
                //Y reemplazamos los atributos de dicho Usuario
                //nombres = rs.getString("nombres");
                //apellidos = rs.getString("apellidos");
            }
 
            if(existeUsuario){
                //Para el usuario existente:
                //Reemplazamos atributos que luego obtendremos desde las páginas .jsp
                //request.setAttribute("nombres", nombres);
                //request.setAttribute("apellidos", apellidos);
                //Mandamos estos atributos a la página bienvenida.jsp
                request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
            }else{
                //De lo contrario vamos a la página errorLogin.jsp
                request.getRequestDispatcher("/errorLogin.jsp").forward(request, response);
            }
            out.close();
        } catch (SQLException ex) {
        out.println(ex.toString());
        }
        
        response.setContentType("text/html;charset=UTF-8");
        Gerencia ger=new Gerencia();
       
        ArrayList <Gerencia> lista=new ArrayList<Gerencia>();
        lista=ger.listaGerencia();
         
        request.setAttribute("lista", lista);
           
        request.getRequestDispatcher("/IngresarRequerimiento.jsp").forward(request, response);
        
        
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    
    
    
}