package com.Applicant.practice.CoreJava.takeUForward;

public class MaximumSubArray {
    public static int maxSubarrayBruteForce(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < n; i++) { // Start index
            for (int j = i; j < n; j++) { // End index
                int sum = 0;
                for (int k = i; k <= j; k++) { // Sum the subarray
                    sum += arr[k];

                }
                count++;
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Total SubArray: "+count);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 10, -1, -2};
        System.out.println("Brute Force Max Sum: " + maxSubarrayBruteForce(arr)); // Output: 10
    }
}
