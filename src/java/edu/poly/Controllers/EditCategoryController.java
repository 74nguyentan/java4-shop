/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import edu.poly.Dao.CategoryDao;
import edu.poly.entities.Category;
import java.io.IOException;
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
@WebServlet(name = "EditCategoryController", urlPatterns = {"/EditCategoryController"})
public class EditCategoryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setAttribute("mode", "insert");

            String id = request.getParameter("id");
            CategoryDao dao = new CategoryDao();
            Category entity = dao.findCategoryById(Integer.parseInt(id));
            request.setAttribute("category", entity);

            RequestDispatcher rd = request.getRequestDispatcher("backend/categories/addOrEdit.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InsertCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String id = request.getParameter("categoryId");
        String name = request.getParameter("name");
        try {
            CategoryDao dao = new CategoryDao();
            Category entity = new Category();
            entity.setCategoryId(Integer.parseInt(id));
            entity.setName(name);
            dao.updateCategory(entity);
            RequestDispatcher rd = request.getRequestDispatcher("ListCategoriesController");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
