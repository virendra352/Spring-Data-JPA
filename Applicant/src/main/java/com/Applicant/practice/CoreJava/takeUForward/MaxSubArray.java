package com.Applicant.practice.CoreJava.takeUForward;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int subArray=3;
        int sum=0;
        for (int i = 0; i < subArray; i++) {
            sum+=arr[i];
        }
        int currentSum=sum;
        int maxSum=0;
        for (int i = subArray; i <arr.length ; i++) {
                      currentSum+=arr[i]-arr[i-subArray];
                      if(currentSum>maxSum){
                          maxSum=currentSum;
                      }

        }
        System.out.println(maxSum);
    }
}
