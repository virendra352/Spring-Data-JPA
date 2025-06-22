package com.Applicant.practice.CoreJava.Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        //generic allows classes interface method to operate on different type of object
        List list=new ArrayList();
        list.add("ab");
        list.add(1);
        list.add(true);
        String s= (String) list.get(0); //need explicit casting
        int b= (int) list.get(1); //need explicit casting


    }
}
