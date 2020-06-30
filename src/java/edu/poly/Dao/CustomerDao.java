/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Dao;

import edu.poly.Helpers.HibernateUtil;
import edu.poly.entities.Customer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDao {

    public Customer insertCustomer(Customer entity) throws Exception {
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

    public Customer updateCustomer(Customer entity) throws Exception {
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

    public void deleteCustomer(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = sess.beginTransaction();

        try {
            Customer entity = (Customer) sess.load(Customer.class, id);

            sess.delete(entity); // nếu id tồn tại thì update, còn k thì save
            trans.commit();

        } catch (Exception e) {
            trans.rollback();
            throw e;
        }
    }

    public Customer findCustomerById(int id) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            Customer entity = (Customer) sess.load(Customer.class, id);

            return entity;

        } catch (Exception e) {

            throw e;
        }
    }

    public List<Customer> findAllCustomer() throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from Customer";
            Query query =  sess.createQuery(hql); ////
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }

    public List<Customer> findCustomerByName(String name) throws Exception {
        Session sess = HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "from Customer where name like :name";
            Query query =  sess.createQuery(hql); ////
            query.setParameter("name", name);
            return query.list();

        } catch (Exception e) {

            throw e;
        }
    }
    
    public Customer checkLogin(int username, String password)
            throws Exception{
        
        Customer user = findCustomerById(username);
        
        if(user!= null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
