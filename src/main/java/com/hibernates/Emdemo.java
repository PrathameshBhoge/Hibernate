package com.hibernates;

import com.hibernates.student.Certificate;
import com.hibernates.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emdemo {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        Student student1= new Student();
        student1.setId(102);
        student1.setName("Anshu");
        student1.setCity("Ramtek");

        Certificate certificate1 = new Certificate();
        certificate1.setCertificate_name("PD-1");
        certificate1.setDuration("4 Month");
        student1.setCertificate(certificate1);

        Student student2= new Student();
        student2.setId(103);
        student2.setName("Anshika");
        student2.setCity("Nagpur");

        Certificate certificate2 = new Certificate();
        certificate2.setCertificate_name("PD-2");
        certificate2.setDuration("6 Months");
        student2.setCertificate(certificate2);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student1);
        session.save(student2);

        tx.commit();
        session.close();
        sessionFactory.close();


    }
}
