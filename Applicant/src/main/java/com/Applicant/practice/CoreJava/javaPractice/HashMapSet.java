package com.Applicant.practice.CoreJava.javaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSet {
    public static void main(String[] args) {
        HashMap<Object ,Object> map=new HashMap<>();
        Student e1=new Student(105,"Viru");
        Student e2=new Student(101,"Virendra");
        Student e3=new Student(100,"Vikas");
        System.out.println(e1.hashCode()); //123
        System.out.println(e2.hashCode()); //343
        System.out.println(e3.hashCode()); //564
        System.out.println(e1.equals(e2)); //false
        System.out.println(e2.equals(e3)); //false
        System.out.println(e3.equals(e1)); //false

        map.put(e1,"ABC");
        map.put(e2,"EFG");
        map.put(e3,"XYZ");

        System.out.println(map);
        List<Student> list=new ArrayList<>();
        List<Student> list1 = Arrays.asList(e1, e2, e3);
        Optional<Student> second = list1.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).skip(1).findFirst();
        System.out.println("Second: "+second.get());

    }
}
