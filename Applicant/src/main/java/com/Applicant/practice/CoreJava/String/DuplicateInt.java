package com.Applicant.practice.CoreJava.String;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DuplicateInt {
    public static void main(String[] args) {
        int[] ar={1,2,1,7,7,2,6 };
        int index=0;
        int[] temp=new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            boolean unique=true;
            for (int j = i+1; j < ar.length; j++) {
                if(ar[i]==ar[j]){
                   unique=false;
                   break;
                }
            }
            if(unique){
                temp[index++]=ar[i];
            }
        }

        int[] ints = Arrays.copyOf(temp, index);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }

        String s="my name is is vikas";

        long count = Stream.of(s.split(" ")).filter(f -> f.equalsIgnoreCase("is")).count();
       // System.out.println(count);
        //BinaryOperator
    }
}
