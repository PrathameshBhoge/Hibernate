package com.hibernates.mapping.onetomany_Manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Questions question = new Questions();
        question.setQuestionId(130);
        question.setQuestion("What is your name ?");

        Answers a1 = new Answers();
        a1.setAnswerId(101);
        a1.setAnswer("My name is Lakhan");
        a1.setQuestion(question);

        Answers a2 = new Answers();
        a2.setAnswerId(102);
        a2.setAnswer("Sajno ka sajan");
        a2.setQuestion(question);

        Answers a3 = new Answers();
        a3.setAnswerId(103);
        a3.setAnswer("My name is Prathamesh");
        a3.setQuestion(question);


        List<Answers> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        question.setAnswers(list);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(question);
        session.save(a1);
        session.save(a2);
        session.save(a3);
        tx.commit();
        session.close();
    }
}
