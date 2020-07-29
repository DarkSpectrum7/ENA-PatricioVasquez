<%-- 
    Document   : MenuPrincipal
    Created on : 12-07-2020, 17:59:50
    Author     : Patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
       
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
        
        
        <h1 align="center">Menú Principal</h1>
             <hr>
    
             <form class= "" method="post" align="center">
     
                 <center><button class="btn-small waves-effect waves-light" name="IngresarRequerimiento" onclick="document.forms[0].action = 'IngresarRequerimiento'; return true;">
                         Ingresar Requerimiento  </button></center>
             

         </form> <br>
         <form class="" method="post" align="center">
             <center><button class="btn-small waves-effect waves-light " name="ConsultarRequerimiento" onclick="document.forms[0].action = 'Consultas'; return true;">
                     Consultar Requerimiento  </button></center>  
             
          <%-- <input class="buttons" type="submit" name="" value="Consultar Requerimiento">--%>
         </form> <br>
         <form class="" method="post" align="center">
             <center><button class="waves-effect waves-light btn-small"name="CerrarRequerimiento" onclick="document.forms[0].action = 'Consultas'; return true;">
                     Cerrar Requerimiento </button></center>    
             

      
             </form>
           
    
    </body>
</html>
