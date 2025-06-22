package com.Applicant.practice.CoreJava.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultiThreadHandle {
    public synchronized void test1() {
        System.out.println("Inside Test1 Method"+ Thread.currentThread().getName());
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void test2() {
        System.out.println("Inside Test2 Method"+ Thread.currentThread().getName());
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        MultiThreadHandle obj =  new MultiThreadHandle();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable runnableTask1 = () -> { obj.test1(); };
        Runnable runnableTask2 = () -> { obj.test2(); };

        executor.execute(runnableTask1);
        executor.execute(runnableTask2);

        Map<String,Integer>mapOf=Map.of("Kundan",100,"Ranjan",200); //java 9 limit 20 entries
        //mapOf.put("Viru",300); //error because map is immutableMap
        //System.out.println(mapOf);
        Map<String,Integer> mapEntry= Map.ofEntries(Map.entry("Kundan",100));
       // mapEntry.put("vira",300);
        System.out.println(mapEntry);
        Map<String,Integer> map=new HashMap<>();
        map.put("Viru",300);
        Map<String, Integer> stringIntegerMap = Collections.unmodifiableMap(map);
        stringIntegerMap.put("a",200);
        System.out.println(stringIntegerMap);
    }
}
