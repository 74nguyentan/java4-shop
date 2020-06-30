/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Dao;

import edu.poly.Helpers.HibernateUtil;
import edu.poly.entities.Cart;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CartDao {

    public Cart insertCart(Cart entity) throws Exception {
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

    public Cart updateCart(Cart entity) throws Exception {
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

    public void deleteCart(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();

        try {
            Cart entity = (Cart) sess.load(Cart.class, id);

            sess.delete(entity); // nếu id tồn tại thì update, còn k thì save
            trans.commit();

        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public Cart findCartById(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            Cart entity = (Cart) sess.load(Cart.class, id);

            return entity;

        } catch (Exception e) {

            throw e;
        }
    }

    public List<Cart> findAllCarts() throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from Cart";
            Query query =  sess.createQuery(hql); ////
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }

//    public List<Cart> findCartByName(String name) throws Exception {
//        Session sess = HibernateUtil.getSessionFactory().openSession();
//
//        try {
//            String hql = "from Cart where name like :name";
//            Query query =  sess.createQuery(hql); ////
//            query.setParameter("name", name);
//            return query.list();
//
//        } catch (Exception e) {
//
//            throw e;
//        }
//    }
}
