package com.sample;

public class Content{
    public String question;
    public String answer;

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Content() {
    }

    public Content(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}