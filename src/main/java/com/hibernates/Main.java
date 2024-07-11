package com.hibernates;

import com.hibernates.student.Address;
import com.hibernates.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        SessionFactory sessionFactory = DBconn.getSessionFactory();

        //Creating object of student class
        Student student = new Student();
        student.setId(101);
        student.setName("jannat");
        student.setCity("Nagpur");
        System.out.println(student);

        //Creating object of Adress class
        Address address = new Address();
        address.setStreet("Near vithall mandir");
        address.setCity("Ramtek");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1234.5678);
        System.out.println(address);

        //Reading Image(How to save image in database.)
        FileInputStream fi = new FileInputStream("src/main/java/com/hibernates/Passport_Photo.jpeg");
        byte [] data = new byte[fi.available()];
        fi.read(data);
        address.setImage(data);

        try {
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(student);
            session.save(address);
            tx.commit();
            session.close();
            System.out.println("Done");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
