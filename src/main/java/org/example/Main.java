package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1=new Alien();
        a1.setAid(101);
        a1.setaName("Soham");
        a1.setTech("java");
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();
    }
}
