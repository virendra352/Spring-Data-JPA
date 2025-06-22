package com.Applicant.practice.CoreJava.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test<T extends Number>{  //upper bound
    public T run(T type){
       return type;
    }
}

public class GenericBound {

    public double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
       // list.add(2); //writing not allowed , type is unknown
        return total;
    }
    public void addNumbers(List<? super Integer> list) { //lower bound
        list.add(10); // Safe to add Integer
        list.add(20);
        list.add(50);
    }
    public static void main(String[] args) {
        GenericBound genericBound=new GenericBound();
        Test<Float> obj=new Test<>();
        System.out.println(obj.run(100.0F));
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(genericBound.sum(list));

    }
}
