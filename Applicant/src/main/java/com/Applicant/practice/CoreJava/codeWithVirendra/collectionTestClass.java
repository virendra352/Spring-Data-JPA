package com.Applicant.practice.CoreJava.codeWithVirendra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class collectionTestClass {
    public static void main(String[] args) {
        //vector
        Vector<Integer> vector=new Vector<>(3);
        System.out.println(vector.capacity());
        //unlike arraylist , we can check capacity of vector or also we can increase capacity as well
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector);
        System.out.println(vector.capacity());
        ArrayList<Integer> arrayList=new ArrayList<>(3);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2); //size increase by half(1/2)
        //arrayList.re
        System.out.println(arrayList);

        HashMap<String,String> map=new HashMap<>();


    }
}
