package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("soham");
        s1.setAge(21);
        s1.setRollNo(36);
        Configuration cfg = new Configuration();

        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        s.save(s1);
        System.out.println(s1);
        }
    }
