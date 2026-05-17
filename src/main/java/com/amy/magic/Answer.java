package com.amy.magic;

public class Answer {

    private String answer;
    private int id;
    private int categoryId;

    public Answer() {

    }

    public Answer(int id, String answer, int categoryId) {
        this.id = id;
        this.answer = answer;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
