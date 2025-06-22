package com.Applicant.practice.CoreJava.takeUForward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSum {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 1, 2};
        if (arr == null || arr.length < 3) {
            System.out.println("Array must have at least 3 elements.");
            return;
        }
        int target=0;
        Arrays.sort(arr);
        List<List<Integer>> triple=new ArrayList<>() ;
        for (int i = 0; i<arr.length-2; i++) {

            if(i>0 && arr[i]==arr[i-1])continue;
            int left=i+1;
            int right= arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];

                if(sum==target){
                    triple.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum<target) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        System.out.println(triple);

    }
}
