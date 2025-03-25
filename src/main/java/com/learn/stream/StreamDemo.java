package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        //What is Stream ?
        //A sequence of elements supporting functional and declarative programming

        // Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,3,4,5,6);
        Stream<Integer> stream = list.stream();

        // 2. From Arrays
        String[] arrays = {"ab","bc","dc"};
        Stream<String> stream1 = Arrays.stream(arrays);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("ab","bc","dc");

        // 4. Infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        List<Integer> generate2 = Stream.iterate(1, x -> x + 1).limit(20).collect(Collectors.toList());


    }
}
