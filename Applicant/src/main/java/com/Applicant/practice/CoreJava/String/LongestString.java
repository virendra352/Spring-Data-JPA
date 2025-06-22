package com.Applicant.practice.CoreJava.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestString {
    public static void main(String[] args) {
        String s="Java";
        Map<Character,Integer> map=new LinkedHashMap<>();
        int longest=0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else {
                i=map.get(ch);
                map.clear();
            }

            if(map.size()>longest){
                longest=map.size();

            }
        }
        System.out.println(longest);
        System.out.println(map.keySet().toString());
    }
}
