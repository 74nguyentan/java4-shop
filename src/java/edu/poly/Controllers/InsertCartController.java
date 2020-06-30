/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import edu.poly.Dao.CartDao;
import edu.poly.Dao.CustomerDao;
import edu.poly.entities.Cart;
import edu.poly.entities.Customer;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "InsertCartController", urlPatterns = {"/InsertCartController"})
public class InsertCartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            CustomerDao dao = new CustomerDao();
            List<Customer> list = dao.findAllCustomer(); // tim kiếm các category truyền vào list
            request.setAttribute("customers", list); // truyền list vào thư mục categories nơi có addOrEdit 

            RequestDispatcher rd = request.getRequestDispatcher("backend/carts/addOrEdit.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InsertCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            CartDao daoo = new CartDao();
            Cart car = new Cart();
            
            car.setCartId(Integer.parseInt(request.getParameter("cartId")));
            car.setCreatedDate(new Date());
            car.setStatus(request.getParameter("status"));
            
            Customer cus = new Customer();
            cus.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
            car.setCustomers(cus);
            
            daoo.insertCart(car);
            RequestDispatcher rd = request.getRequestDispatcher("ListCartController");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
