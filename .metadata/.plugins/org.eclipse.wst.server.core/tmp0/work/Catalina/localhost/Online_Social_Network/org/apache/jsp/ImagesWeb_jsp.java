/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.30
 * Generated at: 2018-05-16 11:48:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database.images;
import java.util.*;

public final class ImagesWeb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Database.images");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/animate.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/icomoon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/magnific-popup.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/salvattore.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ImagesPage/css/Button.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<button class=\"myButton\" type=\"submit\" style=\"float: right; margin-right: 150px;\" onclick=\"location.href='UpdateImagesWeb.jsp';\"><b>Update</b></button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<div id=\"fh5co-main\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"fh5co-board\" data-columns>\r\n");
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("        \t");
 String email = (String)session.getAttribute("LogDetails"); 
			ArrayList<String> ImgSet = images.GetImg(email);
			ArrayList<String> NumSet = images.GetNum(email);
			ArrayList<String> DaTiSet = images.GetDaTi(email);
			ArrayList<String> SizeSet = images.GetSize(email);
				for(int i = 0; i < ImgSet.size();i++) {
      out.write("\r\n");
      out.write("        \t<div class=\"item\">\r\n");
      out.write("        \t\t<div class=\"animate-box\">\r\n");
      out.write("        \t\t\t<a href=\"");
      out.print(ImgSet.get(i) );
      out.write("\" class=\"image-popup fh5co-board-img\"><img src=\"");
      out.print(ImgSet.get(i) );
      out.write("\"></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"fh5co-desc\">Image No :- ");
      out.print(NumSet.get(i) );
      out.write("<br>Image Size :- ");
      out.print(SizeSet.get(i) );
      out.write(" KB<br>Modified Date :- ");
      out.print(DaTiSet.get(i) );
      out.write("<br></div>        \t\t\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("        \t</div> ");
 }
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"ImagesPage/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"ImagesPage/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<script src=\"ImagesPage/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<script src=\"ImagesPage/js/salvattore.min.js\"></script>\r\n");
      out.write("\t<script src=\"ImagesPage/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
