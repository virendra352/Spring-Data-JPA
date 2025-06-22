package com.Applicant.practice.CoreJava.takeUForward;

public class RemoveDuplicateBoundedRange {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] >= 0) {
                arr[index] = -arr[index];  // mark as visited
            } else {
                // Duplicate found: remove it
                arr[i] = arr[n - 1]; // move last element to current
                n--; // shrink size
                i--; // recheck new element at current index
            }
        }

        // Restore values and print
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(arr[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return n;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 0}; // values between 0 and 5
        int newLen = removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + newLen);
    }
}

