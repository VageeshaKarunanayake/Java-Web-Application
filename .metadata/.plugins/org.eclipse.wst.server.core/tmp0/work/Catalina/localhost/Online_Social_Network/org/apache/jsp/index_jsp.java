/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.30
 * Generated at: 2018-06-11 17:44:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.text.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/addSerach.jsp", Long.valueOf(1526489090341L));
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1528739018681L));
    _jspx_dependants.put("/addTime.jsp", Long.valueOf(1526827510320L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Header/HeaderStyle_h.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<ul id=\"menu_wrap\" class=\"Vista_Black\"><li class=\"button\"><a href=\"Home.jsp\">Home</a></li><li class=\"button\"><a href=\"ImagesWeb.jsp\">Wall</a></li><li class=\"button\"><a href=\"index.jsp\">Friends</a></li><li class=\"button\"><a href=\"chat.jsp\">Message</a></li><li class=\"button\"><a href=\"PostWeb.jsp\">Posts</a></li><li class=\"button\"><a href=\"SearchWeb.jsp\">Search</a></li><li class=\"button\" style=\"float:right\"><a href=\"FirstWeb.jsp\">");
      out.print((String)session.getAttribute("LogDetails"));
      out.write("(Logout)</a></li> </ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("form.example  {\r\n");
      out.write("  \tfloat:right;\r\n");
      out.write("\tmargin-right:2cm;\r\n");
      out.write("\tmargin-top:2cm;\r\n");
      out.write("   \r\n");
      out.write("}</style>\r\n");
      out.write("\r\n");
      out.write("<form class=\"example\"  action=\"add.jsp\" style=\"\">\r\n");
      out.write("  <input type=\"text\" placeholder=\"Search..\" name=\"search2\" style=\"height:55px;width:10cm\">\r\n");
      out.write("  <button type=\"submit\" style=\"font-size: 17px;width:2;height:55.3px\" >Add Friend</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".add-friend-button {\r\n");
      out.write("  font: bold 21px Arial;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  background-color: blue;\r\n");
      out.write("  color: #333333;\r\n");
      out.write("  padding: 2px 6px 2px 6px;\r\n");
      out.write("  border-top: 1px solid #CCCCCC;\r\n");
      out.write("  border-right: 1px solid #333333;\r\n");
      out.write("  border-bottom: 1px solid #333333;\r\n");
      out.write("  border-left: 1px solid #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete-friend-button {\r\n");
      out.write("  font: bold 21px Arial;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  background-color: red;\r\n");
      out.write("  color: #333333;\r\n");
      out.write("  padding: 2px 6px 2px 6px;\r\n");
      out.write("  border-top: 1px solid #CCCCCC;\r\n");
      out.write("  border-right: 1px solid #333333;\r\n");
      out.write("  border-bottom: 1px solid #333333;\r\n");
      out.write("  border-left: 1px solid #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr.bottspace>td {\r\n");
      out.write("  padding-bottom: 1em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("       \r\n");
      out.write("       <div id=\"friends\" style=\"width: 100%; height: 300px;\">\r\n");
      out.write("       <!-- friends section -->\r\n");
      out.write("       \t\t<div id=\"friends\" style=\"width: 50%; height: 300px; float:left\">\r\n");
      out.write("       \t\t\t<h1 class=\"head1\" style=\"text-align: center;\">My Friends</h1>\r\n");
      out.write("       \t\t\t<table style=\"margin-left: auto; margin-right:auto;  font-size: 21px\" border=\"1\" class=\"tabel1\">\r\n");
      out.write("        \r\n");
      out.write("\t\t            <thead>\r\n");
      out.write("\t\t                <tr>\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    <th>Name</th>\r\n");
      out.write("\t\t                    <th>Phone</th>\r\n");
      out.write("\t\t                    <th>Email</th>\r\n");
      out.write("\t\t                    <th>Gender</th>\r\n");
      out.write("\t\t                    <th>Add Date</th>\r\n");
      out.write("\t\t                </tr>\r\n");
      out.write("\t\t            </thead>\r\n");
      out.write("\t\t            <tbody>\r\n");
      out.write("\t\t                ");

		                String Host = "jdbc:mysql://localhost:3306/online_social_network";
		                Connection conn = null;
		                Statement st = null;
		                ResultSet rs = null;
		                Class.forName("com.mysql.jdbc.Driver");
		                conn = DriverManager.getConnection(Host, "root", "1234");
		                st = conn.createStatement();
		                String Data = "select UN,cn,email,Gen from friends";
		                rs = st.executeQuery(Data);
		                while (rs.next()) {
		                
      out.write("\r\n");
      out.write("\t\t                <tr class=\"bottspace\">\r\n");
      out.write("\t\t                   \r\n");
      out.write("\t\t                    <td>");
      out.print(rs.getString("UN"));
      out.write("</td>\r\n");
      out.write("\t\t                    <td>");
      out.print(rs.getString("cn"));
      out.write("</td>\r\n");
      out.write("\t\t                    <td>");
      out.print(rs.getString("email"));
      out.write("</td>\r\n");
      out.write("\t\t                     <td>");
      out.print(rs.getString("Gen"));
      out.write("</td>\r\n");
      out.write("\t\t                    <td>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("       ");

         Date dNow = new Date( );
         SimpleDateFormat ft = 
         new SimpleDateFormat ("E yyyy.MM.dd  ");
         out.print( "<p align=\"center\">" + ft.format(dNow) + "</h2>");
      
      out.write("\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
      out.write("</td>\r\n");
      out.write("\t\t                     <td>\r\n");
      out.write("\t\t                     <a href='delete.jsp?d=");
      out.print(rs.getString("cn"));
      out.write("' class=\"delete-friend-button\">Delete friend</a></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t                ");

		                }
		                
      out.write("\r\n");
      out.write("\t\t            </tbody>\r\n");
      out.write("\t\t        </table>\r\n");
      out.write("\t\t            \t\t\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t\r\n");
      out.write("       \t\t<div id=\"friends\" style=\"width: 50%; height: 300px; float:left\">\r\n");
      out.write("       \t\t\t<h1 class=\"head1\" style=\"text-align: center;\">Unichat Users</h1>\r\n");
      out.write("       \t\t\t<table style=\"margin-left: auto; margin-right:auto;  font-size: 21px\" border=\"1\" class=\"tabel1\">\r\n");
      out.write("        \r\n");
      out.write("\t\t            <thead>\r\n");
      out.write("\t\t                <tr>\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    <th>Name</th>\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    <th>Gender</th>\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                </tr>\r\n");
      out.write("\t\t            </thead>\r\n");
      out.write("\t\t            <tbody>\r\n");
      out.write("\t\t                ");

		                String host = "jdbc:mysql://localhost:3306/online_social_network";
		                Connection con = null;
		                Statement stat = null;
		                ResultSet res = null;
		                Class.forName("com.mysql.jdbc.Driver");
		                con = DriverManager.getConnection(Host, "root", "1234");
		                stat = conn.createStatement();
		                String Dat = "select UN,cn,email,Gen from users";
		                res = stat.executeQuery(Dat);
		                while (res.next()) {
		                
      out.write("\r\n");
      out.write("\t\t                <tr class=\"bottspace\">\r\n");
      out.write("\t\t                   \r\n");
      out.write("\t\t                    <td>");
      out.print(res.getString("UN"));
      out.write("</td>\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    <td>");
      out.print(res.getString("Gen"));
      out.write("</td>\r\n");
      out.write("\t\t                   \r\n");
      out.write("\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t                ");

		                }
		                
      out.write("\r\n");
      out.write("\t\t            </tbody>\r\n");
      out.write("\t\t        </table>\r\n");
      out.write("\t\t            \t\t\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("       </div>       \r\n");
      out.write("</html>");
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
