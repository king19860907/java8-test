package com.majun.java8.steam;

import com.majun.java8.lambda.Base;
import com.majun.java8.lambda.Task;
import com.majun.java8.lambda.TaskType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by majun on 10/14/16.
 */
public class Steam1Test extends Base {

    public static void main(String[] args) {
        Steam1Test test = new Steam1Test();
        test.test();
    }


    public void test(){

        List<Task> tasks = getTasks();

        /**
         * 1.创建流管道
         * 2.过滤
         * 3.排序
         * 4.提取title
         * 5.转换成list
         */
        List<String> readingTasks=tasks.stream().filter(task -> task.getType()== TaskType.READING)
                .sorted((task1,task2)->task2.getTitle().length()-task1.getTitle().length())
                .map(task -> task.getTitle())
                //.map(Task::getTitle) 两种写法都可以
                .collect(Collectors.toList());

        readingTasks.forEach(System.out::println);


    }

}
