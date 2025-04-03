package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student();
        s1.setsName("Naveen");
        s1.setAge(22);
        s1.setRollNo(39);
        // Ensure rollNo is manually set only if it's NOT auto-generated
        Student s2 = null;

        // Hibernate Configuration & SessionFactory
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();

        // Opening session
        Session session = sf.openSession();
      s2=  session.get(Student.class,36);

        // Starting transaction
        Transaction t = session.beginTransaction();

        // Saving the student object
        session.save(s1);  // Use save() instead of persist() if you need the generated ID immediately

        // Committing the transaction
        t.commit();

        // Printing the saved object
//        System.out.println("Student saved: " + s1);
        System.out.println(s2);

        // Closing resources
        session.close();
        sf.close();
    }
}
