package com.hibernates.mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Mapping_demo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setEmpId(900);
        e1.setEmpName("Radha");

        e2.setEmpId(300);
        e2.setEmpName("Rani");


        Project p1 = new Project();
        Project p2 = new Project();

        p1.setProjectId(1212);
        p1.setProjectName("Cyberchat");

        p2.setProjectId(2323);
        p1.setProjectName("Cloud Security");

        List<Employee> employees = new ArrayList<>();
        List<Project> projects = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);

        projects.add(p1);
        projects.add(p2);

        e1.setProjects(projects);
        p1.setEmployee(employees);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        tx.commit();
        session.close();
    }
}
