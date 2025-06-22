package com.Applicant.practice.CoreJava.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1); //0
        arrayList.add(8); //1
        arrayList.add(70); //2
        System.out.println(arrayList);
        List list=new ArrayList();
        list.add("ab");
        list.add(1);
        list.add(true);

        System.out.println(list);
        for (Object a:list){
            System.out.println(a);
        }

    }
}
