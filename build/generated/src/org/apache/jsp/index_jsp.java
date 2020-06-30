package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("         <link rel=\"stylesheet\" href=\"../fontawesome-free-5.11.2-web/css/all.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("        <title>Shopping Cart - Login</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            .containerr {\n");
      out.write("                height: 700px;\n");
      out.write("                width: 900px;\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            .headbanner {\n");
      out.write("                float: left;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 900px;\n");
      out.write("                vertical-align:middle;\n");
      out.write("                background-color:#FFCC00;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .containerr .headbanner h1 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                color: #CC3300;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mycontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 900px;\n");
      out.write("            }\n");
      out.write("            .myfooter {\n");
      out.write("                float: left;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 900px;\n");
      out.write("                border-top-width:3px;\n");
      out.write("                border-top-style:solid;\n");
      out.write("                border-top-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("            .containerr .myfooter h3 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-size: 12px;\n");
      out.write("                color:#CC3300;\n");
      out.write("            }\n");
      out.write("            .space {\n");
      out.write("                float: left;\n");
      out.write("                height: 35px;\n");
      out.write("                width: 900px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                padding-top:15px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .formcontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 900px;\n");
      out.write("            }\n");
      out.write("            .formtext {\n");
      out.write("                color:#CC3300;\n");
      out.write("                font-family:Verdana, Geneva, sans-serif;\n");
      out.write("            }\n");
      out.write("            -->\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <main class=\"container\">\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Shop_NVT</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"><i class=\"fas fa-home\"></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("</li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"> Categories</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"> Products</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"> Carts</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"> Carts detail</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\"> Customers</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    Contact\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Phone</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Email</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Facebook</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("    <body style=\"margin:0; padding:0\">\n");
      out.write("        <div class=\"containerr\">\n");
      out.write("            <div class=\"headbanner\">\n");
      out.write("                <h1 style=\"display:inline\">\n");
      out.write("                    <center>\n");
      out.write("                        <img src=\"img/shopping.png\" />[My Shopping Cart]\n");
      out.write("                    </center>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mycontent\">\n");
      out.write("                <div class=\"space\"><span><a class=\"formtext\">Login</a></span></div>\n");
      out.write("                <div class=\"formcontent\">\n");
      out.write("                    <form action=\"loginval\" method=\"post\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"formtext\">Username :</td>\n");
      out.write("                                <td><input id=\"name\" name=\"uname\" type=\"text\" size=\"30\" /></td><td><a style=\"font-size: 10px; font-family:lucida sans; color: darkgray\">[Any name]</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"formtext\">Password :</td>\n");
      out.write("                                <td><input id=\"pas\" name=\"pass\" type=\"password\" size=\"30\" /></td><td><a style=\"font-size: 10px; font-family:lucida sans; color: darkgray\">[Pass = 1234]</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"submit\" value=\"Submit\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <footer class=\"row\">\n");
      out.write("                <section class=\"col\">\n");
      out.write("                    <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                        Copyright by &copy: Nguyen Van Tan\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </footer>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
