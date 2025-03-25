package com.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(53);
        list.add(33);
        list.add(73);
        list.add(93);
        list.add(73);
        list.add(93);

        System.out.println("Min Element : "+ Collections.min(list));
        System.out.println("Max Element : "+ Collections.max(list));
        System.out.println("Frequency : "+ Collections.frequency(list,93));

        Collections.sort(list, Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder());
    }
}
