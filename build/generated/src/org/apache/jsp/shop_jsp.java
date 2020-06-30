package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import classes.Item;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        ");

            String user = (String) session.getAttribute("user");
            if (user == null) {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("        <title>Shopping Cart - Shop</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            .container {\n");
      out.write("                height: 850px;\n");
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
      out.write("            .container .headbanner h1 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                color: #CC3300;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mycontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 650px;\n");
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
      out.write("            .container .myfooter h3 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-size: 12px;\n");
      out.write("                color:#CC3300;\n");
      out.write("            }\n");
      out.write("            .cartof {\n");
      out.write("                float: left;\n");
      out.write("                height: 25px;\n");
      out.write("                width: 900px;\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding-top:5px;\n");
      out.write("            }\n");
      out.write("            .cartcontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 900px;\n");
      out.write("                background-color:#FFFFC2;\n");
      out.write("                border-width:1px;\n");
      out.write("                border-style:solid;\n");
      out.write("                border-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("            .prod1 {\n");
      out.write("                float: left;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 900px;\n");
      out.write("                border-bottom-width:1px;\n");
      out.write("                border-bottom-style:solid;\n");
      out.write("                border-bottom-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding-left:5px;\n");
      out.write("                color:#900;\n");
      out.write("                font-family:Verdana, Geneva, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .items {\n");
      out.write("                float: left;\n");
      out.write("                height: auto;\n");
      out.write("                width: 900px;\n");
      out.write("            }\n");
      out.write("            tr.border_bottom td {\n");
      out.write("                border-bottom-width:1px;\n");
      out.write("                border-bottom-style:solid;\n");
      out.write("                border-bottom-color:#FFCC00;\n");
      out.write("                height:100px;\n");
      out.write("            }\n");
      out.write("            .myitems {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 600px;\n");
      out.write("                border-right-width:1px;\n");
      out.write("                border-right-style:solid;\n");
      out.write("                border-right-color:#FFCC00;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                color:#FFF;\n");
      out.write("                font-family:Verdana, Geneva, sans-serif;\n");
      out.write("                font-weight:normal;\n");
      out.write("                background-color:#900;\n");
      out.write("            }\n");
      out.write("            .total {\n");
      out.write("                float: left;\n");
      out.write("                height: 180px;\n");
      out.write("                width: 285px;\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding-top:20px;\n");
      out.write("                padding-left:10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            -->\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0; padding:0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"requesthandle\" method=\"post\"> \n");
      out.write("                <div class=\"headbanner\">\n");
      out.write("                    <h1 style=\"display:inline\">\n");
      out.write("                        <center>\n");
      out.write("                            <img src=\"img/shopping.png\" />[My Shopping Cart]\n");
      out.write("                        </center>\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mycontent\">\n");
      out.write("                    <div class=\"cartof\">\n");
      out.write("                        <center><a style=\"color: #CC3300;\">Cart Of [");
 out.print(session.getAttribute("user"));
      out.write("]<input name=\"logout\" type=\"submit\" value=\"Logout\"></input></a></center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cartcontent\">\n");
      out.write("                        <div class=\"myitems\">\n");
      out.write("                            <table width=\"600px\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>#id</th> \n");
      out.write("                                    <th>Item</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Action</th>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
if (session.getAttribute("itemlist") != null) {
                                        ArrayList mycart = (ArrayList) session.getAttribute("itemlist");
                                        for (int i = 0; i < mycart.size(); i++) {
                                            Item it = (Item) mycart.get(i);
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td align=\"center\">");
out.print(i);
      out.write("</td>\n");
      out.write("                                    <td align=\"center\">");
 out.print(it.name);
      out.write("</td> \n");
      out.write("                                    <td align=\"center\">");
 out.print(it.price);
      out.write("</td>\n");
      out.write("                                    <td align=\"center\"><input name=\"del\" type=\"submit\" value=\"Delete\" onclick=\"this.value=");
out.print(i);
      out.write("\"></input></td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
                                    }
                                
      out.write("    \n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"total\">\n");
      out.write("                            <a>My Total : $[");
 out.print(session.getAttribute("total"));
      out.write("]</a><br />\n");
      out.write("                            <a style=\"font-size:14px\">Total Qty: [");
 ArrayList il = (ArrayList) session.getAttribute("itemlist");
                       out.print(il.size());
      out.write("]</a><br />\n");
      out.write("                            <input name=\"chkout\" type=\"submit\" value=\"Checkout\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"items\">\n");
      out.write("                        <table width=\"900px\">\n");
      out.write("                            <tr class=\"border_bottom\">\n");
      out.write("                                <td>#1</td>\n");
      out.write("                                <td>Sunglass</td>\n");
      out.write("                                <td>Ray-Ban, Dark Purple Sunglass with the Casing</td>\n");
      out.write("                                <td>$34</td>\n");
      out.write("                                <td><img src=\"img/sunglass.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                <td><input name=\"addtocart1\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"border_bottom\">\n");
      out.write("                                <td>#2</td>\n");
      out.write("                                <td>Wrist Watch</td>\n");
      out.write("                                <td>Quartz, Men's wrist watch, Black</td>\n");
      out.write("                                <td>$66</td>\n");
      out.write("                                <td><img src=\"img/watch.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                <td><input name=\"addtocart2\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"border_bottom\">\n");
      out.write("                                <td>#3</td>\n");
      out.write("                                <td>Camera</td>\n");
      out.write("                                <td>Lumix, 16x Digital Camera</td>\n");
      out.write("                                <td>$167</td>\n");
      out.write("                                <td><img src=\"img/camera.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                <td><input name=\"addtocart3\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"border_bottom\">\n");
      out.write("                                <td>#4</td>\n");
      out.write("                                <td>Shoes</td>\n");
      out.write("                                <td>Bettans, 60 Leather Shoes, Brown</td>\n");
      out.write("                                <td>$23</td>\n");
      out.write("                                <td><img src=\"img/shoes.jpg\" width=\"90\" height=\"90\" /></td>\n");
      out.write("                                <td><input name=\"addtocart4\" type=\"submit\" value=\"Add to Cart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"myfooter\">\n");
      out.write("                    <h3 style=\"font-weight:normal; padding-left:10px\">&copy;This Sample Project is Designed and Developed by Dilukshan Mahendra</h3>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
