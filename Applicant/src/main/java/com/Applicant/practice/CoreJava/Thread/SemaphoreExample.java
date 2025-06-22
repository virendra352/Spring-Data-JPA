package com.medium.java.sftp.Thread;

import java.util.concurrent.Semaphore;

class Printer {
    private final Semaphore semaphore = new Semaphore(2);  // Allow 2 threads at a time

    public void print(String document) {
        try {
            semaphore.acquire();  // Acquire a permit
            System.out.println(Thread.currentThread().getName() + " is printing: " + document);
            Thread.sleep(5000);// Simulating printing time
            System.out.println("wait for 5 seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();  // Release permit
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Runnable task = () -> printer.print("Document");

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");
        Thread t5 = new Thread(task, "Thread-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

