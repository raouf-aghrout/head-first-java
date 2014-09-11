package com.headfirstjava.chapterfourteen.quizcard;

import java.io.Serializable;

public class QuizCard implements Serializable {

    private String uniqueID;
    private String category;
    private String question;
    private String answer;
    private String hint;

    public QuizCard(String q, String a) {
        question = q;
        answer = a;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String id) {
        uniqueID = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String c) {
        category = c;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String q) {
        question = q;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String a) {
        answer = a;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String h) {
        hint = h;
    }
}
