package com.Applicant.practice.CoreJava.takeUForward;

import java.util.HashSet;

public class TripleteSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, -1, 0, -2, 3, 1};
        int target = 2;
        int count=0;
        HashSet<Integer> seen=new HashSet<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j <arr.length ; j++) {

                int compliment=target-(arr[i]+arr[j]);
                if(seen.contains(compliment)){
                    System.out.println("("+compliment+","+arr[i]+","+arr[j]+")");
                    count++;
                }
                seen.add(arr[j]);
            }
        }

        System.out.println("-----------------------------------------");
        HashSet<Integer> set=new HashSet<>();
        int n= arr.length;
        int counts=0;
        for (int i = 0; i <n-2 ; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        if(!set.contains(arr[i])&&!set.contains(arr[i])&& !set.contains(arr[i])){
                            System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                            counts++;
                        }else {
                            set.add(arr[j]);
                            set.add(arr[k]);
                        }

                    }
                }
            }
        }
        System.out.println("count : "+counts);
    }
}
