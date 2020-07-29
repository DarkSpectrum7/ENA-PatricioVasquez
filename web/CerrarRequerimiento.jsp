<%-- 
    Document   : CerrarRequerimiento
    Created on : 12-07-2020, 19:00:01
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
        
        
        <form action=""  method="post">
      
             <h1>Cerrar Requerimiento</h1>
      <hr>
      
      <table>
      <tr>
      <td align="left">Gerencia:</td>
      <td> <select name="menu" class="browser-default"> 
<option value="" disabled selected>Todos</option>
                       
        </select> </td>
      </tr> 
      
      <tr>
      <td align="left" class="input-field col s12">Depto:</td>
      <td> <select name="menu" class="browser-default"> <option value="" disabled selected>Todos</option> </select> </td>
      </tr> 
      
      <tr>
      <td align="left" class="input-field col s12">Asignar a:</td>
      <td> <select name="menu" class="browser-default">
                 <option value="" disabled selected>Todos</option>
                 
		 </select> </td>
      </tr> 
      
      </table>
             </form>
                    <Br>
	      <form>
  
	  <input class="buttons" type="submit" name="input" value="Buscar">
	  <br>
  
  <table border="">
    <tr align="center">
      <td>Gerencia</td>
      <td>Depto</td>
      <td>Asignado a</td>
      <td>Requerimiento</td>
      <td>&nbsp;</td>
    </tr>
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><input type="button" name="button" id="button" value="Cerrar"></td>
    </tr>
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><input type="button" name="button2" id="button2" value="Cerrar"></td>
    </tr>
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><input type="button" name="button3" id="button3" value="Cerrar"></td>
    </tr>
    <tr align="center">
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td><input type="button" name="button4" id="button4" value="Cerrar"></td>
    </tr>
  
</table>
         </form>   
                    
        <form action="MenuPrincipal.jsp" method="post">            
        <input class="buttons" type="submit" name="" value="Volver al Menú">
        </form>
    </body>
</html>
