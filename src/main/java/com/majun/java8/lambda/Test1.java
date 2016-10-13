package com.majun.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by majun on 10/13/16.
 */
public class Test1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("shekhar", "rahul", "sameer");

        //使用匿名内部类
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return second.length()-first.length();
            }
        });
        System.out.println(names);

        //使用lambda表达式
        Collections.sort(names,(String first,String second)->second.length()-first.length());
        System.out.println(names);

    }

}
