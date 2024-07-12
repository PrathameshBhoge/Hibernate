package com.hibernates.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Get()  load()
public class Fetch_data {
    public static void main(String[] args) {
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cf.buildSessionFactory();
        Session session= sessionFactory.openSession();

        //Get()- student id 101
        Student student=session.get(Student.class,101);
        System.out.println(student);

        //load()
        Address ad = session.load(Address.class,1);
        System.out.println(ad.getStreet());
        session.close();
        sessionFactory.close();
    }
}
