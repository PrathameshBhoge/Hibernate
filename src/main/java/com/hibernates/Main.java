package com.hibernates;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        // Get the SessionFactory and print it
        SessionFactory sessionFactory = DBconn.getSessionFactory();
        System.out.println("SessionFactory created: " + sessionFactory);
    }
}
