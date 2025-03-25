package com.learn.collection.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student("Suraj",1);
        Student s2 = new Student("Rajesh",2);
        Student s3 = new Student("Aakash",3);
        Student s4 = new Student("Rahul",4);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println("Raw : "+list);
        Collections.sort(list);
        System.out.println("Comparable Sort :"+list);

        Collections.sort(list, new StudentNameComparetor());
        System.out.println("Comparetor Sort :"+list);

        Collections.sort(list, (x, y) -> Integer.compare(x.getId(),y.getId()));

    }
}
