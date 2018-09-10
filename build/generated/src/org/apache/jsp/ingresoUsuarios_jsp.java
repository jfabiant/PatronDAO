package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ingresoUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      clases.Usuario usr = null;
      synchronized (_jspx_page_context) {
        usr = (clases.Usuario) _jspx_page_context.getAttribute("usr", PageContext.PAGE_SCOPE);
        if (usr == null){
          usr = new clases.Usuario();
          _jspx_page_context.setAttribute("usr", usr, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      clases.UsuarioDatos ud = null;
      synchronized (request) {
        ud = (clases.UsuarioDatos) _jspx_page_context.getAttribute("ud", PageContext.REQUEST_SCOPE);
        if (ud == null){
          ud = new clases.UsuarioDatos();
          _jspx_page_context.setAttribute("ud", ud, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("usr"), request);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("usr"), request);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Semana 5</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String nombres, email;
            nombres = request.getParameter("nombres");
            email = request.getParameter("email");
            
            if(nombres == null && email == null){
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"ingresoUsuarios.jsp\" method=\"post\">\n");
      out.write("            <label>Nombres: </label>\n");
      out.write("            <input name=\"nombres\" type=\"text\" value=\"\"><br>\n");
      out.write("            <label>Email: </label>\n");
      out.write("            <input name=\"email\" type=\"email\" value=\"\"><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Registrar\">\n");
      out.write("        </form>\n");
      out.write("        ");
 } else {
            ud.registrarUsuario(usr);
         }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
