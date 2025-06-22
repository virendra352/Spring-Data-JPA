package com.Applicant.practice.CoreJava.codeWithVirendra;

public class CodewithVirendra {
    public static void main(String[] args) {
        //java 12 introduce feature yield
         String mood="Happy";

        String suggestion=switch(mood){
            case "Happy"->{
                yield "Go for walk";
            }
            case "unHappy"->{
                yield "Do not go for walk";
            }
            default -> throw new IllegalStateException("Unexpected value: " + mood);
        };
        System.out.println(suggestion);
    }
}
