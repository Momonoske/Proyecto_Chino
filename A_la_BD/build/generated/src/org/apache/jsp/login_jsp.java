package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LogIn ADRI</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"imag/fondo_2.jpg\">\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("         <center><fieldset style=\"border:2px solid red; width:300px;height:300px;\">\n");
      out.write("            <legend>LogIn</legend>\n");
      out.write("            <br>\n");
      out.write("            <form name=\"form1\" method=\"POST\" action=\"alta\">\n");
      out.write("                <img src=\"imag/logo.png\" width=\"120px\"  >\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Usuario </td>\n");
      out.write("                    <td> \n");
      out.write("                        <input type=\"text\" name=\"user\" required=\"true\" title=\"Campo requerido\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Password </td>\n");
      out.write("                    <td> \n");
      out.write("                        <input type=\"password\" name=\"pass\" required=\"true\" title=\"Campo requerido\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                  <tr>\n");
      out.write("                     <td align=\"center\"> \n");
      out.write("                        <input type=\"submit\" name=\"btn2\" value=\"Ingresar\">\n");
      out.write("                    </td>\n");
      out.write("                    <td align=\"center\"> \n");
      out.write("                        <input type=\"reset\" name=\"btn2\" value=\"Limpiar\">\n");
      out.write("                        <!--<input type='button' onclick='history.back()' name='volver' value='Cancelar'>\n");
      out.write("                        <input type='image' src='barca.jpg' width='100' height='20' onclick='history.back()'>\n");
      out.write("                        -->\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </fieldset></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
