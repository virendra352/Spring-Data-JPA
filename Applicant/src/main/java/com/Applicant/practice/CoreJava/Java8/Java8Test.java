package com.Applicant.practice.CoreJava.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }
}
public class Java8Test {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 30),
                new Employee("Jane", 25),
                new Employee("Mike", 35)
        );
        //1
        List<Integer> list= Arrays.asList(1,2,3,3,4,5,6);
        Integer i = list.stream().max((a, b) -> a - b).orElse(0);
        System.out.println(i);
        //2
        List<String> list1= Arrays.asList("avi","ravi","charlie","vira");
        List<String> collect = list1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        //use of mapToInt() method . it is used for transforming stream<T> to intStream
        //int sum = employees.stream().map(Employee::getAge).mapToInt(s -> s).sum();
        int sum = employees.stream().mapToInt(Employee::getAge).sum();
        System.out.println(sum);
        //3
        Map<Integer, List<String>> collect1 = list1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);
        //4
        Integer reduce = list.stream().reduce(0, Integer::sum);
        Integer reduce1 = list.stream().reduce(0, (a,b)->a+b);
        System.out.println(reduce1 + " : "+reduce);

        //5
        List<String> word=Arrays.asList("apple","banana","apple");
        Map<String,Long> words=word.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(words);

        //6
        String sentence=word.stream().collect(Collectors.joining(","));
        System.out.println(sentence);

        //7
        List<Student> student = Arrays.asList(
                new Student("John", 3000),
                new Student("Jane", 2500),
                new Student("Mike", 3500)
        );
        List<Student> collect2 = student.stream().sorted((a, b) -> a.getSalary() - b.getSalary()).collect(Collectors.toList());
        System.out.println(collect2);
        student.stream().sorted(Comparator.comparingInt(Student::getSalary)).forEach(System.out::println);

        //8 Non-repeated character in string
        String input="swiss";
        Optional<Map.Entry<String, Long>> first = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1l).findFirst();
        System.out.println(first.get().getKey());

        //9  Remove duplicate
        list.stream().distinct().forEach(System.out::println);

        //10

        List<Student> student1 = Arrays.asList(
                new Student("John", 3000),
                new Student("Jane", 2500),
                new Student("Mike", 3500),
        new Student("John", 3000)
        );
        student1.stream().distinct().forEach(System.out::println);

        //11 ,get String start with "A"

        list1.stream().filter(s->s.startsWith("a")).forEach(System.out::println);

       //12- sort list of string alphabetically and in reverse order
        List<String> names=Arrays.asList("Charlie","Alice","Bob");
        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
      //13
      List<List<Integer>> nestedList=  Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(4,5));

        List<Integer> collect3 = nestedList.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(collect3);

        //14  partitioningBY
        Map<Boolean, List<Integer>> collect4 = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect4);

        //15
        String stringSentence="Java is fun and java is powerful";
        Map<String, Long> collect5 = Arrays.stream(stringSentence.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect5);

        //16
        Integer i1 = names.stream().map(String::length).max((a, b) -> a - b).get();
        String i2 = names.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(i1+ " : "+i2);
        //17
        List<Integer> numbers=Arrays.asList(10,20,5,15);
        Integer i3 = numbers.stream().min(Integer::compare).get();
        System.out.println(i3);

        //18
        List<Integer> number=Arrays.asList(1,2,2,3,1,5);
        Set<Integer> collect6 = number.stream().filter(n -> Collections.frequency(number, n) >1).collect(Collectors.toSet());
        System.out.println(collect6);

        //20
        Map<Boolean, List<Integer>> collect7 = number.stream().collect(Collectors.partitioningBy(n -> isPrime(n)));
        System.out.println(collect7);
        collect7.entrySet().stream().map(n->n.getKey()?Map.entry("prime",n.getValue()):Map.entry("Not-prime",n.getValue())).forEach(System.out::println);

        //21 Collectors.teeing() -> to compute two operation on a stream

        Map<String, Double> collect8 = number.stream().collect(Collectors.teeing(
                Collectors.summingDouble(n -> n),
                Collectors.averagingDouble(n -> n),
                (sums, avg) -> Map.of("sum", sums, "avg", avg)
        ));
        System.out.println(collect8);

        //22 palindrome
        List<String> data=Arrays.asList("madam","racecar","java","level");
        data.stream().filter(wor->wor.equals(new String(new StringBuffer(wor).reverse()))).forEach(System.out::println);




    }

    private static boolean isPrime(Integer n) {
        return IntStream.rangeClosed(2,n).noneMatch(i->n%i==0);
    }
}
