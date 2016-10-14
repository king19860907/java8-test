package com.majun.java8.lambda;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by majun on 10/13/16.
 */
public class Task {

    private String id;

    private String title;

    private TaskType type;

    private LocalDate createdOn;

    private Set<String> tags = new HashSet<>();

    private LocalDate dueOn;

    public Task(String title, TaskType type) {
        this.title = title;
        this.type = type;
    }

    public Task(String title, TaskType type,LocalDate createdOn) {
        this.createdOn = createdOn;
        this.tags = tags;
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

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getDueOn() {
        return dueOn;
    }

    public void setDueOn(LocalDate dueOn) {
        this.dueOn = dueOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Task addTag(String tag){
        this.tags.add(tag);
        return this;
    }

}
