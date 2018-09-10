
<!DOCTYPE html>
<jsp:useBean id="usr" class="clases.Usuario" scope="page"/>
<jsp:useBean id="ud" class="clases.UsuarioDatos" scope="request"/>
<jsp:setProperty name="usr" property="*"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Semana 5</title>
    </head>
    <body>
        <%
            String nombres, email;
            nombres = request.getParameter("nombres");
            email = request.getParameter("email");
            
            if(nombres == null && email == null){
            
        %>
        
        <form action="ingresoUsuarios.jsp" method="post">
            <label>Nombres: </label>
            <input name="nombres" type="text" value=""><br>
            <label>Email: </label>
            <input name="email" type="email" value=""><br>
            
            <input type="submit" value="Registrar">
        </form>
        <% } else {
            ud.registrarUsuario(usr);
        %>
                 
        <jsp:forward page="listaUsuarios.jsp"/>
        
        <%
            }
        %>
    </body>
</html>

