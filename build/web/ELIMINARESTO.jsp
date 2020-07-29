<select name="departamento" class="browser-default" name="Requerimiento">
        <option value="" disabled selected>Selecciona un Departamento</option>
        <% List<In_Requerimiento> listaDepartamento=(List<In_Requerimiento>)request.getAttribute("LDepartamento");
        if(listaDepartamento!=null)//ESTO TMBN ES IMPORTANTE 
        for(In_Requerimiento c:listaDepartamento){%>
        <option value="<%=c.getId_dep()%>"><%=c.getNombre_dep()%></option>
        <%} %>
        </select> 
