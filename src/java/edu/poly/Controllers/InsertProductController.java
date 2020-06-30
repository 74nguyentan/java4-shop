/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Controllers;

import edu.poly.Dao.CategoryDao;
import edu.poly.Dao.ProductDao;
import edu.poly.entities.Category;
import edu.poly.entities.Product;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author exfic
 */
@WebServlet(name = "InsertProductController", urlPatterns = {"/InsertProductController"})
public class InsertProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            CategoryDao dao = new CategoryDao();
            List<Category> list = dao.findAllCategories(); // tim kiếm các category truyền vào list

            request.setAttribute("categories", list); // truyền list vào thư mục categories nơi có addOrEdit 

            RequestDispatcher rd = request.getRequestDispatcher("backend/products/addOrEdit.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InsertProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //upload ảnh    
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            List<FileItem> items = upload.parseRequest(request);
            // Process the uploaded items
            Iterator<FileItem> iter = items.iterator();
            HashMap<String, String> fiel = new HashMap<>();
            String imageName = null;
            while (iter.hasNext()) {
                FileItem item = iter.next();

                if (item.isFormField()) {
                    fiel.put(item.getFieldName(),item.getString());

                } else {

                    String fileName = item.getName();
                    Path path = Paths.get(fileName);
                    
                    String storedPath = servletContext.getRealPath("/uploads");
                    File upploadFile = new File(storedPath + "/" +path.getFileName());
                    item.write(upploadFile);
                    imageName = path.getFileName().toString();
                    System.out.println(storedPath + "/" +path.getFileName());
                }
            }
            
            Product prod = new Product();
            prod.setProductId(Integer.parseInt(fiel.get("productId")));
            prod.setName(fiel.get("name"));
            prod.setPrice(Double.parseDouble(fiel.get("price")));
            prod.setQuantity(Integer.parseInt(fiel.get("quantity")));
            prod.setStatus(fiel.get("status"));
            prod.setDescription(fiel.get("description"));
            prod.setManufacturedDate(new Date());
            
            Category cate = new Category();
            cate.setCategoryId(Integer.parseInt(fiel.get("categoryId")));
            prod.setCategories(cate);
            
            prod.setImage(imageName);
            
            ProductDao dao = new ProductDao();
            dao.insertProduct(prod);
            
            RequestDispatcher rd = request.getRequestDispatcher("ListProductsController");
            rd.forward(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
