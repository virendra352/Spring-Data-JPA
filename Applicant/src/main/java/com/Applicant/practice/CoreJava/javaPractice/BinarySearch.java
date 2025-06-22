package com.Applicant.practice.CoreJava.javaPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9, 10, 15};
        int target = 9;
        int start = 0;
        int last = arr.length;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == target) {
                System.out.println(" target " + mid);
                break;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int i = 1;
        int j = 1;
        while (i <= 3) {
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
