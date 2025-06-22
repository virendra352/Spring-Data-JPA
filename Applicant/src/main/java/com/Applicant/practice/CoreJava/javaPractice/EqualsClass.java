package com.Applicant.practice.CoreJava.javaPractice;

import java.util.HashMap;
import java.util.Map;

public class EqualsClass {
    public static void main(String[] args) {
      Student s=new Student(100,"vikas");
      Student s1=new Student(100,"vikas");
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        Map<Student,String> map=new HashMap<>();
        map.put(s,"Vikas");   //131-> bucket 1-> HashCollision-> equals()-> false
        map.put(s1,"Virendra"); //131->bucket 1->
        System.out.println(map);
    }
}
