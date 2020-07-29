<%-- 
    Document   : IngresarRequerimiento
    Created on : 12-07-2020, 18:00:10
    Author     : Patri
--%>
<%@page import="java.util.List"%>
<%@page import="conexion.*"%>
<%@page import="datos.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

             <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>    
    
       <script>
        document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('select');
        var instances = M.FormSelect.init(elems);
        });
       </script> 
       
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  
        
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
        
        
        <form action="" method="post">

             <h1>Ingresar Requerimiento</h1>
      <hr>
      

      <tr>
      <td align="left">Gerencia:</td>
      <td> 
          
          <select browser-default name="gerencia" class="browser-default" onchange="cambia_departamento()">
              <option value="" disabled selected>Selecciona una Gerencia</option>
        <% List<Gerencia> listaGerencia=(List<Gerencia>)request.getAttribute("LGerencia");
        if(listaGerencia!=null)//ESTO TMBN ES IMPORTANTE 
        for(Gerencia c:listaGerencia){%>
        <option value="<%=c.getId_ger()%>"><%=c.getNombre_ger()%></option>
        <%} %>
        </select>
         
           </td>
      </tr> 
      
      <tr>
      <td align="left" >Departamento:</td>
      <td> 
        <select browser-default name="departamento" class="browser-default">
                <option value="" disabled selected>Selecciona una Departamento</option>
	        <% List<Departamento> listaDepartamento=(List<Departamento>)request.getAttribute("LDepartamento");
        if(listaDepartamento!=null)//ESTO TMBN ES IMPORTANTE 
        for(Departamento ld:listaDepartamento){%>
        <option value="<%=ld.getId_dep()%>"><%=ld.getNombre_dep()%></option>
        <%} %>
        </select>
       </form> 
      </td>
      </tr> 
      
      <tr>
      <td align="left">Asignar a:</td>
      <td> 
          <select browser-default name="area" class="browser-default">
                <option value="" disabled selected>Selecciona a que Area lo asigna</option>
	        <% List<Area> listaArea=(List<Area>)request.getAttribute("LArea");
        if(listaArea!=null)//ESTO TMBN ES IMPORTANTE 
        for(Area la:listaArea){%>
        <option value="<%=la.getId_ar()%>"><%=la.getNombre_ar()%></option>
        <%} %>
        </select>
      </td>
      </tr> 
      
      <tr>
      <td align="left" >Encargado:</td>
      <td> 
          <select browser-default name="encargado" class="browser-default">
                <option value="" disabled selected>Selecciona un Encargado</option>
	        <% List<Encargado> listaEncargado=(List<Encargado>)request.getAttribute("LEncargado");
        if(listaEncargado!=null)//ESTO TMBN ES IMPORTANTE 
        for(Encargado le:listaEncargado){%>
        <option value="<%=le.getId_en()%>"><%=le.getNombre_en()%></option>
        <%} %>
        </select>
      </td>
      </tr> 
      
      <tr>         
      <td align="left">Requerimiento:</td>
      <td> <textarea name="texto" rows="4" cols="40" placeholder="Escriba algo"></textarea> </td>
      </tr>          
      

           
        
      <input class="buttons" type="submit" name="" value="Guardar">
   
        
        <form action="MenuPrincipal.jsp"  method="post">
          <input class="buttons" type="submit" name="" value="Volver al Menú">
         </form>
   
        
    </body>
</html>
