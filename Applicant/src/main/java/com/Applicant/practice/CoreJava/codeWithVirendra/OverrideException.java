package com.Applicant.practice.CoreJava.codeWithVirendra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Org{
     void details(){
         System.out.println("Org");
     }
}
class Emp extends Org{
    @Override
    void details(){
        System.out.println("Emp");
    }
}
public class OverrideException {
    public static void main(String[] args) {
        Org o=new Emp();
        o.details();
        final List<Integer> obj = new ArrayList<Integer>();   //copy all line ctrl+c
        obj.add(24);
        obj.add(10);
       // obj = new ArrayList<Integer>();  can not re-assign //Compile time error
        System.out.println(obj);

        String[ ] str = {"Dhanbad", "Ranchi", "Mumbai"};

        int[] ar={1,2,3,4,5};
        List<String> collect = Arrays.stream(str).collect(Collectors.toList());
        List<Integer> collect1 = Arrays.stream(ar).boxed().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }

}
