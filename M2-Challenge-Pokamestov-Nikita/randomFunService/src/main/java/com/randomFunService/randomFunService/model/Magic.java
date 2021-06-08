package com.randomFunService.randomFunService.model;

import java.util.Objects;

public class Magic {

    protected int id;
    protected String question;
    protected String answer;

    public Magic() {
    }

    public Magic(String answer) {
        this.answer = answer;
    }

//    public Magic(int id, String answer) {
//        this.id = id;
//        this.answer = answer;
//    }

//    public Magic(int id, String question, String answer) {
//        this.id = id;
//        this.question = question;
//        this.answer = answer;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magic magic = (Magic) o;
        return getId() == magic.getId() && Objects.equals(getQuestion(), magic.getQuestion()) && Objects.equals(getAnswer(), magic.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestion(), getAnswer());
    }

    @Override
    public String toString() {
        return "Magic{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
