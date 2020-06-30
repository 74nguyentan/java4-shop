/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import edu.poly.Dao.CustomerDao;
import edu.poly.entities.Customer;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author exfic
 */
@WebServlet(name = "InsertCustomersController", urlPatterns = {"/InsertCustomersController"})
public class InsertCustomersController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("mode", "insert");
        RequestDispatcher rd = request.getRequestDispatcher("backend/customers/addOrEdit.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            CustomerDao dao = new CustomerDao();
            Customer entity = new Customer();
            entity.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
            entity.setName(request.getParameter("name"));
            entity.setPassword(request.getParameter("password"));
            //entity.setGender(Boolean.parseBoolean(request.getParameter("gender")));
         
            if(request.getParameter("gender").equals("Nam"))
            {entity.setGender(true);
            }
            else{entity.setGender(false);}
            
            entity.setDob(new Date());  
            entity.setEmail(request.getParameter("email"));
            entity.setPhone(request.getParameter("phone"));
            entity.setSatatus(request.getParameter("satatus"));
            entity.setRegisteredDate(new Date());
            
            dao.insertCustomer(entity);
            RequestDispatcher rd = request.getRequestDispatcher("ListCustomersController");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
