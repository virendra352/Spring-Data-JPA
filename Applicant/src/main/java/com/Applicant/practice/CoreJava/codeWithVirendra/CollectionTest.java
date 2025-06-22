package com.Applicant.practice.CoreJava.codeWithVirendra;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        //String remove = list.remove(0);
        //System.out.println(remove);
        System.out.println(list.get(0));
        List<String> list1 = new ArrayList<>();
        list1.add("Sunday");
        list1.add("Saturday");
        list.addAll(1,list1);
        System.out.println("Size : "+list.size());
        System.out.println(list);
    }
}
