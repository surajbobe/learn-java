package com.learn.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        // 1. Group based on length of string to odd and even map
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "mango", "peach");
        Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(x -> x.length() % 2 == 0 ? "Even" : "Odd"));
        System.out.println("#1 Odd Even Map : "+collect);

        // 2. Grouping by Length of Strings and Collecting as Set
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Bobby", "Alice");
        Map<Integer, Set<String>> collect2 = names.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println("#2 Length of Strings and Collecting as Set : "+collect2);

        // 3. Grouping and Counting Elements in Each Group
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "orange", "banana", "apple");
        Map<String, Long> collect3 = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("#3 Grouping and Counting Elements in Each Group : "+collect3);

        // 4. Grouping to odd/even and Finding Maximum Value in Each Group
        List<Integer> numbers = Arrays.asList(2, 5, 7, 8, 10, 13, 14, 17);
        Map<String, Optional<Integer>> collect4 = numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "Even" : "Odd", Collectors.maxBy(Comparator.naturalOrder())));
        System.out.println("#4 Grouping to odd/even and Finding Maximum Value in Each Group : "+collect4);

        // 5. Grouping and Mapping to Custom Values
        Map<Integer, List<String>> collect5 = names.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println("#5 Grouping and Mapping to Custom Values : "+collect5);

        // 6. Counting Word Occurrences
        String sentence = "hello world hello java world";
        Map<String, Long> collect6 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("#6 Counting Word Occurrences : "+collect6);

        // 7. Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        Optional<Integer> reduce = items.values().stream().reduce(Integer::sum);
        Integer summingInt = items.values().stream().collect(Collectors.summingInt(x -> x));
        int maptoInt = items.values().stream().mapToInt(x -> x).sum();

        System.out.println("#7 Summing Values in a Map : "+ maptoInt);

        //8. Creating a Map from Stream Elements
        List<String> fruits2 = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> fruitMap = fruits2.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("#8 Creating a Map from Stream Elements"+ fruitMap);

        //9. Creating a Map from Stream Elements and Couting
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> collect9 = words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println("#9 Creating a Map from Stream Elements and Couting : "+collect9);
    }

}
