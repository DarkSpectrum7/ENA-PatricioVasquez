<%-- 
    Document   : IngresarRequerimiento
    Created on : 12-07-2020, 18:00:10
    Author     : Patri
--%>
<%@page import="java.util.List"%>
<%@page import="conexion.*"%>
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
        
        
        <form action="" name="f1"  method="post">

             <h1>Ingresar Requerimiento</h1>
      <hr>
      

      <tr>
      <td align="left">Gerencia:</td>
      <td> 
          
          <select browser-default name="gerencia" class="browser-default" onchange="cambia_departamento()">
              <option value="" disabled selected>Selecciona una Gerencia</option>
        <% List<In_Requerimiento> listaGerencia=(List<In_Requerimiento>)request.getAttribute("lista");
        if(listaGerencia!=null)//ESTO TMBN ES IMPORTANTE 
        for(In_Requerimiento c:listaGerencia){%>
        <option value="<%=c.getId_ger()%>"><%=c.getNombre_ger()%></option>
        <%--<option value="0">NOMBRE</option>--%>
        <%} %>
        </select>
         
           </td>
      </tr> 
      
      <tr>
      <td align="left" >Departamento:</td>
      <td> 
        <select browser-default name="departamento" class="browser-default">
                <option value="" disabled selected>Selecciona una Gerencia</option>
	        <% List<In_Requerimiento> listaDepartamento=(List<In_Requerimiento>)request.getAttribute("LDepartamento");
        if(listaDepartamento!=null)//ESTO TMBN ES IMPORTANTE 
        for(In_Requerimiento c:listaDepartamento){%>
        <option value="<%=c.getId_dep()%>"><%=c.getNombre_dep()%></option>
        <%} %>
        </select>
       </form> 
      </td>
      </tr> 
      
      <tr>
      <td align="left">Asignar a:</td>
      <td> <select name="menu" class="browser-default">
                 <option value="" disabled selected>Seleccionar</option>
 
		 </select> </td>
      </tr> 
      
      <tr>
      <td align="left" >Encargado:</td>
      <td> <select name="menu" class="browser-default"> 
              <option value="" disabled selected>Seleccionar</option>
 
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
    
        <script>
  var departamento_1=new Array("Seleccion","Prevencion de riesgo");
  var departamento_2=new Array("Seguridad");

  var todosDepartamentos = [
    [],
    departamento_1,
    departamento_2,

  ];

  function cambia_departamento(){ 
   	//tomo el valor del select del pais elegido 
   	var gerencia 
   	gerencia = document.f1.gerencia[document.f1.gerencia.selectedIndex].value 
   	//miro a ver si el pais está definido 
   	if (gerencia != 0) { 
      	//si estaba definido, entonces coloco las opciones de la provincia correspondiente. 
      	//selecciono el array de provincia adecuado 
      	mis_departamentos=todosDepartamentos[gerencia]
      	//calculo el numero de provincias 
      	num_departamento = mis_departamentos.length 
      	//marco el número de provincias en el select 
      	document.f1.departamento.length = num_departamento 
      	//para cada provincia del array, la introduzco en el select 
      	for(i=0;i<num_departamento;i++){ 
         	document.f1.departamento.options[i].value=mis_departamentos[i] 
         	document.f1.departamento.options[i].text=mis_departamentos[i] 
      	}	
   	}else{ 
      	//si no había provincia seleccionada, elimino las provincias del select 
      	document.f1.departamento.length = 1 
      	//coloco un guión en la única opción que he dejado 
      	document.f1.departamento.options[0].value = "-" 
      	document.f1.departamento.options[0].text = "-" 
   	} 
   	//marco como seleccionada la opción primera de provincia 
   	document.f1.departamento.options[0].selected = true 
}

  </script>
        
    </body>
</html>
