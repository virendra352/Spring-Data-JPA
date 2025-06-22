package com.Applicant.practice.CoreJava.takeUForward.BruteForce;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s="takeeuforward";
        int left=0;
        int max=Integer.MIN_VALUE;
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                 while(left<i && set.contains(s.charAt(i))){
                     set.remove(s.charAt(left));
                     left++;
                 }
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }

        System.out.println(max);
    }
}
