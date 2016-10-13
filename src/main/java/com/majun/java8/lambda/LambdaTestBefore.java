package com.majun.java8.lambda;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 10/13/16.
 */
public class LambdaTestBefore extends Base {

    public static void main(String[] args) {
        LambdaTestBefore obj = new LambdaTestBefore();
        obj.test();
    }

    public void test(){
        List<Task> tasks = getTasks();
        List<String> taskTitles = taskTitles(tasks);
        for(String title : taskTitles){
            System.out.println(title);
        }
    }


    public List<String> taskTitles(List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for(Task task : tasks){
            if(task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }

}
