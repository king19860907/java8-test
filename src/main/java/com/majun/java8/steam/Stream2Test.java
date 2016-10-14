package com.majun.java8.steam;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by majun on 10/14/16.
 */
public class Stream2Test {

    public static void main(String[] args) {

        Supplier<String> uuids = ()->UUID.randomUUID().toString();
        System.out.println(uuids);

        //生成一个stream
        Stream<String> uuidStream = Stream.generate(uuids);
        uuidStream.forEach(s -> System.out.println(s));
    }

}
