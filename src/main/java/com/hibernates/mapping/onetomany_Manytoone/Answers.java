package com.hibernates.mapping.onetomany_Manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answers;

    @ManyToOne
    private Questions questions;

    public Answers(){
        super();
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answers;
    }

    public void setAnswer(String answer) {
        this.answers = answer;
    }

    public Questions getQuestion() {
        return questions;
    }

    public void setQuestion(Questions question) {
        this.questions = question;
    }
}
