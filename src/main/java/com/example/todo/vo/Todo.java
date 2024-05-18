package com.example.todo.vo;


public class Todo {
    private String content;
    private String isCompleted;

    public Todo() {
    }

    public Todo(String content, String isCompleted) {
        this.content = content;
        this.isCompleted = isCompleted;
    }

    public Todo(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }
}
