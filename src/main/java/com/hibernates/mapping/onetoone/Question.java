package com.hibernates.mapping.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "question_id")
    private int questionid;


    private String question;

    @OneToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;


    public Question() {
        super();
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
