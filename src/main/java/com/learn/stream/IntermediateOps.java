package com.learn.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {

        //Intermediate operations transform a stream into another stream.
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");

        // 1. filter
        Stream<String> filteredStream = list.stream().filter(str -> {
                System.out.println("filter called");
                return str.toLowerCase().startsWith("a");
        });
        System.out.println("Filter not called yet");
        long cnt = filteredStream.count();
        System.out.println("Count : "+cnt);

        // 2. map
        Stream<String> mapStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted( (a,b) -> a.length() - b.length());
        Stream<String> sortedStreamUsingComparator2 = list.stream().sorted(Comparator.reverseOrder());

        // 4. distinct
        Stream<String> distinctStream = list.stream().distinct();

        // 5. limit
        Stream<Integer> integerStream = Stream.iterate(1, x -> x+1).limit(20);

        // 6. skip
        Stream<Integer> integerStream1 = Stream.iterate(1, x -> x+1).skip(10).limit(20);

        // 7. peek
        // Performs an action on each element as it is consumed
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        List<String> flatList = listOfLists.stream().flatMap(x -> x.stream().sorted()).collect(Collectors.toList());
        System.out.println(flatList);

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        System.out.println(sentences.stream().flatMap( x -> Arrays.stream(x.split(" "))).collect(Collectors.toList()));

    }
}
