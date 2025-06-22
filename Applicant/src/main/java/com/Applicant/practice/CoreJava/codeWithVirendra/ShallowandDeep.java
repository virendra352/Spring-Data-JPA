package com.Applicant.practice.CoreJava.codeWithVirendra;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ShallowandDeep {
    int a=10;
    static boolean isvalid(String st){
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        char[] ch=st.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char c : st.toCharArray()) {
            if(map.containsKey(c)){
                char top=stack.isEmpty()?'#':stack.pop();
                if(top!=map.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ShallowandDeep s=new ShallowandDeep();
        System.out.println(s.a);

        ShallowandDeep s2=s;
        System.out.println(s2.a);
        s.a=40;//shallow copy
        System.out.println(s2.a);
        s2.a=20;
        System.out.println(s2.a);
        String st="(){}[]";
        System.out.println(isvalid(st));





    }
}
