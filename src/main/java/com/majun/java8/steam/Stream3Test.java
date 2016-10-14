package com.majun.java8.steam;

import com.majun.java8.lambda.Base;
import com.majun.java8.lambda.Task;
import com.majun.java8.lambda.TaskType;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by majun on 10/14/16.
 */
public class Stream3Test extends Base {

    public static void main(String[] args) {

        Stream3Test test = new Stream3Test();
        test.test8();

    }


    /**
     * 找到所有的阅读任务并按照它们的创建日期排序
     */
    public void test1(){
        List<Task> tasks = getTasks2();

        List<String> results = tasks.stream().filter(task -> task.getType()== TaskType.READING)
                .sorted((task2,task1)->task2.getCreatedOn().compareTo(task1.getCreatedOn()))
                .map(Task::getTitle)
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }

    /**
     * 使用Comparator对排序进行反转
     */
    public void test2(){
        List<Task> tasks = getTasks2();

        List<String> results = tasks.stream().filter(task -> task.getType()== TaskType.READING)
                //排序反转
                .sorted(Comparator.comparing(Task::getCreatedOn).reversed())
                .map(Task::getTitle)
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }

    /**
     * 找到唯一的任务
     */
    public void test3(){
        List<Task> tasks = getTasks2();

        List<String> results= tasks.stream().distinct()
                .map(Task::getTitle)
                .collect(Collectors.toList());

        results.forEach(System.out::println);

    }

    /**
     * 找到根据创建日期排序的前5名的阅读任务
     */
    public void test4(){
        List<Task> tasks = getTasks2();

        List<String> results = tasks.stream()
                .filter(task -> task.getType()==TaskType.READING)
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .limit(5)
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }

    /**
     * 计算所有阅读任务的数量
     */
    public void test5(){
        List<Task> tasks = getTasks2();

        long count = tasks.stream().filter(task -> task.getType()==TaskType.READING).count();

        System.out.println(count);
    }

    /**
     * 从所有的任务中找出所有不同的标签
     * flatMap操作将每次调用tasks.getTags().stream()产生的数据流合并到一个中
     */
    public void test6(){
        List<Task> tasks = getTasks2();

        List<String> results = tasks.stream().flatMap(task -> task.getTags().stream()).distinct()
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }

    /**
     * 检查是否所有的阅读任务都有books标签
     * Stream API提供了方法让用户来检查数据集中元素的某一属性是否符合要求。这些方法是allMatch、anyMatch、findFirst和findAny。
     *
     */
    public void test7(){
        List<Task> tasks = getTasks2();

        boolean result = tasks.stream().filter(task -> task.getType()==TaskType.READING)
                .anyMatch(task -> task.getTags().contains("books"));

        System.out.println(result);
    }

    /**
     * 创建一个所有标题的总结
     * 使用reduce操作，它将数据流缩减为一个值。reduce方法以将数据流中元素进行连接的lambda表达式为参数
     */
    public void test8(){
        List<Task> tasks = getTasks2();

        String result = tasks.stream().map(Task::getTitle)
                .reduce((first,second)->first+"***"+second)
                .get();

        System.out.println(result);
    }

}
