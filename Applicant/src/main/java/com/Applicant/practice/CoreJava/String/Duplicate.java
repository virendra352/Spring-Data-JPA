package com.Applicant.practice.CoreJava.String;


public class Duplicate {
    public static void main(String[] args) {
        String st="hello";
        //a b c d e f g h i j  k  l  m   n  o  p  q  r s  t  u  v  w  x  y  z
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        //97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114
        int[] freq=new int[26];
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <st.length(); i++) {
            int index=st.charAt(i)-97;
            freq[index]+=1;
            if(freq[index]==1){
                sb.append(st.charAt(i));
            }
        }

        System.out.println(sb);
        String unique="";

        for (int i = 0; i < st.length(); i++) {
            if(sb.indexOf(String.valueOf(st.charAt(i)))<0){
                sb.append(st.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
