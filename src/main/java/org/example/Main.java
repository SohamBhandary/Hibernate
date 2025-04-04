package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);
        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("Xps");
        l2.setRam(32);
        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Aplle");
        l3.setModel("MAcbook");
        l3.setRam(32);

        Alien a1=new Alien();
        a1.setAid(101);
        a1.setaName("Soham");
        a1.setTech("java");
        Alien a2=new Alien();
        a2.setAid(101);
        a2.setaName("Harsh");
        a2.setTech("python");
        Alien a3=new Alien();
        a3.setAid(101);
        a3.setaName("Susil");
        a3.setTech("C");
        a3.setLaptops(Arrays.asList(l1,l2));
        l1.setAlien(a1);
        l2.setAlien(a1);
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

        transaction.commit();
        Alien a2 = session.get(Alien.class,101);
        System.out.println(a2);
    }
}
