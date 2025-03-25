package com.learn.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1. Collecting to a List
        List<String> names = Arrays.asList("Suraj", "Bobe", "Suraj");
        List<String> res = names.stream().distinct().collect(Collectors.toList());
        System.out.println("List : "+res);

        //2. Collecting to a Set
        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println("Set : "+set);

        // 3. Collecting to a Specific Collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4. Joining Strings
        // Concatenates stream elements into a single String
        String concat = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Joining Strings : "+concat);

        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // 6. Calculating Sum - summingInt
        System.out.println("Sum : "+numbers.stream().collect(Collectors.summingInt(x -> x)));

        // 7. Calculating Averages - averagingInt
        System.out.println("Average : "+numbers.stream().collect(Collectors.averagingInt(x -> x)));

        // 8. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 9. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");

        Map<Integer, List<String>> collect1 = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        collect1 = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);

        Map<Integer, String> collect2 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        System.out.println(collect2);

        Map<Integer, Long> collect3 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect3);

        TreeMap<Integer, Long> collect4 = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect4);

        // 9. Partitioning Elements
        //  Partitions elements into two groups (true and false) based on a predicate
        Map<Boolean, List<String>> collect5 = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect5);

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        List<String> collect6 = words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect6);


    }

}
