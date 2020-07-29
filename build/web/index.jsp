<%-- 
    Document   : index
    Created on : 12-07-2020, 17:59:14
    Author     : Patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
  <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    
     
        
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               
<div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel z-depth-5">
        
         <form action="MenuPrincipal" class= "" method="post" >
             
      
      
      <table>
           <h1>Autentificación</h1>
           <hr>
      <tr>
      <td align="left">Usuario</td>
      <td> <input class="validate"required type="text" name="usuario" value="" placeholder="Usuario"> </td>
      </tr> <br>
      
      <tr>
      <td align="left">Password</td>
      <td> <input class="validate"required type="password" name="password" value="" placeholder="Contraseña"> </td>
      </tr>
      </table>
     
      <br>
      <label>
             <input class="with-gap" name="login" type="checkbox" value="recordar"  />
             <span>Recordar</span>
      </label>
      <br><br>
      <input class="buttons" type="submit" name="" value="Ingresar">
      
      </form>
    
                </div>
                </div>
    </div>
        
      
  </body>
    </body>
</html>
