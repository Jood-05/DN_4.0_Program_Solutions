package com.hibernate.main;


import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;
import org.hibernate.*;

public class MainHibernate {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee emp = new Employee(102, "Alice", "HR");
            session.save(emp);
            tx.commit();
            System.out.println("Employee added: " + emp);
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
