package com.Applicant.practice.CoreJava.takeUForward;

import com.Applicant.practice.CoreJava.javaPractice.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanToInt {
    public static void main(String[] args) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result=0;
        int previous=0;
        //String s="III";
        String s="MCMXCIV";

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if(current>=previous){
                result+=current;
            }else{
                result-=current;
            }
            previous=current;
        }
        System.out.println(result);

        List<Integer> list=List.of(1,2,3,4,5,6);
        Map<Boolean,List<Integer>> partition=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(partition);
        Map<String, List<Integer>> collect = partition.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey() ? "even" : "odd", Map.Entry::getValue));
        System.out.println(collect);
        List<com.Applicant.practice.CoreJava.javaPractice.Student> list1=List.of(new com.Applicant.practice.CoreJava.javaPractice.Student(100,"maths"),
                new com.Applicant.practice.CoreJava.javaPractice.Student(105,"English"),new com.Applicant.practice.CoreJava.javaPractice.Student(105,"Science"));
        //convert from list to map
        Map<Integer, com.Applicant.practice.CoreJava.javaPractice.Student> collect1 = list1.stream().collect(Collectors.toMap(Student::getMarks, student -> student,(a, b)->b));
        System.out.println(collect1);

        Map<Integer,Integer> map=new HashMap<>();
        map.put(100,0);
        map.put(105,5);
        map.put(102,2);
        map.put(101,1);

        Map<Integer, Integer> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue()));
        System.out.println(collect2);
    }
}
