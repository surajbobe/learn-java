package com.learn.stream;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOps {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1. collect
        list.stream().collect(Collectors.toList());

        // 2. forEach
        list.stream().forEach(System.out::println);
        
        // 3. reduce : Combine elements to produce a single result
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(sum.get());
        Optional<Integer> mul = list.stream().reduce((x,y) -> x*y);
        System.out.println(mul.get());

        // 4. count
        long count = list.stream().filter(x -> x%2 == 0).count();
        System.out.println("Even Count : "+ count);

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        boolean b2 = list.stream().noneMatch(x ->  x < 0);

        // 6. findFirst, findAny
        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();

        // 7. toArray()
        Object[] array = list.stream().toArray();

        // 8. min/max
        List<Integer> list2 = Arrays.asList(4, 2, 6, 4, 5, 1, 10, 8, 14, 7);
        Optional<Integer> max = list2.stream().sorted(Comparator.reverseOrder()).skip(1).max((x, y) -> x - y);
        System.out.println(max.get());

        Optional<Integer> min = list2.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());

        // 9. forEachOrdered for parallel stream to run in order
        list2.stream().forEachOrdered(System.out::println);
    }
}
