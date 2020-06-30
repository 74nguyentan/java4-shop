/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import edu.poly.Dao.CartDao;
import edu.poly.Dao.CartDetailDao;
import edu.poly.Dao.ProductDao;
import edu.poly.entities.Cart;
import edu.poly.entities.CartDetail;
import edu.poly.entities.Product;
import java.io.IOException;
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
@WebServlet(name = "InsertCartDetailController", urlPatterns = {"/InsertCartDetailController"})
public class InsertCartDetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            CartDao dao = new CartDao();
            List<Cart> list = dao.findAllCarts(); // tim kiếm các category truyền vào list
            request.setAttribute("carts", list); // truyền list vào thư mục carts nơi có addOrEdit 

            ProductDao daoo = new ProductDao();
            List<Product> listt = daoo.findAllProducts(); // tim kiếm các category truyền vào list
            request.setAttribute("products", listt); // truyền list vào thư mục categories nơi có addOrEdit 

            RequestDispatcher rd = request.getRequestDispatcher("backend/CartDetails/addOrEdit.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InsertCartDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            CartDetailDao cadao = new CartDetailDao();
            CartDetail cartt = new CartDetail();

            cartt.setCartDetailId(Integer.parseInt(request.getParameter("cartDetailId")));
            cartt.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            cartt.setPrice(Double.parseDouble(request.getParameter("price")));

            Cart car = new Cart();
            car.setCartId(Integer.parseInt(request.getParameter("cartId")));
            cartt.setCarts(car);

            Product pro = new Product();
            pro.setProductId(Integer.parseInt(request.getParameter("productId")));
            cartt.setProducts(pro);

            cadao.insertCartDetail(cartt);
            RequestDispatcher rd = request.getRequestDispatcher("ListCartDetailsController");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
