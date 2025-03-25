package com.learn.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

    public static void main(String[] args){

        //HashMap
        //not sorted
        //random order
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);

        //Put if Absent
        numbers.putIfAbsent("Two", 23);

        //Contains key / value
        System.out.println(numbers.containsKey("Five"));
        System.out.println(numbers.containsValue(5));

        //isEmpty Clear
//        lMap.isEmpty();
//        lMap.clear();


        //iterate
        //EntrySet
        for (Map.Entry<String, Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        //KeySet
        for (String key: numbers.keySet()){
            System.out.println(key);
        }

        //values
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        //LinkedHashMap
        //not sorted
        //Maintain insertation order
        Map<String, Integer> lMap = new LinkedHashMap<>();

        lMap.put("One", 1);
        lMap.put("Three", 3);
        lMap.put("Two", 2);
        lMap.put("Four", 4);
        lMap.put("Five", 5);

        System.out.println(lMap);

        //TreeMap
        //sorted
        Map<String, Integer> tMap = new TreeMap<>();

        tMap.put("One", 1);
        tMap.put("AThree", 3);
        tMap.put("Two", 2);
        tMap.put("Four", 4);
        tMap.put("Five", 5);

        System.out.println(tMap);

    }
}
