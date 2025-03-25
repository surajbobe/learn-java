package com.learn.collection;

import com.learn.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

        //HashSet
        //Unordered / Random order
        Set<Integer> set = new HashSet<>();

        set.add(50);
        set.add(43);
        set.add(32);
        set.add(55);
        System.out.println(set);

        // remove
        set.remove(50);
        System.out.println(set);

        //contains
        System.out.println(set.contains(43));

        //isEmpty
        System.out.println(set.isEmpty());

        //size
        System.out.println(set.size());

        //clear
        set.clear();

        //LinkedHashSet
        //Ordered
        Set<Integer> lSet = new LinkedHashSet<>();

        lSet.add(50);
        lSet.add(54);
        lSet.add(24);
        lSet.add(56);
        lSet.add(26);

        System.out.println(lSet);

        //TreeSet
        //BinarySearch Tree
        //Sorted
        Set<Integer> tSet = new TreeSet<>();

        tSet.add(30);
        tSet.add(40);
        tSet.add(10);
        tSet.add(70);
        tSet.add(90);

        System.out.println(tSet);

        //Student Set Equal and Hashcode Example
        Set<Student> students = new HashSet<>();

        students.add(new Student(1,"Suraj"));
        students.add(new Student(1,"Raj"));
        students.add(new Student(2,"Kedar"));
        students.add(new Student(3,"Karan"));
        students.add(new Student(4,"Rahul"));

        System.out.println(students);

    }
}
