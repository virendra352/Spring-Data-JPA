package com.Applicant.practice.CoreJava.takeUForward.BruteForce;

public class MaxiSubArray {
    public static void main(String[] args) {
        int [] a={-2,-3,4,-1,-2,1,5,-3};
        int [] ar={-2,-3,10,-1,-2};
        int n=ar.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                int sum=0;
                for (int k = i; k <j ; k++) {
                     sum+=a[k];
                    max=Math.max(sum,max);
                }
            }
        }
        System.out.println(max);
    }
}
