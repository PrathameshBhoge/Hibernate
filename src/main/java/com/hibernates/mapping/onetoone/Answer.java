package com.hibernates.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    private int answerId;
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;



    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer() {
        super();
    }
}
