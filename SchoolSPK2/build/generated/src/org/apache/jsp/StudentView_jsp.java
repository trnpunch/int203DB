package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Student;

public final class StudentView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"StudentSearch\" method=\"post\">\n");
      out.write("            name   <input type=\"text\" name=\"searchName\">\n");
      out.write("            <input type=\"submit\" value=\"[ SEARCH ]\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            List<Student> std = (List) session.getAttribute("students");
            if (std != null) {

        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Id</td>\n");
      out.write("\n");
      out.write("                <td>NAME</td>\n");
      out.write("                <td>SURNAME</td>\n");
      out.write("                <td>DOB</td>\n");
      out.write("                <td>CLASSROOM</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
for (Student s : std) {
      out.write("\n");
      out.write("            <tr><td>");
      out.print( s.getsId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.getsFName());
      out.write("</td>  <td>");
      out.print(s.getsLName());
      out.write("</td>\n");
      out.write("\n");
      out.write("                <td>");
      out.print(s.getDob());
      out.write("</td>  <td>");
      out.print(s.getClassroom());
      out.write("</td> \n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        ");
      out.print(request.getAttribute("message"));
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h3 style=\"color:red;margin-left:50px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("        <hr>\n");
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
