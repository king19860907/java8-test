package com.majun.java8.lambda;

import java.util.ArrayList;
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

}
