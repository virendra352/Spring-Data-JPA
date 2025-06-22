package com.medium.java.sftp.Thread;

import java.util.concurrent.*;

public class Threading {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(6);

        //executor(runnable r) method
        Runnable runnable=()->{
            System.out.println("runnable task is running!!!"+Thread.currentThread().getName());
        };

        //executor.shutdown();

        //submit(Callable<T> c) submit(Runnable c)
        Callable<String> callable=()-> "callable task is running "+Thread.currentThread().getName();
        Future<?> submit = executor.submit(runnable);
        Future<String> submit1 = executor.submit(callable);

        try {
           System.out.println("Result : "+submit1.get());
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println(submit);
        executor.execute(runnable);
    }
}
