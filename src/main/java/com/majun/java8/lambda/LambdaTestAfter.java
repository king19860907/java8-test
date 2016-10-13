package com.majun.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by majun on 10/13/16.
 */
public class LambdaTestAfter extends Base {

    public static void main(String[] args) {
        LambdaTestAfter obj = new LambdaTestAfter();
        obj.test();
    }

    public void test(){
        List<Task> tasks = getTasks();
        List<String> taskTitles = taskTitles(tasks,task->task.getType()==TaskType.READING,task->task.getTitle());

        taskTitles.forEach(title-> System.out.println(title));
        taskTitles.forEach(System.out::println);
    }


    public <Result>List<Result> taskTitles(List<Task> tasks, Predicate<Task> filterTasks, Function<Task,Result> extractor){
        List<Result> readingTitles = new ArrayList<>();
        for(Task task : tasks){
            if(filterTasks.test(task)){
                readingTitles.add(extractor.apply(task));
            }
        }
        return readingTitles;
    }

}
