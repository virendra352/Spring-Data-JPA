package com.Applicant.practice.CoreJava.codeWithVirendra;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedExample {
    public static void main(String[] args) {
        try {
            FileInputStream fi=new FileInputStream("file.text");
            ObjectInputStream oi=new ObjectInputStream(fi);
            MyClass m=(MyClass) oi.readObject();
            System.out.println("Object Deserialized.....");
            System.out.println(m.getId()+" and "+m.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
