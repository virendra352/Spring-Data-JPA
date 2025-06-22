package com.Applicant.practice.CoreJava.takeUForward;

public class PairSum {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 6, 8};
       int target=9;
       int left=0;
       int right= arr.length-1;

       while(left<right){
           if(arr[left]+arr[right]==target){
               System.out.println("("+arr[left]+","+arr[right]+")");
               left++;
               right--;
               //return;
           } else if (arr[left]+arr[right]<target) {
               left++;
           }else {
               right--;
           }
       }

    }
}
