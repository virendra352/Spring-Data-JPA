package com.Applicant.practice.CoreJava.takeUForward;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr={34,67,87,68,87};
        int highest=Integer.MIN_VALUE;
        int SecondHighest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int current=arr[i];
            if(current>highest){
                SecondHighest=highest;
                highest=current;
            } else if (current>SecondHighest && current<highest) {
                SecondHighest=current;
            }
        }
        System.out.println("Highest : "+highest);
        System.out.println("Second Highest : "+SecondHighest);
    }
}
