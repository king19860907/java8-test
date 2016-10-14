package com.majun.java8.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majun on 10/13/16.
 */
public class Base {

    public List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("title1",TaskType.READING));
        tasks.add(new Task("title2",TaskType.WRITING));
        tasks.add(new Task("title3",TaskType.READING));
        return tasks;
    }

    public List<Task> getTasks2(){
        Task task1 = new Task("Read Version Control with Git book", TaskType.READING, LocalDate.of(2015, Month.JULY, 1)).addTag("git").addTag("reading");

        Task task2 = new Task("Read Java 8 Lambdas book", TaskType.READING, LocalDate.of(2015, Month.JULY, 2)).addTag("java8").addTag("reading").addTag("books");

        Task task3 = new Task("Write a mobile application to store my tasks", TaskType.CODING, LocalDate.of(2015, Month.JULY, 3)).addTag("coding").addTag("mobile");

        Task task4 = new Task("Write a blog on Java 8 Streams", TaskType.WRITING, LocalDate.of(2015, Month.JULY, 4)).addTag("blogging").addTag("writing").addTag("streams");

        Task task5 = new Task("Read Domain Driven Design book", TaskType.READING, LocalDate.of(2015, Month.JULY, 5)).addTag("ddd").addTag("books").addTag("reading");

        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5,task5);

        return tasks;
    }

}
