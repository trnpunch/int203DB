package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Parant;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user = (String) request.getAttribute("userName");
           
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HOME.jsp?title=Profile", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            ID-Student : <input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getsId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\"><br>\n");
      out.write("            NAME :<input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getsFName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"FName\"><br>\n");
      out.write("            SURNAME : <input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getsLName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"LName\"><br>\n");
      out.write("            ADDRESS :<input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getsAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"add\"><br>\n");
      out.write("            DOB : <input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getDob()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"dob\"><br>\n");
      out.write("            Classroom : <input type=\"text\" disabled value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getClassroom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"classroom\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <p><a href=\"Logout\">LOGOUT</p>\n");
      out.write("        <p><a href=\"CheckGrade\">Check Grade</p>\n");
      out.write("        <p><a href=\"Parant.jsp\">Check Grade</p>\n");
      out.write("\n");
      out.write("        <p><a href=\"Parant.jsp?parantId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getParantId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Parant</p>\n");
      out.write("\n");
      out.write("\n");
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
