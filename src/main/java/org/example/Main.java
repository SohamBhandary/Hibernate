package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);
        Alien a1=new Alien();
        a1.setAid(101);
        a1.setaName("Soham");
        a1.setTech("java");
        a1.setLaptop(l1);
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();
        Alien a2 = session.get(Alien.class,101);
        System.out.println(a2);
    }
}
