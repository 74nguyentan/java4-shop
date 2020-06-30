/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Dao;

import edu.poly.Helpers.HibernateUtil;
import edu.poly.entities.Category;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CategoryDao {

    public Category insertCategory(Category entity) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();
        try {
            sess.persist(entity);
            trans.commit();
            return entity;
        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public Category updateCategory(Category entity) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();
        try {
            sess.saveOrUpdate(entity); // nếu id tồn tại thì update, còn k thì save
            trans.commit();
            return entity;
        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public void deleteCategory(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();

        try {
            Category entity = (Category) sess.load(Category.class, id);

            sess.delete(entity); // nếu id tồn tại thì update, còn k thì save
            trans.commit();

        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public Category findCategoryById(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            Category entity = (Category) sess.load(Category.class, id);

            return entity;

        } catch (Exception e) {

            throw e;
        }
    }

    public List<Category> findAllCategories() throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from Category";
            Query query =  sess.createQuery(hql); ////
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }

    public List<Category> findCategoriesByName(String name) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from Category where name like :name";
            Query query =  sess.createQuery(hql); ////
            query.setParameter("name", name);
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }
}
