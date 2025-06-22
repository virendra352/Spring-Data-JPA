package com.Applicant.practice.CoreJava.takeUForward;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> anagramGroup(String[] st){
        Map<String, List<String>> map = new HashMap<>();
        for (String str : st) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key,  k->new ArrayList<String>()).add(str);
            // map.computeIfPresent()
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strss={"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = anagramGroup(strss);
        System.out.println(lists);

    }
}
