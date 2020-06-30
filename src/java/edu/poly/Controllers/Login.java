/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author exfic
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (user.equals("tony") && pass.equals("123")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", user);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("message", "Acount is invalid!");
            request.getRequestDispatcher("backend/login/login.jsp").forward(request, response);
        }
    }
    //Xoa session khi logout
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { //To change body of generated methods, choose Tools | Templates.
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        response.sendRedirect("backend/login/login.jsp");
    }
    //Xoa session cach 2
    //@Override
    //protected void doGet(HttpServletRequest request, HttpServletResponse response)
    //        throws ServletException, IOException {
    //    request.getSession().invalidate();
    //    response.sendRedirect(request.getContextPath() + "/admin/login.jsp");
    //}

}
