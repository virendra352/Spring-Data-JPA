package com.Applicant.practice.CoreJava.javaPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObjectClass {
    public static void main(String[] args) {
        //== and equals
        //1. premitive
        int a=10;
        int b=15;
        Integer r=35;
        Integer s=35;

        System.out.println(a==b);
        System.out.println(r==s);
        System.out.println(r.equals(s));












        List<String> student=Arrays.asList("Hindi:50","English:60","Hindi:60");
        //Hindi 55.0
        //English 60

        Map<String, Double> averageScores = student.stream()
                .map(entry -> entry.split(":"))  // Split "Subject:Score"
                .collect(Collectors.groupingBy(
                        arr -> arr[0],   // Subject as key
                        Collectors.averagingDouble(arr -> Double.parseDouble(arr[1])) // Average of scores
                ));

        // Print the result
        averageScores.forEach((subject, avg) ->
                System.out.println(subject + " " + avg));




        student.stream().map(i->new Student(Integer.parseInt(i.split(":")[1]),i.split(":")[0]))
                //.collect(Collectors.groupingBy(Student::getSubject,Collectors.averagingDouble(Student::getMarks)))
                .collect(Collectors.groupingBy(Student::getSubject,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(m->m.getMarks())),st->st.map(l->l.getMarks()))))
                .entrySet().stream().forEach((y)-> System.out.println(y.getValue()+", "+y.getKey()));



        Stream<String> a1 = Stream.of("a", "b", "e", null);
        Map<String, Long> collect = a1.filter(data -> data != null).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);


        String s1="Virendra";
        Map<String, Long> collect1 = Stream.of(s1.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1);

        student.stream().map(i->new Student(Integer.parseInt(i.split(":")[1]),i.split(":")[0]))
                .collect(Collectors.groupingBy(Student::getSubject,Collectors.averagingDouble(Student::getMarks)))
                .entrySet().stream().forEach((y)-> System.out.println(y.getValue()+", "+y.getKey()));


        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(set.add(12));
        System.out.println(list.add(12));
        System.out.println(set.add(12));
        System.out.println(list.add(12));
        System.out.println(map.put(1,12));
        System.out.println(map.put(1,13));

       // Stream.of("Vikas kumar mishra".split(" ")).map(data->data.charAt(IntStream.generate(()->1)))


        String st = "Vikas kumar mishra";
        String[] s2 = st.split(" ");
        int index = 1;
        for (int i = 0; i < s2.length; i++) {
            char ch = s2[i].charAt(index);
            index++;
            System.out.println(ch);
        }

        IntStream.range(0,s2.length)
                .mapToObj(i->s2[i].charAt(i+1))
                .forEach(System.out::println);








        String data="a100-b1-c2,a101-b2-c3";
        List<String> collect2 = Stream.of(data.split(",")).map(arr -> arr.split("-")[0]).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
