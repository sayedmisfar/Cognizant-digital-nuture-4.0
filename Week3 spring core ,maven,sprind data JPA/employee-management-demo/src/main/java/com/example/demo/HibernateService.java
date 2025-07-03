package com.example.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateService {
    public Integer addEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer id = null;

        try {
            tx = session.beginTransaction();
            id = (Integer) session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return id;
    }
}