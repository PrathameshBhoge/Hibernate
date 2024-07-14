package com.hibernates.mapping.onetomany_Manytoone;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Question_stake")
public class Questions {
    @Id
    @Column(name = "question_id")
    private int questionId;
    private String questions;

    @OneToMany (mappedBy = "questions")
    private List<Answers> answers;

    public Questions() {
        super();
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return questions;
    }

    public void setQuestion(String question) {
        this.questions = question;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}
