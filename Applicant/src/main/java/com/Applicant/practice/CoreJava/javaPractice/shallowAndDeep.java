package com.Applicant.practice.CoreJava.javaPractice;

public class shallowAndDeep {
    public static void main(String[] args) {
        Student s=new Student(100, "ab");
        Student s2=s; //shallow copy
        System.out.println(s.hashCode()+ " : "+s2.hashCode());
    }
}
