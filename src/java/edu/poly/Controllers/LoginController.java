/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;


import edu.poly.Dao.CustomerDao;
import edu.poly.entities.Customer;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       RequestDispatcher rd = request.getRequestDispatcher("backend/login/login.jsp");
       rd.forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        
        if(username !=null && password !=null && !username.equals("") &&!password.equals("")){
            try {
                CustomerDao dao =new CustomerDao();
                Customer user = dao.checkLogin(Integer.parseInt(username), password);
                if(user !=null){
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    
                RequestDispatcher rd = request.getRequestDispatcher("ListUserControll");
                rd.forward(request, response);
                }else{
                     request.setAttribute("message", "invalid username or password");
             RequestDispatcher rd = request.getRequestDispatcher("backend/login/login.jsp");
             rd.forward(request, response);
                }
            } catch (Exception e) {
            }
        }else{
            request.setAttribute("messege", "invalid username or password");
             RequestDispatcher rd = request.getRequestDispatcher("backend/login/login.jsp");
             rd.forward(request, response);
        }
    }

}
