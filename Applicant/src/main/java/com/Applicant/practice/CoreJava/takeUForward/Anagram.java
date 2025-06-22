package com.Applicant.practice.CoreJava.takeUForward;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s="cat";
        String s1="acta";
       boolean r= anagramCheck(s,s1);
        System.out.println(r);

        String[] aa={"cat","tac","abc","cba","man"};
        Map<String, List<String>> map=new HashMap<>();
        for (int i = 0; i < aa.length; i++) {
            String collect = Stream.of(aa[i].split("")).sorted().collect(Collectors.joining());
            map.computeIfAbsent(collect,j->new ArrayList<>()).add(aa[i]);//
        }
        System.out.println(map.values());
        Map<String, String> map1=new HashMap<>();
        map1.put("a","b");
        map1.put("b","c");
        System.out.println(map1);
        map1.computeIfAbsent("b",ab->"e");
        System.out.println(map1);

    }

    private static boolean anagramCheck(String s, String s1) {
        if(s.length()!=s.length()){
            return false;
        }
        int[] count=new int[26];
        char[] charArray = s.toCharArray();
        char[] charArray1 = s1.toCharArray();
        for(char c:charArray){
            count[c-'a']++;
        }
        for (char c: charArray1){
            if(--count[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}
