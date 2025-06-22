package com.medium.java.sftp.Thread;

public class PrintZeroToSau {
    void run(int a){
        System.out.println("int");
    }
    void run(boolean a){
        System.out.println("boolean");
    }void run(Object a){
        System.out.println("Object");
    }void run(String a){
        System.out.println("String");
    }/*void  run(Integer a){
        System.out.println("Integer");
    }*/
    public static void main(String[] args) {
        PrintZeroToSau a=new PrintZeroToSau();


            Thread t1=new Thread(()->{
                for (int i = 0; i <=50; i++) {
                    System.out.println(i);
                }
            });
        Thread t2=new Thread(()->{
            for (int i =51 ; i <=100; i++) {
                System.out.println(i);
            }
        });
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        a.run(null);
    }
}
