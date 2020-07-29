/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import datos.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import conexion.*;
import java.util.ArrayList;
/**
 *
 * @author patri
 */
@WebServlet(name = "Consultas", urlPatterns = {"/IngresarRequerimiento"})
public class Consultas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Gerencia ger=new Gerencia();
        Departamento dep=new Departamento();
        Area ar=new Area();
        Encargado en=new Encargado();

       /*LISTA GERENCIA*/ 
        ArrayList <Gerencia> LGerencia=new ArrayList<Gerencia>();
         LGerencia=ger.listaGerencia();
         
          request.setAttribute("LGerencia", LGerencia);
          
        /*LISTA DEPARTAMENTO*/  
        ArrayList <Departamento> LDepartamento=new ArrayList<Departamento>();
         LDepartamento=dep.listaDepartamento();
         
          request.setAttribute("LDepartamento", LDepartamento);  
          
        /*LISTA AREA*/  
         ArrayList <Area> LArea=new ArrayList<Area>();
         LArea=ar.listaArea();
         
          request.setAttribute("LArea", LArea);
          
          
         /*LISTA ENCARGADO*/  
         ArrayList <Encargado> LEncargado=new ArrayList<Encargado>();
         LEncargado=en.listaEncargado();
         
          request.setAttribute("LEncargado", LEncargado); 
          
          
          
          
          request.getRequestDispatcher("/IngresarRequerimiento.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
