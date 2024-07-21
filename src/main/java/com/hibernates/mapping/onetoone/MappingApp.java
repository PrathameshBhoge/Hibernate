package com.hibernates.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //Set a Question
        Question question1 = new Question();
        question1.setQuestionid(110);
        question1.setQuestion("What is Java");

        //Set a Answer
        Answer answer1 = new Answer();
        answer1.setAnswerId(330);
        answer1.setAnswer("Java is a programming language");
        question1.setAnswer(answer1);


        Question question2 = new Question();
        question2.setQuestionid(120);
        question2.setQuestion("What is an API");

        Answer answer2 = new Answer();
        answer2.setAnswerId(340);
        answer2.setAnswer("Api is a way to communicate with DB");
        question2.setAnswer(answer2);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(question1);
        session.save(question2);
        session.save(answer1);
        session.save(answer2);

        tx.commit();
        session.close();


    }

}
