package com.Applicant.practice.CoreJava.javaPractice;

public class GetInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            // Loading the class dynamically
            Class<?> clazz = Class.forName("com.medium.java.sftp.codeWithVirendra.MyClass");

            // Creating a new instance
            Object obj = clazz.newInstance();

            System.out.println("Object created: " + obj.getClass().getName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
