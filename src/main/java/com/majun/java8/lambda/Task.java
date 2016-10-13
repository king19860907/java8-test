package com.majun.java8.lambda;

/**
 * Created by majun on 10/13/16.
 */
public class Task {

    private String title;

    private TaskType type;

    public Task(String title, TaskType type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }
}
