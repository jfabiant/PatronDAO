<%@page import="clases.Usuario"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="clases.UsuarioDatos"%>
<jsp:useBean id="ud" class="clases.UsuarioDatos" scope="request"/>
<%
    List l = ud.recuperarUsuario();
    Iterator i = l.iterator();
    
    Usuario usr;
    
    while (i.hasNext()){
        usr = (Usuario)i.next();
        out.println("Nombres: "+usr.getNombres()+" - <span style='color:red;'>"+usr.getEmail()+"</span><br>");
        
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Semana 5</title>
    </head>
    <body>
    </body>
</html>