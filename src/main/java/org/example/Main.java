package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Hibernate Configuration & SessionFactory
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();

        // Opening session
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        // Fetching existing student (ID = 11)
        Student s1 = session.get(Student.class, 11);

        if (s1 != null) {
            // Updating fields
            s1.setsName("Updated Harsh");
            s1.setAge(25);

            session.update(s1);  // Properly update instead of remove + save
            System.out.println("Student updated: " + s1);
        } else {
            System.out.println("Student with ID 11 not found.");
        }

        // Committing the transaction
        t.commit();

        // Closing resources
        session.close();
        sf.close();
    }
}
