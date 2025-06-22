package com.Applicant.practice.CoreJava.takeUForward;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateBoolean {
         static int[] removeDuplicates(int[] arr) {
            int max = 1000; // Assume max number is 1000 (adjust if needed)
            boolean[] seen = new boolean[max + 1];
            List<Integer> uniqueList = new ArrayList<>();

            for (int num : arr) {
                if (!seen[num]) {
                    seen[num] = true;
                    uniqueList.add(num);
                }
            }

            return uniqueList.stream().mapToInt(i -> i).toArray();
        }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 3, 4, 1};
        int[] result = removeDuplicates(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
