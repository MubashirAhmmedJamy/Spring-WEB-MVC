package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Employee</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Employee</h1>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"/Spring-WEB-MVC/employee\">\n");
      out.write("            <label>Name</label>\n");
      out.write("            <input type=\"text\" name=\"ename\"/>\n");
      out.write("            \n");
      out.write("            <label>Address</label>\n");
      out.write("            <input type=\"text\" name=\"eaddress\"/>\n");
      out.write("\n");
      out.write("            <input type=\"submit\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"/Spring-WEB-MVC/emp\">\n");
      out.write("            <label>Name</label>\n");
      out.write("            <input type=\"text\" name=\"ename\"/>\n");
      out.write("            \n");
      out.write("            <label>Address</label>\n");
      out.write("            <input type=\"text\" name=\"eaddress\"/>\n");
      out.write("            \n");
      out.write("            <label>Mobile</label>\n");
      out.write("            <input type=\"text\" name=\"empMobile\"/>\n");
      out.write("            \n");
      out.write("            <label>Date of Birth</label>\n");
      out.write("            <input type=\"text\" name=\"DOB\"/>\n");
      out.write("            \n");
      out.write("            <label>Skills</label>\n");
      out.write("            <select name=\"skills\">\n");
      out.write("                <option value=\"Java\">Java</option>\n");
      out.write("                <option value=\"C\">C</option>\n");
      out.write("                <option value=\"C++\">C++</option>\n");
      out.write("                <option value=\"PHP\">PHP</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
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
