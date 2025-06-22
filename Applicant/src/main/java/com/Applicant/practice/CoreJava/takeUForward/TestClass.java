package com.Applicant.practice.CoreJava.takeUForward;

import com.Applicant.practice.CoreJava.takeUForward.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(12,10);
        map.put(9,19);
        map.put(16,8);
        map.put(10,1);

        Map<Integer, Integer> collect = map.entrySet().stream().sorted((a, b) -> b.getKey() - a.getKey()).collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue(), (a,b)->a,LinkedHashMap::new));
        System.out.println(collect);

        int sum = map.entrySet().stream().mapToInt(s -> s.getValue()).sum();
        System.out.println(sum);

        map.entrySet().stream().forEach(System.out::println);
        List<Map.Entry<Integer, Integer>> collect1 = map.entrySet().stream().collect(Collectors.toList());
        System.out.println(collect1);

        int n=5;

        for(int i=0;i<n;i++){
            for (int j = 0; j<=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");

        }
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("  ");
            }
            for (int k= 1; k <=(2*i-1) ; k++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        //
        Student student1 = new Student(1, "Alice", Arrays.asList("Delhi", "Mumbai","Delhi"));
        Student student2 = new Student(2, "Bob", Arrays.asList("Bangalore", "Bangalore"));

        // Creating a list of students
        List<Student> students = Arrays.asList(student1, student2);

        List<String> collect2 = students.stream().flatMap(s -> s.getAddress().stream()).distinct().collect(Collectors.toList());
        System.out.println(collect2);
        List<List<String>> collect3 = students.stream().map(s -> s.getAddress().stream().distinct().collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(collect3);
        String sorted = "bdca";
        List<String> sortString = Stream.of(sorted.split("")).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(sortString);


    }


}
