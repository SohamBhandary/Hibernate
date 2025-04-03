package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student();
        s1.setsName("soham");
        s1.setAge(21);
        s1.setRollNo(36);  // Ensure rollNo is manually set only if it's NOT auto-generated

        // Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // Explicitly load hibernate.cfg.xml
        cfg.addAnnotatedClass(Student.class);

        // Building SessionFactory
        SessionFactory sf = cfg.buildSessionFactory();

        // Opening session
        Session session = sf.openSession();

        // Starting transaction
        Transaction t = session.beginTransaction();

        // Saving the student object
        session.save(s1);

        // Committing the transaction
        t.commit();

        // Printing the saved object
        System.out.println("Student saved: " + s1);

        // Closing resources
        session.close();
        sf.close();
    }
}
