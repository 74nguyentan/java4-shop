/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Dao;

import edu.poly.Helpers.HibernateUtil;
import edu.poly.entities.CartDetail;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CartDetailDao {

    public CartDetail insertCartDetail(CartDetail entity) throws Exception {
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

    public CartDetail updateCartDetail(CartDetail entity) throws Exception {
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

    public void deleteCartDetail(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();

        try {
            CartDetail entity = (CartDetail) sess.load(CartDetail.class, id);

            sess.delete(entity); // nếu id tồn tại thì update, còn k thì save
            trans.commit();

        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public CartDetail findCartDetailById(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            CartDetail entity = (CartDetail) sess.load(CartDetail.class, id);

            return entity;

        } catch (Exception e) {

            throw e;
        }
    }

    public List<CartDetail> findAllCartDetails() throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from CartDetail";
            Query query =  sess.createQuery(hql); ////
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }

    public List<CartDetail> findCartDetailByName(String name) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from CartDetail where name like :name";
            Query query =  sess.createQuery(hql); ////
            query.setParameter("name", name);
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }
}
