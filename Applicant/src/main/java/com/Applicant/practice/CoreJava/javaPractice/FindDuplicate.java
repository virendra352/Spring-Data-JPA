package com.Applicant.practice.CoreJava.javaPractice;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] ar={3,2,1,2,3};
        int[] dArray=new int[5];
        for (int i = 0; i < ar.length; i++) {
               int value=ar[i];
               dArray[value]++;
        }
       // Arrays.stream(dArray).filter(a->a>1).forEach(System.out::println);
        for(int index=0;index<dArray.length;index++){
            if(dArray[index]>1){
                System.out.println(index);
            }
        }
        int[] temp=new int[ar.length];
        int index=0;
        for (int i = 0; i < ar.length; i++) {
            boolean duplicate=false;
            for (int j = i; j < ar.length-1; j++) {
                  if(ar[i]==ar[j+1]){
                      duplicate=true;
                      break;
                  }
            }
            if(!duplicate) {
                temp[index] = ar[i];
                index++;
            }
        }

        for(int i:temp){
            System.out.print(i + " ");
        }

    }
}
