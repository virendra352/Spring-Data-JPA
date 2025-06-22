package com.Applicant.practice.CoreJava.takeUForward;

public class PairSum2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 9, 2, 8};
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int i1=-1,i2=-1;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max1){
                max2=max1;
                i2=i1;
                max1=arr[i];
                i1=i;

            } else if (arr[i]>max2) {
                max2=arr[i];
                i2=i;
            }
        }
        System.out.println("("+max1+ " "+max2  +") and ("+i1+ " "+i2+")");

    }
}
